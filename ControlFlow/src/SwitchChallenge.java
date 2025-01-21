public class SwitchChallenge {
    public static void main(String[] args) {
        char NATO = 'X';
        switch (NATO) {
            case 'A':
                System.out.print("Able");
                break;
            case 'B':
                System.out.print("Baker");
                break;
            case 'C':
                System.out.print("Charlie");
                break;
            case 'D':
                System.out.print("Dog");
                break;
            case 'E':
                System.out.print("Easy");
                break;
            default: System.out.print("Not found");
        }
    }
}
