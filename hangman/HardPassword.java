public class HardPassword
{
    private String password, str;
    
    public HardPassword()
    {
	int r=(int)(Math.random()* 20 + 0);

	if(r==0)
	{
	    str=" delinquents";
	    password=" ***********";
	}
	else if(r==1)
	{
	    str=" hagiology";
	    password=" *********";
	}
	else if(r==2)
	{
	    str=" skullduggery";
	    password=" ************";
	}
	else if(r==3)
	{
	    str=" indubitably";
	    password=" ***********";
	}
	else if(r==4)
	{
	    str=" mollycoddle";
	    password=" ***********";
	}
	else if(r==5)
	{
	    str=" superstitious";
	    password=" *************";
	}
	else if(r==6)
	{
	    str=" pogonophobia";
	    password=" ************";
	}
	else if(r==7)
	{
	    str=" superposition";
	    password=" *************";
	}
	else if(r==8)
	{
	    str=" rutherfordium";
	    password=" *************";
	}
	else if(r==9)
	{
	    str=" polymorphism";
	    password=" ************";
	}
	else if(r==10)
	{
	    str=" soliloquy";
	    password=" *********";
	}
	else if(r==11)
	{
	    str=" hypnagogic";
	    password=" **********";
	}
	else if(r==12)
	{
	    str=" rigamarole";
	    password=" **********";
	}
	else if(r==13)
	{
	    str=" stoichiometry";
	    password=" *************";
	}
	else if(r==14)
	{
	    str=" amortization";
	    password=" ************";
	}
	else if(r==15)
	{
	    str=" gargantuan";
	    password=" **********";
	}
	else if(r==16)
	{
	    str=" microblogger";
	    password=" ************";
	}
	else if(r==17)
	{
	    str=" alexithymia";
	    password=" ***********";
	}
	else if(r==18)
	{
	    str=" melancholy";
	    password=" **********";
	}
	else if(r==19)
	{
	    str=" circumcenter";
	    password=" ************";
	}
    
    }
    public void setPassword(String p)
    {
	password=p;
    } 
    public void setStr(String s)
    {
	str=s;
    }
    public String getPassword()
    {
	return password;
    }   
    public String getStr()
    {
	return str;
    }
}
