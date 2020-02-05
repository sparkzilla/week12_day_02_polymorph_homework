package attractions;

import behaviours.IReviewed;

public abstract class Attraction implements IReviewed {
    private String name;
    private int rating;
    private int visitCount;

    public Attraction(String name, int rating) {
        this.name = name;
        this.rating = rating;
        this.visitCount = 0;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public void addRating(int newRating){
        this.rating = newRating;
    }

    public int getVisitCount() {
        return visitCount;
    }
}
