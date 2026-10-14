import java.util.Scanner;

public class IT24102711Lab3Q3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Rupee in amount : ");
        int rupeeamt = sc.nextInt();

        int[] values = {5000,1000,500,200,100,50,20,10,5,2,1};

        int count = 0;
        while (count != values.length){

            int notes = rupeeamt/values[count];
            rupeeamt %= values[count];

            System.out.println(values[count] + " notes " + notes);

            count++;
        }


    }
}