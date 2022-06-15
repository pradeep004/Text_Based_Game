package textBasedGame;

public class map {
	
// 	size of the map
	private int X;
	private int Y;
	
//	the current player location
	private int currentX;
	private int currentY;
	
	map (int X, int Y,int currentX,int currentY){
		this.X =X;
		this.Y= Y;
		this.currentX= currentX;
		this.currentY= currentY;
	}

	public void move(String direction) {
		direction = direction.toLowerCase();
		switch(direction) {
		case "n":
			if(this.getCurrentY() == this.getY()) {
				this.setCurrentY(0);
			}else {
				this.setCurrentY(this.getCurrentY()+1);
			}
			break;
		case "s":
			if (this.getCurrentY()== 0) {
				this.setCurrentY(this.X);
			}else {
				this.setCurrentY(this.getCurrentX()-1);
			}
			break;
			
		case "e" :
			if(this.getCurrentX()== this.getX()) {
				this.setCurrentX(0);
			}else {
				this.setCurrentX(this.getCurrentX()+1);
			}
			break;
		case "w":
			if (this.getCurrentX() == 0){
				this.setCurrentX(this.Y);
			}else {
				this.setCurrentX(this.getCurrentX()-1);
			}
			break;
			
		default:
			System.out.println("That is not a recognised direction");
		}
	}
	public void getInfo() {
		System.out.println("Player is currently at x,y: " + this.getCurrentX() + "," + this.getCurrentY());
	}
	
	
	public int getCurrentX() {
		return currentX;
	}
	public void setCurrentX(int currentX) {
		this.currentX = currentX;
	}
	public int getCurrentY() {
		return currentY;
	}
	public void setCurrentY(int currentY) {
		this.currentY = currentY;
	}
	public int getX() {
		return X;
	}
	public int getY() {
		return Y;
	}
	
	
	

}
