// 알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.

// 길이가 짧은 것부터
// 길이가 같으면 사전 순으로

// 입력
// 첫째 줄에 단어의 개수 N이 주어진다. (1≤N≤20,000) 둘째 줄부터 N개의 줄에 걸쳐 알파벳 소문자로 이루어진 단어가 한 줄에 하나씩 주어진다. 
// 주어지는 문자열의 길이는 50을 넘지 않는다.

// 출력
// 조건에 따라 정렬하여 단어들을 출력한다. 단, 같은 단어가 여러 번 입력된 경우에는 한 번씩만 출력한다.

var fs = require('fs');
// var input = fs.readFileSync('/dev/stdin');
var input = fs.readFileSync('test/input.txt').toString().split('\n');
var wordCnt = parseInt(input[0]);
var wordArr = [];

if(wordCnt > 0 && wordCnt <= 20000) {
  while(wordCnt) {
    wordArr.push(input[wordCnt]);
    wordCnt--;
  }

  if(wordArr.length <= 50) {
    wordArr.sort(); // 아스키로 문자까지는 정렬해줌
    sort(wordArr);
  }
}

// 1차 sort 길이 정렬
function sort(wordArr) {
  for(var i=0; i<wordArr.length; i++) {
    for(var j=0; j<wordArr.length; j++) {
      if(wordArr[i].length < wordArr[j].length) {
        var temp = wordArr[i];
        wordArr[i] = wordArr[j];
        wordArr[j] = temp;
      }
    }
  }
}
// 출력;
wordArr.filter(function(val, idx) {
  if(wordArr[idx] !== wordArr[idx+1]) {
    console.log(val);
  }
});