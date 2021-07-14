import java.util.Scanner;

public class lesson_8 {
    public static void main(String[] args) {

// Application to see what type of triangle it is by the side values

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of first triangle side");
        int firstTriangleSide = scanner.nextInt();
        System.out.println("Please enter the length of second triangle side");
        int secondTriangleSide = scanner.nextInt();
        System.out.println("Please enter the length of third triangle side");
        int thirdTriangleSide = scanner.nextInt();
        int sumOne = firstTriangleSide + secondTriangleSide;
        int sumTwo = thirdTriangleSide + secondTriangleSide;
        int sumThree = thirdTriangleSide + firstTriangleSide;

        if ((sumOne < thirdTriangleSide) || (sumTwo < firstTriangleSide) || (sumThree < secondTriangleSide)) {
            System.out.println("Triangle doesn't exist!");
        } else if ((firstTriangleSide == secondTriangleSide) || (secondTriangleSide == thirdTriangleSide) || (firstTriangleSide == thirdTriangleSide)) {
            System.out.println("Isosceles triangle");
        }
        if ((firstTriangleSide == secondTriangleSide) && (secondTriangleSide == thirdTriangleSide)) {
            System.out.println("Equilateral triangle");
        } else if ((firstTriangleSide != secondTriangleSide) && (secondTriangleSide != thirdTriangleSide) && (firstTriangleSide != thirdTriangleSide)) {
            System.out.println("Scalene triangle");
        }

    }
}