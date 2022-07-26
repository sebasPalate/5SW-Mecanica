/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorador;

/**
 *
 * @author sebas
 */
public class SeguroCompleto implements ISeguro {

    private String descripcion;

    @Override
    public int valor() {
        return 100;
    }

    @Override
    public String getDescripcion() {
        this.descripcion = "Este es el Seguro Medio, cubre daños y accidentes durante 3 años";
        return this.descripcion;
    }
}
