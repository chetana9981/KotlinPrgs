package collections

fun main(){
    var players = mutableMapOf<String, String>()
    players.put("Sachin", "Sachin is a batsman")
    players.put("Dhoni","Dhoni is a wicket keeper & batsman")
    players.put("Shami","Shami is a bowler")
    players.put("Dravid", "Dravid is a coach")
    players.put("Dhoni", "Dhoni is a batsman")

    println(players)
    println("size = ${players.size}")

    println("keys ${players.keys}")
    println("value ${players.values}")
    println("both key and values ${players.entries}")
    println(players.get("Dravid"))
    var a:String?= players.get("Dravid")
    println(a)

    for(key in players.keys)
        println(key)
    println("----------")

    for(keyValue in players.entries)
        println(keyValue)
}
