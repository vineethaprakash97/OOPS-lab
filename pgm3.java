import java.util.*;
class pgm3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        if(n % 2 == 0)
        
            System.out.println("The given number "+n+" is Even ");
        
        else
            System.out.println("The given number "+n+" is Odd ");
	    
    }
}