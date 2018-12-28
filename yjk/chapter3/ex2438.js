printstar(5)

function printstar(num) {
  if (num > 100) {
    return false
  }

  var str = ''
  for (var i = 0; i < num; i++) {
    for (var j = 0; j <= i; j++) {
      str += '*'
    }
    console.log(str)
    str = ''
  }
}
