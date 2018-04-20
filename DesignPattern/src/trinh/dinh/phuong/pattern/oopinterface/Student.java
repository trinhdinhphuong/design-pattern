package trinh.dinh.phuong.pattern.oopinterface;

/**
 *
 * @author Trinh Dinh Phuong
 * @website: https://trinhdinhphuong.com
 */
public class Student {
    private String name;
    private int point;
    private University university;

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

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    
    
    public void displayName(){
        System.out.println(name + " gets " + university.calculatePoint(point));
    }
    
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Trinh Dinh Phuong");
        s1.setPoint(95);
        s1.setUniversity(new UniversityA());
        s1.displayName();
    }
}
