compare('20 10 10')
function compare(num) {
  var numArr = []
  var strArr = num.split(' ')
  if (strArr.length) {
    for (var i = 0; i < strArr.length; i++) {
      numArr.push(parseInt(strArr[i]))
    }

    var temp = 0

    for (var i = 0; i < numArr.length; i++) {
      for (var j = 0; j < numArr.length - 1; j++) {
        if (numArr[j] > numArr[j + 1]) {
          temp = numArr[j]
          numArr[j] = numArr[j + 1]
          numArr[j + 1] = temp
        }
      }
    }

    console.log(numArr)
    console.log(numArr[1])
  } else {
    return false
  }
}
