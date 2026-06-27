let alrqm_alsry = 42;
let add_almhawlat = 0;
let antht_allabh = false;
function thqq_mn_altkhmyn() {
    if (antht_allabh === true) {
    return;
}
    let alhql = document.getElementById("hql_altkhmyn");
    let ns_altkhmyn = alhql.value;
    if (ns_altkhmyn === "") {
    alert("الرجاء إدخال رقم");
    return;
}
    let altkhmyn = ns_altkhmyn * 1;
    if (altkhmyn !== altkhmyn) {
    alert("الرجاء إدخال رقم صحيح");
    alhql.value = "";
    return;
}
    add_almhawlat = add_almhawlat + 1;
    let rsalh = document.getElementById("alrsalh");
    let mhawlat = document.getElementById("almhawlat");
    mhawlat.innerText = "عدد المحاولات " + add_almhawlat;
    if (altkhmyn === alrqm_alsry) {
    rsalh.innerText = "صحيح لقد خمنت الرقم في " + add_almhawlat + " محاولة";
    antht_allabh = true;
    console.log("انتهت اللعبة عدد المحاولات ", add_almhawlat);
} else if (altkhmyn < alrqm_alsry) {
    rsalh.innerText = "الرقم أكبر من ذلك حاول مرة أخرى";
} else {
    rsalh.innerText = "الرقم أصغر من ذلك حاول مرة أخرى";
}
    alhql.value = "";
}
function aaadh_allabh() {
    alrqm_alsry = 42;
    add_almhawlat = 0;
    antht_allabh = false;
    document.getElementById("alrsalh").innerText = "ابدأ التخمين الرقم بين ١ و ١٠٠";
    document.getElementById("almhawlat").innerText = "عدد المحاولات ٠";
    document.getElementById("hql_altkhmyn").value = "";
    console.log("تم بدء لعبة جديدة");
}
let zr_altkhmyn = document.getElementById("zr_altkhmyn");
let zr_aaadh = document.getElementById("zr_aaadh");
zr_altkhmyn.addEventListener("click", thqq_mn_altkhmyn);
zr_aaadh.addEventListener("click", aaadh_allabh);
aaadh_allabh();
