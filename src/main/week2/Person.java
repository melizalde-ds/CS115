package main.week2;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate dob;
    private String gender;
    private String phone;

    public Person() {
        name = "";
        dob = LocalDate.parse("1900-01-01");
        gender = "";
        phone = "";
    }

    public Person(String name, String dob, String gender, String phone){
        this.name = name;
        this.dob = LocalDate.parse(dob);
        this.gender = gender;
        this.phone = phone;
    }

    // Getters
    public String getName(){
        return name;
    }
    public String getDob(){
        return dob.toString();
    }
    public String getGender(){
        return gender;
    }
    public String getPhone(){
        return phone;
    }

    // Setters
    public void setName(String name){
        this.name = name;
    }
    public void setDob(String dob){
        this.dob = LocalDate.parse(dob);
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
}
