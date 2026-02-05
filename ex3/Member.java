package test.ex1.ex3;

public class Member {

    private long id;
    private String name;
    private double weight;


    public Member(long id, String name, double weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public void heavyWeightMember() {
        if(weight >= 80){
            System.out.println("고중량자");
        }else{
            System.out.println("일반");
        }
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }


}
