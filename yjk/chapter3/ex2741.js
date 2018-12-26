outputN(5)

function outputN(number) {
  if (number <= 100000) {
    for (var i = 1; i <= number; i++) {
      console.log(parseInt(i))
    }
  } else {
    console.log('100000보다 작은 수를 입력하세요.')
  }
}
