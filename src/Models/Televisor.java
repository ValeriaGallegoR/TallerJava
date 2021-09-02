package Models;

public class Televisor {
    private int pulgadas;
    private boolean tdt;
    private double precio;

    public Televisor(int pulgadas, boolean tdt){
        this.pulgadas = pulgadas;
        this.tdt = tdt;
    }
    public boolean tamañoTV(int pulgadas){
        if (this.pulgadas > 40){
            this.precio += 0.30;
        } else {
            return precio;
        }
        if(tdt == true ){
            this.precio += 250.000;
        }
    }
}
