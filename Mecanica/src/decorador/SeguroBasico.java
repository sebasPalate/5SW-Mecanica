
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorador;

/**
 *
 * @author sebas
 */
public class SeguroBasico implements ISeguro {

    private String descripcion;

    @Override
    public int valor() {
        return 20;
    }

    @Override
    public String getDescripcion() {
        this.descripcion = "Este es el Seguro Basico, cubre daños durante 6 meses";
        return this.descripcion;
    }

}
