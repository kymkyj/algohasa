// 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오. 
// 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.

// QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.

// 입력
// 첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 
// 각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8), 문자열 S가 공백으로 구분되어 주어진다. S의 길이는 적어도 1이며, 20글자를 넘지 않는다. 

// 출력
// 각 테스트 케이스에 대해 P를 출력한다.

var fs = require('fs');
var input = fs.readFileSync('test/input.txt');
var inputArr = input.toString().split('\n');
var T = parseInt(inputArr[0]);
var P = '';

if(T > 0 && T <= 1000) {
  for(var i=1; i<=T; i++) {
  var P = '';
  var R = inputArr[i].split(' ')[0];
  var rNum = parseInt(R);
  var S = inputArr[i].split(' ')[1];

  if(rNum > 0 && rNum <= 8) {
    if(S.length > 0 && S.length <= 20 && /([\\$%*+-./:A-Z0-9])/.test(S)) {
      var sArr = S.split('');
      for(var sIdx = 0; sIdx<sArr.length; sIdx++) {
        for(var j=0; j<rNum; j++) {
          P += sArr[sIdx];
        }
      }
        console.log(P);
      }
    }
  }
}