package test.ex2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class MemberManager {

    Map<String, Member> members = new HashMap<>();

    public void addMember(String name) {
        if (members.containsKey(name)) {
            return; // 이미 있으면 아무것도 안 함
        }
        members.put(name, new Member(name));
    }

    public boolean recordExercise(String name, int count) {
        Member member = members.get(name);

        if (member == null || count <= 0) {
            return false;
        }
        member.increaseExercise(count);
        return true;
    }

    public double getAverageExerciseCount() {
        if (members.isEmpty()) {
            return 0.0;
        }

        int total = 0;

        for (Member member : members.values()) {
            total += member.getExerciseCount();
        }

        return (double) total / members.size();
    }

    public String findTopMemberName(){
        if(members.isEmpty()){
            return null;
        }

        String topName = null;
        int maxCount = -1;

        for (Member  member : members.values()) {
            if(member.getExerciseCount() > maxCount){
                maxCount = member.getExerciseCount();
                topName = member.getName();
            }
        }
        return topName;
    }
}

