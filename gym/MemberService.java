package test.ex1.gym;

import java.util.List;

public class MemberService {

    private final MemberRepository memberRepository = new MemberRepository();

    // 회원 등록
    public void registerMember(Long id, String name, int age, String phone){
        Member findId = memberRepository.findById(id);
        if (findId != null) {
            System.out.println("이미 존재하는 회원 번호입니다 !" + id);
            return;
        }
        Member member = new Member(id , name, age, phone);
        memberRepository.save(member);
    }

    // 전체 회원 조회
    public List<Member> getMembers(){
        return memberRepository.findAll();
    }

    // 한명 조회
    public Member getMember(Long id){
        return memberRepository.findById(id);
    }

    // 회원 삭제
    public void deleteMember(Long id){
        memberRepository.delete(id);
    }
}
