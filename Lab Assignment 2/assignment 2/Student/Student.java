package Student;
import Person.*;

public class Student extends Person{
	private int rollNumber;

	public Student(String name, int age, int rollNumber){
		super(name, age);
		this.rollNumber=rollNumber;
	}
	public int getRollNumber(){
		return rollNumber;
	}	
	public void setRollNumber(int rollNo){
		rollNumber=rollNo;
	}

	@Override
	public boolean equals(Object obj){
		Student student = (Student)obj;
		return this.rollNumber==(student.rollNumber);
	}
	@Override
	public String toString(){
		StringBuilder str = new StringBuilder();
		str.append("Student Name: " + getName() + "\nAge:" + getAge() + "\nRoll No.: " + this.rollNumber + "\n");
		return str.toString();
	}

}
