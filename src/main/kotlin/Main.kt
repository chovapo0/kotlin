fun main() {
    print("Введите сумму перевода в рублях: ")
    var amount = readln().toDouble()
    val minCommission = 35.0
    val difference = amount * 0.0075
    val commission: Double
    if (difference >= minCommission) {
        amount = amount - difference
        commission = difference
    } else {
        amount = amount - minCommission
        commission = minCommission
    }
    println("Сумма перевода, с учетом комиссии: $amount₽. Комиссия: $commission₽")

    println()
    print("Введите количество отметок 'Понравилось': ")
    val likes = readln().toInt()
    if (likes % 10 == 1 && likes % 100 != 11) {
        println("Понравилось $likes человеку")
    } else {
        println("Понравилось $likes людям")
    }

    println()
    print("Какую сумму потратил пользователь?: ")
    var sum = readln().toDouble()

    print("Вы являетесь постоянным покупателем (да или нет)?: ")
    var answer = readln()
    while (answer != "да" && answer != "нет") {
        print("Неверный формат ввода (да или нет), пожалуйста повторите: ")
        answer = readln()
    }
    val isRegularCustomer = answer == "да"

    var hasDiscount = false
    if (sum >= 1001 && sum <= 10000) {
        sum = sum - 100
    } else if (sum >= 10001) {
        sum = sum - (sum * 0.05)
        hasDiscount = true
    }

    if (hasDiscount && isRegularCustomer) {
        sum = sum - (sum * 0.01)
    }

    println("Сумма покупки, с учетом скидок: $sum₽")
}