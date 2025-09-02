import java.util.ArrayList;
import java.util.List;

public class Model {
    static public class Libro{
    String titolo;
    String autore;
    int anno;
    boolean disponibile = true;


    public Libro(){}

    public Libro (String titolo, String autore, int anno){
        this.titolo= titolo;
        this.autore= autore;
        this.anno= anno;
    }

    public String getTitolo(){return titolo;}
    public String getAutore(){return autore;}
    public int getAnno(){return anno;}
    public boolean isDisponibile() { return disponibile; }

    public void stampaDettagli() {
        System.out.println("Titolo: " + titolo);
        System.out.println("Autore: " + autore);
        System.out.println("Anno : " + anno);
        System.out.println("Disponibile: " + disponibile);

    }

    public void setTitolo(String nuovoTitolo){this.titolo=nuovoTitolo;}
    public void setAutore(String nuovoAutore){this.autore=nuovoAutore;}
    public void setAnno(int nuovoAnno){this.anno=nuovoAnno;}
    public void setDisponibile(boolean nuovaDisponibilità) { this.disponibile = nuovaDisponibilità; }


    }


    public class Utente{
    String nome;
    String ID;

    List<Libro> libriPrestati = new ArrayList<>();
    public Utente(String nome, String ID){
    this.nome= nome;
    this.ID= ID;
    }

    public void prestitoDisponibile(String titolo){
    List <Libro> libroDisp = new ArrayList<>(); 
    for (Libro libro: libroDisp){
        if(libro.getTitolo().equalsIgnoreCase(titolo)){
            if(libro.isDisponibile()){
                libro.setDisponibile(false);
                    libriPrestati.add(libro);
                    System.out.println(nome + "ID: " + ID +" ha preso in prestito: " + libro.getTitolo());
                } else {
                    System.out.println("Il libro '" + titolo + "' non è disponibile.");
                }
                return;
                
            }
        }
        System.out.println("Nessun libro trovato con il titolo: " + titolo);
        
    }
    public void mostraLibriPrestati() {
        if (libriPrestati.isEmpty()) {
            System.out.println(nome + " non ha libri in prestito.");
        } else {
            System.out.println("Libri presi da " + nome + ":");
            for (Libro libro : libriPrestati) {
                libro.stampaDettagli();
    } 
        }
    }
    }

}
