// 어떤 양의 정수 X의 자리수가 등차수열을 이룬다면, 그 수를 한수라고 한다. 
// 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. 
// N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 

// 입력 110
// 첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.

// 출력 99
// 첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.

var fs = require('fs');
// var input = fs.readFileSync('/dev/stdin');
var input = fs.readFileSync('test/input.txt');
var num = parseInt(input);

getCount(num);

function getCount(n) {
  var count = 0;
  if(n > 1000) {
    return false;
  }
  while(n) {
    count += checkHansu(n) ? 1 : 0;
    n--;
  }
  console.log(count);
}

function checkHansu(n) {
  var a = Math.floor(n / 100);
  var b = Math.floor(n % 100 / 10);
  var c = n % 10;
  
  if(n > 0 && n < 100) {
    return true;
  } else {
    return isHansu(a, b, c);
  }
}

function isHansu(a, b, c) {
  var hansu = false;
  if(c-b == b-a) {
    hansu = true;
  }
  return hansu;
}