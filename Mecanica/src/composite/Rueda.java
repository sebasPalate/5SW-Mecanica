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
public class Rueda implements IRecambio {

    private ArrayList<IRecambio> recambios; //llantas(tornillos), valvulas, neumateicos
    private String codigo;
    private String tamaño;
    private float precio;

    public Rueda() {
    }

    public Rueda(ArrayList<IRecambio> recambios, String codigo, String tamaño, float precio) {
        this.recambios = recambios;
        this.codigo = codigo;
        this.tamaño = tamaño;
        this.precio = precio;
    }

    public Rueda(String codigo, String tamaño, float precio) {
        this.codigo = codigo;
        this.tamaño = tamaño;
        this.precio = precio;
    }

    public ArrayList<IRecambio> getRecambios() {
        return this.recambios;
    }

    public void setTornillos(ArrayList<IRecambio> recambios) {
        this.recambios = recambios;
    }

    @Override
    public String getCodigo() {
        String nombreCompleto = this.codigo + "\n";
        for (int i = 0; i < this.recambios.size(); i++) {
            nombreCompleto += "| " + this.recambios.get(i).getCodigo();
        }
        return nombreCompleto;
    }

    @Override
    public void setCodigo(String codigo) {
        this.codigo = codigo;

    }

    @Override
    public String getMarca() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setMarca(String marca) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        for (int i = 0; i < this.recambios.size(); i++) {
            nombreCompleto += "| " + this.recambios.get(i).getMarca();
        }
        return nombreCompleto;
    }

    @Override
    public void setTamaño(String tamaño) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public float getPrecio() {
        float precioTotal = this.precio;
        for (int i = 0; i < this.recambios.size(); i++) {
            precioTotal += this.recambios.get(i).getPrecio();
        }
        return precioTotal;
    }

    @Override
    public void setPrecio(float precio) {
        this.precio = precio;
    }

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
