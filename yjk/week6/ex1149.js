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
var costArr = [];

for(var i=1 ;i <= houseCnt; i++) {
  costArr.push(input[i].split(' ').map(function(cost) {
    return parseInt(cost);
  }));
}

console.log(costArr);
// var costs = input[1][houseCnt]

getCost(houseCnt);

function getCost(houseCnt) {

  var R = 0, G = 1, B = 2;

  var total_cost = [
    costArr[0][R],
    costArr[0][G],
    costArr[0][B]
  ];

    console.log(total_cost);

  for(var houseNum=1; houseNum<=houseCnt; houseNum++) {
    total_cost[houseNum][R] = Math.min(total_cost[houseNum-1][G], total_cost[houseNum-1][B]) + costArr[houseNum][R];
    total_cost[houseNum][G] = Math.min(total_cost[houseNum-1][R], total_cost[houseNum-1][B]) + costArr[houseNum][G];
    total_cost[houseNum][B] = Math.min(total_cost[houseNum-1][R], total_cost[houseNum-1][G]) + costArr[houseNum][B];
  }

  var result = Math.min(total_cost[houseCnt-1][R], Math.min(total_cost[houseCnt-1][G], total_cost[houseCnt-1][B]));
  console.log(result);
}