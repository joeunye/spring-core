package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.member.member;
import hello.core.member.memberRepository;
import hello.core.member.memoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    memberRepository memberRepository = new memoryMemberRepository();

    DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberOd, String itemName, int itemPrice) {

        member member = memberRepository.findById(memberId);

    }
}
