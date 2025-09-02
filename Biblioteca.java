import java.util.ArrayList;
import java.util.List;

public class Biblioteca extends Libro {

public class AutoController {
    private final List<Libro> listaLibro = new ArrayList<>();
    
    public String aggiungiAuto(Libro libro){
        listaLibro.add(libro);
        return "Hai aggiunto " + libro.getTitolo() + " " + libro.getAutore() + " " + libro.getAnno();
    }


public List<Libro> tuttiLibro() {
        return listaLibro;


}

}
}