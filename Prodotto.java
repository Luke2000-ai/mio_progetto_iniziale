public class Prodotto {
    String nome;
    double prezzoBase;

public Prodotto(String nome, double prezzoBase){
    this.nome= nome;
    this.prezzoBase= prezzoBase;
}


public double calcolaPrezzoFinale(double prezzoBase){
    if(prezzoBase < 0){
        System.out.println("Attenzione! il prezzo indicato è sotto lo zero");
    }else {
        System.out.println("Il PrezzoBase indicato è conforme ");
    }
    return prezzoBase;
}
    public void stampaDettagli() {
        System.out.println("Nome: " + nome);
        System.out.println("PrezzoBase: " + prezzoBase);
    }

    public String getNome(){
    return nome;
}

public double getPrezzoBase(){
    return prezzoBase;
}

public void setNome(String nuovoNome){
    this.nome=nuovoNome;
}

public void setPrezzoBase(double nuovoPrezzo){
    this.prezzoBase= nuovoPrezzo;
}




}