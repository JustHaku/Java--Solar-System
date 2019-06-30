public class Sun extends PointInSpace{
	
	private double diameter;
	private String colour;
	
	public Sun(double sunDiameter,String sunColour){
		
		super(0,0);
		
		diameter = sunDiameter;
		colour = sunColour;
		
	}
	
	// useful setters and getters to aid encapsulation
	
	public double getDiameter(){
		
		return diameter;
		
	}
	
	public String getColour(){
		
		return colour;
		
	}
	
	public void setDiameter(double i){
			
		diameter = i;
			
	}
	
	public void setColour(String i){
		
		colour = i;
		
	}
		
	// non utilised abstract method inclusion
	
	public double getCentreOfRotationDistance(){
	
		return 0;
	}
	
	public double getCentreOfRotationAngle(){
		
		return 0;
		
	}
	
	
	public void update(){
	
		
	}
	
}
