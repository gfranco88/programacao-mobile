fun main(){
    ordemCrescente()

}
fun ordemCrescente(){

    val numeros: MutableList<Float> = mutableListOf()
    println("Digete 3 numeros: ")
    val a = readLine()!!.toFloat()
    val b = readLine()!!.toFloat()
    val c = readLine()!!.toFloat()

    numeros.add(a)
    numeros.add(b)
    numeros.add(c)

    println(numeros.sorted())
    //return numeros
}