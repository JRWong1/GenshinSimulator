package GenshinSimulator;

public class Item {
	
	public boolean isChar;
	public int starCount;
	public String name;
	public Item(boolean isChar, int starCount, String name) {
		this.isChar = isChar;
		this.starCount = starCount;
		this.name = name;
	}
	
	public String toString() {
		if(isChar) {
			return "Character: " + this.name + " - " + this.starCount + " Stars";
		}
		return "Weapon: " + this.name + " - " + this.starCount + " Stars";
	}
}
