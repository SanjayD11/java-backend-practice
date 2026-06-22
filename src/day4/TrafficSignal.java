package day4;

class TrafficSignal {
	public static void main(String args[]) {
		String color = "Yellow";
		if (color == "Red") {
			System.out.print("Stop");
		} else if (color == "Yellow") {
			System.out.print("Get Ready");
		} else if (color == "Green") {
			System.out.print("Go");
		} else {
			System.out.print("Invalid Signal");

		}

	}
}