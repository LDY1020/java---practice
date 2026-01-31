package test.matter1;

public class Member {

    private String name;
    private int age;
    private int pullCount;

    public Member(String name, int age, int pullCount) {
        this.name = name;
        this.age = age;
        this.pullCount = pullCount;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPullCount() {
        return pullCount;
    }

    public void showInfo(){
        System.out.println("이름 : " + name + " 나이 : " + age + " 풀업 : " + pullCount);
    }
}
