
package Employee;

import java.io.Serializable;

public class Employee implements Serializable{
    private String id,name,mail;
    private int age;
    private double salary;

    public Employee() {
    }

    public Employee(String id, String name, String mail, int age, double salary) {
        this.id = id;
        this.name = name;
        this.mail = mail;
        this.age = age;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
// 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    


}  
    
