package Juego

object Prueba extends App
{
    val j : Juego = new Juego

    println("se van a generar enemigos de color " + j.ronda._tipoEnemigo._color + " y de tipo " + j.ronda._tipoEnemigo._textura)
    println("estamos en la ronda " + j.ronda._numRonda)
    j.ronda.subirRonda()
    println("estamos en la ronda " + j.ronda._numRonda + " y se van a generar " + j.ronda._enemigos.length + " enemigos")
    j.ronda._enemigos.head.atacar()

}