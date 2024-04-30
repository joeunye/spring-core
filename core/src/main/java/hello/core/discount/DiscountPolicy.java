package hello.core.discount;

import java.lang.reflect.Member;

public interface DiscountPolicy {

    int discount(member member, int price);

    int discount(Member member, int price);

    int discount(member member, int price);
}
