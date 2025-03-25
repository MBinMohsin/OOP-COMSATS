package ClassRoom;
import Teacher.*;
import Student.*;

public class ClassRoom{

	private String name;
	private String classCode;
	private Teacher teacher;
	private Student students[];

	public ClassRoom(String name, String classCode, Teacher teacher, Student students[]){
		setName(name);
		setClassCode(classCode);
		setTeacher(teacher);
		setStudents(students);
	}

	public void setName(String name){
		this.name = name;
	}

	public void setClassCode(String classCode){
		this.classCode = classCode;
	}

	public void setTeacher(Teacher teacher){
		this.teacher = teacher;
	}

	public void setStudents(Student students[]){
		this.students = students;
	}

	public String getName(){
		return this.name;
	}

	public String getClassCode(){
		return this.classCode;
	}

	public Teacher getTeacher(){
		return this.teacher;
	}

	public Student[] getStudents(){
		return this.students;
	}
	
	@Override
	public String toString(){
		StringBuilder str = new StringBuilder();
		str.append("Class name: " + this.name + "\nClass code:" + this.classCode + "\nClass teacher: " + this.teacher.getName() + "\n");
		return str.toString();
	}
	
}