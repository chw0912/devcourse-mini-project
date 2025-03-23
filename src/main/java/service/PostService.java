package service;

import data.Post;
import repository.PostRepository;

import java.util.List;

public class PostService {

    private PostRepository postRepository = new PostRepository();


    public int addPost(String title, String body) {
        return postRepository.addPost(title, body);
    }

    public Post getPost(int postId) {
        return postRepository.getPost(postId);
    }

    public void updatePost(int postId, String title, String body) {
        postRepository.updatePost(postId, title, body);
    }

    public void removePost(int postId) {
        postRepository.removePost(postId);
    }

    public int getPostAmount() {
        return postRepository.getPostAmount();
    }

    public List<Post> getAllPosts() {
        return postRepository.getPostList();
    }

}
