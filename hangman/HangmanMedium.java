//Hangman
//By: Tahmid Mehdi, Ryan Del Genio, Cole Stichhaller
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HangmanMedium extends Applet implements ActionListener
{
    JFrame f=new JFrame("Hangman");
    JPanel p1=new JPanel();
    JPanel p2=new JPanel();

    //gets a password from Password classes
    MediumPassword p=new MediumPassword();
    String password=p.getPassword();
    String str=p.getStr();
    //components
    JTextField tfGuess=new JTextField(5);
    JLabel lblPassword=new JLabel(password);
    JLabel lblMsg=new JLabel("only type lower case letters please                                            ");
    JLabel lblPrompt=new JLabel("Type a Letter: ");
    JLabel lblBank=new JLabel("Your used letters will be displayed here! ");
    //letter that they guess
    char guess;
    //pictures
    Image img1;
    Image img2;
    Image img3;
    Image img4;
    Image img5;
    Image img6;
    Image img7;
    Image img8;
    Image img9;
    Image img10;
    Image img11;
    Image img12;
    
    Image logo;
    //strikes is the number of wrong guesses
    int strike=0;
    //bank is the letter bank
    String bank="";
    
    public void init()
    {
	p2.add(lblPassword);
	p1.add(lblPrompt);
	p1.add(tfGuess);
	p2.add(lblMsg);
	tfGuess.addActionListener(this);
	p1.add(lblBank);
	f.setSize(500, 100);
	f.getContentPane().add(p1, BorderLayout.NORTH); 
	f.getContentPane().add(p2, BorderLayout.CENTER);
	f.setVisible(true);
	
	logo=getImage(getDocumentBase(), "logo.jpg");
	
	img1=getImage(getDocumentBase(), "hm1.GIF");
	img2=getImage(getDocumentBase(), "hm2.GIF");
	img3=getImage(getDocumentBase(), "hm3.GIF");
	img4=getImage(getDocumentBase(), "hm4.GIF");
	img5=getImage(getDocumentBase(), "hm5.GIF");
	img6=getImage(getDocumentBase(), "hm6.GIF");
	img7=getImage(getDocumentBase(), "hm7.GIF");
	img8=getImage(getDocumentBase(), "hm8.GIF");
	img9=getImage(getDocumentBase(), "hm9.GIF");
	img10=getImage(getDocumentBase(), "hm10.GIF");
	img11=getImage(getDocumentBase(), "hm11.GIF");
	img12=getImage(getDocumentBase(), "hm12.GIF");
    }
    
    public void actionPerformed(ActionEvent ae)
    {
	if(ae.getSource()==tfGuess)
	{
	    boolean found=false;
	    //guess is the 1st letter that's in the textbox
	    guess=tfGuess.getText().charAt(0);
	    
	    for(int i=0; i<password.length(); i++)
	    {   
		 //if the phrase contains the letter, the program will replace the * with the letter
		if (guess==str.charAt(i))
		{
		    found=true; 
		    String newphrase = password.substring(0,i)+guess+password.substring((i+1), password.length()); 
		    password=newphrase;
		}
	    }
	    lblPassword.setText(password);
	    p2.add(lblPassword);
	    /*if the letter is found, the message will appear
	    if not, they get 1 more strike and the letter is added to the letter bank*/
	    if(found)
	    {
		lblMsg.setText("Letter Found!!!");
		p2.add(lblMsg);
	    }
	    else
	    {
		lblMsg.setText("Letter Not Found!!!");
		p2.add(lblMsg);
		strike++;
		bank=bank+", "+guess;
	    }
	    lblBank.setText(bank);
	    
	    int counter=0;
		
		//counts number of * in string
		for(int j=1; j<password.length(); j++)
		{
		    if(password.charAt(j)=='*')
		    {
			counter++;
		    }
		}
		    
		    //if there's no * the program outputs this because the user won
		    if (counter==0)
		    {
			lblMsg.setText("You Win. Congratulations!!!");
			p2.add(lblMsg);
			p1.remove(tfGuess);
		    }
	    //empty textbox after the user presses enter        
	    tfGuess.setText("");
	    repaint();
	    //if they get 11 letters wrong, they lose
	    if(strike==11)
	    {
		lblMsg.setText("You Lose. Sorry. The word was "+str);
		p2.add(lblMsg);
		p1.remove(tfGuess);
	    }
	}
    }
    public void paint(Graphics g)
    {
	g.drawImage(logo, 0, 0, this);
	//displays picture based on number of strikes
	if(strike==0)    
	{    g.drawImage(img1, 0, 200, this); }
	else if(strike==1)
	{    g.drawImage(img2, 0, 200, this); }
	else if(strike==2)
	{    g.drawImage(img3, 0, 200, this); }
	else if(strike==3)
	{    g.drawImage(img4, 0, 200, this); }
	else if(strike==4)
	{    g.drawImage(img5, 0, 200, this); }
	else if(strike==5)
	{    g.drawImage(img6, 0, 200, this); }
	else if(strike==6)
	{    g.drawImage(img7, 0, 200, this); }
	else if(strike==7)
	{    g.drawImage(img8, 0, 200, this); }
	else if(strike==8)
	{    g.drawImage(img9, 0, 200, this); }
	else if(strike==9)
	{    g.drawImage(img10, 0, 200, this); }
	else if(strike==10)
	{    g.drawImage(img11, 0, 200, this); }
	else if(strike==11)
	{    g.drawImage(img12, 0, 200, this); }
	
	
    }
    
}
