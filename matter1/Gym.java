package test.matter1;

import java.util.HashSet;
import java.util.Set;

public class Gym {

    Set<Member> gym =  new HashSet<Member>();

    public void addMember(Member member){
        gym.add(member);
    }

    public void showAllMembers(){
        for(Member member:gym){
            System.out.println(member);
        }
    }

    public String showTopPullUpMember(){
        int max = 0;
        String maxName = "";
        for(Member member:gym){
            if(member.getPullCount() > max){
                max = member.getPullCount();
                maxName = member.getName();

            }
        }
        return maxName;
    }
}
