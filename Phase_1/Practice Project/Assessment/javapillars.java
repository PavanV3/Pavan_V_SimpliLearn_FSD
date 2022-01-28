package Assessment;


public class javapillars {
	String name; 
    String type; 
    int age; 
    String color; 
    public javapillars(String name, String type, int age, String color) 
    { 
        this.name = name; 
        this.type = type; 
        this.age = age; 
        this.color = color; 
    } 
    public String getName() 
    { 
        return name; 
    } 
    public String gettype() 
    { 
        return type; 
    } 
    public int getAge() 
    { 
        return age; 
    } 
    public String getColor() 
    { 
        return color; 
    } 
    @Override
    public String toString() 
    { 
        return(" Name: "+ this.getName()+"\n Type: " + this.gettype()+"\n Age: "+ this.getAge()+"\n Color: "+ this.getColor());
        
    } 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		javapillars scott = new javapillars("Jacky","Wolf", 2 , " black and white"); 
        System.out.println(scott.toString()); 


	}

}