import models.Coupon;
import org.junit.*;

import static org.junit.Assert.*;

public class CouponTest {
    @Test
    public void newCoupon_getNewPrice_minus200() {
        Coupon testCoupon = new Coupon(1000);
        assertEquals(800, testCoupon.getCouponOne());
    }

    @Test
    public void newCoupon_getNewPrice_minus100() {
        Coupon testCoupon = new Coupon(1000);
        assertEquals(900, testCoupon.getCouponTwo());
    }
}
