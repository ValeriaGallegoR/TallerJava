package Models;

public class Nevera extends Electrodomesticos {
    private int litros;
    private double precio;


    public Nevera(String consumo, String procedencia, int litros) {
        super(consumo, procedencia);
        this.litros = litros;
    }

    public double obtenerAumento() {
        int cantidadLitros = 0;
        if (this.litros > 120) {
            cantidadLitros = (this.litros - 120) / 10;
            double porcentaje = cantidadLitros * 0.05;
            this.precio = super.getTotal() * porcentaje;
        } else {
            this.precio = 0;
        }
        return precio;
    }
}
