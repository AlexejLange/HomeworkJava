package homework3;

public class Plate {
    protected int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int partFood) {
        if ((this.food - partFood) >= 0) {
            this.food -= partFood;
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
