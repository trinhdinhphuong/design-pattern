package trinh.dinh.phuong.pattern.oopinterface;

/**
 *
 * @author Trinh Dinh Phuong
 * @website: https://trinhdinhphuong.com
 */
public class UniversityA implements University{

    @Override
    public String calculatePoint(int point) {
        if(point > 85){
            return "A";
        }else if (point > 70){
            return "B";
        }else if(point > 55){
            return "C";
        }else{
            return "D";
        }
    }
    
}
