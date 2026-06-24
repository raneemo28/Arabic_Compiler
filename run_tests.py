import os
import subprocess
import sys

TESTS_DIR = "tests_5codes"

def find_test_files():
    return [
        os.path.join(TESTS_DIR, f)
        for f in sorted(os.listdir(TESTS_DIR))
        if f.endswith(".arweb")
    ]

def run_one(path):
    env = os.environ.copy()
    env["ARWEB_TEST_MODE"] = "1"
    env["PYTHONIOENCODING"] = "utf-8"

    result = subprocess.run(
        [sys.executable, "main.py", path],
        capture_output=True, text=True, encoding="utf-8", env=env,
    )
    output = result.stdout + result.stderr
    lines = output.splitlines()

    syntax_lines = [l for l in lines if "mismatched input" in l or "extraneous input" in l]
    semantic_lines = [l for l in lines if l.strip().startswith("❌")]

    return {
        "path": path,
        "crashed": "Traceback (most recent call last)" in output,
        "syntax_lines": syntax_lines,
        "semantic_lines": semantic_lines,
        "output": output,
    }

def main():
    files = find_test_files()
    if not files:
        print("⚠️ لا توجد ملفات .arweb في tests/")
        return

    results = [run_one(f) for f in files]
    crashed = 0

    for r in results:
        name = os.path.basename(r["path"])
        if r["crashed"]:
            crashed += 1
            print(f"\n🔴 انهيار حقيقي     | {name}")
            print("\n".join(r["output"].strip().splitlines()[-15:]))
        elif r["syntax_lines"]:
            print(f"\n🟡 خطأ نحوي ({len(r['syntax_lines'])})  | {name}")
            for line in r["syntax_lines"]:
                print(f"    {line}")
        elif r["semantic_lines"]:
            print(f"\n🟠 خطأ دلالي ({len(r['semantic_lines'])}) | {name}")
            for line in r["semantic_lines"]:
                print(f"    {line}")
        else:
            print(f"🟢 نجح بالكامل       | {name}")

    print(f"\nالإجمالي: {len(results)} | انهيارات حقيقية: {crashed}")

    if crashed:
        sys.exit(1)

if __name__ == "__main__":
    main()