/** 
* File: PersonTest.java 
* Description: This class test the Class constructors, setters, and getters from Person Class  
* Instructor's Name: Barbara Chamberlin
* 
* @author: Miguel Elizalde
* @since: 01/11/2023
*/
package week2;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

// Tests for the Person class
public class PersonTest {

    // Getters Test
    // Test getName
    @Test
    public void testGetName() {
        Person p = new Person("Jenny", "2003-05-05", "F", "801-867-5309");
        String name = p.getName();
        assertEquals(name, "Jenny");
    }

    // Test getDob
    @Test
    public void testGetPerson() {
        Person p = new Person("Jenny", "2003-05-05", "F", "801-867-5309");
        String dob = p.getDob();
        assertEquals(dob, "2003-05-05");
    }

    // Test getGender
    @Test
    public void testGetGender() {
        Person p = new Person("Jenny", "2003-05-05", "F", "801-867-5309");
        String gender = p.getGender();
        assertEquals(gender, "F");
    }

    // Test getPhone
    @Test
    public void testGetPhone() {
        Person p = new Person("Jenny", "2003-05-05", "F", "801-867-5309");
        String name = p.getPhone();
        assertEquals(name, "801-867-5309");
    }

    // Setters Test
    // Test setName
    @Test
    public void testSetName() {
        Person p = new Person("Jenny", "2003-05-05", "F", "801-867-5309");
        p.setName("Miguel");
        String name = p.getName();
        assertEquals(name, "Miguel");
    }

    // Test setDob
    @Test
    public void testSetPerson() {
        Person p = new Person("Jenny", "2003-05-05", "F", "801-867-5309");
        p.setDob("1995-01-17");
        String dob = p.getDob();
        assertEquals(dob, "1995-01-17");
    }

    // Test setGender
    @Test
    public void testSetGender() {
        Person p = new Person("Jenny", "2003-05-05", "F", "801-867-5309");
        p.setGender("M");
        String gender = p.getGender();
        assertEquals(gender, "M");
    }

    // Test setPhone
    @Test
    public void testSetPhone() {
        Person p = new Person("Jenny", "2003-05-05", "F", "801-867-5309");
        p.setPhone("801-385-4425");
        String name = p.getPhone();
        assertEquals(name, "801-385-4425");
    }
}
