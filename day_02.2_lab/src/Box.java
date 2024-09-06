class Box {

	private double height, width, depth;
	private String boxColor;

	// Default initialized box
	Box() {
		this(-1);// constructor chaining
	}

	// To initialized cube
	Box(double side) {
		// this.height = this.width = this.depth = side;
		this(side, side, side);// constructor chaining
	}

	// To initialized box
	Box(double height, double width, double depth) {

		this.height = height;
		this.width = width;
		this.depth = depth;

	}

	// To initialized box with color
	Box(double height, double width, double depth, String boxColor) {

		this.height = height;
		this.width = width;
		this.depth = depth;
		this.boxColor = boxColor;
	}

	public String getBoxDemensions() {

		return "Demensions of a box: " + this.width + " " + this.depth + " " + this.height;

	}

	public String getColor() {

		return this.boxColor;

	}

	public void setColor(String boxColor) {

		this.boxColor = boxColor;

	}

	public double getBoxVolume() {

		return this.width * this.depth * this.height;

	}
	
	public boolean checkEquality(Box anotherBox){
		
		return this.height == anotherBox.height && this.width == anotherBox.width && this.depth == anotherBox.depth;
	}
	
	public Box createNewBox(double heightOffset, double widthOffset, double depthOffset){
		
		return new Box(this.height + heightOffset, this.width + widthOffset, this.depth + depthOffset);
	}

}