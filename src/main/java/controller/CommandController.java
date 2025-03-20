package controller;

import view.InputView;
import view.OutputView;

public class CommandController {

    private boolean programStatus = true;
    public CommandController() {

    }

    public void inputCommand() {
        while (programStatus) {
            OutputView.printCommandString();
            String command = InputView.commandInput();

            switch (command) {

                case OutputView.EXIT_COMMAND -> {
                    OutputView.printExitCommand();
                    programStatus = false;
                }
                default -> OutputView.printNotExistsCommand();
            }

        }
    }
}
