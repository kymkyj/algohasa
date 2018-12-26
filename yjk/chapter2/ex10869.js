// A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B

console.log(add(3, 4))
console.log(subtract(3, 4))
console.log(multiply(3, 4))
console.log(divide(3, 4))
console.log(remainder(3, 4))

function add(a, b) {
  return returnNumber(a) + returnNumber(b)
}

function subtract(a, b) {
  return returnNumber(a) - returnNumber(b)
}

function multiply(a, b) {
  return returnNumber(a) * returnNumber(b)
}

function divide(a, b) {
  return returnNumber(a) / returnNumber(b)
}

function remainder(a, b) {
  return returnNumber(a) % returnNumber(b)
}

function returnNumber(num) {
  return num >= 0 && num <= 10000 ? parseInt(num) : 0
}
