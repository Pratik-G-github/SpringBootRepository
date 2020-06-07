package in.nit;

import org.springframework.stereotype.Component;

@Component("msg")
public class MyMessage {
  
	public void welcome() {
		System.out.println("Welcome to first app");
	}
	 
}
