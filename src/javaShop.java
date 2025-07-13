
public class javaShop {
    
    private int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private double iva;

    public javaShop(String nome, double prezzo, double iva){
        this.nome = nome;
        this.codice = (int)(Math.random()*5000);  //random.nextInt(bound:1000);
        if(prezzo < 0){
            System.out.println("Il prezzo non è valido");
            return;
        }else{
            this.prezzo = prezzo;
        }
        if(iva < 0){
            System.out.println("iva non valida");
            return;
        }else{
            this.iva = iva;
        }
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
        System.out.println("- Il prodotto selezionato è " + nomeEsteso);
        return nomeEsteso;
    }

    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public double getIva() {
        return iva;
    }

    public void setPrezzo(double prezzo) {
        if(prezzo < 0){
            System.out.println("Il prezzo non è valido");
        }else{
            this.prezzo = prezzo;
        }
        
    }

    public void setIva(double iva) {
        if(iva < 0){
            System.out.println("iva non valida");
        }else{
            this.iva = iva;
        }
    }

    

}
