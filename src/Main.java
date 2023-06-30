import java.util.Scanner;

public class Main {
  
  public static void main (String [] args) {
    Scanner keyboard = new Scanner(System.in);
    
    ContaBancaria contaCorrente = new ContaCorrente();
    ContaInvestimento contaInvestimento = new ContaInvestimento();
    ContaBancaria contaPoupanca = new ContaPoupanca();

    contaCorrente.depositar(1500);
    contaInvestimento.depositar(2000);
    contaPoupanca.depositar(2000);

    contaInvestimento.fazerInvestimento(1000, 3);


    keyboard.close();
  }
}
