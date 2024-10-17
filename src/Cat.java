public class Cat extends Animal {

    String catFoodPreference;

    //    Skriver över klass Animals metod med samma namn
    @Override
    public void makeNoise() {
//        Anropar superklassens metod med samma namn
        super.makeNoise();
        System.out.println("Meow Meow");
    }

    public void jump() {
        super.makeNoise();
        System.out.println("Meow jumps high");

    }
}
