package overrideoverload;

public class DogOverload {
    public void bark() {
        System.out.print("woof");
    }
    public void bark (int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("woof");
        }
    }
}
