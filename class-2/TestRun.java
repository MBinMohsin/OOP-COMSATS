public class TestRun{
	public static void main(String[] args){
	Student s1 = new Student("Ali Ahmad",3.24,"ali block street 3");
	Student s2 = new Student("Zulfiqar ali",1.63,"Talwaar block street 10");
	Student s3 = new Student("Shah Hassan",3.14,"central block street 67");
	Student s4 = new Student("Afridi hassan",2.29,"tulip block street 5");
	Student s5 = new Student("Mani Khan",4.00,"ali block street 35");
	
	System.out.printf("%20s%20s%20s%30s\n","Student NAME","Roll Number","CGPA","Address");
	s1.displayData();
	s2.displayData();
	s3.displayData();
	s4.displayData();
	s5.displayData();
	}
}
