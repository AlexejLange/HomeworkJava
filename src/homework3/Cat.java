package homework3;

public class Cat {
    private final String name;
    protected final int appetite;
    protected boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public static boolean checkEat(Plate plate, int appetite) {
        return plate.food >= appetite;
    }

    public int needFood(Plate plate, int appetite) {
        return appetite - plate.food;
    }

    public void eat(Plate plate) {
        if (!this.satiety && checkEat(plate,this.appetite)) {
            plate.decreaseFood(appetite);
            this.satiety = true;
        }
    }

    @Override
    public String toString() {
        return "Cat " + name +
                ", satiety: " + satiety;
    }
}
