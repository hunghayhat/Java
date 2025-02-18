package TextBlock;

public class Main {
    //text box format
    public static void main(String[] args) {
        String textBox = """
                This is my speech:
                    \u2022 First point
                        \u2022 Second point
                """;
        System.out.print(textBox);
    }


}
