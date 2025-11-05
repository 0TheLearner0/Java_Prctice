public class encapBook{
	private String title;
	private String author;
	private int price;
	
	public String getTitle() { return title;}
	public String getAuthor() {return author;}
	public int getPrice() {return price;}
	
	public void setTitle(String title)
	{if(title!=null) {this.title=title;}
	if(title==null) {this.title=title;
	System.out.println("Please insert value");}
	}
	

	public void setAuthor(String author)
	{if(author!=null) {this.author=author;}
	if(author==null) {this.author=author;
	System.out.println("Please insert value");}
	}
	
	public void setPrice(int price)
	{if(price>0) {this.price=price;}
	if(price<0) {this.price=price;
			System.out.println("Please insert positive value");}
	}
	
	
	public static void main(String[] arg)
	{encapBook bookObj=new encapBook();
	bookObj.setTitle("The power of Subconscious mind");
	bookObj.setAuthor("Dr Joseph Murphy");
	bookObj.setPrice(450);
	System.out.println("Title: "+bookObj.getTitle());

	System.out.println("Author: "+bookObj.getAuthor());

	System.out.println("Price: "+bookObj.getPrice());
	
	encapBook bookObj1=new encapBook();
	bookObj1.setTitle("The power of Subconscious mind");
	bookObj1.setAuthor(null);
	bookObj1.setPrice(-71);
	
	
	System.out.println("Title: "+bookObj1.getTitle());

	System.out.println("Author: "+bookObj1.getAuthor());

	System.out.println("Price: "+bookObj1.getPrice());
	
	}
	
}