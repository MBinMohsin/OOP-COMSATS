public class Student{
	private String studentName;
	private static int rollNo;
	private String batchCode="FA24-BCS-";
	private double cGPA;
	private String address;	
	private String compRollNo;
	
	Student(String name,double gpa,String adress){
		studentName=name;
		cGPA=gpa;
		rollNo=rollNo+1;
		address=adress;
		compRollNo=String.format("%s%03d",batchCode,rollNo);
	}
	public void displayData(){
		System.out.printf("%20s%20s%20.2f%30s\n",studentName,compRollNo,cGPA,address);
	}
}
