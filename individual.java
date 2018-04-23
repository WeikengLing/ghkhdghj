/**
 * Write a description of class pairshare here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class individual
{
    public static void main(String[]args)
    {
        System.out.println(collect(1000));
        System.out.println(palindrome("wasitaratisaw"));
        System.out.println(palindrome("willy ling"));
        System.out.println(gcd(50, 9673));
        System.out.println(gcd(50, 9000));
    }
    
    public static int collect(int monetaryGoal)
    {
        System.out.println(monetaryGoal);
        if (monetaryGoal / 10 == 0)
        {
            return monetaryGoal;
        }
        else
        {
            System.out.println("1");
            return (1 + collect(monetaryGoal / 10) 
                      + collect(monetaryGoal / 10) 
                      + collect(monetaryGoal / 10) 
                      + collect(monetaryGoal / 10) 
                      + collect(monetaryGoal / 10) 
                      + collect(monetaryGoal / 10) 
                      + collect(monetaryGoal / 10) 
                      + collect(monetaryGoal / 10) 
                      + collect(monetaryGoal / 10) 
                      + collect(monetaryGoal / 10));
        }
    }
    
    public static boolean palindrome(String str)
    {
        if (str.length() <= 1)
            return true;
        else
        {
            if (str.charAt(0) == str.charAt(str.length() - 1))
                return palindrome(str.substring(1, str.length() - 1));
            else return false;
        }
    }
    
    public static int gcd(int num1, int num2)
    {
        if (num2 <= num1 && num1 % num2 == 0)
            return num2;
        else if (num1 < num2)
            return gcd(num2, num1);
        else return gcd(num2, num1 % num2);
    }
}
