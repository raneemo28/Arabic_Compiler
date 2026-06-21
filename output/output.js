function اضرب(ا, ب) {
    return ا * ب;
}
function احسب-الكل(ا, ب, ج) {
    const ضرب = اضرب(ا, ب);
    const ناتج = ضرب + ج;
    return ناتج;
}
const النتيجة-النهائية = احسب-الكل(2, 3, 4);
console.log(النتيجة-النهائية);
var المجموع = 0;
for (var فهرس = 1; فهرس <= 5; فهرس = فهرس + 1) {
    المجموع = المجموع + فهرس;
}
console.log(المجموع);
var محاولات = 0;
var نجح = false;
while (محاولات < 3 && نجح == false) {
    محاولات = محاولات + 1;
    if (محاولات == 3) {
    نجح = true;
}
}
console.log(محاولات);
try {
    const قيمة = اضرب(5, 2);
    console.log(قيمة);
} catch (خطا) {
    console.log("حدث خطا");
} finally {
    console.log("انتهت المحاولة");
}
console.log("تم عرض القسم");
