// 첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)
// 첫째 줄에 (A+B)%C, 둘째 줄에 (A%C + B%C)%C, 셋째 줄에 (A×B)%C, 넷째 줄에 (A%C × B%C)%C를 출력한다.

var a = 5,
  b = 8,
  c = 4
console.log((returnNumber(a) + returnNumber(b)) % returnNumber(c))
console.log(
  ((returnNumber(a) % returnNumber(c)) + (returnNumber(b) % returnNumber(c))) %
    returnNumber(c)
)
console.log((returnNumber(a) * returnNumber(b)) % returnNumber(c))
console.log(
  (((returnNumber(a) % returnNumber(c)) * returnNumber(b)) % returnNumber(c)) %
    returnNumber(c)
)

function returnNumber(num) {
  return num >= 2 && num <= 10000 ? parseInt(num) : 0
}
