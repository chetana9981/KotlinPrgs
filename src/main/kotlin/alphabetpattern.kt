fun main() {

    var last = 'D'
    var alphabet = 'A'

    for(i in 1 .. last - 'A'){
        for(j in 1 .. i){
            print("$alphabet")
        }
        ++alphabet
        println()
    }
}