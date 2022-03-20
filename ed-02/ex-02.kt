fun main(){
    fat0a10()
}
fun fat0a10(){
    for (i in 0..10){
        if(i == 0 ){ println("!0 = 1") }

        else if(i == 1){ println("!1 = 1") }

        else{
            var num = i
            var a = num
            while (num > 1) {

                a *= (num- 1)
                num--
            }
            println("!$i = $a")
        }
    }
}




