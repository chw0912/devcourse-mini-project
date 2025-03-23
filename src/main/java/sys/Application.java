package sys;

import controller.PostController;

public class Application {

    public void run() {
        PostController postController = new PostController();

        postController.inputCommand();
    }

}
