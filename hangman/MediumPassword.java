public class MediumPassword
{
    private String password, str;
    
    public MediumPassword()
    {
	int r=(int)(Math.random()* 20 + 0);

	if(r==0)
	{
	    str=" cadence";
	    password=" *******";
	}
	else if(r==1)
	{
	    str=" robotics";
	    password=" ********";
	}
	else if(r==2)
	{
	    str=" gymnastics";
	    password=" **********";
	}
	else if(r==3)
	{
	    str=" relapse";
	    password=" *******";
	}
	else if(r==4)
	{
	    str=" ellipsis";
	    password=" ********";
	}
	else if(r==5)
	{
	    str=" rutabaga";
	    password=" ********";
	}
	else if(r==6)
	{
	    str=" dyslexia";
	    password=" ********";
	}
	else if(r==7)
	{
	    str=" aardvarks";
	    password=" *********";
	}
	else if(r==8)
	{
	    str=" relative";
	    password=" ********";
	}
	else if(r==9)
	{
	    str=" functions";
	    password=" *********";
	}
	else if(r==10)
	{
	    str=" deflect";
	    password=" *******";
	}
	else if(r==11)
	{
	    str=" quagmire";
	    password=" ********";
	}
	else if(r==12)
	{
	    str=" quantum";
	    password=" *******";
	}
	else if(r==13)
	{
	    str=" pregnant";
	    password=" ********";
	}
	else if(r==14)
	{
	    str=" pomegranet";
	    password=" **********";
	}
	else if(r==15)
	{
	    str=" plausible";
	    password=" *********";
	}
	else if(r==16)
	{
	    str=" plethora";
	    password=" ********";
	}
	else if(r==17)
	{
	    str=" myriad";
	    password=" ******";
	}
	else if(r==18)
	{
	    str=" pegasus";
	    password=" *******";
	}
	else if(r==19)
	{
	    str=" metaphor";
	    password=" ********";
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
