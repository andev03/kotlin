fun main() {
    var a = 10 //khai báo tắt, tự động nhận kiểu int
    var b = 3 //khai báo tắt, tự động nhận kiểu int

    println(a::class.java.typeName)
    println(a::class.java.typeName)
    // phéo cộng
    println("Cách 1 a + b = " + (a + b))
    println("Cách 2 a + b = " + (a.plus(b)))

    // phéo trừ
    println("Cách 1 a - b = " + (a + b))
    println("Cách 2 a - b = " + (a.minus(b)))

    // phéo nhân
    println("Cách 1 a * b = " + (a * b))
    println("Cách 2 a * b = " + (a.times(b)))

    // phéo chía
    println("Cách 1 a * b = " + (a / b))
    println("Cách 2 a * b = " + (a.div(b)))

    // phéo chía lấy phần dữ rem
    println("Cách 1 a * b = " + (a % b))
    println("Cách 2 a * b = " + (a.rem(b)))

    var x:Float = 9.2f
    // -:trừ một ngôi đảo dấu
    var y = x.unaryMinus()
    println("x = " + x)
    println("y = " + y)
    // Cộng 1 ngôi
    var z = y.unaryPlus()
}