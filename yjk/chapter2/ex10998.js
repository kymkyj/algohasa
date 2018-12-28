multiplyNum(3, 4)

function multiplyNum(a, b) {
  a = returnInt(a)
  b = returnInt(b)
  var multiply = a * b
  return a === 0 || b === 0
    ? console.log('0보다 크고 10보다 작은 정수만 입력해주세요')
    : console.log(multiply)
}

function returnInt(num) {
  return num > 0 && num < 10 ? parseInt(num) : 0
}
