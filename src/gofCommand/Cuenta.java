package gofCommand;

//request
public class Cuenta {
	private int id;
	private double saldo;
	
 public Cuenta(int id , double saldo) {
	this.id = id ;
	this.saldo = saldo;
}
 
 public void retira(double monto) {
	 this.saldo = this.saldo - monto;
	 System.out.println("CMD retirar " + id + " Saldo: "+ saldo);
	 
 }

 public void depositar(double monto) {
	 this.saldo = this.saldo + monto;
	 System.out.println("CMD depositar " + id + " Saldo: "+ saldo);
	 
 }
 
}
