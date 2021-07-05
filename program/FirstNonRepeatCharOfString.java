package program;

public class FirstNonRepeatCharOfString {

	static final int NO_OF_CHARS = 256;
    static char count[] = new char[NO_OF_CHARS];
    
    public static void getCountOfChar(String str) {
    	for(int i=0;i<str.length();i++) {
    		count[str.charAt(i)]++;
    	}
    }
    
    public static int firstNonReapeat(String str) {
    	getCountOfChar(str);
    	int index=-1;
    	
    	for(int i=0;i<str.length();i++) {
    		if(count[str.charAt(i)]==1) {
    			index=1;
    			break;
    		}
    	}
    	return index;
    }
    
    public static void main(String[] args) {
    	String str="goodd";
    	int index=firstNonReapeat(str);
    	System.out.println(
                index == -1
                    ? "characters are repeating "
                          + "is empty"
                    : "First non-repeating character is "
                          + str.charAt(index));
    }
}
