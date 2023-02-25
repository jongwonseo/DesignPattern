package Mediator;

public class HeatBoiler extends Participant{
	private boolean bOff = true;
	
	public HeatBoiler(Mediator mediator) {
		super(mediator);
	}
	
	public void on() {
		if(!bOff) return;
		
		bOff = false;
		
		mediator.participantChanged(this);
	}
	
	public void off() {
		if(bOff) return;
		
		bOff = true;
		mediator.participantChanged(this);
	}
	
	public boolean isRunning() {
		return !bOff;
	}

	@Override
	public String toString() {
		if(bClosed) return "# off Boiler";
		else return "# om Boiler";
	}

}
