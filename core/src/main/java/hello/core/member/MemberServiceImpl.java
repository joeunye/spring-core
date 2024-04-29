package hello.core.member;

public class MemberServiceImpl  implements memberService {

    // 회원 저장소
    private final memberRepository memberRepository = new memoryMemberRepository();


    @Override
    public void join(member member) {
        memberRepository.save(member);
    }

    @Override
    public member findMember(Long memberId) {

        member Member = memberRepository.findById(memberId);

        return null;
    }
}