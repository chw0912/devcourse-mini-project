package controller;

import view.InputView;
import view.OutputView;

public class CommandController {
    public CommandController() {

    }

    public void inputCommand() {
        while (true) {
            OutputView.printCommandString();
            OutputView.printCommand(InputView.commandInput());
        }
    }
}
