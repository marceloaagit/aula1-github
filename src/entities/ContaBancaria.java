package entities;

public class ContaBancaria {

	private int numeroConta;
	private String titular;
	private double saldo;
	private double taxa = 5.0;

	public ContaBancaria(int numeroConta, String titular) {
		this.numeroConta = numeroConta;
		this.titular = titular;
	}
	
	public ContaBancaria(int numeroConta, String titular, double valor ) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		deposito(valor);
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void deposito(double valor) {
		this.saldo += valor;
	}
	
	public void saque(double valor) {
		this.saldo -= valor + taxa;	
	}

	@Override
	public String toString() {
		return "Account: " + numeroConta + ", Holder: " + titular + ", Balance: $ " + String.format("%.2f", saldo);
	}
	
}
