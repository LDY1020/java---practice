package test.ex1.test2;

public class Member {

    private String name;
    private int weight;
    private int height;
    private double muscles;

    public Member(String name, int height ,  int weight, double muscles) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.muscles = muscles;

    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public double getMuscles() {
        return muscles;
    }

    public int getHeight() {
        return height;
    }
}
