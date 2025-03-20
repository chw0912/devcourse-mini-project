package model;

import java.util.LinkedList;

public class PostBoard {
    private LinkedList<Post> postBoard;

    public PostBoard() {
        postBoard = new LinkedList<>();
    }

    public void addPost(Post post) {
        postBoard.add(post);
    }

    @Override
    public String toString() {
        return "PostBoard{" +
                "postBoard=" + postBoard +
                '}';
    }
}
