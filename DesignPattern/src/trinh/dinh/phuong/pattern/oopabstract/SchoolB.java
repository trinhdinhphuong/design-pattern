package trinh.dinh.phuong.pattern.oopabstract;

/**
 *
 * @author Trinh Dinh Phuong
 * @website: https://trinhdinhphuong.com
 */
public class SchoolB extends School{

    @Override
    public String calculatePoint(int point) {
        return Integer.toString(Math.round(point/(float)10));
    }
    
}
