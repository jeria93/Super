public class Cat extends Animal {

    String catFoodPreference;

//    public Cat(int age, String name, String catFoodPreference) {
////        Anropar basklassens konstruktör
//        super(age, name);
//        this.catFoodPreference = catFoodPreference;
//    }
    public Cat (int age, String name, String catFoodPreference) {
        super(age, name);
        this.catFoodPreference = catFoodPreference;

    }



    //    Skriver över klass Animals metod med samma namn,
    //Override samt super måste med, annars kraschar konsolen.
//    @Override
//    public void makeNoise() {
////        Anropar superklassens metod med samma namn
//        super.makeNoise();
//        System.out.println("Meow Meow");
//    }
    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Mew");
    }

    public void jump() {
//        Anropar basklassens metod "makeNoise"
        super.makeNoise();
        System.out.println("Meow jumps high");
//        Behöver inte anropa via super då Basklassen redan bär på metoden.
        eat();
        doSomething();
    }

//    doSomething(); går ej att anropa, inte ens med super
//    doSomething(); går att anropa om den är public eller protected

    @Override
    protected void doSomething() {
        super.doSomething();
        System.out.println("Nicholas");
    }


//Super används bara inom klasser
}
