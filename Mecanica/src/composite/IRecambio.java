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
    public String getCodigo();

    public void setCodigo(String codigo);

    public String getMarca();

    public void setMarca(String marca);

    public String getTipo();

    public void setTipo(String tipo);

    public String getTamaño();

    public void setTamaño(String tamaño);

    public float getPrecio();

    public void setPrecio(float precio);

    //Métodos necesarios del Patron Composite
    public void addComponenteRecambio(IRecambio recambio);

    public void removeComponenteRecambio(IRecambio recambio);

    public IRecambio getComponenteRecambio(int hijo);
}
