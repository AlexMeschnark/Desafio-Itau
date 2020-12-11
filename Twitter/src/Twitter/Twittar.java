package Twitter;

import javax.swing.JOptionPane;

import twitter4j.Status;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class Twittar {

	public void tweet () throws TwitterException
	{
		ConfigurationBuilder cb = new ConfigurationBuilder(); //Cria builder para validação da API.
		cb.setDebugEnabled(false)
		.setOAuthConsumerKey("sSAqJJ3V8SH6pbXPxiuxjVHDU")
		.setOAuthConsumerSecret("bCZrAExfLt0MKBqiBi2mmJZbtchofChaSChCsJh5MBEwQDLcuf")
		.setOAuthAccessToken("3082605442-hyCFl01SwfIFhrzhJQi3l4Bmb2n3KpO2g7UjJ3G")
		.setOAuthAccessTokenSecret("NKihYGG6md5YNax0YC9glrru2V49FLoWC6AFkQ6caafXv");
		
		TwitterFactory tf = new TwitterFactory (cb.build());
		twitter4j.Twitter twitter = tf.getInstance();

		String tweet = JOptionPane.showInputDialog("Digite o texto para ser postado.");
		Status status = twitter.updateStatus(tweet);
		System.out.println("Tema postado.");
	}
	
}
