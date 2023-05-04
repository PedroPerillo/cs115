/*
 * File: The name of the file such as Person.java
 * Description: A short description of the project.  This does not need to be long.
 * Instructor's Name: Jeffrey Light
 *
 * @author: Pedro Fonseca Perillo
 * @since: April 26, 2023
 */

package week02;

import java.time.LocalDate;

public class Person {
    // Attributes
    private String name;
    private LocalDate dob;
    private String gender;
    private String phone;

    //no argument constructor
    public Person(){
        name = "";
        dob = LocalDate.parse("1900-01-01");
        gender = "";
        phone = "";
    }

    //argument constructor
    public Person(String n, String d, String g, String p){
        name = n;
        dob = LocalDate.parse(d);
        gender =g;
        phone = p;

    }

    //getter methods

    public String getName(){
        return name;
    }
    public LocalDate getDob(){
        return dob;
    }
    public String getGender(){
        return gender;
    }
    public String getPhone(){
        return phone;
    }

    // setter methods


    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = LocalDate.parse(dob);
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
