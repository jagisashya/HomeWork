
function printArray(vector: any) {
    //    function printArray (vector:Array<number>){
    for (let i in vector) {
        console.log("Value at position {i} from vector ==> ", vector[i]);
    }
    console.log("Another way ==> ", vector);

}

function AverageArray(vector: any) {
    //    function printArray (vector:Array<number>){
    console.log("Average value  ==>", vector.reduce(function (accumulator, currentValue) { return accumulator + currentValue }) / vector.length);
}

function maxValue(vector: any) {
    //    function printArray (vector:Array<number>){
    console.log("Max value  ==>", vector.reduce((accumulator, currentValue) =>
        Math.max(accumulator, currentValue)));
}

function minValue(vector: any) {
    //    function printArray (vector:Array<number>){
    console.log("Min value  ==>", vector.reduce((accumulator, currentValue) => Math.min(accumulator, currentValue)));

}

function indexMaxValue(vector: any) {
    //    function printArray (vector:Array<number>){
    console.log("Indes of man value  ==>", vector.indexOf
        (vector.reduce
            ((accumulator, currentValue) => Math.max(accumulator, currentValue))
        )
    );

}

function indexMinValue(vector: any) {
    //    function printArray (vector:Array<number>){
    console.log("Indes of min value  ==>", vector.indexOf
        (vector.reduce
            ((accumulator, currentValue) => Math.min(accumulator, currentValue))
        )
    );

}

function sumPair(vector: any) {
    //    function printArray (vector:Array<number>){
    console.log("Pair array  ==> ", vector.filter
        (function (currentValue) {
            if (currentValue % 2 == 0) { return currentValue };
        }
        ));
    console.log("Sum of pairs values  ==>",
        (vector.reduce
            ((accumulator, currentValue) =>
                (currentValue % 2 == 0) ? accumulator + currentValue : accumulator, 0)
        )
    );

}

function sumOdd(vector: any) {
    //    function printArray (vector:Array<number>){
    console.log("Odd array  ==> ", vector.filter
        ((currentValue) => (currentValue % 2 != 0)));
        
    console.log("Sum of pairs values  ==>",
        (vector.reduce
            (function (accumulator, currentValue) {
                return (currentValue % 2 != 0) ? accumulator + currentValue : accumulator;
            }, 0)
        )
    );

}

function amountGT0 (vector:any){
    let count:number = 0;
    console.log("Amount of numbers GT 0 ",
    vector.reduce((accumulator,currentvalue) => currentvalue > 0?++count:0,0))
}

function amountEQ0 (vector:any){
    let count:number = 0;
    console.log("Amount of numbers EQ 0 ",
    vector.reduce((accumulator,currentvalue) => currentvalue == 0?++count:0,0))
}

function sumAllCells(vector: any) {
    let sumAllCells: number = 0;
    for (let i in vector) {
        sumAllCells += vector[i];
        //     console.log("Sum of all cells ==> ", sumAllCells, vector[i]);
    }
    console.log("Sum of all cells - first way   ==> ", sumAllCells);
    console.log("Sum of all cells - second way  ==> ", vector.reduce((a, atual) => a + atual, 0));
    console.log("Sum of all cells - third way   ==> ", vector.reduce(
        function (accumulator, currentValue) { return accumulator + currentValue }));
}


// console.log("estou na rotina");

let array: Array<number> = new Array<number>(10);

for (let x = 0; x < array.length; x++) {
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