package Main;
import School.*;
import Principal.*;
import ClassRoom.*;
import Teacher.*;
import Student.*;

public class Main{

	public static void main(String args[]){

		Principal principal = new Principal("Prin1", 33, 5);
		Teacher teachers[] = new Teacher[2];
		teachers[0] = new Teacher("teacher1", 35, "T01", "Math");
		teachers[1] = new Teacher("teacher2", 32, "T02", "English");

		Student students[] = new Student[5];
		students[0] = new Student("Ali", 4, 01);
		students[1] = new Student("Mohsin", 5, 02);
		students[2] = new Student("Ahmad", 9, 03);
		students[3] = new Student("Maha", 4, 04);
		students[4] = new Student("Yousuf", 5, 05);

		School school = new School("Beacon House", "Bahria town Janiper Block, Lahore", principal, 2, teachers, students);

		System.out.println(school);	
	}
}