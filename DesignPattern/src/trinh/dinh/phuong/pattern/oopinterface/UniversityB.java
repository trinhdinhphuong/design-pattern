package trinh.dinh.phuong.pattern.oopinterface;

/**
 *
 * @author Trinh Dinh Phuong
 * @website: https://trinhdinhphuong.com
 */
public class UniversityB implements University{

    @Override
    public String calculatePoint(int point) {
        return Integer.toString(Math.round(point/(float)10));
    }
    
}
