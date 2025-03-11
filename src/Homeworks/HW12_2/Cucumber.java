package Homeworks.HW12_2;

public class Cucumber extends Vegetable{

    private String variety;

    public Cucumber(String name, int height, boolean needsGreenhouse, String variety) {
        super(name, height, needsGreenhouse);
        this.variety = variety;
    }

    @Override
    void bringFruit() {
        System.out.println(getName() + " variety " + variety + " brings tasty fruits");
    }

    @Override
    public void needsGreenhouse() {
        System.out.println(getName() + " variety " + variety + " needs greenhouse: " + isNeedsGreenhouse());
    }

    @Override
    void grow() {
        System.out.println(getName() + " variety " + variety + " grows up to " + getHeightCm() + " cm in height");
    }
}
