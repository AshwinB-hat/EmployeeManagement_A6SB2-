package com.project.employee.model;

import javax.persistence.*;

@Entity
@Table(name="employees")
public class Employee {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    public Employee(){

    }
    public Employee(String firstName,String lastName,String emailId){
        this.emailId=emailId;
        this.firstName = firstName;
        this.lastName=lastName;
    }

    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    @Column(name="last_name",nullable=false)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    @Column(name="email_address",nullable=true)
    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }


    @Override
    public String toString(){
        return "Employee [id="+id+",First Name "+firstName+",Last Name= "+lastName+",emailId="+emailId+"]";
    }

    private String firstName;
    private String lastName;
    private String emailId;

}
