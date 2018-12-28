lessThanNumber(10, 5)

function getRange(numStr) {
  var strArr = numStr.split(' ')
  for (var i = 0; i < strArr.length; i++) {
    numArr.push(parseInt(strArr[i]))
  }
  return numArr
}
var result = ''
var max = 10000
var min = 1
function lessThanNumber(len, num) {
  // var numArr = getRange(numStr); // 직접 수를 입력 받는 경우
  var numArr = []
  console.log(Math.floor(Math.random() * (max - min + 1)) + min)
  for (var i = 0; i < len; i++) {
    // numArr.push(Math.floor(Math.random() * (max - min + 1)) + min)
  }
  console.log(numArr)

  for (var i = 0; i < numArr.length; i++) {
    if (numArr[i] < num) {
      result += ' ' + numArr[i]
    }
  }

  console.log(result)
}
