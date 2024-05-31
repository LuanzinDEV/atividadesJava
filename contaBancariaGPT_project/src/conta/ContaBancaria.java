package conta;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    private String titular;

    public ContaBancaria(int numeroConta, double saldoInicial, String titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
        this.titular = titular;
    }
    
   public void depositar(double valor) {
	   this.saldo += valor;
   }
   
   public void sacar(double valor) {
	   this.saldo -= valor;
   }
   
   public double getSaldo() {
	   return this.saldo;
   }
   
   public int getNumeroConta() {
	   return this.numeroConta;
   }
   
   public String getTitular() {
	   return this.titular;
   }
   
   public String toString() {
	   return "Conta: " + this.numeroConta + " do titular " + this.titular + " possui: " + this.saldo;
   }
}
