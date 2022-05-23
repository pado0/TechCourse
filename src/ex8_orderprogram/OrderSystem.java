package ex8_orderprogram;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class OrderSystem {

    Scanner scanner = new Scanner(System.in);
    private static OrderSystem orderSystem;

    private OrderSystem() {
    }

    public static OrderSystem getOrderSystem() {
        if(orderSystem == null) orderSystem = new OrderSystem();
        return orderSystem;
    }

    public void deleteItemService() {
        System.out.print("[System] 제품 등록 취소를 원하는 제품명을 입력하세요 :");
        String name = scanner.nextLine();
        ItemRepository.getOrderSystem().deleteItem(name);
        System.out.println("[System] 제품 취소가 완료됬습니다.");
    }
    public void joinItemService(){
        System.out.print("[System] 제품 등록을 원하는 제품명을 입력하세요 :");
        String name = scanner.nextLine();
        ItemRepository.getOrderSystem().joinItem(name);
        System.out.println("[System]등록이 완료됬습니다.");
        printList();
    }

    public void printList(){
        LinkedHashMap <String, Item> items = ItemRepository.getOrderSystem().getItems();
        System.out.println("[System] 현재 등록된 제품 목록 ▼");
        // 사이즈가 5보다 클때 해쉬 그대로 보여줌
        // 5보다 작을때는, for문을 5번만 돌리면서 -> hash는 일단 다뿌려주고, 나머지를 그냥 등록가능으로 출력
        items.forEach((k, v) -> System.out.println("> " +k));
        if (items.size() < 5) {
            for (int i = 0; i < 5 - items.size(); i++) {
                System.out.println("> 등록 가능");
            }
        }
    }

    public void printListWithCount(){
        LinkedHashMap<String, Item> items = ItemRepository.getOrderSystem().getItems();
        System.out.println("[System] 현재 등록된 제품 및 수량 ▼");
        items.forEach((k, v) -> System.out.println("> " +k + " : " + v.getCount() + "개"));
        if (items.size() < 5) {
            for (int i = 0; i < 5 - items.size(); i++) {
                System.out.println("> 등록 가능 : 0개");
            }
        }

    }

    public void addItemService() {
        System.out.println("[System] 물건의 수량을 추가합니다.(입고)");
        printListWithCount();

        System.out.print("[System] 수량을 추가할 제품명을 입력하세요 : ");
        String name = scanner.nextLine();
        if(name.isEmpty()) name=scanner.nextLine();
        System.out.print("[System] 추가할 수량을 입력해주세요 :");
        int num = scanner.nextInt();

        ItemRepository.getOrderSystem().addItemCount(name, num);

        System.out.println("[Clear] 정상적으로 제품의 수량 추가가 완료되었습니다.");
        printListWithCount();
    }

    public void subItemService() {
        System.out.println("[System] 제품의 출고를 진행합니다.");
        printListWithCount();

        System.out.print("[System] 출고를 진행할 제품명을 입력하세요 : ");
        String name = scanner.nextLine();
        if(name.isEmpty()) name=scanner.nextLine();
        System.out.println("!!!!!!!!name = " + name);
        System.out.print("[System] 원하는 출고량을 입력하세요 : ");
        int num = scanner.nextInt();

        ItemRepository.getOrderSystem().subItemCount(name, num);

        System.out.println("[Clear] 출고가 완료되었습니다.");
        printListWithCount();
    }

    public void closeScanner(){
        this.scanner.close();
    }
}
