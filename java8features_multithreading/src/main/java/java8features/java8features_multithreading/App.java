package java8features.java8features_multithreading;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
        int count;
        List<Integer> list1=Arrays.asList(9,7,5,6,3,8);
        List<String> list2=Arrays.asList("java","ama","madam","kkkkk","ses");
        System.out.print("Enter the operation to be performed \n1.Average of list\n2.Check for a\n3.Get list of palindromes\n");
        count=sc.nextInt();
        appMethods cal=new appMethods();
        switch(count) {
        case 1:System.out.println("List = "+list1);
        	System.out.println("Average="+cal.avearagelist(list1));
        	break;
        case 2:System.out.println("List = "+list2);
    	System.out.println(cal.check_a(list2));
        	break;
        case 3:System.out.println("List = "+list1);
    	System.out.println("Palindromes "+cal.palindrome(list2));
        	break;
        default:
        	System.exit(0);
        }
    }
}
