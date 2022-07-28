package Email;
import java.util.Scanner;
public class EmailValidation
  {
  public static void main(String[] args)
    {
	  //enter the total no of email id
       System.out.println("Enter the total number of email id");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    String str[] = new String[num];
    //use loop to get all email id's
    for(int i=0; i<num ; i++)
    {
      System.out.println("Enter email id");
      str[i] = sc.next();
    }
    //enter the email id to be searched
    System.out.println("Enter email id to be searched: ") ;
    String check  = sc.next();
    boolean flag = false ; 
    for(int i=0; i<num ; i++)
    {
      if(check.equals(str[i]))
      {
      System.out.println("Email id found at the place: "+(i+1));
    flag = true ;
      }
    }
         if(!flag)
        System.out.println("Given email id is not found");
    }
    
  }