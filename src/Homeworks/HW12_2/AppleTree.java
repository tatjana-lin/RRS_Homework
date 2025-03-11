package Homeworks.HW12_2;

public class AppleTree extends Tree {

    private String variety;

    public AppleTree(String name, int height, boolean shedLeaves, String variety) {
        super(name, height, shedLeaves);
        this.variety = variety;
    }

    @Override
    public void shedLeaves() {
        System.out.println(getName() + " variety " + variety + " shed its leaves: " + isShedLeaves());
    }

    @Override
    void bringFruit() {
        System.out.println(getName() + " variety " + variety + " brings tasty fruits");
    }

    @Override
    void grow() {
        System.out.println(getName() + " variety " + variety + " grows up to " + getHeightCm() + " cm in height");
    }
}
