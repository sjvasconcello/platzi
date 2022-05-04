val a1 = Seq(1,2,3)

a1.appended(4)
val a2 = a1.appended(4)
a1 :+ 4 // a1.appended(4)
a1 .:+(4) // a1.appended(4)
a1 appended 4 // a1.appended(4)
a2(0) // Int = 1
a2(4) // ERROR

///// SETS
val c1 = Set(1,2,3)
val c2 = c1.incl(4)

c1 + 4 // c1.incl(4)
c2(4) // Boolean = true
c2(0) // Boolean = false

///// MAP
val m1 = Map((1,"hello"))
val m1 = Map(1 -> "hello")

val m2 = m1 + (2 -> "hola")
val m2 = m1 + ((2, "hola"))

c2.map(x => x+1)
m2.view.mapValues(s => s + "!")

/// Reto
