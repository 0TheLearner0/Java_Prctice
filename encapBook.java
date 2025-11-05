public class encapBook{
	private String title;
	private String author;
	private int price;
	
	public String getTitle() { return title;}
	public String getAuthor() {return author;}
	public int getPrice() {return price;}
	
	public void setTitle(String title)
	{if(title!=null) {this.title=title;}
	
	}
	

	public void setAuthor(String author)
	{if(author!=null) {this.author=author;}
	
	}
	
	public void setPrice(int price)
	{ {this.price=price;}}
	
	
	
	public static void main(String[] arg)
	{encapBook bookObj=new encapBook();
	bookObj.setTitle("The power of Subconscious mind");
	bookObj.setAuthor("Dr Joseph Murphy");
	bookObj.setPrice(450);
	System.out.println("Title: "+bookObj.getTitle());

	System.out.println("Author: "+bookObj.getAuthor());

	System.out.println("Price: "+bookObj.getPrice());
	
	encapBook bookObj1=new encapBook();
	bookObj1.setTitle(null);
	bookObj1.setAuthor("Vans Hagner");
	bookObj1.setPrice(0);
	
	if(bookObj1.getTitle()!=null)
	System.out.println("Title: "+bookObj1.getTitle());
	else
		System.out.println("Please insert the name of the book");
	if(bookObj1.getAuthor()!=null)
	System.out.println("Author: "+bookObj1.getAuthor());
	else
		System.out.println("Please insert the name of the Author");

	if(bookObj1.getPrice()>=0)
	System.out.println("Price: "+bookObj1.getPrice());
	else
		System.out.println("Please the posotive or 0 value of the book");

	
	}
	
}