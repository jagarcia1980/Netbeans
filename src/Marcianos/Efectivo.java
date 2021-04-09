/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Marcianos;

/**
 *
 * @author jagarcia1980
 */
public abstract class efectivo extends Efectivo {
    
    public efectivo() {
    }

    public void recibeDisparo(int i) {
        for (int j = 0; j < 10; j++) {
            if (somos.equals("Terricolas")) {
                ((Terricola) (tripulacion[j])).recibeDisparo(i);
            } else {
                ((Marciano) (tripulacion[j])).recibeDisparo(i);
            }
        }
    }

    public int generaDisparo(int i) {
        return tripulacion[i].dispara();
    }
    
}
