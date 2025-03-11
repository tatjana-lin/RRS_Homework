package Homeworks.HW12_2;

public abstract class Tree extends GardenPlant {

    private boolean shedLeaves;

    public Tree(String name, int height, boolean shedLeaves) {
        super(name, height);
        this.shedLeaves = shedLeaves;
    }
    abstract void shedLeaves();

    abstract void bringFruit();

    public boolean isShedLeaves() {
        return shedLeaves;
    }
}
