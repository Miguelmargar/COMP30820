package Pract_6;

public class test {
    public static void main(String[] args) {
        Question_1 c = new Question_1(5, 2, -1);
        System.out.println(c.toString());
        c.setRadius(10);
        c.move(3, 4);
        System.out.print(c.toString());
        Question_1 d = new Question_1();
        System.out.println("Circle d is: " + d.toString());
        System.out.println(c.getDistance(d));
        System.out.println("number of objects is: " + Question_1.getNumberOfObjects());
    }
}
