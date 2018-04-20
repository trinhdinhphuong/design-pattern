package trinh.dinh.phuong.pattern.composite;

/**
 *
 * @author Trinh Dinh Phuong
 * @website: https://trinhdinhphuong.com
 */
public class Student implements Education{
    //Subclass 1
    
    private float math;
    private float physic;
    
    public Student(float math, float physic){
        super();
        this.math = math;
        this.physic = physic;
    }

    @Override
    public float calculatePoint() {
        return (math + physic)/2;
    }
    
    
}
