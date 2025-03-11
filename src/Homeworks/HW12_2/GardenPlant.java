package Homeworks.HW12_2;

public abstract class GardenPlant {
    private String name;
    private int heightCm;

    GardenPlant(String name, int height) {
        this.name = name;
        this.heightCm = height;
    }

    abstract void grow();

    public String getName() {
        return name;
    }

    public int getHeightCm() {
        return heightCm;
    }
}
