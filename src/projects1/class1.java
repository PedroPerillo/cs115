package projects1;
/**
 * File: The name of the file such as Lab3a.java
 * Description: A short description of the project.  This does not need to be long.
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: Pedro Fonseca Perillo
 * @since: Jan 4 2022
 */

import java.util.ArrayList;
import java.util.Scanner;

public class class1 {
    public static void main (String[] args){

        ArrayList<Integer> myArray = new ArrayList<Integer>();

        Scanner input = new Scanner(System.in);

        String data = "";

        data = input.nextLine();

        try{
            int num = Integer.parseInt(data);
            myArray.add(num);
        }catch (NumberFormatException e){

            System.out.println("Please input a whole number");

        }


        System.out.println("Hello, World!");
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");


    }
}
