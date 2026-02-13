package test.ex1.gym;

import java.util.List;

public class GymMain {

    public static void main(String[] args) {
        MemberService memberService = new MemberService();

        memberService.registerMember(1L , "도윤" , 25 , "01071017180");
        memberService.registerMember(2L , "철수" , 26 , "01012341244");
        memberService.registerMember(3L , "맹구" , 27 , "01000000000");

        System.out.println("===전체 회원====");
        for(Member m : memberService.getMembers()){
            System.out.println(m.getId() + " / " + m.getName());
        }

        System.out.println("===한명 조회===");
        Member member = memberService.getMember(1L);
        System.out.println(member.getName());

        memberService.deleteMember(1L);
        System.out.println("삭제 후 회원 수 : " + memberService.getMembers().size());



    }
}
