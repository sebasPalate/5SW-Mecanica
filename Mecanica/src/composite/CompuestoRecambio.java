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
    private String codigo;
    private String marca;
    private String tipo;
    private String tamaño;
    private float precio;

    public CompuestoRecambio() {
    }

    public CompuestoRecambio(ArrayList<IRecambio> recambios, String codigo, String marca, String tipo, String tamaño, float precio) {
        this.recambios = recambios;
        this.codigo = codigo;
        this.marca = marca;
        this.tipo = tipo;
        this.tamaño = tamaño;
        this.precio = precio;
    }

    public CompuestoRecambio(String codigo, String marca, String tamaño, float precio) {
        this.codigo = codigo;
        this.marca = marca;
        this.tamaño = tamaño;
        this.precio = precio;
    }

    public ArrayList<IRecambio> getRecambios() {
        return recambios;
    }

    public void setRecambios(ArrayList<IRecambio> recambios) {
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
        String nombreCompleto = this.marca + "\n";
        for (int i = 0; i < this.recambios.size(); i++) {
            nombreCompleto += "| " + this.recambios.get(i).getCodigo();
        }
        return nombreCompleto;
    }

    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String getTipo() {
        String nombreCompleto = this.tipo + "\n";
        for (int i = 0; i < this.recambios.size(); i++) {
            nombreCompleto += "| " + this.recambios.get(i).getCodigo();
        }
        return nombreCompleto;
    }

    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
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
        this.tamaño = tamaño;
    }

    @Override
    public float getPrecio() {
        float precioTotal = (float) this.precio;
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
