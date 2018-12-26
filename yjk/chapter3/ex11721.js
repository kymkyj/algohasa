breakStr('BaekjoonOnlineJudge')
function breakStr(str) {
  var lastIdx = 0
  if (/^([a-zA-Z]{1,100})$/.test(str)) {
    for (var i = 1; i <= str.length; i++) {
      if (i % 10 === 0) {
        console.log(str.substr(lastIdx, 10))
        lastIdx = i
      } else if (str.length - lastIdx <= 10) {
        console.log(str.substr(lastIdx, str.length))
        return false
      }
    }
  } else {
    return false
  }
}
