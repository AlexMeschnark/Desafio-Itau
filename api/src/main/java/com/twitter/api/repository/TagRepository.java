package com.twitter.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.twitter.api.model.TagModel;


@Repository
public interface TagRepository extends JpaRepository<TagModel, Long>{

	public List<TagModel> listPubAmountByTags();
}
