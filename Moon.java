public class Moon extends Planet{
	
	private double pSpeed;
	
	public Moon(double distance,double moonDiameter,String moonColour,double moonCentreOfRotationDistance, double moonCentreOfRotationAngle,double moonSpeed, double planetSpeed){
		
		super(moonDiameter,moonColour,moonCentreOfRotationDistance,moonCentreOfRotationAngle,moonSpeed);
		
		pSpeed = planetSpeed;
		setDistance(distance);
		
	}

	// update method to run on all moons and constantly increment their rotation angle
	
	public void update(){
		
		setAngle(getAngle() + getSpeed());
		setCentreOfRotationAngle(getCentreOfRotationAngle() + pSpeed);
		
	}
	
	
}
