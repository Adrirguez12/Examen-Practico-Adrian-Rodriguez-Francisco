package Gestionvehiculos;

import java.util.Date;
import java.util.Scanner;
public class VehiculoMotorizado extends Vehiculo;
Gestionvehiculos.Vehiculo;

public class VehiculoMotorizado {
    private String marca;
    private String modelo;
    private Date año_de_fabricacion;

    public VehiculoMotorizado(String marca, String modelo, Date año_de_fabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.año_de_fabricacion = año_de_fabricacion;
    }
}

public class TipoCombustible{
    private String gasolina;
    private String diesel;
    private String hibrido;
    private String electrico;
    private String hidrogeno;

    public TipoCombustible(String gasolina, String diesel, String hibrido, String electrico, String hidregeno) {
        this.gasolina = gasolina;
        this.diesel = diesel;
        this.hibrido = hibrido;
        this.electrico = electrico;
        this.hidrogeno = hidregeno;
    }

    public void mostrarDetalles{
        System.out.println("Mostrar detalles del vehiculo");
        System.out.println("Marca del vehiculo");
        System.out.println("Mostrar modelo de fabricacion");
        System.out.println("Mostar año de fabricación");
        System.out.println("Mostrar Tipo de combustible");
        Scanner mostrarDetalles;
    }

    @Override
    public String toString() {
        return "TipoCombustible{" +
                "gasolina='" + gasolina + '\'' +
                ", diesel='" + diesel + '\'' +
                ", hibrido='" + hibrido + '\'' +
                ", electrico='" + electrico + '\'' +
                ", hidrogeno='" + hidrogeno + '\'' +
                ", mostrarDetalles=" + mostrarDetalles +
                '}';
    }
}
