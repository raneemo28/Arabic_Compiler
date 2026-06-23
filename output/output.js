let aladad = 0;
function thdyth_alshashh() {
    let alshashh = document.getElementById("shashh");
    alshashh.innerText = aladad;
    console.log("القيمة الحالية: ", aladad);
}
function zyadh() {
    aladad = aladad + 1;
    thdyth_alshashh();
}
function nqsan() {
    aladad = aladad - 1;
    thdyth_alshashh();
}
function tsfyr() {
    aladad = 0;
    thdyth_alshashh();
    console.log("تم تصفير العداد!");
}
let zr_zayd = document.getElementById("zr_zayd");
let zr_naqs = document.getElementById("zr_naqs");
let zr_tsfyr = document.getElementById("zr_tsfyr");
zr_zayd.addEventListener("click", zyadh);
zr_naqs.addEventListener("click", nqsan);
zr_tsfyr.addEventListener("click", tsfyr);
thdyth_alshashh();
