package com.twitter.api.key;

import java.io.Serializable;

import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterKey implements Serializable{
	
	private Twitter getTwitterConfiguration() {
        ConfigurationBuilder cb = new ConfigurationBuilder()
                .setDebugEnabled(true)
                .setOAuthConsumerKey("*********")
                .setOAuthConsumerSecret("*********")
                .setOAuthAccessToken("*********")
                .setOAuthAccessTokenSecret("*********");

        TwitterFactory twitterFactory = new TwitterFactory(cb.build());
        Twitter twitter = twitterFactory.getInstance();

        return twitter;
    }
}
