public class Run {
	
	
	public static void main(String[] args)
    {
		
	 SolarSystem a = new SolarSystem(1100,1100);							// create main display
	 PointInSpace[] solarSystem = new PointInSpace[999];					// creates array for pointInSpace based objects
	 solarSystem[0] = new Sun(50,"YELLOW");								    // main sun
	 solarSystem[1] = new Planet(2,"DARK_GRAY",80,0,-6);	 				// mercury planet
	 solarSystem[2] = new Planet(5,"ORANGE",110,0,3);	 					// venus planet
	 solarSystem[3] = new Planet(7,"BLUE",140,0,-5);  						// earth planet
	 solarSystem[4] = new Planet(2,"RED",170,0,-4);	 						// mars planet
	 solarSystem[5] = new Planet(20,"GRAY",450,0,-2);	 					// jupiter planet
	 solarSystem[6] = new Moon(12,2,"LIGHT_GRAY",140,0,10,-5);				// earth moon
	 solarSystem[7] = new Moon(7,2,"LIGHT_GRAY",170,0,20,-4);				// mars moon 1
	 solarSystem[8] = new Moon(12,2,"LIGHT_GRAY",170,0,10,-4);				// mars moon 2
	 
	 for(int i = 9; i < 67; i++){
		 
		 solarSystem[i] = new Moon((Math.random() * 25) + 25,2,"LIGHT_GRAY",450,0,(Math.random() * 20) + 1,-2);			// creating jupiter's randomised moons 
		 
	 }
	 
	 for(int i = 67; i < solarSystem.length; i++){
		 
		 solarSystem[i] = new Planet((Math.random() * 4) + 1,"GRAY",(Math.random() * 120) + 230,0,(Math.random() * 7) + -4);			// creating randomised asteroid field  
		 
	 }
	  
	 
	 while(true){
		 
		 a.drawSolarObject(solarSystem[0].getDistance(),solarSystem[0].getAngle(),solarSystem[0].getDiameter(),solarSystem[0].getColour());			// creating asteroid field  
		 
		 for(int i = 1; i < solarSystem.length; i++){
			 
			 a.drawSolarObjectAbout(solarSystem[i].getDistance(),solarSystem[i].getAngle(),solarSystem[i].getDiameter(),solarSystem[i].getColour(),solarSystem[i].getCentreOfRotationDistance(),solarSystem[i].getCentreOfRotationAngle()); 		// drawing all the objects in the array on the display
			 
		 }
		 
		 a.finishedDrawing();
		 
		 for(int i = 1; i < solarSystem.length; i++){
			 
			 solarSystem[i].update(); 										// runs update method on all of the objects in the array
			
		 }
		 
	 }
	 
    }
	
}
