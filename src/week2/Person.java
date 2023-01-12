/** 
* File: Person.java 
* Description: This is a Person Class with the constructors and setters/getters   
* Instructor's Name: Barbara Chamberlin
* 
* @author: Miguel Elizalde
* @since: 01/11/2023
*/
package week2;

import java.time.LocalDate;

public class Person {
    // Setting the Classes Variable
    private String name;
    private LocalDate dob;
    private String gender;
    private String phone;

    /**
     * Constructor Name: Person
     * Description: Default constructor
     * Returns: A Person Object
     * 
     * @return Person Object
     */
    public Person() {
        name = "";
        dob = LocalDate.parse("1900-01-01");
        gender = "";
        phone = "";
    }

    /**
     * Constructor Name: Person(parameters)
     * Description: Person constructor
     * Returns: A Person Object
     * 
     * @param name   Name for the Person Object
     * @param dob    Date of Birth for the Person Object
     * @param gender Gender for the Person Object
     * @param phone  Phone for the Person Object
     * @return Person Object
     */
    public Person(String name, String dob, String gender, String phone) {
        this.name = name;
        this.dob = LocalDate.parse(dob);
        this.gender = gender;
        this.phone = phone;
    }

    /**
     * Getters
     * Method Names: getName; getDob; getGender; getPhone
     * Description: Getters for the Person Object
     * Returns: Strings with the required information
     * 
     * @return name; dob; gender; phone
     */
    public String getName() {
        return name;
    }

    public String getDob() {
        return dob.toString();
    }

    public String getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    /**
     * Setters
     * Method Names: setName; setDob; setGender; setPhone
     * Description: Getters for the Person Object
     * Returns: Void
     * 
     * @param String name setName() Name to be changed
     * @param String dob setDob() Dob to be changed
     * @param String gender setGender() Gender to be changed
     * @param Stromg phone setPhone() Phone to be changed
     * @return Void
     */
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
