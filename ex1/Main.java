package test.ex1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        MemberManager memberManager = new MemberManager();

        memberManager.addMember(new Member("도윤" , 174 , 80 , 0));
        memberManager.addMember(new Member("철수" , 170 , 90 , 0));
        memberManager.addMember(new Member("훈이" , 178 , 110 , 0));


        System.out.println("====운동 기록 시작====");
        memberManager.recordExercise("도윤");
        memberManager.recordExercise("도윤");
        memberManager.recordExercise("철수");

        System.out.println("성실 회원 목록");
        int standard = 2;
        List<Member> goldMembers = memberManager.getGoldMembers(standard);

        if(goldMembers.isEmpty()){
            System.out.println("기준을 도달한 회원이 없습니다");
        }else{
            for (Member goldMember : goldMembers) {
                System.out.println("성실 회원 = " + goldMember.getName() + " (운동 횟수 = " + goldMember.getExerciseCount() + "번");
            }
        }
    }
}
