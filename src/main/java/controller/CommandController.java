package controller;

import view.InputView;
import view.OutputView;

public class CommandController {
    public CommandController() {

    }

    public void inputCommand() {
        while (true) {
            System.out.print(OutputView.COMMAND);
            String command = InputView.commandInput();
            System.out.println(command);
        }
    }
}
