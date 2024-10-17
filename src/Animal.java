//Superclass -> Basklass
public class Animal {
    int age;
    String name;

    public Animal() {}

    public void makeNoise() {
        System.out.println("Hello, i am an animal");
    }

    public void eat() {
        System.out.println("Munch Munch");
    }

//    Går ej att anropa på super då den är private i en subklass
    private void doSomething() {
        System.out.println("I am an animal");
    }

}
