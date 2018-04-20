package trinh.dinh.phuong.pattern.composite;

import java.util.ArrayList;

/**
 *
 * @author Trinh Dinh Phuong
 * @website: https://trinhdinhphuong.com
 */
public class Clazz implements Education{
    // Composite
    ArrayList<Student> students = new ArrayList<Student>();
    
    public Clazz(){
        for(int i=0; i< 20; i++){
            students.add(new Student((float)(i-0.5)/i,(float)(i-0.5)/i));
        }
    }

    @Override
    public float calculatePoint() {
        float sum = 0;
        for(Student s: students){
            sum += s.calculatePoint();
        }
        return sum/ students.size();
    }
    
}
