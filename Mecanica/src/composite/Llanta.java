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
public class Llanta implements IRecambio {

    private ArrayList<IRecambio> tornillos;
    private String codigo;
    private String marca;
    private String tamaño;
    private float precio;

    public Llanta() {
    }

    public Llanta(ArrayList<IRecambio> tornillos, String codigo, String marca, String tamaño, float precio) {
        this.tornillos = tornillos;
        this.codigo = codigo;
        this.marca = marca;
        this.tamaño = tamaño;
        this.precio = precio;
    }

    public Llanta(String codigo, String marca, String tamaño, float precio) {
        this.codigo = codigo;
        this.marca = marca;
        this.tamaño = tamaño;
        this.precio = precio;
    }

    public ArrayList<IRecambio> getTornillos() {
        return this.tornillos;
    }

    public void setTornillos(ArrayList<IRecambio> tornillos) {
        this.tornillos = tornillos;
    }

    @Override
    public String getCodigo() {
        String nombreCompleto = this.codigo + "\n";
        for (int i = 0; i < this.tornillos.size(); i++) {
            nombreCompleto += "| " + this.tornillos.get(i).getCodigo();
        }
        return nombreCompleto;
    }

    @Override
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getMarca() {
        String nombreCompleto = this.marca + "\n";
        for (int i = 0; i < this.tornillos.size(); i++) {
            nombreCompleto += "| " + this.tornillos.get(i).getMarca();
        }
        return nombreCompleto;
    }

    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String getTipo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setTipo(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getTamaño() {
        String nombreCompleto = this.tamaño + "\n";
        for (int i = 0; i < this.tornillos.size(); i++) {
            nombreCompleto += "| " + this.tornillos.get(i).getTamaño();
        }
        return nombreCompleto;
    }

    @Override
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public float getPrecio() {
        float precioTotal = this.precio;
        for (int i = 0; i < this.tornillos.size(); i++) {
            precioTotal += this.tornillos.get(i).getPrecio();
        }
        return precioTotal;
    }

    @Override
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public void addComponenteRecambio(IRecambio recambio) {
        this.tornillos.add(recambio);
    }

    @Override
    public void removeComponenteRecambio(IRecambio recambio) {
        this.tornillos.remove(recambio);
    }

    @Override
    public IRecambio getComponenteRecambio(int hijo) {
        return this.tornillos.get(hijo);
    }

}
