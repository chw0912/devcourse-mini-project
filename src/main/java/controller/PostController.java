package controller;

import data.Post;
import repository.PostRepository;
import service.PostService;
import view.InputView;
import view.OutputView;

import java.util.List;

public class PostController {

    private boolean programStatus = true;

    private PostService postService = new PostService();

    public void inputCommand() {
        while (programStatus) {
            OutputView.printCommandString();
            String command = InputView.commandInput();

            switch (command) {
                case OutputView.ADD_COMMAND -> {
                    OutputView.printWriteTitle();
                    String title = InputView.commandInput();
                    OutputView.printWriteBody();
                    String body = InputView.commandInput();

                    int postId = postService.addPost(title, body);
                    System.out.println(postId + "번 게시물을 추가하였습니다.");

                }

                case OutputView.VIEW_COMMAND -> {
                    try {
                        System.out.println("게시물을 조회합니다.");

                        OutputView.printWhatPost(command);
                        String targetIdStr = InputView.commandInput();
                        int targetId = Integer.parseInt(targetIdStr);

                        Post findPost = postService.getPost(targetId);

                        System.out.println("게시물 번호 : " + findPost.getId());
                        System.out.println("게시물 제목 : " + findPost.getTitle());
                        System.out.println("게시물 내용 : " + findPost.getBody());
                        System.out.println("게시물 생성일 : " + findPost.getCreatedAt());
                    } catch (NumberFormatException e) {
                        System.out.println("게시물 번호는 양의 정수로만 입력해주세요!");
                    } catch (NullPointerException e) {
                        System.out.println("해당 게시물이 존재하지 않습니다!");
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("게시물 번호를 확인해주세요!");
                    } catch (Exception e) {
                        System.out.println("알 수 없는 오류가 발생했습니다!");
                        e.printStackTrace();
                    }
                }

                case OutputView.REMOVE_COMMAND -> {
                    try {
                        System.out.println("게시물을 삭제합니다!");
                        OutputView.printWhatPost(command);
                        String targetIdStr = InputView.commandInput();
                        int targetId = Integer.parseInt(targetIdStr);

                        postService.removePost(targetId);
                        System.out.println("성공적으로 게시물을 삭제했습니다!");

                    } catch (NumberFormatException e) {
                        System.out.println("게시물 번호는 양의 정수로만 입력해주세요!");
                    } catch (NullPointerException e) {
                        System.out.println("해당 게시물이 존재하지 않습니다!");
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("게시물 번호를 확인해주세요!");
                    } catch (Exception e) {
                        System.out.println("알 수 없는 오류가 발생했습니다!");
                        e.printStackTrace();
                    }
                }

                case OutputView.UPDATE_COMMAND -> {
                    try {
                        System.out.println("게시물을 수정합니다!");
                        OutputView.printWhatPost(command);
                        String targetIdStr = InputView.commandInput();
                        int targetId = Integer.parseInt(targetIdStr);

                        OutputView.printWriteTitle();
                        String title = InputView.commandInput();
                        OutputView.printWriteBody();
                        String body = InputView.commandInput();

                        postService.updatePost(targetId, title, body);
                        System.out.println("게시물 수정이 완료되었습니다!");


                    } catch (NumberFormatException e) {
                        System.out.println("게시물 번호는 양의 정수로만 입력해주세요!");
                    } catch (NullPointerException e) {
                        System.out.println("해당 게시물이 존재하지 않습니다!");
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("게시물 번호를 확인해주세요!");
                    } catch (Exception e) {
                        System.out.println("알 수 없는 오류가 발생했습니다!");
                        e.printStackTrace();
                    }

                }

                case OutputView.LIST_COMMAND -> {
                    try {
                        int totalPostAmount = postService.getPostAmount();
                        System.out.printf("총 게시물은 %d개 작성되었습니다.\n", totalPostAmount);

                        List<Post> postList = postService.getAllPosts();
                        for (Post post : postList) {
                            System.out.println(post.getId()+"번 게시물");
                            System.out.println("제목 : " + post.getTitle());
                            System.out.println("내용 : " + post.getBody());
                            System.out.println("게시물 생성일 " + post.getCreatedAt());
                            System.out.println("게시물 수정일 " + post.getUpdatedAt());
                            System.out.println();
                        }

                    } catch (NumberFormatException e) {
                        System.out.println("게시물 번호는 양의 정수로만 입력해주세요!");
                    } catch (NullPointerException e) {
                        System.out.println("해당 게시물이 존재하지 않습니다!");
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("게시물 번호를 확인해주세요!");
                    } catch (Exception e) {
                        System.out.println("알 수 없는 오류가 발생했습니다!");
                        e.printStackTrace();
                    }

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
