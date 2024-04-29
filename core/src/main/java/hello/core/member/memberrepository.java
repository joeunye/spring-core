package hello.core.member;

public interface memberRepository {

    // 회원 저장
    void save(member member);

    // 회원 id로 회원 조회
    member findById(Long id);
}