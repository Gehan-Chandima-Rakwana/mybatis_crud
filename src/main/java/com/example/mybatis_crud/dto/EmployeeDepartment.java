package com.example.mybatis_crud.dto;

public class EmployeeDepartment {
    private long id;
    private String firstName;
    private String lastName;
    private String emailId;

    public EmployeeDepartment() {
    }

    public EmployeeDepartment(long id, String firstName, String lastName, String emailId, int department_id, String department_name) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
