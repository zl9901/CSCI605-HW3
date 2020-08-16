import java.io.*;
import java.util.Scanner;
public class ArtWork {
    public static String test(String c,String d) {
    	String original=c;
    	String a2="";
    	for(int i=0;i<original.length();i++) {
			  String rev=original.substring(i, i+1) ;	
			  if(rev.equals(d)) {
				  a2=a2+d;
			  }else {
				  a2=a2+".";
			  }
		  }

    	return a2;
    }
    
    
    
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//如果输入a后想再次输入a怎么办？
//		File file = new File("C:\\Users\\Liu Zhuo\\Desktop\\ArtWork.txt"); 
//		BufferedReader br = new BufferedReader(new FileReader(file)); 
//		  String st; 
//		  while ((st = br.readLine()) != null) 
//		    System.out.println(st); 
//		  System.out.println("-----------------------");
//		  File file1 = new File("C:\\Users\\Liu Zhuo\\Desktop\\ArtWork1.txt"); 
//			BufferedReader br1 = new BufferedReader(new FileReader(file1)); 
//			  String st1; 
//			  while ((st1= br1.readLine()) != null) 
//			    System.out.println(st1); 
			  ArtWork hp=new ArtWork();
			  int count=0;
			  String a10="";
			  String a11="";
			  String a12="";
			  String a13="";
			  System.out.println("....");
			  String a="zzlx";
			  String image="xxxxxxxxx";
			  String dollar="$$$$$$$$$";
			  
			  
			  
			
			  
			  for(int p=0;p<100;p++){
				  if(count==9)break;
			  System.out.print("Please enter your answer: ");
			  Scanner ip=new Scanner(System.in);
			  String b=ip.next();
			  if(b.length()>1) {
				  count=9;
				  System.out.println("idiot ! you can just input 1 digit num");
				  break;
			  }
			  
			  String a1=hp.test(a,b);
			  if(!a1.equals("....")) {
				  System.out.println(a1);
				  a11=b;
				  a12=a1;
				  count=count+1;
				  System.out.println(image);
				  break;
			  }
			  
			  System.out.println(a1);
			  count=count+1;
			  image=image.substring(0, image.length()-count)+dollar.substring(0, count);
			  System.out.println(image);
			  
			  }
			  
			  
			  
			  
			  for(int q=0;q<100;q++) {
				  if(count==9)break;
			  System.out.print("Please enter your answer: ");
			  Scanner ip1=new Scanner(System.in);
			  String b1=ip1.nextLine();
			  if(b1.length()>1) {
				  count=9;
				  System.out.println("idiot ! you can just input 1 digit num");
				  break ;
			  }
			  if(b1.equals(a11)) {
				  count=9;
				  System.out.println("idiot ! Do not type the same answer!");
				  break;
			  }
			  String a2=hp.test(a, b1);
			  String a3="";
			  for(int j=0;j<a.length();j++) {
				  if(!a12.substring(j, j+1).equals(a2.substring(j, j+1))) {
					  if(!a12.substring(j, j+1).equals(".")) {
						  a3=a3+a12.substring(j, j+1);
					  }
					  if(!a2.substring(j, j+1).equals(".")) {
						  a3=a3+a2.substring(j, j+1);
					  }
				  }else {
					  a3=a3+".";
				  }
			  }
			 
			  if(!a2.equals("....")) {
			  System.out.println(a3);
			  a13=b1;
			  a10=a3;
			  count=count+1;
			  System.out.println(image);
			  break;
			  }
			  System.out.println(a3);
			  count=count+1;
			  image=image.substring(0, image.length()-count)+dollar.substring(0, count);
			  System.out.println(image);
			  }
			  
			  
			  
			  
			  for(int t=0;t<100;t++) {
				  if(count==9)break;
				  System.out.print("Please enter your answer: ");
			  Scanner ip2=new Scanner(System.in);
			  String b2=ip2.nextLine();
			  if(b2.length()>1) {
				  count=9;
				  System.out.println("idiot ! you can just input 1 digit num");
				  break;
			  }
			  if(b2.equals(a13)||b2.equals(a11)) {
				  count=9;
				  System.out.println("idiot ! Do not type the same answer!");
				  break;
			  }
			  String a4=hp.test(a, b2);
			  String a5="";
			  for(int k=0;k<a.length();k++) {
				  if(!a10.substring(k, k+1).equals(a4.substring(k, k+1))) {
					  if(!a10.substring(k, k+1).equals(".")) {
						  a5=a5+a10.substring(k, k+1);
					  }
					  if(!a4.substring(k, k+1).equals(".")) {
						  a5=a5+a4.substring(k, k+1);
					  }
				  }else {
					  a5=a5+".";
				  }
			  }
			  
			  if(!a4.equals("....")) {
				  System.out.println(a5);
				  count=9;
				  System.out.println(image);
				  break;
				  }
			  System.out.println(a5);//收尾问题，得到结果直接跳出循环
				  count=count+1;
				  image=image.substring(0, image.length()-count)+dollar.substring(0, count);
				  System.out.println(image);
			  }
	}
}
			  
			  

