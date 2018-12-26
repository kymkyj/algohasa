var weekArr = ['SUN', 'MON', 'TUE', 'WED', 'THU', 'FRI', 'SAT']

function getDays(month) {
  if ([1, 3, 5, 7, 8, 10, 12].indexOf(month) > -1) {
    return 31
  } else if ([4, 6, 9, 11].indexOf(month) > -1) {
    return 30
  } else if (month === 2) {
    return 28
  }
}

function getWeek(month, day) {
  if (month < 1 || month > 12) {
    return false
  }
  var monthDays = getDays(month)
  if (day < 1 || day > monthDays) {
    console.log('날짜가 넘어간다')
    return false
  }

  var days = monthDays
  var counter = 1
  for (var mon = 1; mon < month; mon++) {
    days += getDays(mon)
  }
  for (var i = 0; i < days; i++) {
    if (days - (monthDays - day) == i + counter) {
      console.log(i + counter + '일' + weekArr[(i + counter) % 7])
    }
  }
}
getWeek(12, 25)
