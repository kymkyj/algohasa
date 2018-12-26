printstar(5)

function printstar(num) {
  if (num > 100) {
    return false
  }

  var space = ''
  var star = ''

  for (var i = num; i > 0; i--) {
    star += '*'
    for (var j = 1; j < i; j++) {
      space += ' '
    }
    console.log(space + star)
    space = ''
  }
}
