// 정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

// 명령은 총 여섯 가지이다.

// push X: 정수 X를 큐에 넣는 연산이다.
// pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
// size: 큐에 들어있는 정수의 개수를 출력한다.
// empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
// front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
// back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.

// 입력
// 첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 
// 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다. 주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.

// 출력
// 출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.

var fs = require('fs');
var input = fs.readFileSync('test/input.txt').toString().split('\n');
var row = parseInt(input[0]);
var queue = [];

test(row);

function test(row) {
  if(row === 0 || row > 10000) {
    return false;
  }

  for(var i=1; i<=row; i++) {
    queueOperator(input[i]);
  }
};

function queueOperator(inputVal) {
  var inputArr = inputVal.split(' ');
  var order = inputArr[0];

  // console.log('queue  : ', queue);
  switch (order) {
    case 'push' :
      queue.push(inputArr[1]);
    break;
    case 'pop' : 
      if(queue.length) {
        console.log(queue[0]);
        queue.shift();
      } else {
        console.log('-1');
      }
      break;
    case 'size' :
      console.log(queue.length);
    break;
    case 'empty' : 
      if(queue.length) {
        console.log('0');
      } else {
        console.log('1');
      }
    break;
    case 'front' : 
      if(queue.length) {
        console.log(queue[0]);
      } else {
        console.log('-1');
      }
      break;
    case 'back' : 
      if(queue.length) {
        console.log(queue[queue.length-1]);
      } else {
        console.log('-1');
      }
      break;
    default:
    break;
  }
}