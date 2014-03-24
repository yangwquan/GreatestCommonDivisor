import java.util.Scanner;
//It is for calculating greatest common divisor.
public class GrCoDivisor{

public int calculateGCD(int m, int n){

	int gcd =1;
	for (int i=1; i<=m && i<=n; i++){
		if(m%i==0 && n%i==0)
		gcd=i;
	}
	return gcd;
}

public static void main (String [] Args){
	int value1 = 1;
	int value2 = 1;
	int valuegcd = 1;
	Scanner userinput= new Scanner(System.in);
	System.out.println("First value:");
	value1=userinput.nextInt();
	System.out.println("Second value:");
	value2=userinput.nextInt();
	GrCoDivisor grcodi = new GrCoDivisor();
	valuegcd=grcodi.calculateGCD(value1,value2);
	System.out.println("The greatest common divisor is:" + valuegcd);
	}
}