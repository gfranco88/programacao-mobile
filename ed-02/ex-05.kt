fun main(){
    println(contamoedas())
}

fun contamoedas() {
    println("Digite o Valor: ")
    var a = readLine()!!.toDouble()
    var moeda100 = 0
    var moeda050 = 0
    var moeda025 = 0
    var moeda010 = 0
    var moeda005 = 0
    var moeda001 = 0

    while(a > 0.01){
        if(a >= 1){
            a -=1.0
            moeda100++
        }
        else if(a >= 0.5){
            a -=0.5
            moeda050++
        }
        else if(a >= 0.25){
            a -=0.25
            moeda025++
        }
        else if((a >= 0.10)){
            a -=0.10
            moeda010++
        }
        else if((a >= 0.05)){
            a -=0.05
            moeda005++
        }
        else if((a >= 0.01)){
            a -=0.01
            moeda001++
        }
        else {
            break
        }

    }
    println("O numero de moedas de 1.00  = $moeda100")
    println("O numero de moedas de 0.50  = $moeda050")
    println("O numero de moedas de 0.25  = $moeda025")
    println("O numero de moedas de 0.10  = $moeda010")
    println("O numero de moedas de 0.05  = $moeda005")
    println("O numero de moedas de 0.01  = $moeda001")

}