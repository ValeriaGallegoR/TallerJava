package Models;

public class Electrodomesticos {

     private String consumo;
     private String procedencia;
     private double total;
     private double valorconsumo;
     private double valorprocedencia;

     public Electrodomesticos(String consumo, String procedencia) {
          this.consumo= consumo;
          this.procedencia= procedencia;
          this.total = tipoConsumo(this.consumo) + procedencia(this.procedencia);
     }

     public double tipoConsumo(String consumo) {
          switch (consumo)
          {
               case "A":
                    this.valorconsumo= 450.000;
                    break;
               case "B":
                    this.valorconsumo= 350.000;
                    break;
               case "C":
                    this.valorconsumo= 250.000;
                    break;

          }
          return valorconsumo;
     }

     public double procedencia(String procedencia) {
          switch (procedencia)
          {
               case "Nacional":
                    this.valorprocedencia= 450.000;
                    break;
               case "Importado":
                    this.valorprocedencia= 350.000;
                    break;

          }
          return valorprocedencia;
     }
}
