package OOP.PracticeInheritance.Ex3;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalArgumentException{
        Locale.setDefault(Locale.CANADA);
        Scanner scanner = new Scanner(System.in);
/*        String[] sidesStr = scanner.nextLine().split(" ");
        int[] inSides = new int[sidesStr.length];
        for (int i = 0; i < sidesStr.length; i++) {
            inSides[i] = Integer.parseInt(sidesStr[i]);
        }*/
        int[] inSides = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        if (inSides.length == 2){
            throw new IllegalArgumentException("Invalid value to sides number");
        }else if (inSides.length > 4){
            System.out.println(new Polygon(inSides));
        } else if (inSides.length == 4 &&
                (
                (inSides[0] == inSides[1])&&
                (inSides[1] == inSides[2])&&
                (inSides[2] == inSides[3])
                )
        ){
            System.out.println(new Rhombus(inSides));
            System.exit(0);
        } else if (inSides.length == 4 &&
                (
                        ((inSides[0] == inSides[1])&&(inSides[2] == inSides[3]))|
                        ((inSides[1] == inSides[2])&&(inSides[3] == inSides[0]))|
                        ((inSides[0] == inSides[2])&&(inSides[1] == inSides[3]))

                )
        ){
            System.out.println(new Parallelogram(inSides));
            System.exit(0);
        } else if (inSides.length == 4){
            System.out.println(new Quadrilateral(inSides));
        } else  if (inSides.length == 3){
            System.out.println(new Triangle(inSides));
        } else if (inSides.length == 1) {
            System.out.println(new Circle(inSides));
        }
    }
}
