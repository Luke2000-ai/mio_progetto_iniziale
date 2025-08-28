public class ContoCorrente {
    
    // private per garantire l'incapsulamento
    String intestatario;
    private double saldo;

    // costruttore
    public ContoCorrente(String intestatario, double saldo) {
        this.intestatario = intestatario;
        this.saldo = saldo;
    }


    public double deposita(double somma) {
        saldo += somma;
        return saldo;
    }

    public double preleva(double somma) {
        if(somma>0) {
            if(saldo>=somma) {
                saldo -= somma;
            } else {
                System.out.println("Non è stato possibile il prelievo di " + somma + " euro");
            }
        } else {
            System.out.println("La somma non può essere negativa");
        }
        return saldo;
    }

    public String getIntestatario(){
        return intestatario;
    }

    public void stampaDettagli() {
        return saldo;
    }

}