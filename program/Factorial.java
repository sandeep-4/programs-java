package program;

public class Factorial {

//	int f=1;
//	public int factorial(int fact) {
//		while(fact>1) {
//		f=f+f*fact;
//		fact=fact-1;
//		}
//		return f;
//	}
	
	int fact=1;
	public void factorial(int num) {
	for(int i=1;i<=num;i++) {
		fact=fact*i;
	}
	 System.out.println("Factorial of "+num +" is : "+fact);

	}
	
	public static void main(String[] args) {
		
		
		
		
		 Factorial fac=new Factorial();
		 fac.factorial(12);
	}
}
