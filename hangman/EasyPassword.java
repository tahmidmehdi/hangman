public class EasyPassword
{
    private String password, str;
    
    public EasyPassword()
    {
	int r=(int)(Math.random()* 20 + 0);

	if(r==0)
	{
	    str=" decision";
	    password=" ********";
	}
	else if(r==1)
	{
	    str=" obtain";
	    password=" ******";
	}
	else if(r==2)
	{
	    str=" brief";
	    password=" *****";
	}
	else if(r==3)
	{
	    str=" freight";
	    password=" *******";
	}
	else if(r==4)
	{
	    str=" acquire";
	    password=" *******";
	}
	else if(r==5)
	{
	    str=" product";
	    password=" *******";
	}
	else if(r==6)
	{
	    str=" market";
	    password=" ******";
	}
	else if(r==7)
	{
	    str=" confirm";
	    password=" *******";
	}
	else if(r==8)
	{
	    str=" goal";
	    password=" ****";
	}
	else if(r==9)
	{
	    str=" believe";
	    password=" *******";
	}
	else if(r==10)
	{
	    str=" sandwich";
	    password=" ********";
	}
	else if(r==11)
	{
	    str=" deceive";
	    password=" *******";
	}
	else if(r==12)
	{
	    str=" ancient";
	    password=" *******";
	}
	else if(r==13)
	{
	    str=" pressure";
	    password=" ********";
	}
	else if(r==14)
	{
	    str=" success";
	    password=" *******";
	}
	else if(r==15)
	{
	    str=" cooperate";
	    password=" *********";
	}
	else if(r==16)
	{
	    str=" surprise";
	    password=" ********";
	}
	else if(r==17)
	{
	    str=" accept";
	    password=" ******";
	}
	else if(r==18)
	{
	    str=" utensil";
	    password=" *******";
	}
	else if(r==19)
	{
	    str=" conduct";
	    password=" *******";
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
