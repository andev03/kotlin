fun main(args: Array<String>) {
    // Ép kiểu tường minh

    var soA:Int = 35;
    var soB:Long = soA.toLong()

    // kiểm tra kiểu loại
    println(soA::class.java.typeName)
    println(soB::class.java.typeName)

    // ép kiểu hẹp
    var x:Short = 32767
    var y:Byte = x.toByte()

    println("X = $x")
    println("X = $y")

}