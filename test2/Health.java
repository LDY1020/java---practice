package test.ex1.test2;

public class Health {

    public static void main(String[] args) {
        MemberManager manager = new MemberManager();
        manager.addMember(new Member("도윤" , 80 , 174 , 40));
        manager.addMember(new Member("철수" , 70 , 170 , 45));
        manager.addMember(new Member("짱구" , 75 , 179 , 50));


        manager.showInfo();

        System.out.println("--특정 회원 검색 기능--");

        String searchName = "도윤";

        manager.findAndPrintMember(searchName);

        String searchName2 = "맹구";
        manager.findAndPrintMember(searchName2);

    }
}
