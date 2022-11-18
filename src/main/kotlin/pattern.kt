fun main() {
    var row = 5
    var col = 6
    //1
    for (i in 1.. row){
        for(j in 1 .. col){
            print("*")
        }
        println()
    }
    //2
    for (i in 1..row){
        for(j in 1.. i){
            print("*")
        }
        println()
    }
    //3
    for (i in 1.. row){
        for(j in 1..i){
            print("$j")
        }
        println()
    }
    //4
    for (i in 1.. row){
        for(j in 1.. i){
            print("$i")
        }
        println()
    }

    //5
    for (i in 1.. row){
        for(j in 1.. col){
            if(i == 1 || i== row || j ==1 || j==col){
                print("*")
            }
            else
                print(" ")
        }
        println()
    }

}