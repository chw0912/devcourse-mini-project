package repository;

import data.Post;

import java.time.LocalDate;
import java.util.ArrayList;

public class PostRepository {
    private int sequence = 0;
    private ArrayList<Post> postList = new ArrayList<>();


    public int addPost(String title, String body) {
        Post newPost = new Post(++sequence,title, body);
        postList.add(newPost);

        return newPost.getId();
    }

    public Post getPost(int postId) {
        return postList.get(postId - 1);
    }

    public int getPostAmount() {
        return postList.size();
    }

    public ArrayList<Post> getPostList() {
        return postList;
    }

    public void updatePost(int postId, String title, String body) {
        Post findPost = getPost(postId);
        findPost.setTitle( title );
        findPost.setBody( body );
        findPost.setUpdatedAt(LocalDate.now());
    }

    public void removePost(int postId) {
        Post findPost = getPost(postId);
        if (findPost != null) {
            postList.set(postId - 1, null);
        }
    }


}
