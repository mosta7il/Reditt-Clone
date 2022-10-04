package com.springIt.redittClone.repository;

import com.springIt.redittClone.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {

}
