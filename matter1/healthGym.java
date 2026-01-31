package test.matter1;

import java.util.HashSet;
import java.util.Set;

public class healthGym {

    public static void main(String[] args) {
        Gym gym = new Gym();
        gym.addMember(new Member("철수" , 20 , 5));
        gym.addMember(new Member("도윤" , 28 , 20));
        gym.addMember(new Member("짱구" , 25 , 12));

        System.out.println(gym.showTopPullUpMember());


    }
}
