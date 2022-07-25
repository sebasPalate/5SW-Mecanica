/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package composite;

/**
 *
 * @author sebas
 */
public interface IRecambio {

    //Métodos comunes de los componentes de recambio Tornillo, Rueda, Valvula y Neumático.
    public String getNombre();

    public void setNombre(String nombre);

    public String getDescripcion();

    public void setDescripcion(String descripcion);

    public double getPrecio();

    public void setPrecio(double precio);

    //Métodos necesarios del Patron Composite
    public void addComponenteRecambio(IRecambio recambio);

    public void removeComponenteRecambio(IRecambio recambio);

    public IRecambio getComponenteRecambio(int hijo);
}
