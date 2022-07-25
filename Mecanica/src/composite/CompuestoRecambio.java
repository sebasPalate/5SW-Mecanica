/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite;

import java.util.ArrayList;

/**
 *
 * @author sebas
 */
public class CompuestoRecambio implements IRecambio {

    private ArrayList<IRecambio> recambios;
    private String nombre;
    private String descripcion;
    private double precio;

    public CompuestoRecambio(String nombre, String descripcion, double precio) {
        this.recambios = new ArrayList<>();
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public ArrayList<IRecambio> getRecambios() {
        return recambios;
    }

    public void setRecambios(ArrayList<IRecambio> recambios) {
        this.recambios = recambios;
    }

    @Override
    public String getNombre() {
        String nombreCompleto = this.nombre + "\n";
        for (int i = 0; i < this.recambios.size(); i++) {
            nombreCompleto += "| " + this.recambios.get(i).getNombre();
        }
        return nombreCompleto;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getDescripcion() {
        String descripcionCompleta = this.descripcion + "\n";
        for (int i = 0; i < this.recambios.size(); i++) {
            descripcionCompleta += "| " + this.recambios.get(i).getDescripcion();
        }
        return descripcionCompleta;
    }

    @Override
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public double getPrecio() {
        double precioTotal = this.precio;
        for (int i = 0; i < this.recambios.size(); i++) {
            precioTotal += this.recambios.get(i).getPrecio();
        }
        return precioTotal;
    }

    @Override
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //Método Composite
    @Override
    public void addComponenteRecambio(IRecambio recambio) {
        this.recambios.add(recambio);
    }

    @Override
    public void removeComponenteRecambio(IRecambio recambio) {
        this.recambios.remove(recambio);
    }

    @Override
    public IRecambio getComponenteRecambio(int hijo) {
        return this.recambios.get(hijo);
    }

}
