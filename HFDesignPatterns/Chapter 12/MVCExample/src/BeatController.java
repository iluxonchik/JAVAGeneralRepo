
public class BeatController implements ControllerInterface {
	BeatModelInterface model;
	DJView view;
	
	public BeatController(BeatModelInterface model){
		this.model = model;
		view = new DJView(this, model);
		view.createControls();
		view.enableStartMenuItem();
		view.disableStopMenuItem();
		model.initialize();
	}
	
	public void start(){
		model.on();
		view.disableStartMenuItem();
		view.enableStopMenuItem();
	}
	
	public void stop(){
		model.off();
		view.disableStopMenuItem();
		view.enableStartMenuItem();
	}
	
	public void increaseBPM(){
		int bpm = model.getBPM();
		model.setBPM(++bpm);
	}
	
	public void decreaseBPM(){
		int bpm = model.getBPM();
		model.setBPM(--bpm);
	}
	
	public void setBPM(int bpm){
		model.setBPM(bpm);
	}

}
