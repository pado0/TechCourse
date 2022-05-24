package ex9_chickenDelivery.Repository;

import ex9_chickenDelivery.Entity.Review;

import java.util.ArrayList;
import java.util.List;

public class ReviewRepository {
    private static ReviewRepository reviewRepository;

    private ReviewRepository() {
    }

    public static ReviewRepository getInstance() {
        if(reviewRepository == null) reviewRepository = new ReviewRepository();
        return reviewRepository;
    }
    private List<Review> reviews = new ArrayList<>();

    public void joinReview (Review review){
        reviews.add(review);
    }

    public List<Review> getReviewList(){
        return reviews;
    }
}
