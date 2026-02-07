package test.ex1;

public class Member {

    private String name;
    private int height;
    private int weight;
    private int exerCiseCount = 0;

    public Member(String name, int height, int weight , int exerCiseCount) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.exerCiseCount = exerCiseCount;
    }

    public Member(int exerCiseCount) {
        this.exerCiseCount = exerCiseCount;
    }

    public int getExerciseCount() {
        return exerCiseCount;
    }

    public void setExerciseCount(int exerCiseCount) {
        this.exerCiseCount = exerCiseCount;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getexerCiseCount() {
        return exerCiseCount;
    }
}
