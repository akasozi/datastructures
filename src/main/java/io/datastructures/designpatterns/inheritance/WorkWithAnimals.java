package io.datastructures.designpatterns.inheritance;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public class WorkWithAnimals {

    public static void main(String[] args) {
        Dog fido = new Dog();
        fido.setName("fido");
        System.out.println(fido.getName());
        fido.digHole();
        fido.setWeight(-1);

        int randNum = 10;
        fido.changeVar(randNum);
        System.out.println("randNum: " + randNum);
        Dog.changeObjectName(fido);
        System.out.println(fido.getName());
    }

}
