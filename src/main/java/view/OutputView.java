package view;

public class OutputView {

    private static final String COMMAND = "명령어 > ";
    public static final String EXIT_COMMAND = "종료";
    public static final String WRITE_COMMAND = "작성";
    public static final String CHECK_COMMAND = "조회";
    public static final String DELETE_COMMAND = "삭제";
    public static final String MODIFY_COMMAND = "수정";


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

