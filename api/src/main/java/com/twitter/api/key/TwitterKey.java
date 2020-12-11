package com.twitter.api.key;

import java.io.Serializable;

import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterKey implements Serializable{
	
	private Twitter getTwitterConfiguration() {
        ConfigurationBuilder cb = new ConfigurationBuilder()
                .setDebugEnabled(true)
                .setOAuthConsumerKey("EACUFJQ17VqtBYvBn7A9XPOVu")
                .setOAuthConsumerSecret("BiQuFFO9ExD8PPM6SxBOfAwyKj3iWt2n2tIKnoaghLTghV0i80")
                .setOAuthAccessToken("1084119416336510978-UaW8A5XWUHzdONNDJQA4f6DioYQ1uR")
                .setOAuthAccessTokenSecret("d0cfneMgq76IHGIFUxmV91WnVUPEq1qwwESaNqaSnpzZm");

        TwitterFactory twitterFactory = new TwitterFactory(cb.build());
        Twitter twitter = twitterFactory.getInstance();

        return twitter;
    }
}
