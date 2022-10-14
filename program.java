
import java.util.Scanner;
public class PercentageCalculator {

    public static void main(String[]args){

        System.out.println("Taking the marks of the students forthe purpose of calclulating their percentage ");
        
        Scanner Percent = new Scanner(System.in);

        System.out.println("Enter the marks of Maths");
        float a = Percent.nextFloat();

        System.out.println("Enter the Marks of your Computer Science ");
        float b = Percent.nextFloat();

        System.out.println("Enter the marks of Physics");
        float c = Percent.nextFloat();

        System.out.println("Enter the marks of Chemistry");
        float d = Percent.nextFloat();

        System.out.println("Enter the marks of your History");

        float e = Percent.nextFloat();

        System.out.println("Whats the total maximum marks of your one subject?");
        float f = Percent.nextFloat();
        f = f*5;


        float Percentage = (a+b+c+d+e)*100/f;

        System.out.println("The total percentage of your marks is ");

        System.out.println(Percentage);

    }

    
}
