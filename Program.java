//import stuff here
import java.util.Scanner;

//Your code here

public class Program{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter schrute-bucks: ");
        
        int schruteBucksInput = input.nextInt();
        
        
        System.out.println("Enter klevins: ");
        
        int klevinsInput= input.nextInt();
        
        
        System.out.println("Enter stanley-nickels: ");
        
        int stanleyNickelsInput = input.nextInt();
        
        final double schruteBucksConversion = 1.0;
        final double klevinsConversion = 0.05;
        final double stanleyNickelsConversion = 0.05 / 12;
        
        
        double schruteBucks = schruteBucksConversion * schruteBucksInput;
        
        double klevins = klevinsConversion * klevinsInput;
        
        double stanleyNickels = stanleyNickelsConversion * stanleyNickelsInput;
        
        schruteBucks = schruteBucks + klevins + stanleyNickels;
        
        
        
        schruteBucks = schruteBucks * 100;
        
        schruteBucks = Math.round(schruteBucks);
        
        schruteBucks = schruteBucks / 100;
        

        
        System.out.println("Decimal schrute-bucks = $" + schruteBucks);
    }
}
//Paste console output below:
/*
Enter schrute-bucks: 
7
Enter klevins: 
17
Enter stanley-nickels: 
9
Decimal schrute-bucks = $7.89

*/

//MY NOTES ###### 
/*
conversions: 
1 schrute buck = 20 klevins 
1 kelvin = 12 stanley-nickels 

x.x.x = schrutebucks - klevins - stanleynickels
*/