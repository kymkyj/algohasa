console.log(grade(87.5))

function grade(score) {
  if (score < 0 || score > 100) {
    return false
  } else {
    score = parseInt(score)
  }
  var result
  if (score >= 90 && score <= 100) {
    result = 'A'
  } else if (score >= 80 && score < 90) {
    result = 'B'
  } else if (score >= 70 && score < 80) {
    result = 'C'
  } else if (score >= 60 && score < 70) {
    result = 'D'
  } else {
    result = 'F'
  }
  return score + '점 ' + result
}
