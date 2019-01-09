// 위의 그림과 같이 육각형으로 이루어진 벌집이 있다. 그림에서 보는 바와 같이 중앙의 방 1부터 시작해서 이웃하는 방에 돌아가면서 1씩 증가하는 번호를 주소로 매길 수 있다. 
// 숫자 N이 주어졌을 때, 벌집의 중앙 1에서 N번 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나가는지(시작과 끝을 포함하여)를 계산하는 프로그램을 작성하시오. 
// 예를 들면, 13까지는 3개, 58까지는 5개를 지난다.

var fs = require('fs');
// var input = fs.readFileSync('/dev/stdin');
var input = fs.readFileSync('test/input.txt').toString();
var findNum = parseInt(input);

countPassByRoom(findNum);

function countPassByRoom(num) {
  if(num == 0 || num > 1000000000) {
    return false;
  }

  var offset = 6;
  var passCnt = 0;

  //1-7(6) 나 포함이기때문에 1을 제외하고는 2번부터 시작. 7-19(12) 1번 방포함 3번, 20-38(18) 1번 방 포함 4번 39-58(21) 1번 방 포함 5번...
  for(roomCnt = 1; roomCnt<=num; roomCnt++) {
    passCnt++; // 무조건 for문 들어오면 1씩 증가
    if(num > 1) {
      var lange = offset * passCnt + roomCnt;
      if(lange > num) { // 범위가 입력 받은 숫자보다 커야 체크 가능
        while(roomCnt <= lange) {
          if(roomCnt == num) {
            // 멈춘다. 그리고 for문도 빠져 나옴.
            passCnt = num === 1 ? passCnt : passCnt + 1;
            break;
          }
          roomCnt++;
        }
      }
    } else {
      break;
    }
    roomCnt = lange; // 범위
  }
  console.log(passCnt);
}
