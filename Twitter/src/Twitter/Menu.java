package Twitter;

import javax.swing.JOptionPane;

import twitter4j.TwitterException;

public class Menu {

	public static void main(String[] args) throws TwitterException {
		int opc = 0;
		
		Twittar tw  = new Twittar();
		Timeline tl = new Timeline();
		
		while (opc != 3)
		{
			opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha a opção: \n" + 
					 "1 - Ver a Timeline \n" +
					 "2 - Twittar \n" +
					 "3 - Sair"));
			
			switch (opc)
			{
			case 1: 
			{
				
				tl.linhaDoTempo();
				break;
			}
			
			case 2:
			{
				tw.tweet();
				break;
			}
			
			case 3:
			{
				break;
			}
			
			default:
				break;
			
			}
		}
		
	}

}
