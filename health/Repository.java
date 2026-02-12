package test.ex1.health;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Repository {

    private  Map<Long, Member> map = new HashMap<>();
    
    public void save(Member member){
        map.put(member.getId(), member);
    }

    public Member findById(Long id){
        return map.get(id);
    }

}