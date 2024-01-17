package Gestionvehiculos;

import java.util.Scanner;

public class Automovil extends VehiculoMotorizado;
public class Automovil {
    private int numero_puertas

    public Automovil(int numero_puertas) {
        this.numero_puertas = numero_puertas;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "numero_puertas=" + numero_puertas +
                '}';
    }
    public void mostrarDetalles{
        System.out.println("Mostrar detalles del vehiculo");
        System.out.println("Marca del vehiculo");
        System.out.println("Mostrar modelo de fabricacion");
        System.out.println("Mostar año de fabricación");
        System.out.println("Mostrar Tipo de combustible");
        System.out.println("Mostar numero de puertas");
        Scanner mostrarDetalles;
    }
}
