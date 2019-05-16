class Author{
	private String name;
	private String email;
	private char gender;

	public Author(String n,String e,char g)
	{
name=n;
email=e;
gender=g;
	}

	public String getName()
{
return name;
}

	public void  setEmail(String e)
	{
		email=e;
	}

	public String getEmail(){
return email;
	}

	public char getGender(){
		return gender;
		
	}

	public String toString(){
		return "Author[Name :"+name+" Email :"+email+" Gender :"+gender+"]";
	}



	
}
