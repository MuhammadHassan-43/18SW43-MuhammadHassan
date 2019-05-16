class Task2{
	public static void main(String[] args) {
		
	Author[] authors=new Author[2];
	authors[0]=new Author("Hassan","hassan@gmail.com",'m');
	authors[1]=new Author("Mike","mike-8@gamil.com",'m');
	

	Book b=new Book("Java ",authors,19.95,99);
	System.out.println(b);


	}
}
