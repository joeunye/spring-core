package hello.core.member;

import java.util.HashMap;
import java.util.Map;

public class memoryMemberRepository implements memberRepository {

    //저장소
    private static Map<Long, member> store = new HashMap<>();

    @Override
    public void save(member member) {
        store.put(member.getId(), member);
    }

    @Override
    public member findById(Long memberId) {

//        Member member = store.get(memberid);
//
//        return member;

        return store.get(memberId);
    }
}