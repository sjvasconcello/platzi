# Programación Funcional con Scala

## [7] - Inmutabilidad

- Mutabilidad
  - Un dado mutable _puede cambiar_ en el tiempo
- Inmutabilidad
  - Algo que _no pude cambiar_ con el tiempo

```scala

var x = 1 // Crear una variable 
var x: Int = 1

val y = 1 // Crear un valor

def z = 1 // Crear una definicion 

```

- Las definiciones son inmutabless
- En general en los lenguajes funcionales evitan los datos mutables

## [7] - Expresiones

- Todo lo que definamos en nuestro codigo es una expresión.
- Nada esta fuera de una expresión
- Valor de retorno
  - El dato al final de una expresión siempre es su valor de retorno
  - Por esa razon no escribimos _return_ ya siempre se retorna algo
  - Si queremos retornar "nada" utilizamos la expresion Unit

```scala

// Es exactamente lo mismo
def x = (3) // Solo poner una expresion
def x = 3
def x = {3} // Usar varias expresiones separadas ;

if (x!=3) "No es tres" else "es tres"

```

## [8] - Expresiones

- Dominio: Todo lo que puede entrar a la funcion
- Rango: Todo lo que puede salir de la funcion

- **Funciones de orden superior**
  - Una funcion es tratada como otra funcion
  - Esto implica que las funciones pueden resivir o retornar funciones
  
```scala

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


```
