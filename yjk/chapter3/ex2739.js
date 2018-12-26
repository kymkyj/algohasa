multiplication(2)

function multiplication(num) {
  var num = parseInt(num)
  if (num > 0 && num < 10) {
    for (var i = 1; i < 10; i++) {
      console.log(num + ' * ' + i + ' = ' + i * num)
    }
  } else {
    return false
  }
}
