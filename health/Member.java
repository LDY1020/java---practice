package test.ex1.health;

public class Member {
    
    private Long id;
    private String name;
    private String phoneNumber;
    private int countPT;

    public Member(Long id, String name, String phoneNumber, int countPT) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.countPT = countPT;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getCountPT() {
        return countPT;
    }

    public void ptDeduct(){
        int count = countPT;
        if(count <= 0){
            System.out.println("횟수 부족");
        }else{
            countPT--;
            System.out.println("차감 완료 ! 남은횟수 : " + countPT);
        }
    }

}
