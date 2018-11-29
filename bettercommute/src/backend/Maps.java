package backend;

public class Maps {
	public static void main(String[] args) {
		
		// This main function is for testing.
		
		// PUT IN YOUR APIKEY HERE
		GoogleAPI google = new GoogleAPI("___________");
		OurAPI api = new OurAPI();
		
		try {
			Path path = api.getDirection(
					google.placeAPI("university_of_maryland"),
					google.placeAPI("the_catholic_university_of_america"));
			System.out.println(path);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
