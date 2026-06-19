package conta_bancaria;

import java.util.Scanner;

public class Main {
	public static void main(String args[])
	{
		Scanner teclado = new Scanner(System.in);
	       
       ContaBancaria conta = new ContaBancaria();
       
       System.out.println("Seu saldo corresponde a "+conta.getSaldo());
       
       System.out.println("Nome");
       conta.nome = teclado.next();
       
       System.out.println("Cpf");
       conta.cpf = teclado.next();
       
       System.out.println("Nome do Banco");
       conta.nomeBanco = teclado.next();
       
       System.out.println("Agencia");
       conta.agencia = teclado.nextInt();
       
       System.out.println("Número da conta");
       conta.numeroConta = teclado.nextInt();
       
       System.out.println("Digite um valor para saque");
       double valor = teclado.nextDouble();
       
       double saldo = conta.sacar(valor);
       
       System.out.println("Seu saldo corresponde a "+saldo);
       
       teclado.close();
	}

}
