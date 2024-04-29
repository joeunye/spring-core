package hello.core.member;

public interface MemberService {

    // 회원 가입
    void join(member member);

    // 회원 조회
    member findMember(Long memberId);
}