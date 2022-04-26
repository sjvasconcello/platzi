def f(x: Int) = x*x
f(2) // Output: Int = 4

val a = def f(x: Int) = x*x

a(4) // Output: Int = 4

f.apply(2) // Output: ERROR
a.apply(2) // Output: Int = 4 (Se trata como objeto)

def g(h: Int => Int) = h(3)

h(f) // Output: Int = 9

def k(h: Int => Int)(x => Int) = h(X)

k(f)(3) // Output: Int = 9

object Util {
  def metodo(x: Int) = x+x
  val a = metodo _
}

object isGreather {
  def metodo(x: Int, y: Int) = x>y
  val a = metodo _
}


def comparar(fx: (Int, Int) => Boolean, a: Int, b: Int): Boolean = fx(a,b)

comparar(isGreatherObj, 3, 1)