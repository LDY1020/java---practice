package test.ex2;

class Member {
    private String name;
    private int exerciseCount;

    public Member(String name) {
        this.name = name;
        this.exerciseCount = 0;
    }

    public String getName() {
        return name;
    }

    public int getExerciseCount() {
        return exerciseCount;
    }

    public void increaseExercise(int count) {
        this.exerciseCount += count;
    }
}

