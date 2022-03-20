fun main() {
    println("Digite as Medias: ")
    var media1 = readLine()!!.toFloat()
    var media2 = readLine()!!.toFloat()
    var media3 = readLine()!!.toFloat()
    println(mediaPonderada(media1, media2, media3))

}

fun mediaPonderada(a: Float, b: Float, c: Float): Float{
    var m1 = a * 2
    var m2 = b * 3
    var m3 = c * 5
    var media = (m1 + m2 + m3)/10
    return media
}