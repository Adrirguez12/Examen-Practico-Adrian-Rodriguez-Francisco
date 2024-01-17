package Gestionvehiculos;

import java.util.Date;

public class Vehiculo {
    private String marca;
    private String modelo;
    private Date año_de_fabricacion;
    private String tipo

    public Vehiculo(String marca, String modelo, Date año_de_fabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.año_de_fabricacion = año_de_fabricacion;
    }
    public void mostrarDetalles{
        System.out.println("Mostrar detalles del vehiculo");
        System.out.println("Marca del vehiculo");
        System.out.println("Mostrar modelo de fabricacion");
        System.out.println("Mostar año de fabricación");
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año_de_fabricacion=" + año_de_fabricacion +
                ", tipo='" + tipo + '\'' +
                ", mostrarDetalles=" + mostrarDetalles +
                '}';
    }
}
