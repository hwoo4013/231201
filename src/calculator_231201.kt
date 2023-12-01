fun main() {

  print("첫번째 숫자를 입력하세요 :")
  val number1 = readLine()?.toDoubleOrNull()

  if(number1 == null) {
    println("올바른 숫자를 입력하세요.")

    return
  }

  print("연산자를 입력하세요(+. -, *, /, %) :")
  var operator = readLine()

  print("두 번째 숫자를 입력하세요: ")
  val number2 = readLine()?.toDoubleOrNull()

  if (number2 == null) {
    println("올바른 숫자를 입력하세요.")
    return
  }

  val result = when (operator) {
    "+" -> number1 + number2
    "-" -> number1 - number2
    "*" -> number1 * number2
    "%" -> number1 % number2
    "/" -> if (number2 != 0.0) number1 / number2 else "0으로 나눌 수 없습니다."
    else -> "올바른 연산자를 입력하세요."
  }

  println("결과: $result")
    }
