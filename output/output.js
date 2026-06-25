let ns_swal_awl = "ما هي عاصمة المملكة العربية السعودية؟";
let ns_swal_thany = "كم عدد أيام السنة؟";
let ns_swal_thalth = "ما هي لغة القرآن الكريم؟";
let khyarat_awl = ["دبي", "الرياض", "جدة", "مكة"];
let khyarat_thany = ["300", "350", "365", "400"];
let khyarat_thalth = ["الفارسية", "العبرية", "العربية", "التركية"];
let ejabh_awl = 1;
let ejabh_thany = 2;
let ejabh_thalth = 2;
let nsws_alasylh = [ns_swal_awl, ns_swal_thany, ns_swal_thalth];
let qaymh_alkhyarat = [khyarat_awl, khyarat_thany, khyarat_thalth];
let qaymh_alejabat = [ejabh_awl, ejabh_thany, ejabh_thalth];
let alswal_alhaly = 0;
let alntyjh_alhalyh = 0;
let tm_alejabh = false;
let marfat_alkhyarat = ["khyar_alf", "khyar_ba", "khyar_jym", "khyar_dal"];
function ard_alswal() {
    tm_alejabh = false;
    let ns_alswal = nsws_alasylh[alswal_alhaly];
    let khyarat_alswal = qaymh_alkhyarat[alswal_alhaly];
    document.getElementById("ns_alswal").innerText = ns_alswal;
    document.getElementById("rdh_alfal").innerText = "";
    document.getElementById("rqm_alswal").innerText = "السؤال " + (alswal_alhaly + 1);
    let adad = 0;
    while (adad < khyarat_alswal.length) {
    let asm_almarf = marfat_alkhyarat[adad];
    document.getElementById(asm_almarf).innerText = khyarat_alswal[adad];
    adad = adad + 1;
}
    console.log("تم عرض السؤال رقم: ", alswal_alhaly + 1);
}
function thqq_alejabh(rqm_alkhyar) {
    if (tm_alejabh === true) {
    return;
}
    tm_alejabh = true;
    let alejabh_alshyhh = qaymh_alejabat[alswal_alhaly];
    let alrd = document.getElementById("rdh_alfal");
    if (rqm_alkhyar === alejabh_alshyhh) {
    alntyjh_alhalyh = alntyjh_alhalyh + 1;
    alrd.innerText = "اجابة صحيحة!";
    alrd.style.لون = "اخضر";
    console.log("إجابة صحيحة! النتيجة: ", alntyjh_alhalyh);
} else {
    alrd.innerText = "اجابة خاطئة!";
    alrd.style.لون = "احمر";
    console.log("إجابة خاطئة.");
}
    document.getElementById("ard_alntyjh").innerText = "النتيجة: " + alntyjh_alhalyh;
}
function akhtar_alf() {
    thqq_alejabh(0);
}
function akhtar_ba() {
    thqq_alejabh(1);
}
function akhtar_jym() {
    thqq_alejabh(2);
}
function akhtar_dal() {
    thqq_alejabh(3);
}
function alswal_altaly() {
    if (tm_alejabh === false) {
    alert("الرجاء اختيار إجابة اولا!");
    return;
}
    alswal_alhaly = alswal_alhaly + 1;
    if (alswal_alhaly < nsws_alasylh.length) {
    ard_alswal();
} else {
    alert("انتهى الاختبار! نتيجتك: " + alntyjh_alhalyh);
    console.log("انتهى الاختبار. النتيجة النهائية: ", alntyjh_alhalyh);
}
}
let zr_altaly = document.getElementById("zr_altaly");
zr_altaly.addEventListener("click", alswal_altaly);
let zr_alf = document.getElementById("khyar_alf");
let zr_alba = document.getElementById("khyar_ba");
let zr_aljym = document.getElementById("khyar_jym");
let zr_aldal = document.getElementById("khyar_dal");
zr_alf.addEventListener("click", akhtar_alf);
zr_alba.addEventListener("click", akhtar_ba);
zr_aljym.addEventListener("click", akhtar_jym);
zr_aldal.addEventListener("click", akhtar_dal);
ard_alswal();
console.log("تطبيق الاختبار جاهز. عدد الأسئلة: ", nsws_alasylh.length);
