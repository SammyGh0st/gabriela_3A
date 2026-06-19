package conta_bancaria;

public class ContaBancaria {
	public String nome;
	   public String cpf;
	   public String nomeBanco;
	   public int agencia;
	   public int numeroConta;
	   private double saldo = 500;
	   
	   public double sacar(double valor)
	   {
	       if(valor <= this.saldo)
	       {
	           this.saldo -= valor;
	           
	       }
	       else
	       {
	           System.out.println("Saldo insuficiente");
	       }
	       return this.saldo;        
	   }    
	   
	   public double getSaldo()
	   {
	       return this.saldo;
	   }


}
