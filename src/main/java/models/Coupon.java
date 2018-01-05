package models;

public class Coupon {
    private int preCoupon;

    public Coupon(int preCoupon) {
        this.preCoupon = preCoupon;

    }

    public int getCouponOne() {
        return this.preCoupon - 200;
    }
}
