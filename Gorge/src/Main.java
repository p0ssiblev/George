import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество квадратов: ");
        int n = input.nextInt();

        Square[] squareArray = createSquareArray(n);
        printSquareArray(squareArray);

        double totalPerimeter = getTotalPerimeter(squareArray);
        System.out.println("Общий периметр всех квадратов: " + totalPerimeter);

        Random random = new Random(250);
        for (int i = 0; i < 50; i++) {
            int randomNumber = random.nextInt(60);
            System.out.println(randomNumber);

        }
    }

    public static Square[] createSquareArray(int n) {
        Square[] squareArray = new Square[n];
        for (int i = 0; i < squareArray.length; i++) {
            squareArray[i] = new Square(Math.random() * 10);
        }
        return squareArray;
    }

    public static void printSquareArray(Square[] squareArray) {
        System.out.println("Ширина\t\t\tПлощадь\t\t\tПериметр");
        for (int i = 0; i < squareArray.length; i++) {
            System.out.println(squareArray[i].getWidth() + "\t\t\t"
                    + squareArray[i].getArea() + "\t\t\t" + squareArray[i].getPerimeter());
        }
    }

    public static double getTotalPerimeter(Square[] squareArray) {
        double totalPerimeter = 0;
        for (int i = 0; i < squareArray.length; i++) {
            totalPerimeter += squareArray[i].getPerimeter();
        }
        return totalPerimeter;
    }

}

