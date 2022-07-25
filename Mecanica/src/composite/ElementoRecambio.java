/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite;

/**
 *
 * @author sebas
 */
public class ElementoRecambio implements IRecambio {

    private String nombre;
    private String descripcion;
    private double precio;

    public ElementoRecambio() {
    }

    /**
     * Constructor con parametros
     *
     * @param nombre
     * @param descripcion
     * @param precio
     */
    public ElementoRecambio(String nombre, String descripcion, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    @Override
    public String getNombre() {
        return this.nombre + "\n";
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getDescripcion() {
        return descripcion + "\n";
    }

    @Override
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public double getPrecio() {
        return this.precio;
    }

    @Override
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Los métodos addComponenteRecambio, removeComponenteRecambio y
     * getComponenteRecambio no se sobrecargarán, ya que el nodo hoja no estará
     * compuesto por más elementos que él mismo. Por tanto, si se invocan estos
     * métodos, se llamará el método padre que lanzará una excepción de tipo
     * NotSupportedException
     */
    @Override
    public void addComponenteRecambio(IRecambio recambio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void removeComponenteRecambio(IRecambio recambio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public IRecambio getComponenteRecambio(int hijo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
