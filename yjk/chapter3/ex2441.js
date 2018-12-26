printstar(5)

function printstar(num) {
  if (num > 100) {
    return false
  }

  var space = ''
  var star = ''

  for (var i = 0; i < num; i++) {
    for (var j = num; j > i; j--) {
      star += '*'
    }
    console.log(space + star)
    space += '1'
    star = ''
  }
}
