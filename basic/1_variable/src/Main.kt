fun main(args: Array<String>) {
    //Khởi tạo biến
    var soA:Int = 65
    var soB:Short = 5

    println("Giá trị của số A là: $soA")
    println("Giá trị của số A là: $soB")

    // đặt tên biến

    var diemToan:Float
    var diemVan:Float
    var giaThuocTay:Double

    // Khai báo số thực
    var v:Double = 8.5
    var z = 10.75

    println("Kiểu biến của z là " + (z::class.java.typeName))

    var k:Float = 7.5f
    var l:Long = 70000L

    // Kí tự và chuỗi

    var kyTu:Char = 'A'
    var chuoi:String = "Hello World"

    // Khai báo đoạn
    var doan = """
        Thân em vừa trắng lại vừa tròn
        Bảy nổi ba chìm với nước non
    """

    // Khai báo bool
    var check1:Boolean = true
    var check2:Boolean = false

    // Khai báo mảng
    var mangSothuc:FloatArray = floatArrayOf(0.5f, 7.5f)
    var mangKyTu:CharArray = charArrayOf('A', 'B');

    // Khai báo hằng số
    val nhietDoSoi:Int = 100;
}
