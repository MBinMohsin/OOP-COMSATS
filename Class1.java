import java.util.Scanner;
public class Class1{

public static void main(String[]arg){
	Scanner input = new Scanner(System.in);
	
	System.out.printf("TYPES OF EDITORS FOR EACH\nbyte=d\nshort=d\nint=d\nlong=d\nfloat=f\ndouble=f\nstring=s\n");
	System.out.printf("%,.1f \n",100000000.323);
	System.out.print("float: ");
	double ab=input.nextFloat();
	System.out.printf("%,.1f \n",ab);
	System.out.print("string 1: ");
	String str;
	str = input.next();
	System.out.printf("string 1 %s \n",str);
	input.nextLine();
	System.out.printf("String 2: ");
	String str2 = input.nextLine();
	System.out.printf("STRING line = %s \n",str2);

	System.out.print("integer: ");
	int i;
	i = input.nextInt();
	System.out.printf("Integer %s \n",i);
	
System.out.print("byte: ");
	Byte b;
	b = input.nextByte();
	System.out.printf("Byte = %s \n", b);
	
	


	}

}