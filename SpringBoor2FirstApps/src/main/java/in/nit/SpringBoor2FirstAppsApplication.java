package in.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoor2FirstAppsApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(SpringBoor2FirstAppsApplication.class, args);
	
		// read obj from container
	    MyMessage mob = ac.getBean("msg",MyMessage.class);
	
	   // call method
	    mob.welcome();
	}
	

}
