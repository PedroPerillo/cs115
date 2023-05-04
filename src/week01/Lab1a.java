package week01;

/*
 * File:Lab1a.java
 * Description:Last semester's review
 * Instructor's Name: Jeffrey Light
 *
 * @author: Pedro Fonseca Perillo
 * @since: April 20, 2023
 */



import java.util.ArrayList;
import java.util.Scanner;

public class Lab1a {
    public static void main(String[] args) {

        ArrayList<Integer> myArray = new ArrayList<Integer>();

        Scanner input = new Scanner(System.in);

        boolean valid = true;

        String data = "";

        System.out.println("In this program you will enter a list of numbers.");
        System.out.println("");
        /* do {
            System.out.print("Please enter a number (or hit the <Enter> key to stop):");
            data = input.nextLine();
            int i = 0;


        }while (!data.equals("")); */

        while (valid){
            System.out.print("Please enter a number (or hit the <Enter> key to stop):");
            data = input.nextLine();

            try {

                if (data.equals("")){
                    break;
                }else {

                    int num = Integer.parseInt(data);
                    myArray.add(num);
                    System.out.println();

                }

            } catch (NumberFormatException e) {

                System.out.println("Invalid response.'"+ data +"' is not a number.");

            }







        }
        if (myArray.size() > 0) {
            System.out.println("");
            System.out.println("");
            System.out.println("The total of the list of numbers is:" + addNumbers(myArray));
            System.out.println("The biggest number in the list is:" + largestNumber(myArray));
        }else{
            System.out.println("__________________________________________________________");
            System.out.println("Did you forget how to write? we'll wait for you next game!");
            System.out.println("__________________________________________________________");
        }
    }

    public static int addNumbers(ArrayList<Integer> myArray ){
        int sum=0;

        for(int i = 0; i < myArray.size(); i++) {
            sum+= myArray.get(i);

        }
        return sum;
    }

    public static int largestNumber(ArrayList<Integer> myArray ){
        int number = 0;
        for(int i = 0; i < myArray.size(); i++) {
            if(myArray.get(i) > number) {
                number = myArray.get(i);
            }
        }
        return number;
    }
}

