package view;

public class OutputView {

    private static final String COMMAND = "명령어 > ";
    public static final String EXIT_COMMAND = "exit";


    public static void printCommandString() {
        System.out.print(COMMAND);
    }

    public static void printExitCommand() {
        System.out.println("프로그램을 종료합니다.");
    }

    public static void printNotExistsCommand() {
        System.out.println("존재하지 않는 명령어입니다.");
    }


}

