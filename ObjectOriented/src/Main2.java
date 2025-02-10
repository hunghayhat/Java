public class Main2 {
    public static void main(String[] args) {
        // Student Class
        for (int i = 0; i < 5; i++) {
            Student s = new Student("h" + i, switch (i) {
                case 0 -> "Hung";
                case 1 -> "Sen";
                case 2 -> "Dung";
                case 3 -> "Gioi";
                case 4 -> "Nam";
                default -> "Anonymous";
            }, "01/07/2002", "java class");
            System.out.println(s);
        }
        LPAStudent s1 = new LPAStudent("h7", "Hung", "01/07/2002", "Java Master Class");
        System.out.println(s1);

        // Wall Class
        Wall wall = new Wall(5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());

        //Point Class
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }
}
