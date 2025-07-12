
public class javaShop {
    
    public int codice;
    public String nome;
    public String descrizione;
    public double prezzo;
    public double iva;

    public javaShop(String nome){
        this.nome = nome;
        this.codice = (int)(Math.random()*5000);
    }

    public double prezzoBase(){
        System.out.println("Il prezzo base è di " + prezzo + " euro.");
        return prezzo;
    }

    public double prezzoFinale(){
        double prezzoFinale = prezzo+iva;
        System.out.println("Il prezzo finale è di " + prezzoFinale + " euro.");
        return prezzoFinale;
        
    }

    public String nomeEsteso(){
        String nomeEsteso = nome + "-" + codice;
        System.out.println("Il prodotto selezionato è " + nomeEsteso);
        return nomeEsteso;
    }



}





// Esercizio di oggi Java Shop
// repo : java-oop-shop
// Nel progetto java-oop-shop, creare la classe Prodotto che gestisce i prodotti dello shop.
// Un prodotto è caratterizzato da:
// - codice (numero intero)
// - nome
// - descrizione
// - prezzo
// - iva
// Usate opportunamente costruttori, attributi ed eventuali altri metodi di “utilità” per fare in modo che:
// - alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random
// - il prodotto esponga un metodo per avere il prezzo base
// - il prodotto esponga un metodo per avere il prezzo comprensivo di iva
// - il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome
// Aggiungete una classe Main con metodo main nella quale testate tutte le funzionalità della classe Prodotto.