package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.key.TwitterKey;
import com.example.demo.model.PubModel;
import com.example.demo.model.UserModel;
import com.example.demo.repository.PubRepository;
import com.example.demo.repository.TagRepository;

import twitter4j.HashtagEntity;
import twitter4j.Twitter;

@Configuration
public class TwitterService<Status> {
	
	
	TwitterKey twitterkey = new TwitterKey();
    
    //Twitter statuses =  twitterkey.getTwitterConfiguration();
	//public CommandLineRunner initDatabase(PubRepository pubRepository, TagRepository tagRepository) {
        
		
		/*return args ->
        {
            List<String> hashs = new ArrayList<String>();
            //hashs.add("#openbanking");
            //hashs.add("#apifirst");
            //hashs.add("#devops");
            //hashs.add("#cloudfirst");
            //hashs.add("#microservices");
            //hashs.add("#apigateway");
           // hashs.add("#oauth");
            //hashs.add("#swagger");
            //hashs.add("#raml");
            //hashs.add("#openapis");

            TwitterKey twitterkey = new TwitterKey();
            @SuppressWarnings("unchecked")
            List<Status> statuses = (List<Status>) twitterkey.getTwitterConfiguration();
        };*/
         
           /* for (Status s : statuses) {
                PubModel tweet = new PubModel();
                tweet.setId(s.getId());
                tweet.setCreatedAt(s.getCreatedAt());
                tweet.setUser(new UserModel(s.getUser().getId(), String.format("@%s", s.getUser().getScreenName()), Long.valueOf(s.getUser().getFollowersCount()), s.getUser().getLang(), null));
                tweetRepository.save(tweet);

                HashtagEntity tags[] = s.getHashtagEntities();
                Arrays.stream(tags).filter(x -> hashs.contains("#" + x.getText().toLowerCase())).forEach(h -> {
                            TagEntity tagEntity = new TagEntity();
                            tagEntity.setId(1234l);
                            tagEntity.setTag(h.getText().toLowerCase());
                            tagEntity.setTweet(tweet);

                            tagRepository.save(tagEntity);
                        }
                );

            }*/
        
	}	

