
import java.util.Scanner;
import java.io.File;
import java.util.regex.Pattern;


public class RegExTest {
    public  static void testPattern(String regEx, String aString, String comment ) {
	if ( Pattern.matches(regEx, aString) )	{
		System.out.println("RegEx Test:");
		System.out.println("\tInput line: " + aString);
		System.out.println("\t" + regEx );
		System.out.println("\t" + comment);
	}
    }
    public  void testOwn1(String aString, String comment ) {
	if ( aString.indexOf('a') >= 0 )	{
		System.out.println("Own Test:");
		System.out.println("\tInput line: " + aString);
		System.out.println("\t" + comment);
	}
    }
    
	public  boolean testOwn2(String aString) {//过程方法，不用输出
		String original=aString;
		String reverse="";
		for(int i=original.length();i>0;i--) {
			reverse=reverse+original.substring(i-1,i);
		}
			if(reverse.equals(original)) {
				//System.out.println("The number is a panlindrome number");
				//String sos=reverse.substring(0, 1);
				//System.out.println(sos+" is a palindrome anchored at the beginning and end of line");
				return true;
			}else {
				return false;
			}
		}
    
	
	public  void testOwn3(String aString) {
		String original=aString;
		String rev="";
		for(int j=0;j<=(original.length())%3;j++) {
				rev=original.substring(j, j+3);
				if(testOwn2(rev)) {
					System.out.println("Include a palindrome "+rev+" which is 3 characters long");
				}
			}
	}
	
	public  void testOwn4(String aString) {
		String original=aString;
		String rev="";
		for(int k=0;k<=original.length()-2;k++) {
				rev=original.substring(k, k+2);
				if(testOwn2(rev)) {
					System.out.println("Include a palindrome "+rev+" which is 2 characters long");
				}
			}
	}
	
	public  boolean testOwn5(String aString) {
		String original=aString;
		String reverse="";
		for(int i=original.length();i>0;i--) {
			reverse=reverse+original.substring(i-1,i);
		}
			if(reverse.equals(original)) {
				System.out.print("The number "+reverse+" is a panlindrome number. ");
				String sos=reverse.substring(0, 1);
				System.out.println(sos+" is a palindrome anchored at the beginning and end of line");
				return true;
			}else {
				return false;
			}
		}
	
	 public  void testOwn6(String aString) {
		 String original=aString;
		 int pass=0;
		 for(int m=0;m<original.length();m++){
			  String s=original.substring(m,m+1) ;
			 if(!s.equals("a") && !s.equals("b")) {//indexOf==-1
				 System.out.println("There is another thing in the string");
				 pass=1;
				 break; 
			 }
		 }
		 if(pass==0) {
			 System.out.println("The word consist only of ’a’s or ’b’s");
		 }
	 }
	
	 public static void test1(String aString) {
		 String original=aString;
		 if(original.indexOf("a")>=0||original.indexOf("b")>=0) {
			 System.out.println("There should not exist a or b");
		 }else {
		 System.out.println("all clear!");
		 }
	 }

	 
    public static void main( String[] args ) {
	String aString;
	Pattern aPattern;
	RegExTest hp=new RegExTest();

	aString =  "bgaopou";
	testPattern("\\w*a+\\w*", aString, "a’ is part of the word");
	hp.testOwn1(aString, "string has at least one a ");
	
	aString = "abbba";
	testPattern("(.?)(.?).?\\2\\1", aString, "Palindrome anchored at the beginning and end of line");
	hp.testOwn5("abba");
	
	aString ="abbdfewrwerwg";
	testPattern("\\w*(\\w)\\1\\w*", aString, "Include a palindrome which is 2 characters long");
	hp.testOwn4("bbacd");
	
	aString ="drtabaeryu";
	testPattern("\\w*(\\w)\\w\\1\\w*", aString, "Include a palindrome which is 3 characters long");
	hp.testOwn3("abacd");
	
	aString ="abbbabaaa";
	testPattern("[ab]*", aString, "The word consist only of ’a’s or ’b’s");
	hp.testOwn6("bbbbb");
	
	aString ="cdeftyu";
	testPattern("\\w*[^ab]\\w*", aString, "a’s or ’b’s can not be part of the word");
	hp.test1("cd");
	
	aString =".";
	testPattern("\\.*", aString, "The word is == ’.’");
	aString ="Hello World.";
	testPattern("\\w*\\s*\\w*\\.*", aString, "The word includes a ’.’");
	
	
	
	
	
    
    }
}