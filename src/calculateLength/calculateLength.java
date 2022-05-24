package calculateLength;

public class calculateLength {

	// x1,x2,y1,y2 is the coordinate point of (x,y).
	// AB is the length of line.
	// Here we are using pythagoras theorem for finding length of the line.
	// Here we are using cartesian system.
	// formula AB =(x2-x1)^2+(y2-y1)^2.
	
	static int x1;
	static int y1;
	static int x2;
	static int y2;
	static int AB =(x2-x1)^2+(y2-y1)^2;
	
	//  Here we are using constructor......................>>>>>>>>
	
	public calculateLength(int x1, int y1, int x2, int y2) {
		
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
        this.AB = (x2-x1)^2+(y2-y1)^2;
	}
	
	public static void main(String[] args) { 
		calculateLength cal= new calculateLength(2,1,7,-3);
		System.out.println("Length of the Line is");
		System.out.print((x2-x1)^2+(y2-y1)^2);
	    
	}

}
