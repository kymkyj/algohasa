var fs = require('fs');
var input = fs.readFileSync('test/input.txt').toString().split('\n');
var sNum = parseInt(input[0]);
var lNum = parseInt(input[1]);

getSumPrimeNumber(sNum, lNum);

function isPrime(num) {
  for(var i=2; i<=num; i++) {
    if(num%i === 0) {
      if(num === i) {
        return i;
      } else {
        return 0;
      }
    } else if(num === i){
      return i;
    }
  }
}

function getSumPrimeNumber(sNum, lNum) {
  var inputNumArr = new Array(lNum-sNum + 1);
  var i = 0;
  var initNumber = sNum;
  while(i < inputNumArr.length) {
    inputNumArr[i] = initNumber;
    initNumber++;
    i++
  }

  var primeArr = [];
  var sum = 0;
  for(var j=0; j<inputNumArr.length; j++) {
    if(isPrime(inputNumArr[j])) {
      sum += parseInt(inputNumArr[j]);
      primeArr.push(inputNumArr[j]);
    }
  }
  if(primeArr.length) {
    console.log(sum);
    console.log(primeArr[0]);
  } else {
    console.log('-1');
  }
};