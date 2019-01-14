var fs = require('fs');
var input = fs.readFileSync('test/input.txt').toString().split('\n');
var lenNum = parseInt(input[0]);
var numArr = input[1].split(' ');

getCountPrimeNumber(lenNum, numArr);

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

function getCountPrimeNumber(len, numArr) {
  if(len > 100) {
    return false;
  }

  if(numArr.length !== len) {
    return false;
  } else {
    for(var i=0; i<len; i++) {
      if(numArr[i] <= 1000) {
        numArr[i] = parseInt(numArr[i]);
      }
    }
  }

  var primeArr = [];
  
  for(var j=0; j<numArr.length; j++) {
    if(isPrime(numArr[j])) {
      primeArr.push(numArr[j]);
    }
  }
  console.log(primeArr.length);
};