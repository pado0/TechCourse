package ex9_chickenDelivery.service;

import ex9_chickenDelivery.Entity.Order;
import ex9_chickenDelivery.Entity.Review;
import ex9_chickenDelivery.Repository.OrderRepository;
import ex9_chickenDelivery.Repository.ReviewRepository;

import java.util.List;

import static ex9_chickenDelivery.Main.scanner;
public class ReviewService {
    private static ReviewService reviewService;

    private ReviewService() {
    }

    public static ReviewService getInstance() {
        if(reviewService == null) reviewService = new ReviewService();
        return reviewService;
    }

    ReviewRepository reviewRepository = ReviewRepository.getInstance();
    OrderRepository orderRepository = OrderRepository.getInstance();

    // 리뷰 등록
    public void writeReview(){
        System.out.println("[안내] 고객님! 별점 등록을 진행합니다.\n" +
                "[안내] 주문자 이름은 무엇인가요?");
        System.out.print(">>> ");
        String name = scanner.nextLine();

        // 주문자가 주문한 주문서 불러오기
        List<Order> order = orderRepository.findOrderByCustomerName(name);

        // 주문자 이름으로 주문된 이력이 있는지 확인
        if (order == null){
            System.out.println("고객님 성함으로 주문된 이력이 없습니다.");
            System.out.println("주문 이력이 없으면 리뷰를 등록할 수 없어요. 성함을 다시 입력해주세요.");
            writeReview();
            return;
        }

        System.out.println("[안내] 음식점 상호는 무엇인가요?");
        System.out.print(">>> ");
        String restaurantName = scanner.nextLine();

        // 예외처리: 주문자 이름으로 주문한 상호가 있는지 확인
        boolean chk = false;
        for (Order o : order) {
            if(restaurantName.equals(o.getRestaurantName())){
                chk = true;
            }
        }
        if (chk == false){
            System.out.println("해당 상호에서 주문하신 이력이 없습니다.");
            System.out.println("처음부터 다시 입력해주세요.");
            writeReview();
            return;
        }

        System.out.println("[안내] 주문하신 음식 이름은 무엇인가요?");
        System.out.print(">>>");
        String menuName = scanner.nextLine();

        // 예외처리: 주문자 이름으로 해당 상호에서 입력한 음식을 주문했는지 확인.
        boolean chk2 = false;
        for (Order o : order) {
            if(restaurantName.equals(o.getRestaurantName())){
                if(menuName.equals(o.getMenuName())){
                    chk2 = true;
                }
            }
        }
        if (chk2 == false){
            System.out.println("해당 상호에서 메뉴를 주문하신 이력이 없습니다.");
            System.out.println("처음부터 다시 입력해주세요.");
            writeReview();
            return;
        }

        System.out.println("[안내] 음식맛은 어떠셨나요? (1점 ~ 5점)");
        int starPoint = scanner.nextInt();
        reviewRepository.joinReview(new Review(name, restaurantName, menuName, starPoint));

        System.out.println("[안내] 리뷰 등록이 완료되었습니다.");
    }

    // 리뷰 조회
    public void getReviews() {
        List<Review> reviewList = reviewRepository.getReviewList();
        if (reviewList.isEmpty()){
            System.out.println("등록된 리뷰 목록이 없습니다.");
        }
        for (Review review : reviewList) {

            System.out.println(review.getCustomerName() + " [고객님]");
            System.out.println("주문 매장 : " + review.getRestaurantName());
            System.out.println("주문 메뉴 : " + review.getMenuName());
            System.out.print("별점 : " );
            int n = review.getStarPoint();
            for(int i=0 ; i< n ; i++) System.out.print("★");
            System.out.println();
        }
    }
}
