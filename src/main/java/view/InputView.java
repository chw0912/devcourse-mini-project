package view;

import java.util.Scanner;

public class InputView {

    private static final Scanner input = new Scanner(System.in);

    public static String commandInput() {
        return input.nextLine().trim();
    }

}
