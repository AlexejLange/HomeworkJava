package homework3;

public class Plate {
    protected int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int partFood) {
        if (this.food >= partFood) {
            this.food -= partFood;
            return true;
        } else {
            return false;
        }
    }

    public void addFood(int partFood) {
        this.food += partFood;
    }

    @Override
    public String toString() {
        return "Plate: " + food;
    }
}
