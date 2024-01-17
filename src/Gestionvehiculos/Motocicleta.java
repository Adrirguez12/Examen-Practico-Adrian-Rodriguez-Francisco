package Gestionvehiculos;

import java.util.Scanner;

public class Tipootocicleta extends Automovil;

public class TipoMotocicleta {
    private String touring;
    private String deportiva;
    private String cruiser;
    private String naked;

    @Override
    public String toString() {
        return "TipoMotocicleta{" +
                "touring='" + touring + '\'' +
                ", deportiva='" + deportiva + '\'' +
                ", cruiser='" + cruiser + '\'' +
                ", naked='" + naked + '\'' +
                '}';
    }

    public TipoMotocicleta(String touring, String deportiva, String cruiser, String naked) {
        this.touring = touring;
        this.deportiva = deportiva;
        this.cruiser = cruiser;
        this.naked = naked;

        public void mostrarDetalles{
            System.out.println("Mostrar detalles del vehiculo");
            System.out.println("Marca del vehiculo");
            System.out.println("Mostrar modelo de fabricacion");
            System.out.println("Mostar año de fabricación");
            System.out.println("Mostrar Tipo de combustible");
            System.out.println("Mostar Tipo de motocicleta");
            Scanner mostrarDetalles;
        }
    }
}
