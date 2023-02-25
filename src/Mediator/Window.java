package Mediator;

public class Window extends Participant{
private boolean bClosed = true;
	
	public Window(Mediator mediator) {
		super(mediator);
	}
	
	public void open() {
		if(!bClosed) return;
		
		bClosed = false;
		
		mediator.participantChanged(this);
	}
	
	public void close() {
		if(bClosed) return;
		
		bClosed = true;
		mediator.participantChanged(this);
	}
	
	public boolean isClosed() {
		return bClosed;
	}

	@Override
	public String toString() {
		if(bClosed) return "# close window";
		else return "# open window";
	}
}
