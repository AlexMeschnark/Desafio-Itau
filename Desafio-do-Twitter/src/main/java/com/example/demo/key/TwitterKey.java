package com.example.demo.key;

import java.io.Serializable;

import twitter4j.conf.ConfigurationBuilder;
import org.apache.commons.lang3.StringUtils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.demo.model.PubModel;

import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TwitterKey implements Serializable {
	
	 public List<Status> getStatusByHashtags(List<String> hashtags) {
	        List<Status> statuses = new ArrayList<Status>();
	        

	        return statuses;
	    }
	 
	/* public List<Status> getStatusByHashtag(String ht) {
	        List<Status> statuses = null;

	        if (StringUtils.isBlank(ht))
	            throw new RuntimeException("hashtag can not by empty");

	        logger.info(String.format("fetching posts to hashtag [%s]", ht));
	        try {
	            QueryResult queryResult = getTwitterConfiguration().search(new Query(ht));
	            statuses = queryResult.getTweets();
	        } catch (TwitterException e) {
	            logger.error(String.format("error fetching posts to hashtag [%s]", ht), e);
	        }

	        return statuses;
	    }

*/
	
	 public Twitter getTwitterConfiguration() throws TwitterException{
	        ConfigurationBuilder cb = new ConfigurationBuilder()
	                .setDebugEnabled(true)
	                .setDebugEnabled(true)
                .setOAuthConsumerKey("*********")
                .setOAuthConsumerSecret("*********")
                .setOAuthAccessToken("*********")
                .setOAuthAccessTokenSecret("*********");

	        TwitterFactory twitterFactory = new TwitterFactory(cb.build());
	        Twitter twitter = twitterFactory.getInstance();

	       /* PubModel pub = new PubModel();
	        pub.setId(pub.getId());
            pub.setCreatedAt(pub.getCreatedAt());
            pub.setUser(new UserModel(pub.getUser().getId(), String.format("@%s", pub.getUser().getScreenName()), Long.valueOf(s.getUser().getFollowersCount()), s.getUser().getLang(), null));
            tweetRepository.save(pub);*/
	        
	        
	        //Teste
	        List<Status> status = twitter.getHomeTimeline();
			
			for (Status stat : status)
			{
				System.out.println("usuario @" + stat.getUser().getScreenName() + " - " + stat.getText());
			}
			
		return twitter;
	    }
	 
	 

}
