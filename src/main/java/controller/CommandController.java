package controller;

import model.Post;
import model.PostBoard;
import view.InputView;
import view.OutputView;

import java.util.LinkedList;

public class CommandController {

    private boolean programStatus = true;

    private int id = 0;

    private PostBoard postBoard = new PostBoard();


    public CommandController() {

    }

    public void inputCommand() {
        while (programStatus) {
            OutputView.printCommandString();
            String command = InputView.commandInput();

            switch (command) {
                case OutputView.WRITE_COMMAND -> {
                    OutputView.printWriteTitle();
                    String title = InputView.commandInput();
                    OutputView.printWriteBody();
                    String body = InputView.commandInput();

                    id++;
                    Post newPost = new Post(id, title, body);
                    postBoard.addPost(newPost);
                }

                case OutputView.CHECK_COMMAND -> {
                    OutputView.printWhatPost(command);
                    String targetId = InputView.commandInput();
                    System.out.println(postBoard.getPost(Integer.parseInt(targetId)));
                }

                case OutputView.DELETE_COMMAND -> {
                    OutputView.printWhatPost(command);
                }

                case OutputView.MODIFY_COMMAND -> {
                    OutputView.printWhatPost(command);
                }

                case OutputView.EXIT_COMMAND -> {
                    OutputView.printExitCommand();
                    programStatus = false;
                }
                default -> OutputView.printNotExistsCommand();
            }

        }
    }
}
