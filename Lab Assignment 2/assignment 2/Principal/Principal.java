package Principal;
import Person.*;

public class Principal extends Person{
	private int experience;
	public Principal(String name, int age, int exp){
		super(name,age);
		experience=exp;
	}
	public void setExperience(int exp){
		this.experience = exp;
	}
	public int getExperience(){
		return this.experience;
	}
	@Override
	public String toString(){
		StringBuilder str = new StringBuilder();
		str.append("Principal Name: " + getName() + "\nAge:" + getAge() + "\nExperience: " + this.experience + "\n");
		return str.toString();
	}
}