/*
 * File: The name of the file such as PersonTest.java
 * Description: A short description of the project.  This does not need to be long.
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: Pedro Fonseca Perillo
 * @since: Jan 30 2022
 */

package week03;

import week02.Person;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class MageLightUniversity {
    public static void main (String []Args){

        ArrayList<Person> People = new ArrayList<Person>();

        Person name1 = new Person("Rachel","1993-05-12","F","801-555-1212");
        Person name2 = new Person("Jose","2004-12-01","M","480-555-1212");
        Person name3 = new Person("Prya","2001-02-27","F","385-555-1212");
        Person name4 = new Person("Bob","1984-06-06","M","916-555-1212");

        People.add(name1);
        People.add(name2);
        People.add(name3);
        People.add(name4);
        System.out.printf("%-19s%-9s%-11s%-12s%-15s%-12s%s\n","Name","|","Age","|","Gender","|","Phone");
        System.out.println("-------------------------------------------------------------------------------------------------");
        for (Person person : People) {

            Period today = Period.between(person.getDob(), LocalDate.now());
            int birthday = today.getYears();
            System.out.printf("%-19s%-9s%-11s%-12s%-15s%-12s%s\n",person.getName(),"|",birthday,"|",person.getGender(),"|",person.getPhone());
        }
    }
}
