/**
 * 최대공약수와 최소공배수
 * 두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.
 * 
 * 입력
 * 첫째 줄에는 두 개의 자연수가 주어진다. 이 둘은 10,000이하의 자연수이며 사이에 한 칸의 공백이 주어진다.
 * 
 * 출력
 * 첫째 줄에는 입력으로 주어진 두 수의 최대공약수를,둘째 줄에는 입력으로 주어진 두 수의 최소 공배수를 출력한다.
 * 
 * /dev/stdin
 */
var fs = require('fs');
var input = fs.readFileSync('test/input.txt').toString().trim().split(' ');
var numA = parseInt(input[0]);
var numB = parseInt(input[1]);

// 수 판별
var gNum = numA > numB ? numA : numB;
var lNum = numA > numB ? numB : numA;
console.log(getGCD(gNum, lNum));
console.log(getLCM(gNum, lNum));

function getGCD(a, b) {
  while(b != 0) {
    var r = a%b;
    a = b;
    b = r;
  }
  return a;
}

function getLCM(a, b) {
  return a*b / getGCD(a,b);
}