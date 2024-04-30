package hello.core.member;

import hello.core.AppConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MemberServiceTest {

    MemberService memberService;

    @BeforeEach
    void setUp() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }

    @Test
    void join() {

        member memberA = new member(1L, "memberA", Grade.VIP);
        member memberB = new member(2L, "memberB", Grade.VIP);

        memberService.join(memberA);
        memberService.join(memberB);

        member findMemberA = MemberService.findMember(1L);

        Assertions.assertTrue(member).isEqualTo(findMemberA);
    }

    @Test
    void findMember() {
    }
}