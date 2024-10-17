//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//    Fresh start
        Cat cat = new Cat(1, "Buster", "Grass feed");
        System.out.println(cat.age + " " + cat.name + " " + cat.catFoodPreference);
        cat.makeNoise();
        cat.doSomething();
    }
}