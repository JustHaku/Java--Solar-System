public abstract class PointInSpace
{
	private double distance;
	private double angle;
	
	public PointInSpace(double objectDistance, double objectAngle)
	{
		distance = objectDistance;
		angle = objectAngle;
	}
	
	// useful setters and getters to aid encapsulation
	
	public double getDistance(){
		
		return distance;
		
	}
	
	public double getAngle(){
		
		return angle;
		
	}
	
	public void setDistance(double newDistance){
		
		distance = newDistance;
		
	}
	
	public void setAngle(double newAngle){
		
		angle = newAngle;
		
	}

	// abstract methods that have to be implemented in each subclass
	
	public abstract double getDiameter();
	public abstract String getColour();
	public abstract double getCentreOfRotationDistance();
	public abstract double getCentreOfRotationAngle();
	public abstract void update();
	
}



