package test.ex1.test2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberManager {


    Map<String , Member> manager = new HashMap<>();


    public void addMember(Member member){
        manager.put(member.getName(), member);
    }

    public void showInfo(){
        System.out.println("--전체 회원 목록--");
        for (Member m : manager.values()) {
            double bmi = calculateBMI(m);
            System.out.println("이름 : " + m.getName() + " 몸무게 : " + m.getWeight() + " 키 : " + m.getHeight() + " 골격근량 : " + m.getMuscles()
            + " BMI : " + String.format("%.2f", bmi));

        }
    }


    public double calculateBMI(Member member) {
        double heightInMeters = member.getHeight() / 100.0;
        return member.getWeight() / (heightInMeters * heightInMeters);
    }

    public void findAndPrintMember(String name){
        Member member = manager.get(name);
        if(member != null){
            System.out.println(name + " 님의 정보를 찾았습니다!");
            System.out.println("몸무게: " + member.getWeight() + "kg, 키: " + member.getHeight() + "cm");
        }else{
            System.out.println(name + "님은 등록되지 않은 회원입니다.");
        }
    }
}

