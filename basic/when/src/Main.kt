fun main() {

/*    var i:Int = 1

    when(i){
        1 -> println("Thím bấm số 1")
        2 -> println("Thím bấm số 2")
        3 -> println("Thím bấm số 3")
        else -> println("Thím bấm tào lao")
    }*/

//    var i2:Int = 0
//    println("Mời nhập vào 1 số nguyên: ")
//    var s:String? = readLine()
//    if(s != null){
//        i2 = s.toInt()
//    }
//    // ktra theo cấu trúc when
//    when (i2%2){
//        0 -> println("$i2 là số chẵn")
//        else -> println("$i2 là số lẻ")
//    }
/*
    var i3:Int = 0
    println("Mời nhập vào 1 tháng: ")
    var s:String? = readLine()
    if(s != null){
        i3 = s.toInt()
    }
    // ktra theo cấu trúc when
    when (i3){
        1,2,3 -> println("$i3 là quý 1")
        4,5,6 -> println("$i3 là quý 2")
        7,8,9 -> println("$i3 là quý 3")
        10,11,12 -> println("$i3 là quý 4")
        else -> println("$i3 là tháng tào lao")
    }*/

//    var thuNhap:Int = 0
//    println("Mời thím nhập vào thu nhập triệu / tháng")
//    var s:String? = readLine()
//    if(s != null){
//        thuNhap = s.toInt()
//    }
//    when(thuNhap){
//        in 1 .. 3 -> println("Lương k cao lắm")
//        in 4 .. 7 -> println("Lương thâp")
//        in 7 .. 15 -> println("Lương cao")
//    }

//    var a:Int = 101
//
//    var check = when (a) {
//        in 0 .. 100 -> false
//        else -> true
//    }
//    println(check)

    // Dùng when như 1 biểu thức if else
    var a:Int = 99
    when
    {
        a%2 == 0 -> println("$a là số chẵn")
        a%2 != 0 -> println("$a là số lẻ")
    }
}