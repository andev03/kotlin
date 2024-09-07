fun main() {
    // gán bằng
    var x = 8 // khai báo tắt
    println("Kiểu giá trị của x là " + x::class.java.typeName)
    println("x = " + x)

    // gán cộng bằng
    x+=5
    println("x = " + x)

    // gán trừ bằng
    x-=5
    println("x = " + x)

    // gán chia bằng
    x /= 5
    println("x = " + x)

    // gán chia lấy dư bằng
    x %= 5
    println("x = " + x)
}