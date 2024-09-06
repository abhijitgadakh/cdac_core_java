class Box{

	private double height, width, depth;
	
	Box(double height, double width, double depth){
	
		this.height = height;
		this.width = width;
		this.depth = depth;

	}


	String getBoxDemensions(){

		return "Demensions of a box: " + this.width + " " + this.depth + " " + this.height;

	}


	double getBoxVolume(){

	return this.width * this.depth * this.height;

	}

}