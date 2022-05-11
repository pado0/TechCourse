package Daily_study_example;

public interface CafeCustomer {
    String getOrder();
}

class CafeCustomerA implements CafeCustomer{

    @Override
    public String getOrder() {
        return "아메리카노";
    }
}

class CafeCustomerB implements CafeCustomer{

    @Override
    public String getOrder() {
        return "카페라떼";
    }
}

class CafeOwner{
    public void givenItem(CafeCustomer customer){
        System.out.println(customer.getOrder() + " 를 주문하셨습니다.");
    }
}

class OrderExample{
    public static void main(String[] args) {
        CafeOwner cafeOwner = new CafeOwner();
        CafeCustomer customerA = new CafeCustomerA();
        CafeCustomer customerB = new CafeCustomerB();
        cafeOwner.givenItem(customerA);
        cafeOwner.givenItem(customerB);
    }
}