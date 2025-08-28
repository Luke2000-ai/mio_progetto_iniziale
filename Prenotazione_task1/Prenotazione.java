public class Prenotazione {
    private String cliente;
    private int date;
    private int postiRichiesti;
    int postiDisponibili;
    boolean validaPrenotazione;
    
    public Prenotazione(String cliente, int date, int postiRichiesti, int postiDisponibili, boolean validaPrenotazione) {
        this.cliente = cliente;
        this.date =  date;
        this.postiRichiesti = postiRichiesti;

}

public String getCliente(){return cliente;}
public double getDate(){return date;}
public double getpostiRichiesti(){return postiRichiesti;}
public double getpostiDisponibili(){return postiDisponibili;}
    
public void stampaDettagli() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Data: " + date);
        System.out.println("postiRichiesti: " + postiRichiesti );
        System.out.println("postiDisponibili: " + postiDisponibili );

}
 public void verificaPrenotazione() {
        System.out.println("I posti richiesti sono: " + postiRichiesti );
        if( postiRichiesti <= postiDisponibili ) {
            System.out.println("I posti richiesti sono disponibili");
        } else {
            System.out.println("ATTENZIONE! I posti richiesti non sono disponibili");
        }
    }
    public boolean validaPrenotazione(){
        return validaPrenotazione;
    }
}