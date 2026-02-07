package test.ex1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberManager {

    Map<String, Member> members = new HashMap<>();

    public void addMember(Member member) {
        members.put(member.getName(), member);
    }

    public void recordExercise(String name){
        Member member = members.get(name); // 회원을 꺼낸다

        if(member != null) { // 회원이 존재하는지 확인
            // 꺼낸 회원 객체의 운동횟수를 1올린다
            member.setExerciseCount(member.getExerciseCount() + 1);

            System.out.println(name + "님의 운동 횟수가 증가했습니다. 현재 = " + member.getExerciseCount());
        }else{
            System. out.println("등록되지 않은 회원입니다 !!");
        }
    }

    public List<Member> getGoldMembers(int standard){
        List<Member> goldMembers = new ArrayList<>();
        for (Member m : members.values()) {
            if(m.getExerciseCount() >= standard){
                goldMembers.add(m);
            }
        }
        return goldMembers;
    }
}
