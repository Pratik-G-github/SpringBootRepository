package in.nit.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix ="my.app")
public class DataCollectionRunner implements CommandLineRunner {

	@Override
	public String toString() {
		return "DataCollectionRunner [branches=" + branches + ", course=" + course + ", slots=" + slots + "]";
	}










	private Set<String> branches;
 	private Set<String>course;
    private Set<String> slots;
  
	  	public Set<String> getBranches() {
		return branches;
	}





	public void setBranches(Set<String> branches) {
		this.branches = branches;
	}





	public Set<String> getCourse() {
		return course;
	}





	public void setCourse(Set<String> course) {
		this.course = course;
	}





	public Set<String> getSlots() {
		return slots;
	}





	public void setSlots(Set<String> slots) {
		this.slots = slots;
	}





	  
	  

    

			@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("From RUNNER");
		System.out.println(this);

	}


}