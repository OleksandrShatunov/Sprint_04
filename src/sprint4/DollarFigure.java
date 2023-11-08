//Shatunov Oleksandr KND12 Sprint 4
package sprint4;

public class DollarFigure {
    public static final int HEIGHT = 7;

    public static void main(String[] args) {
        for (int i = 1; i <= HEIGHT; i++) {
            for (int j = HEIGHT + 2; j < i * 2 + HEIGHT; j++) {
                System.out.print("*");
            }
            for (int j = 1; j > i - HEIGHT; j--) {
                System.out.print("$");
            }
            for (int j = HEIGHT + 2; j > i * 2 - HEIGHT; j--) {
                System.out.print("*");
            }
            for (int j = 1; j > i - HEIGHT; j--) {
                System.out.print("$");
            }
            for (int j = HEIGHT + 2; j < i * 2 + HEIGHT; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}