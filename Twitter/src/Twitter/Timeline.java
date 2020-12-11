package Twitter;

import java.util.List;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class Timeline {

	public void linhaDoTempo() throws TwitterException
	{
		ConfigurationBuilder cb = new ConfigurationBuilder(); //Cria builder para validação da API.
		cb.setDebugEnabled(false)
		.setDebugEnabled(true)
                .setOAuthConsumerKey("*********")
                .setOAuthConsumerSecret("*********")
                .setOAuthAccessToken("*********")
                .setOAuthAccessTokenSecret("*********");
		

		TwitterFactory tf = new TwitterFactory (cb.build());
		twitter4j.Twitter twitter = tf.getInstance();
		
		List<Status> status = twitter.getHomeTimeline();
		
		/*Twitter twitter = TwitterFactory.getSingleton();
	    Query query = new Query("#openbanking");
	    QueryResult result = twitter.search(query);
	    
	    for (Status stt : result.getTweets()) 
	    {
	        System.out.println("TESTE " + stt.getUser().getScreenName() + ":" + stt.getText());
	    }
		*/
		for (Status stat : status)
		{
			System.out.println("usuario @" + stat.getUser().getScreenName() + " - " + stat.getText());
		}
	}
	
}
