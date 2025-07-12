
public class javaShop {
    
    public int codice;
    public String nome;
    public String descrizione;
    public double prezzo;
    public double iva;

    public javaShop(String nome){
        this.nome = nome;
        this.codice = (int)(Math.random()*5000);  //random.nextInt(bound:1000);
    }

    public double prezzoBase(){
        System.out.println("Il prezzo base è di " + prezzo + " euro.");
        return prezzo;
    }

    public double prezzoFinale(){
        double prezzoFinale = prezzo + ((prezzo*iva)/100);
        System.out.println("Il prezzo finale è di " + prezzoFinale + " euro.");
        return prezzoFinale;
        
    }

    public String nomeEsteso(){
        String nomeEsteso = codice + "-" + nome;
        System.out.println("Il prodotto selezionato è " + nomeEsteso);
        return nomeEsteso;
    }



}
