package hello.core.discount;

import hello.core.member.Grade;

public abstract class RateDiscountPolicy implements DiscountPolicy{

    private final int discountPercent = 10;

    @Override
    public int discount(member member, int price) {

        //회원 등급 검증
        if(member.getGrade() == Grade.VIP) {
            return price * discountPercent / 100;
        }else {
            return 0;
        }
    }
}
