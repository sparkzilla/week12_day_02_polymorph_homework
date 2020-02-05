import attractions.Attraction;
import behaviours.IReviewed;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;
    private ArrayList<IReviewed> reviewed;

    public ThemePark() {
        this.attractions = new ArrayList<>();
        this.stalls = new ArrayList<>();
        this.reviewed = new ArrayList<>();
    }

    public void addAttraction(Attraction attraction){
        this.attractions.add(attraction);
    }

    public ArrayList<Attraction> getAttractions(){
       return this.attractions;
    }

    public void addReviewed(IReviewed reviewedItem){
        this.reviewed.add(reviewedItem);
    }

    public ArrayList<IReviewed> getAllReviewed(){
        return this.reviewed;
    }




}
