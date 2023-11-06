

import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
  
           
      int numero = 0;
      String agencia = null;
      String nomeCliente = null;
      double saldo =0D;

      Scanner ler = new Scanner(System.in);

      System.out.println("Por favor, digite o numero da Agência !");
      numero =  ler.nextInt();
      
      System.out.println("Por favor, digite o nome da Agência !");
      agencia = ler.next();

      System.out.println("Por favor, digite o nome do cliente !");
      nomeCliente = ler.next();
      
      System.out.println("Por favor, digite o valor do saldo !");
      saldo = ler.nextDouble();
      
      //saldo = ler.nextLong();
      
      System.out.println("oi !");
     
      System.out.println("Ola ["+ nomeCliente+"], obrigada" +
      " por criar uma conta em nosso banco, sua agencia" +
      " é ["+ agencia +"], conta["+Integer.toString(numero)+
      "] e seu saldo ["+Double.toString(saldo)+"]"+
      " já está disponível para saque.");
      
      //String.valueOf(numero) "+Integer.toString(numero)+"
      //String.valueOf(saldo) "+Double.toString(saldo)+"
      


    }
}
