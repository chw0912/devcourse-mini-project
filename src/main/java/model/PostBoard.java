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

    public Post getPost(int id) {
        for (Post post : postBoard) {
            if (post.getId() == id) {
                return post;
            }
        }
        return null;
    }
}
