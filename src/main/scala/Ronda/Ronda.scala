package Ronda

import Enemigo._

class Ronda
{

    var _tipoEnemigo : Type = new Type
    var _enemigos : List[Enemigo] = List()
    var _numRonda : Int = 0

    def subirRonda() : Unit =
    {
        var aux = 0
        _numRonda += 1

        while(aux < 10)
        {
            var ene : Enemigo = new Enemigo
            _enemigos = ene :: _enemigos

            aux += 1
        }

    } 
}