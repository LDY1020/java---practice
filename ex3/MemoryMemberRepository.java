package test.ex1.ex3;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository {

    Map<String , Member> map = new HashMap<>();

    @Override
    public void save(Member member) {
        map.put(member.getName(), member);
    }

    @Override
    public void findAll() {
        System.out.println("===전체 회원 출력===");
        for (Member member : map.values()) {
            System.out.println("회원번호 : " + member.getId() + " 이름 : " + member.getName() + " 몸무게 : " + member.getWeight());
            member.heavyWeightMember();
        }
    }

    @Override
    public void findHighWeightMembers() {
        System.out.println("===고중량자 명단자===");
        int count = 0;
        for (Member member : map.values()) {
            if(member.getWeight() >= 80) {
                System.out.println("이름 : " + member.getName() + " 몸무게 : " + member.getWeight());
                count++;
            }
        }
        System.out.println("고중량자 인원 : " + count);
    }
}
