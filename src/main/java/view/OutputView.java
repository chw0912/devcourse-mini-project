package view;

public class OutputView {

    private static final String COMMAND = "명령어 > ";
    public static final String EXIT_COMMAND = "exit";
    public static final String ADD_COMMAND = "add";
    public static final String VIEW_COMMAND = "view";
    public static final String REMOVE_COMMAND = "remove";
    public static final String UPDATE_COMMAND = "update";
    public static final String LIST_COMMAND = "list";


    public static void printCommandString() {
        System.out.print(COMMAND);
    }

    public static void printExitCommand() {
        System.out.println("프로그램을 종료합니다.");
    }

    public static void printNotExistsCommand() {
        System.out.println("존재하지 않는 명령어입니다.");
    }

    public static void printWriteTitle() {
        System.out.print("제목 : ");
    }
    public static void printWriteBody() {
        System.out.print("내용 : ");
    }

    public static void printWhatPost(String command) {
        System.out.printf("어떤 게시물을 %s할까요? ", command);
    }

}

