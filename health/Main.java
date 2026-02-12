package test.ex1.health;

public class Main {

    public static void main(String[] args) {
        Repository repository = new Repository();

        repository.save(new Member(1L , "도윤" , "01071017180" , 5));
        repository.save(new Member(2L , "철수" , "01012345678" , 8));
        repository.save(new Member(3L , "유리" , "01094911565" , 10));

        System.out.println(repository.findById(1L).getName());


        System.out.println("====운동 후 (PT 1회 차감)===");

        Member findMember = repository.findById(1L);
        findMember.ptDeduct();
        System.out.println("남은 횟수 = " + findMember.getCountPT());

    }
}
