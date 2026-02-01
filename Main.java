package test.ex1;

public class Main {

    public static void main(String[] args) {
        ConvenienceStore convenienceStore = new ConvenienceStore();
        convenienceStore.addStock("삼각김밥" , 10);
        convenienceStore.addStock("콜라" , 3);

        convenienceStore.sellProduct("콜라" , 3);

        convenienceStore.showInventory();

    }
}
