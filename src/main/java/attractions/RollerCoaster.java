package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, ITicketed {

    private double defaultPrice;

    public RollerCoaster(String name, int rating) {
        super(name, rating);
        this.defaultPrice = 8.50;
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() >= 12 && visitor.getHeight() >= 145) {
            return true;
        } else return false;
    }

    public double defaultPrice() {
        return defaultPrice;
    }

    public double priceFor(Visitor visitor){
        if (visitor.getHeight() >= 200){
            return defaultPrice * 2;
        } else return defaultPrice;
    }
}


