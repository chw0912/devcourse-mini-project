package view;

public class OutputView {

    private static final String COMMAND = "명령어 > ";

    public static void printCommandString() {
        System.out.print(COMMAND);
    }

    public static void printCommand(String command) {
        System.out.println(command);
    }

}

