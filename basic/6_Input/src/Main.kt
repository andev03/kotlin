fun main() {
    var a1:Boolean = "true".toBoolean()

    println(a1)
    println(a1::class.java.typeName)

    var a2:Byte = "2".toByte()
    var a3:Short = "20".toShort()
    var a4:Int = "20".toInt()
    var a6:Float = "20.5".toFloat()

    println(a6)
    println(a6::class.java.typeName)

    // Nhập chuỗi từ bàn phím
    println("Mời cụ nhập vào tên: ")
    var ten:String? = readLine()

    println("tên cụ vừa nhập là: " + ten)

    // nhập số từ bàn phim
    var soA:Int
    println("Mời cụ nhập vào 1 số nguyên: ")
    var s:String? = readLine()
    if(s != null){
        soA = s.toInt()
        println(soA)
    }
}