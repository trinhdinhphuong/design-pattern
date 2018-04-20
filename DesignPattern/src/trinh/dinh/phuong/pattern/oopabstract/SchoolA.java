package trinh.dinh.phuong.pattern.oopabstract;

/**
 *
 * @author Trinh Dinh Phuong
 * @website: https://trinhdinhphuong.com
 */
public class SchoolA extends School{

    @Override
    public String calculatePoint(int point) {
        if(point > 85){
            return "A";
        }else if(point > 70){
            return "B";
        }else if(point > 55){
            return "C";
        }else{
            return "D";
        }
    }
    
}
