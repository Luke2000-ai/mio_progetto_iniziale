import java.util.ArrayList;
import java.util.List;

public class BibliotecaService extends Model{

    private final List<Libro> listaLibro = new ArrayList<>();

    public String aggiungiLibro(Libro libro){
        listaLibro.add(libro);
        return "Hai aggiunto " + libro.getTitolo() + " " + libro.getAutore() + " " + libro.getAnno();
    }

    
    public void mostraLibriDisponibili() {
        System.out.println("Libri disponibili:");
        boolean libritrovati = false;
        for (Libro libro : listaLibro) {  
            if (libro.isDisponibile()) {
                libro.stampaDettagli();
                libritrovati = true;
            }
        }
        if (!libritrovati) {
            System.out.println("Nessun libro disponibile.");
        }
    }

    public List<Libro> getListaLibro(){
        return listaLibro;  
    }
}