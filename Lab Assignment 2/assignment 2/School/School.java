package School;
import Principal.*;
import ClassRoom.*;
import Teacher.*;
import Student.*;

public class School{

	String name;
	String address;
	Principal principal;
	ClassRoom classes[];

	public School(String name, String address, Principal principal, int noOfClasses, Teacher teachers[], Student students[]){
		setName(name);
		setAddress(address);
		setPrincipal(principal);
		if (noOfClasses>=2){
			classes = new ClassRoom[noOfClasses];
		}else{
			classes = new ClassRoom[2];
		}
		classes[0] =  new ClassRoom("Grade 1", "G1", teachers[0], students);
		classes[1] =  new ClassRoom("Grade 2", "G2", teachers[1], students);
	}

	public void setName(String name){
		this.name = name;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public void setPrincipal(Principal principal){
		this.principal = principal;
	}

	public void setClasses(ClassRoom classes[]){
		this.classes = classes;
	}

	public String getName(){
		return this.name;
	}

	public String getAddress(){
		return this.address;
	}

	public Principal getPrincipal(){
		return this.principal;
	}

	public ClassRoom[] getClasses(){
		return classes;
	}

	@Override
	public String toString(){
		StringBuilder str = new StringBuilder();
		str.append("School Name: " + this.name + "\nAddress:" + this.address + "\n" + principal);
		str.append("Number of classes: " + classes.length + "\n");
		
		for(int i = 0; i < classes.length; i++){
			str.append("Class " + (i + 1) + ": \n" + classes[i]);
		}

		return str.toString();
	}

}