public class RacingRobot extends Robot{
	protected FootParts footParts;
	protected int speed;

	public RacingRobot(int id, String name, int distance, int energy, int speed, FootParts footParts){
		super(id, name, distance, energy);
		this.speed = speed;
		this.footParts = footParts;

	}

	public RacingRobot(String name, int speed){
		this(++maxId, name, 0, 100, 15, new FootParts(speed));
	}

	public RacingRobot(String name){
		this(name, 10);
	}

	public void run(){
		if(isRunning()){
			energy = energy - 20;
			distance += speed + footParts.getSpeed();
		}
	}

	public boolean isRunning(){
		return energy >= 0;
	}

	public int getSpeed(){
		return speed;
	}

	public void setSpeed(int speed){
		this.speed = speed;
	}

	public FootParts getSpeed(int speed){
		return footParts;
	}

	public void setFootParts(FootParts footParts){
		this.footParts = footParts;
	}

	public String getInfo(){
		return String.format("RacingRobot(id=%2d, name=%9s, energy=%d, distance=%3d, %s)", id, name, energy, distance, footParts.getInfo());
	}
}

