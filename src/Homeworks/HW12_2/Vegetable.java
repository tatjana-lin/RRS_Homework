package Homeworks.HW12_2;

public abstract class Vegetable extends GardenPlant{

    private boolean needsGreenhouse;

    public Vegetable(String name, int height, boolean needsGreenhouse) {
        super(name, height);
        this.needsGreenhouse = needsGreenhouse;
    }

    abstract void bringFruit();

    public abstract void needsGreenhouse();

    public boolean isNeedsGreenhouse() {
        return needsGreenhouse;
    }
}
