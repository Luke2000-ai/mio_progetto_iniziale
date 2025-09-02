public class Libro{
    String titolo;
    String autore;
    int anno;


public Libro(){}

    public Libro (String titolo, String autore, int anno){
        this.titolo= titolo;
        this.autore= autore;
        this.anno= anno;
    }

public String getTitolo(){return titolo;}
public String getAutore(){return autore;}
public int getAnno(){return anno;}

public void stampaDettagli() {
        System.out.println("Titolo: " + titolo);
        System.out.println("Autore: " + autore);
        System.out.println("Anno : " + anno);
    
}

public void setTitolo(String nuovoTitolo){this.titolo=nuovoTitolo;}
public void setAutore(String nuovoAutore){this.autore=nuovoAutore;}
public void setPrezzo(int nuovoAnno){this.anno=nuovoAnno;}


}