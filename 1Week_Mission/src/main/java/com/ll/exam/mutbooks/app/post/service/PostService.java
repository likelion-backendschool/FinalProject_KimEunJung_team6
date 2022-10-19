package com.ll.exam.mutbooks.app.post.service;

import com.ll.exam.mutbooks.app.member.entity.Member;
import com.ll.exam.mutbooks.app.post.entity.Post;
import com.ll.exam.mutbooks.app.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class PostService {
    private final PostRepository postRepository;

    public Post write(Long authorId, String subject, String content) {
        Post post = Post
                .builder()
                .author(new Member(authorId))
                .subject(subject)
                .content(content)
                .build();

        postRepository.save(post);

        return post;
    }
}
