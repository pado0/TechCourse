package ex8_orderprogram;

import java.util.LinkedHashMap;

public class ItemRepository {
    //private List<Item> itemList = new ArrayList<>();
    private LinkedHashMap<String, Item> hashMap = new LinkedHashMap<>();


    private static ItemRepository itemRepository;

    private ItemRepository() {
    }

    public static ItemRepository getOrderSystem() {
        if(itemRepository == null) itemRepository = new ItemRepository();
        return itemRepository;
    }
    // 1. 물건 정보 등록 joinItem(String name) : boolean
    // + 이미 등록되어 있습니다.
    public boolean joinItem(String name){
        //itemList.add(new Item(name,0));
        hashMap.put(name, new Item(name, 0));
        // todo : 이름 중복처리
        return true;
    }

    // 2. 물건 정보 등록 취소 deleteItem(String name) : boolean
    // + 리스트에 없어서 삭제할 수 없습니다.
    public boolean deleteItem(String name) {
        //itemList.getItemByNa--
        // Item item = getItemByName(name);
        hashMap.remove(name);
        return true;

    }

    // 3. 물건 재고추가 addItemCount(Item item)
    public void addItemCount(String name, int count) {

        try {
            int addCount = hashMap.get(name).getCount() + count;
            hashMap.put(name, new Item(name, addCount));
            // todo: 이름 찾았는데 없을때
        } catch (Exception e) {
            System.out.println("존재하지 않는 제품입니다.");
        }
    }

    // 4. 물건재고 빼기 subItemCount(Item item)
    public void subItemCount(String name, int count){
        try {
            int subCount = Math.max(hashMap.get(name).getCount() - count, 0);
            hashMap.put(name, new Item(name, subCount));
        }catch (Exception e){
            System.out.println("존재하지 않는 제품입니다.");
        }
    }

    // 5. 조회 getItems() : List<Item>
    public LinkedHashMap<String, Item> getItems(){
        return hashMap;
//        for (String s : hashMap.keySet()) {
//            System.out.println("s = " + s);
//        }
    }

    // ++ 공통기능
    public Item getItemByName(String name) {
        //todo : 못찾았을때 예외처리
        return hashMap.get("name");
    }

    // setItemByName()
    // 문구 출력 모듈



}
