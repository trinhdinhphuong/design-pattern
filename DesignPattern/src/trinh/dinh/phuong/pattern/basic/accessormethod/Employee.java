package trinh.dinh.phuong.pattern.basic.accessormethod;

/**
 *
 * @author Trinh Dinh Phuong
 * @website: https://trinhdinhphuong.com
 */
public class Employee {
    /* Accessor method chính là các geter và seter các thuộc tính của java
     tăng tính bảo mật của class
    */
    private String name;
    private int salary;
    private int age;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
