/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorador;

/**
 *
 * @author sebas
 */
public class Accidente implements AdicionalSeguro {

    private ISeguro seguro;

    @Override
    public String getDescripcion() {
        return this.seguro.getDescripcion();
    }

    @Override
    public int valor() {
        return 15;
    }

}
