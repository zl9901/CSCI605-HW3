import java.util.Scanner;
import java.lang.Math;
public class testSqrt {
	static void   testSqrt()    {
		double epsilon=0.000001;
	    if ( 0 != sqrt(0) )
	            System.out.println("Test 1: sqrt failed");
	    if ( 0 != sqrt(-0) )
	            System.out.println("Test 2: sqrt failed");
	    if ( Double.NaN == sqrt(-1) )
	            System.out.println("Test 3: sqrt failed");
	    if ( Double.NaN == sqrt(Double.NaN) )
	            System.out.println("Test 4: sqrt failed");
	    double result;
	    double aDouble;
	    double theDoubles[] = {1, 2, 3, 4, 5 };
	    for ( int index = 0; index < theDoubles.length; index ++ )      {
	            result = sqrt(theDoubles[index]);
	            System.out.println(result);
	            if ( sqrt(( result * result - theDoubles[index] ) *( result * result - theDoubles[index] ))> epsilon ) 
	                    System.out.println("Test 5: sqrt failed: " + ( result * result - theDoubles[index] ));
	    }
	}
	
	static double sqrt(double a) {
	if(a==-1) {
		return  Double.NaN;
	}
	if(a== Double.NaN) {
	    return Double.NaN;
	}
	
    double b,c=0,d;
    d=1;
    d=d/10;
    int e,z=0;
    
   

    for(b=1;b<=a/2;b++)
    {
        if(b*b==a)
        {
            c=b;
            break;
        }
        else
        {
            if(b*b>a)
            break;
        }
    } 
    b--;
    if(c==0)
    {
       for(e=1;e<=15;e++)
        {
            while(b*b<=a && z==0)
            {
                if(b*b==a){c=b;z=1;}
                else
                {
                    b=b+d;          //*d==0.1 first time*//
                    if(b*b>=a){z=1;b=b-d;}
                }
            }
            d=d/10;
            z=0;
        }
        c=b;
    }
    //System.out.println("Squre root="+c);
    return c;
	}

        

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testSqrt hp=new testSqrt();
//		Scanner x=new Scanner(System.in);
//		System.out.print("Enter number:");
//		 double a=x.nextInt();
//		 hp.sqrt(a);
		hp.testSqrt();
		
	}

}
