import java.util.Scanner;

public class LessonThree {
    private static char[][] field;
    private static int fieldSizeX;
    private static int fieldSizeY;
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = 'O';
    private static final char DOT_EMPTY = '.';

    private static void initField() {
        fieldSizeX = 3;
        fieldSizeY = 3;
        field = new char[fieldSizeY][fieldSizeX];
        for (int i = 0; i < fieldSizeY; i++) {
            for (int j = 0; j < fieldSizeX; j++) {
                field[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void showField() {
        for (int i = 0; i < fieldSizeY; i++) {
            System.out.print("|");
            for (int j = 0; j < fieldSizeX; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        initField();
        showField();
    }

    private static void HumanTurn() {
        int x;
        int y;
        System.out.println("Введите координаты");
        x = SCANNER.nextInt();
        y = SCANNER.nextInt();
        if (x > 0 && x < fieldSizeX && y > 0 && y < fieldSizeY && field[y][x] == DOT_EMPTY)
            field[y][x] = DOT_HUMAN;
    }
    //aiTurn
    //checkWin
    //checkDraw


}
