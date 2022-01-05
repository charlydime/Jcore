package completableFurure.Order;

import java.util.Random;
import java.util.function.Supplier;


public class OrderX implements Supplier<OrderX>  {
	
	private Integer num;
	private Integer status;	
		
	public OrderX() {
			num = new Random().nextInt();
		}
	public OrderX(OrderX o) {
		num =  o.getNum();
		status = o.getStatus();
	}
	Supplier<OrderX> ordenar() {
	 System.out.println("ordenar " + this.num);
	 status = 1 ;
	 return this;
	}
	Supplier<OrderX> pagar() {
		 System.out.println("pagar orden " + this.num);
		 status = 2 ;
		 return this;
		}
	Supplier<OrderX> despachar() {
		 System.out.println("despachar orden " + this.num);
		 status = 3 ;
		 return this;
		}
	Supplier<OrderX> notificaMail(){
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
	@Override
	public OrderX get() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
