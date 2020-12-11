package com.twitter.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.twitter.api.model.PubModel;


import twitter4j.Status;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

@Repository
public interface PubRepository extends JpaRepository<PubModel, Long> {
	public List<PubModel> listPubCountByHourOfDay ();

	
	
}
