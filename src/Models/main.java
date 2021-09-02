package Models;

public class main {
    public static void main(String[] args) {

        Televisor newtv = new Televisor("A", "Nacional", 45 , true);
        System.out.println(newtv.getPrecio()+ newtv.getTotal());

        Nevera newNevera = new Nevera("B", "Importada", 130);
        System.out.println(newNevera.getTotal() + newNevera.obtenerAumento());
    }
}
