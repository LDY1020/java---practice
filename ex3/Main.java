package test.ex1.ex3;

public class Main {

    public static void main(String[] args) {
        MemberRepository mr = new MemoryMemberRepository();
        mr.save(new Member(1 , "도윤" , 85));
        mr.save(new Member(2 , "철수" , 70));
        mr.save(new Member(3 , "짱구" , 90));

        mr.findAll();
        mr.findHighWeightMembers();


    }
}
