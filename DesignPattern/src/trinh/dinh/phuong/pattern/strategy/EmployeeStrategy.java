package trinh.dinh.phuong.pattern.strategy;

/**
 *
 * @author phuongtrinh
 * @website: https://trinhdinhphuong.com
 */
public class EmployeeStrategy implements MarketingStrategy{

    @Override
    public void sale() {
        System.out.println("Employee");
    }
    
}
