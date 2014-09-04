
import javax.sound.midi.*;
import java.util.*;

public class BeatModel implements BeatModelInterface, MetaEventListener{

	Sequencer sequencer;
	ArrayList beatObservers = new ArrayList(); // holds the beat observers
	ArrayList bpmObservers = new ArrayList(); // holds the bpm observers
	int bpm = 90;
	Sequence sequence;
	Track track;
	
	public void initialize(){
		setUpMidi();
		buildTrackAndStart();
	}
	
	public void on(){
		sequencer.start();
		buildTracksAndStart();
	}
	
	public void off(){
		setBPM(0);
		sequencer.stop();
	}
	
	public void setBPM(int bpm){
		this.bpm = bpm;
		sequencer.setTempoInBPM(getBPM());
		notifyBPMObservers();
	}
	
	public int getBPM(){
		return bpm;
	}
	
	void beatEvent(){
		// This method is called by MIDI whenever a new beat starts
		notifyBeatObservers();
	}
}
