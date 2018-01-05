import models.Coupon;
import org.junit.*;

import static org.junit.Assert.*;

public class CouponTest {
    @Test
    public void newCoupon() {
        Coupon testCoupon = new Coupon(1000);
        assertEquals(900, testCoupon.getCouponOne());
    }
}
