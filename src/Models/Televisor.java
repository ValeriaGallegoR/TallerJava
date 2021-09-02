package Models;

public class Televisor extends Electrodomesticos {
    int pulgadas;
    boolean tdt;
    double precio;

    public Televisor(String consumo, String procedencia, int pulgadas, boolean tdt) {
        super(consumo, procedencia);
        this.pulgadas = pulgadas;
        this.tdt = tdt;
        this.precio = estdt(this.tdt) + obtenerAumento(this.pulgadas);
    }

    public double getPrecio() {
        return this.precio;
    }

    public double estdt (boolean tdt) {
        double resultado = 0;
        if (tdt == true) {
            resultado += 250.000;
        } else {
            resultado = 0;
        } return resultado;
    }
    public double obtenerAumento (int pulgadas){
        double resultado = 0;
        if (this.pulgadas > 40){
            resultado += 0.30;
        }return resultado;
    }
}
