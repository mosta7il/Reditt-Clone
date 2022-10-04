package com.springIt.redittClone.repository;

import com.springIt.redittClone.domain.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote,Long> {

}
