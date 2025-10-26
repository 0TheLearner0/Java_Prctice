public class car{
	private String carName;
	private String type;
	private int year;
	
	public String getCarName() {return carName;}
	public String getCarType() {return type;}
	public int getCarYear() {return year;}
	
	public void setCar(String carName, String type, int year)
	{
		this.carName=carName;
		this.type=type;
		this.year=year;
	}
	public static void main(String[] arg)
	{
		car carObj= new car();
		carObj.setCar("Valkyrie","Supercar",2025);
		System.out.println("Car: "+carObj.getCarName()+" Type: "+carObj.getCarType()+" Year: "+carObj.getCarYear());
	}
	
	
	
}
