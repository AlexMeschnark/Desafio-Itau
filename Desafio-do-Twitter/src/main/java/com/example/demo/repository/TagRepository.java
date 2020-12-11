package com.example.demo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.TagModel;
import com.example.demo.valueobject.PubByTagByUserIdiomVO;

import java.util.List;

@Repository
public interface TagRepository extends JpaRepository<TagModel, String> {
    @Query("SELECT new com.example.demo.valueobject.PubByTagByUserIdiomVO(count(tag.pub), tag.tag, tag.pub.user.idiom) " +
            "FROM TagModel tag GROUP BY tag.tag, tag.pub.user.idiom ORDER BY 1, tag.pub.user.idiom")
    public List<PubByTagByUserIdiomVO> listPubAmountByTagsByUser();
}

	

