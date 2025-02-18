package overrideoverload;

public class DogOverride {
    public void bark() {
        System.out.print("woof");
    }

}
class Beggie extends DogOverride {
    @Override
    public void bark() {
        System.out.print("woof woof");
    }
}
