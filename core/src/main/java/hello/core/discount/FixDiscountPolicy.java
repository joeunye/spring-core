package hello.core.discount;

import hello.core.member.Grade;

public class FixDiscountPolicy implements DiscountPolicy{

    private int discountFixAmount = 1000;

    @Override
    public int discount(member member, int price) {
        if(member.getGrade() == Grade.VIP) {

        }
    }
}
