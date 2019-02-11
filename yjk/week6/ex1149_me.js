/**
 * RGB거리
 * RGB거리에 사는 사람들은 집을 빨강, 초록, 파랑중에 하나로 칠하려고 한다. 
 * 또한, 그들은 모든 이웃은 같은 색으로 칠할 수 없다는 규칙도 정했다. 
 * 집 i의 이웃은 집 i-1과 집 i+1이다.
 * 각 집을 빨강으로 칠할 때 드는 비용, 초록으로 칠할 때 드는 비용, 파랑으로 드는 비용이 주어질 때, 모든 집을 칠할 때 드는 비용의 최솟값을 구하는 프로그램을 작성하시오.
 * 
 * 입력
 * 첫째 줄에 집의 수 N이 주어진다. N은 1,000보다 작거나 같다. 
 * 둘째 줄부터 N개의 줄에 각 집을 빨강으로 칠할 때, 초록으로 칠할 때, 파랑으로 칠할 때 드는 비용이 주어진다. 
 * 비용은 1,000보다 작거나 같은 자연수이다.
 * 3
 * 26 40 83
 * 49 60 57
 * 13 89 99
 * 
 * 출력
 * 모든 집을 칠할 때 드는 비용의 최솟값을 출력한다.
 * 
 */
var fs = require('fs');
var input = fs.readFileSync('test/input.txt').toString().split('\n');

var houseCnt = parseInt(input[0]);  // 집의 수

getCost(houseCnt);

function getCost(houseCnt) {

  var minCost = 0;
  var beforeIdx; // undefined

  for(var i=1; i<=houseCnt; i++) {

    // 작은 값 가져오기
    var getMinCost = function(_row, _beforeIdx) {
     
      var numRow = _row.map(function(cost) {
        return parseInt(cost);
      });

      var min = numRow[0];
      for(var i=0; i<numRow.length; i++) {
        if(min > numRow[i+1]) {
          min = numRow[i+1]
        }
      }

      beforeIdx = numRow.indexOf(min);

      // 이전 인덱스 값 체크도 같이 해야함.
      if(beforeIdx !== -1 && beforeIdx === _beforeIdx) {
        numRow[_beforeIdx] = 1000; // 최대값 셋팅
        return getMinCost(numRow);
      } 
      return min;
    }

    minCost += getMinCost(input[i].split(' '), beforeIdx);
  }
  console.log(minCost);
}