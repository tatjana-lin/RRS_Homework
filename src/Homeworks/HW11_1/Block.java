package Homeworks.HW11_1;

public class Block {
//    https://www.codewars.com/kata/building-blocks/train/java
//    Write a class Block that creates a block (Duh..)
//Requirements
//The constructor should take an array as an argument,
// this will contain 3 integers of the form [width, length, height] from which the Block should be created.
//Define these methods:
//`getWidth()` return the width of the `Block`
//`getLength()` return the length of the `Block`
//`getHeight()` return the height of the `Block`
//`getVolume()` return the volume of the `Block`
//`getSurfaceArea()` return the surface area of the `Block`
//Examples
//    Block b = new Block(new int[]{2,4,6}) -> creates a `Block` object with a width of `2` a length of `4` and a height of `6`
//    b.getWidth() // -> 2
//
//    b.getLength() // -> 4
//
//    b.getHeight() // -> 6
//
//    b.getVolume() // -> 48
//
//    b.getSurfaceArea() // -> 88

    int[] size = new int[3];

    public Block(int[] size) {
        this.size = size;
    }

    public int getWidth() {
        return size[0];
    }

    public int getLength() {
        return size[1];
    }

    public int getHeight() {
        return size[2];
    }

    public int getVolume(){
        return getWidth() * getLength() * getHeight();
    }
    public int getSurfaceArea(){
        return 2 * (getWidth() * getLength() + getLength() * getHeight() + getWidth() * getHeight());
    }

    public static void main(String[] args) {
        Block b = new Block(new int[] {2, 4, 6});
        System.out.println(b.getWidth());
        System.out.println(b.getLength());
        System.out.println(b.getHeight());
        System.out.println(b.getVolume());
        System.out.println(b.getSurfaceArea());
    }

}
