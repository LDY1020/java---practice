package test.ex1;

import java.util.HashMap;
import java.util.Map;

public class ConvenienceStore {

    Map<String , Integer> inventory = new HashMap<>();

    public void addStock(String name , int count){
        inventory.put(name,count);
    }

    public void sellProduct(String name , int count){
        int currentCount = inventory.getOrDefault(name , 0);
        if(currentCount >= count){
            inventory.put(name , currentCount - count);
            System.out.println(name + " " + count + "개 판매완료!");
        }else{
            System.out.println(name + " 재고가 부족합니다");
        }
    }

    public void showInventory(){
        System.out.println("상품 , 재고 : " + inventory);
    }
}
