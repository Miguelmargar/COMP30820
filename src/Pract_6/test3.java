package Pract_6;

public class test3 {
    public static void main(String[] args) {
        Question_3 [] regularPoligon = new Question_3[5];
        regularPoligon[0] = new Question_3(3, 10, 2.5,8);
        regularPoligon[1] = new Question_3(6, 4);
        regularPoligon[2] = new Question_3(3, 1);
        regularPoligon[3] = new Question_3(10, 5);
        regularPoligon[4] = new Question_3(4, 6, 3.0,6.8);


        for (Question_3 i: regularPoligon) {
            System.out.println(i.toString());
            System.out.println("area is: " + i.getArea());
        }

        int bigArea = 0;
        int minPeri = 0;
        for (int i = 0; i < regularPoligon.length; i++) {
            if (regularPoligon[i].getArea() > regularPoligon[bigArea].getArea()) {
                bigArea = i;

            }

            if (regularPoligon[i].getPerimeter() < regularPoligon[minPeri].getPerimeter()) {
                minPeri = i;
            }
        }
        System.out.println("biggest area is: " + regularPoligon[bigArea].getArea());
        System.out.println("biggest perimeter is: " + regularPoligon[minPeri].getPerimeter());


    }
}
