package test.ex1.gym;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberRepository {

    private final Map<Long, Member> map = new HashMap<>();

    public void save(Member member){
        map.put(member.getId(), member);
    }

    public Member findById(Long id){
        return map.get(id);
    }

    public List<Member> findAll(){
        return new ArrayList<>(map.values());
    }

    public void delete(Long id){
        map.remove(id);
    }
}
