public class Main {
    public static void main(String[] args) {
        
        javaShop prodotto1 = new javaShop("tastiera");
        prodotto1.prezzo = 100;
        prodotto1.iva = 22;

        prodotto1.nomeEsteso();
        prodotto1.prezzoBase();
        prodotto1.prezzoFinale();



    }
}
