package dayFive;

public class NumerPalendrom {

	public static int oneDigit(int num) {
		if((num>=0) && (num<10)) 
			return 1;
		else
			return 0;
	}
	
	public static int isPalUtil(int num,int dubNum) throws Exception {
		if(num==0) {
			return dubNum;
		}
		else {
			dubNum=isPalUtil(num/10,dubNum);
		}
		if(num%10==dubNum%10) {
			return dubNum/10;
		}
		else{
			throw new Exception();
		}
	}
	
	public static int isPal(int num) throws Exception {
		if(num<0) 
			num=(-num);
		
		int dubnum=(num);
		return isPalUtil(num, dubnum);
	}
	
	public static void main(String[] args) {
		try {
            isPal(1221);
            System.out.println("Yes");
        } catch (Exception e) {
            System.out.println("No");
        }
	}
}
