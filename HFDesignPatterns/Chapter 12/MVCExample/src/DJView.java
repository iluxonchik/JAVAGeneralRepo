import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DJView implements ActionListener, BeatObserver, BPMObserver{
	BeatModelInterface model;
	ControllerInterface controller;
	JFrame viewFrame;
	JFrame viewPanel;
	BeatBar beatBar;
	JLabel bpmOutputLabel;
	
	public DJView (ControllerInterface controller, BeatModeInterface model) {
		this.controller = controller;
		this.model = model;
		model.registerObserver((BeatObserver)this);
		model.registerObserver((BPMObserver)this);
	}
	
	public void createView(){
		// Create all Swing components here
	}
	
	public void updateBPM(){
		int bpm = model.getBPM();
		if (bpm == 0)
			bpmOutputLabel.setText("offline");
		else
			bpmOutputLabel.setText("Current BPM: " + model.getBPM());
	}
}
