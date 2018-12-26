outputRevers(5)

function outputRevers(number) {
  if (number <= 100000) {
    for (var i = number; i > 0; i--) {
      console.log(parseInt(i))
    }
  } else {
    console.log('100000보다 작은 수를 입력하세요.')
  }
}
