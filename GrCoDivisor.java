import java.util.Scanner;
//It is for calculating greatest common divisor (GCD),
// GCD is also known as the greatest common factor (GCF)
// or highest common factor (HCF)..
public class GrCoDivisor{

//1. Basic, and least efficiency (O(n), if n<m) 
// Search the number from 1 to n (1->n)
public int calculateGCD1(int m, int n){

	int gcd =1;
	for (int i=1; i<=m && i<=n; i++){
		if(m%i==0 && n%i==0)
		gcd=i;
	}
	return gcd;
}

//2. Better efficiency (still O(n)); 
// Search the number from n to the smaller gcd (n->gcd)
public int calculateGCD2(int m, int n){

	int gcd =1;
	for (int i=n; i>=1; i--){
		if(m%i==0 && n%i==0){
		gcd=i;
		break;
		}
	}
	return gcd;
}

//3. Better efficiency (still O(n)); 
// Search the number from n to the smaller gcd (n or n/2->gcd)
public int calculateGCD3(int m, int n){

	int gcd =1;
	if(m%n==0){
	return n;
	}
	for (int i=n/2; i>=1; i--){
		if(m%i==0 && n%i==0){
		gcd=i;
		break;
		}
	}
	return gcd;
}

//4. Best efficiency ( O(log(n))); 
// Euclidean algorithm, How to prove it?
public int calculateGCD4(int m, int n){
	if(m%n==0){
	return n;
	}
	else{
	return calculateGCD4(n, m%n);
	}
}

public static void main (String [] Args){
	int value1 = 1;
	int value2 = 1;
	int valuegcd1 = 1;
	int valuegcd2 = 1;
	int valuegcd3 = 1;
	int valuegcd4 = 1;
	Scanner userinput= new Scanner(System.in);
	System.out.println("First value:");
	value1=userinput.nextInt();
	System.out.println("Second value:");
	value2=userinput.nextInt();
	GrCoDivisor grcodi1 = new GrCoDivisor();
	GrCoDivisor grcodi2 = new GrCoDivisor();
	GrCoDivisor grcodi3 = new GrCoDivisor();
	GrCoDivisor grcodi4 = new GrCoDivisor();
	valuegcd1=grcodi1.calculateGCD1(value1,value2);
	valuegcd2=grcodi2.calculateGCD2(value1,value2);
	valuegcd3=grcodi3.calculateGCD3(value1,value2);
	valuegcd4=grcodi4.calculateGCD4(value1,value2);
	System.out.println("The greatest common divisor is (first calculation):" + valuegcd1);
	System.out.println("The greatest common divisor is (second calculation):" + valuegcd2);
	System.out.println("The greatest common divisor is (third calculation):" + valuegcd3);
	System.out.println("The greatest common divisor is (fourth calculation):" + valuegcd4);
	}
}