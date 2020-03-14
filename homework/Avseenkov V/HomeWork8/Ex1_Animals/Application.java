import bean.Animal;
import bean.Cat;
import bean.Dog;

public class Application {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.voice();
        Dog dog = new Dog();
        dog.voice();
        dog.breath = true;
    }
}
