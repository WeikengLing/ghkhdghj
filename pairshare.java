

/**
 * Write a description of class pairshare here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pairshare
{
    public static void main(String[]args)
    {
        System.out.print(display3("display",6));
    }
    
    public static void display(int num)
    {
        if (num == 0){
            System.out.print("0");
        }
        else{
            System.out.print(""+num);
            display(num-1);
        }
    }
    
    public static void display2(int num)
    {
        if ((num==0))
            System.out.print("0");
        else{
            display2(num-1);
            System.out.print(""+num);
        }
    }
    
    public static String display3(String str, int i)
    {
        if (i>=1)
            return str.charAt(i) + display3(str, i-1);
        else{
            return ""+str.charAt(0);}
    }
    
    public static boolean prime(int n, int d)
    {
        if (d == 1)
            return true;
        else 
        {
            if (n % (d)== 0)
                return false;
            else
                return prime(n,d-1);
        }
    }
    
    public static int fib(int n)
    {
        if (n<=0)
            return 0;
        else if(n==1)
            return 1;
        else{
            return(fib(n-1) + fib(n-2));
        }
    }
}
