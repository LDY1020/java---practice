package test.ex2;

public class Main {

    public static void main(String[] args) {
        MemberManager manager = new MemberManager();

        // 1️⃣ 회원 등록
        manager.addMember("도윤");
        manager.addMember("철수");
        manager.addMember("영희");

        // 2️⃣ 운동 기록
        manager.recordExercise("도윤", 5);
        manager.recordExercise("철수", 3);
        manager.recordExercise("영희", 7);

        manager.recordExercise("도윤", 2); // 도윤 총 7

        // 3️⃣ 평균 운동 횟수 출력
        double avg = manager.getAverageExerciseCount();
        System.out.println("평균 운동 횟수 = " + avg);

        // 4️⃣ 운동 가장 많이 한 회원
        String topMember = manager.findTopMemberName();
        System.out.println("운동왕 = " + topMember);
    }
}
