/*
 * File: The name of the file such as PersonTest.java
 * Description: A short description of the project.  This does not need to be long.
 * Instructor's Name: Jeffrey Light
 *
 * @author: Pedro Fonseca Perillo
 * @since: Apr 27 2023
 */
package week02;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getName() {
        Person person1 = new Person("Pedro", "1999-03-08", "Male", "801-792-3540");
        assertEquals("Pedro",person1.getName());
    }

    @Test
    void getDob() {
        Person person1 = new Person("Pedro", "1999-03-08", "Male", "801-792-3540");
        LocalDate Dob = LocalDate.of(1999,3,8);
        assert(Dob.equals(person1.getDob()));
    }

    @Test
    void getGender() {
        Person person1 = new Person("Pedro", "1999-03-08", "Male", "801-792-3540");
        assertEquals("Male", person1.getGender());

    }

    @Test
    void getPhone() {
        Person person1 = new Person("Pedro", "1999-03-08", "Male", "801-792-3540");
        assertEquals("801-792-3540",person1.getPhone());

    }

    @Test
    void setName() {
        Person personSet = new Person();
        personSet.setName("Hemily");
        assertEquals("Hemily", personSet.getName());
    }

    @Test
    void setDob() {
        Person personSet = new Person();
        personSet.setDob("1998-01-19");
        LocalDate Dob = LocalDate.of(1998,1,19);
        assert(Dob.equals(personSet.getDob()));

    }

    @Test
    void setGender() {
        Person personSet = new Person();
        personSet.setGender("Female");
        assertEquals("Female",personSet.getGender());
    }

    @Test
    void setPhone() {
        Person personSet = new Person();
        personSet.setPhone("3855006828");
        assertEquals("3855006828", personSet.getPhone());
    }
}