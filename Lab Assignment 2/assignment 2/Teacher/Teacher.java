package Teacher;
import Person.*;

public class Teacher extends Person{

	private String subject;
	private String id;

	public Teacher(String name, int age, String id, String sub){
		super(name, age);
		setSubjectTeaching(sub);
		setId(id);
	}

	public void setSubjectTeaching(String subject){
		this.subject = subject;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getSubject(){
		return this.subject;
	}

	public String getId(){
		return this.id;
	}

	@Override
	public boolean equals(Object obj){
		Teacher teacher = (Teacher)obj;
		return this.id.equals(teacher.id);
	}

	@Override
	public String toString(){
		StringBuilder str = new StringBuilder();
		str.append("Teacher Name: " + getName() + "\nAge:" + getAge() + "\nID: " + this.id + "\nSubject: " + this.subject);
		return str.toString();
	}
}