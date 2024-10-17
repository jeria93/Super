//Superclass -> Basklass
public class Animal {
    int age;
    String name;

//    Constructor with no values
    public Animal() {}

//    Constructor with values
    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void makeNoise() {
        System.out.println("Hello, i am an animal");
    }

    public void eat() {
        System.out.println("Munch Munch");
    }

//    Går ej att anropa på super då den är private i en subklass
    protected void doSomething() {
        System.out.println("I am a human");
    }

}
