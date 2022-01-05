package completableFurure.Order;

import java.util.Random;


public class Order {
	
	private Integer num;
	private Integer status;	
		
	public Order() {
			num = new Random().nextInt();
		}
	public Order(Order o) {
		num =  o.getNum();
		status = o.getStatus();
	}
	Order ordenar() {
	 System.out.println("ordenar " + this.num);
	 status = 1 ;
	 return this;
	}
	Order pagar() {
		 System.out.println("pagar orden " + this.num);
		 status = 2 ;
		 return this;
		}
	Order despachar() {
		 System.out.println("despachar orden " + this.num);
		 status = 3 ;
		 return this;
		}
	Order notificaMail(){
		 System.out.println("despachar orden " + this.num);
		 status = 4 ;
		 return this;
		}
	
	public Integer getNum() {
		return num;
	}
	
	public Integer getStatus() {
		return status;
	}
	
}
