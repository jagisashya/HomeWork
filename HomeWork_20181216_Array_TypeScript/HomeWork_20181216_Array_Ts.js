function printArray(vector) {
    //    function printArray (vector:Array<number>){
    for (var i in vector) {
        console.log("Value at position {i} from vector ==> ", vector[i]);
    }
    console.log("Another way ==> ", vector);
}
function AverageArray(vector) {
    //    function printArray (vector:Array<number>){
    console.log("Average value  ==>", vector.reduce(function (accumulator, currentValue) { return accumulator + currentValue; }) / vector.length);
}
function maxValue(vector) {
    //    function printArray (vector:Array<number>){
    console.log("Max value  ==>", vector.reduce(function (accumulator, currentValue) {
        return Math.max(accumulator, currentValue);
    }));
}
function minValue(vector) {
    //    function printArray (vector:Array<number>){
    console.log("Min value  ==>", vector.reduce(function (accumulator, currentValue) { return Math.min(accumulator, currentValue); }));
}
function indexMaxValue(vector) {
    //    function printArray (vector:Array<number>){
    console.log("Indes of man value  ==>", vector.indexOf(vector.reduce(function (accumulator, currentValue) { return Math.max(accumulator, currentValue); })));
}
function indexMinValue(vector) {
    //    function printArray (vector:Array<number>){
    console.log("Indes of min value  ==>", vector.indexOf(vector.reduce(function (accumulator, currentValue) { return Math.min(accumulator, currentValue); })));
}
function sumPair(vector) {
    //    function printArray (vector:Array<number>){
    console.log("Pair array  ==> ", vector.filter(function (currentValue) {
        if (currentValue % 2 == 0) {
            return currentValue;
        }
        ;
    }));
    console.log("Sum of pairs values  ==>", (vector.reduce(function (accumulator, currentValue) {
        return (currentValue % 2 == 0) ? accumulator + currentValue : accumulator;
    }, 0)));
}
function sumOdd(vector) {
    //    function printArray (vector:Array<number>){
    console.log("Odd array  ==> ", vector.filter(function (currentValue) { return (currentValue % 2 != 0); }));
    console.log("Sum of pairs values  ==>", (vector.reduce(function (accumulator, currentValue) {
        return (currentValue % 2 != 0) ? accumulator + currentValue : accumulator;
    }, 0)));
}
function amountGT0(vector) {
    var count = 0;
    console.log("Amount of numbers GT 0 ", vector.reduce(function (accumulator, currentvalue) { return currentvalue > 0 ? ++count : 0; }, 0));
}
function amountEQ0(vector) {
    var count = 0;
    console.log("Amount of numbers EQ 0 ", vector.reduce(function (accumulator, currentvalue) { return currentvalue == 0 ? ++count : 0; }, 0));
}
function sumAllCells(vector) {
    var sumAllCells = 0;
    for (var i in vector) {
        sumAllCells += vector[i];
        //     console.log("Sum of all cells ==> ", sumAllCells, vector[i]);
    }
    console.log("Sum of all cells - first way   ==> ", sumAllCells);
    console.log("Sum of all cells - second way  ==> ", vector.reduce(function (a, atual) { return a + atual; }, 0));
    console.log("Sum of all cells - third way   ==> ", vector.reduce(function (accumulator, currentValue) { return accumulator + currentValue; }));
}
// console.log("estou na rotina");
var array = new Array(10);
for (var x = 0; x < array.length; x++) {
    array[x] = Math.floor(Math.random() * 200);
}
printArray(array);
sumAllCells(array);
AverageArray(array);
maxValue(array);
indexMaxValue(array);
minValue(array);
indexMinValue(array);
sumPair(array);
sumOdd(array);
amountGT0(array);
amountEQ0(array);
