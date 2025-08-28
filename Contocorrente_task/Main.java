import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci il nome dell'intestatario: ");
        String nome = scan.nextLine();

        System.out.println("Inserisci il saldo iniziale: ");
        double saldoIniziale = scan.nextDouble();
        ContoCorrente c1 = new ContoCorrente(nome, saldoIniziale);


        System.out.println("Quanto vuoi depositare? ");
        double deposito = scan.nextDouble();
        c1.deposita(deposito);
        c1.stampaDettagli();

        System.out.println("Quanto vuoi prelevare? ");
        double prelievo = scan.nextDouble();
        c1.preleva(prelievo);
        c1.stampaDettagli();

        scan.close();
    }
}