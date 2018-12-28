printstar(5)

function printstar(num) {
  if (num > 100) {
    return false
  }

  var space = ''
  var star = ''

  for (var i = num; i > 0; i--) {
    space += '1'
    for (var j = 0; j < i; j++) {
      star += '*'
    }
    console.log(star + space)
    star = ''
  }
}
