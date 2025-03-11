package Homeworks.HW12_2;

public class Main {

    public static void main(String[] args) {

        AppleTree appleTree = new AppleTree("Apple tree", 250, true, "Pippin");
        Cucumber cucumber = new Cucumber("Cucumber", 60, true, "Libella");

        appleTree.grow();
        appleTree.shedLeaves();
        appleTree.bringFruit();

        System.out.println("=====================================");

        cucumber.grow();
        cucumber.needsGreenhouse();
        cucumber.bringFruit();

    }
}
