package io.datastructures.designpatterns.inheritance;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public class Animal {

    private String name;
    private double height;
    private int weight;
    private String sound;

    public Animal() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public int getWeight() {
       return weight;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Weight must be greater than zero!");
        }

    }
}
