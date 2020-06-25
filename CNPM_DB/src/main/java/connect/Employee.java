package connect;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name="employee")
public class Employee {
 
    @Id
    @Column(name = "emp_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int employeeId;
 
    @Column(name = "emp_fname")
    private String firstName;
 
    @Column(name = "emp_lname")
    private String lastName;
 
    @Column(name = "emp_age")
    private int age;
 
    @Column(name = "emp_education")
    private String education;
 
    @Column(name = "emp_salary")
    private int salary;
 
    public int getEmployeeId() {
        return employeeId;
    }
 
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
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
 
    public int getAge() {
        return age;
    }
 
    public void setAge(int age) {
        this.age = age;
    }
 
    public String getEducation() {
        return education;
    }
 
    public void setEducation(String education) {
        this.education = education;
    }
 
    public int getSalary() {
        return salary;
    }
 
    public void setSalary(int salary) {
        this.salary = salary;
    }
 
    public String toString() {
        return "Id: " + employeeId + ", Name: " + firstName + " " + lastName + ", Age: " + age + ", Education: " + education + ", Salary:" + salary + "$\n";
    }}