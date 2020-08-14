package meshCreator.twoDimensions;

public enum Side {
	WEST, EAST, SOUTH, NORTH;
	
	public Side opposite() {
		switch(this){
		case EAST:
			return WEST;
		case WEST:
			return EAST;
		case SOUTH:
			return NORTH;
		case NORTH:
			return SOUTH;
		}
		return NORTH;
	}
	public String toString() {
		switch(this){
		case EAST:
			return "east";
		case WEST:
			return "west";
		case SOUTH:
			return "south";
		case NORTH:
			return "north";
		}
		return "";
	}
	
}
