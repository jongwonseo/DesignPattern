package Bridge;

public class MainEntry {

	public static void main(String[] args) {
		var title = "a restored earth";
		var author = "Kim";
		String[] content= {
				"aaaaaa", "bbbbbb","ccccccc"
		};

		Draft draft = new Draft(title, author, content);
	
		Display display1 = new SimpleDisplay();
		draft.print(display1);
		
		Display display2 = new CaptionDisplay();
		draft.print(display2);
		
		var publisher = "kyobo";
		var cost = 100;
		Publication publication = new Publication(title, author, content, publisher, cost);
		publication.print(display1);
		publication.print(display2);
		
		
	}

}
