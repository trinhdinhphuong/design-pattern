package trinh.dinh.phuong.pattern.oopabstract;

/**
 *
 * @author Trinh Dinh Phuong
 * @website: https://trinhdinhphuong.com
 */
public class Student {
    private String name;
    private int point;
    private School school;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
    
    public void displayName(){
        System.out.println(name + " gets " + school.calculatePoint(point));
    }
    
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Trinh Dinh Phuong");
        s1.setPoint(95);
        s1.setSchool(new SchoolA());
        s1.displayName();
    }
    
}
