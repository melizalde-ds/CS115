package main.week2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PersonTest {

    // Getters Test
    @Test
    public void testName(){
        Person p = new Person("Jenny", "2003-05-05", "F", "801-867-5309");
        String name = p.getName();
        assertEquals(name,"Jenny");
    }
    
    @Test
    public void testPerson(){
        Person p = new Person("Jenny", "2003-05-05", "F", "801-867-5309");
        String dob = p.getDob();
        assertEquals(dob,"2003-05-05");
    }

    @Test
    public void testGender(){
        Person p = new Person("Jenny", "2003-05-05", "F", "801-867-5309");
        String gender = p.getGender();
        assertEquals(gender, "F");
    }

    @Test
    public void testPhone(){
        Person p = new Person("Jenny", "2003-05-05", "F", "801-867-5309");
        String name = p.getPhone();
        assertEquals(name,"801-867-5309");
    }

    // Setters Test
    @Test
    public void testSetName(){
        Person p = new Person("Jenny", "2003-05-05", "F", "801-867-5309");
        p.setName("Miguel");
        String name = p.getName();
        assertEquals(name,"Miguel");
    }
    
    @Test
    public void testSetPerson(){
        Person p = new Person("Jenny", "2003-05-05", "F", "801-867-5309");
        p.setDob("1995-01-17");
        String dob = p.getDob();
        assertEquals(dob,"1998-01-17");
    }

    @Test
    public void testSetGender(){
        Person p = new Person("Jenny", "2003-05-05", "F", "801-867-5309");
        p.setGender("M");
        String gender = p.getGender();
        assertEquals(gender, "M");
    }

    @Test
    public void testSetPhone(){
        Person p = new Person("Jenny", "2003-05-05", "F", "801-867-5309");
        p.setPhone("801-385-4425");
        String name = p.getPhone();
        assertEquals(name,"801-385-4425");
    }
}
