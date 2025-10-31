public class encaprectangle{
	private int length;
	private int width;
	private int s;
	
	public int getLength() {return length;}
	public int getWidth() {return width;}
	public int getArea() {return s;}
	
	public void setLength(int length) {if (length>0) {this.length=length;}
	else
		System.out.println("Please enter the Positive value");}
	public void setWidth(int width) {if (width>0) {this.width=width;}
	else
		System.out.println("Please enter the Positive value");}
	public void setArea(int s) { this.s=s;
	this.s=this.length*this.width;
	
	}
	
	
	public static void main(String[] arg)
	{
		encaprectangle recObj=new encaprectangle();
		recObj.setLength(20);
		recObj.setWidth(30);
		
		System.out.println("Length: "+recObj.getLength());
		System.out.println("Width: "+recObj.getWidth());
		System.out.println("Area: "+recObj.getArea());
		
		
		
	}
	
}
