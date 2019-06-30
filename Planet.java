public class Planet extends Sun {
	
	private double centreOfRotationDistance;
	private double centreOfRotationAngle;
	private double speed;
	
	public Planet(double planetDiameter,String planetColour,double planetCentreOfRotationDistance, double planetCentreOfRotationAngle,double planetSpeed){
		
		super(planetDiameter,planetColour);
		
		centreOfRotationDistance = planetCentreOfRotationDistance;
	    centreOfRotationAngle = planetCentreOfRotationDistance;
	    speed = planetSpeed;
	    
	}
	
	// useful setters and getters to aid encapsulation
	
	public double getCentreOfRotationDistance(){
	
		return centreOfRotationDistance;
	}
	
	public double getCentreOfRotationAngle(){
		
		return centreOfRotationAngle;
		
	}
	
	public double getSpeed(){
		
		return speed;
		
	}
	
	public void setCentreOfRotationDistance(double i){
		
		centreOfRotationDistance = i;
			
	}
	
	public void setCentreOfRotationAngle(double i){
		
		centreOfRotationAngle = i;
			
	}
	
	public void setPlanetSpeed(double i){
		
		speed = i;
			
	}
	
	
	// update method to run on all planets and constantly increment their rotation angle
	
	public void update(){
		
		setCentreOfRotationAngle(getCentreOfRotationAngle() + speed);
		
	}
	
}
