package hello.core;

import hello.core.member.Grade;
import hello.core.member.MemberService;
import hello.core.order.Order;
import hello.core.order.OrderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Member;

@SpringBootApplication
public class CoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoreApplication.class, args);

		AppConfig appConfig = new AppConfig();

		MemberService memberService = appConfig.memberService();
		//MemberService memberService = new MemberServiceImpl();

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

		MemberService memberService = applicationContext.getBean("memberSe", MemberService.class);

		OrderService orderService = applicationContext

		//applicationContext.getBean("orderService: ");

		Member member = new Member(1L, "memberA", Grade.VIP);
		memberService.join(member);

		member memberA = memberService.findMember(1L);

		System.out.println("memberA: " + memberA.getName());
		System.out.println("member: " + member.getName());

		Order order = orderSrevice.createOrder(1L, "testItem", 1000);
		System.out.println("order: " + order);

	}

}
