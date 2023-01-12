/** 
* File: MagelightUniversity.java 
* Description: This class creates an ArrayList of Person Objects and display their basic information
* Instructor's Name: Barbara Chamberlin
* 
* @author: Miguel Elizalde
* @since: 01/11/2023
*/

// Class prep
package week2;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class MagelightUniversity {
    public static void main(String[] args) {
        // Declarin variables and ArrayList
        ArrayList<Person> people = new ArrayList<Person>();
        LocalDate today = LocalDate.now();

        // creating and adding the Objects to the ArrayList
        people.add(new Person("Rachel", "1993-05-12", "F", "801-555-1212"));
        people.add(new Person("Jose", "2004-12-01", "M", "480-555-1212"));
        people.add(new Person("Prya", "2001-02-27", "F", "385-555-1212"));
        people.add(new Person("Bob", "1984-06-06", "M", "916-555-1212"));

        // Printing the basic info
        System.out.printf("%s\t\t%s\t%s\t%s\n", "Name", "Age", "Gender", "Phone Number");
        System.out.println("----------------------------------------------------------");
        for (Person person : people) {
            System.out.printf("%s\t\t%s\t%s\t%s\n", person.getName(),
                    Period.between(LocalDate.parse(person.getDob()), today).getYears(), person.getGender(),
                    person.getPhone());
        }
    }
}
