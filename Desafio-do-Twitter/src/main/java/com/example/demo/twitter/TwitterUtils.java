package com.example.demo.twitter;

import java.io.Serializable;
import java.util.List;

import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterUtils<Status>  implements Serializable {
	
	
	public void linhaDoTempo() throws TwitterException
	{
		ConfigurationBuilder cb = new ConfigurationBuilder(); //Cria builder para validação da API.
		cb.setDebugEnabled(false)
		.setOAuthConsumerKey("sSAqJJ3V8SH6pbXPxiuxjVHDU")
		.setOAuthConsumerSecret("bCZrAExfLt0MKBqiBi2mmJZbtchofChaSChCsJh5MBEwQDLcuf")
		.setOAuthAccessToken("3082605442-hyCFl01SwfIFhrzhJQi3l4Bmb2n3KpO2g7UjJ3G")
		.setOAuthAccessTokenSecret("NKihYGG6md5YNax0YC9glrru2V49FLoWC6AFkQ6caafXv");
		
		TwitterFactory tf = new TwitterFactory (cb.build());
		twitter4j.Twitter twitter = tf.getInstance();
		
		List<twitter4j.Status> status = twitter.getHomeTimeline();
		
		for (twitter4j.Status stat : status)
		{
			System.out.println("usuario @" + stat.getUser().getScreenName() + " - " + stat.getText());
		}
	}
}
	
	
	