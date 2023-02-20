package Bridge;

public class CaptionDisplay implements Display {

	@Override
	public void title(Draft draft) {
		System.out.println("title: " + draft.getTitle());

		
	}

	@Override
	public void author(Draft draft) {
		System.out.println("author: " + draft.getAuthor());
		
	}

	@Override
	public void content(Draft draft) {
		System.out.println("content: ");
		var content = draft.getContent();
		for(var i=0;i<content.length;i++)
			System.out.println("      "+ content[i]);
		
	}

}
