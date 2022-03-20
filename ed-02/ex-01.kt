fun fatorial(): Int {
    var num: Int
    println("Digite um num: ")
    num = readLine()!!.toInt()

    var a = num
    while (num > 1){
        a = a * (num-1)
        num -=1
    }
    return a
}
fun main(){
    println(fatorial())
}