package com.ll.exam.mutbooks.app.postKeyword.repository;

import com.ll.exam.mutbooks.app.postKeyword.entity.PostKeyword;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PostKeywordRepository extends JpaRepository<PostKeyword, Long> {
    Optional<PostKeyword> findByContent(String keywordContent);
}
