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

    private String codigo;
    private String marca;
    private String tipo;
    private String tamaño;
    private float precio;

    public ElementoRecambio() {
    }

    public ElementoRecambio(String codigo, String marca, String tipo, String tamaño, float precio) {
        this.codigo = codigo;
        this.marca = marca;
        this.tipo = tipo;
        this.tamaño = tamaño;
        this.precio = precio;
    }

    /**
     * Contructor para Tornillo y Valvula
     *
     * @param codigo
     * @param marca
     * @param precio
     */
    public ElementoRecambio(String codigo, String marca, float precio) {
        this.codigo = codigo;
        this.marca = marca;
        this.precio = precio;
    }

    /**
     * Contructor para Rueda
     *
     * @param codigo
     * @param tamaño
     * @param llanta
     * @param neumatico
     * @param precio
     */
    public ElementoRecambio(String codigo, String tamaño, IRecambio llanta, IRecambio neumatico, float precio) {
        this.codigo = codigo;
        this.tamaño = tamaño;
        this.precio = precio;
    }

    /**
     * Contructor para Llanta
     *
     * @param codigo
     * @param marca
     * @param tamaño
     * @param precio
     */
    public ElementoRecambio(String codigo, String marca, String tamaño, float precio) {
        this.codigo = codigo;
        this.marca = marca;
        this.tamaño = tamaño;
        this.precio = precio;
    }

    @Override
    public String getCodigo() {
        return this.codigo;
    }

    @Override
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getMarca() {
        return this.marca;
    }

    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String getTipo() {
        return this.tipo;
    }

    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String getTamaño() {
        return this.tamaño;
    }

    @Override
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public float getPrecio() {
        return this.precio;
    }

    @Override
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /*
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
