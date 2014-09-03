
public interface BeatModelInterface {
	void initialize();
	void on();
	void off();
	void setBPM(int bpm);
	int getBPM();
	
	// Two types of observers: 
	// 1. Notified with every beat.
	// 2. Notified with beats per minute change.
	void registerObserver(BeatObserver o);
	void removeObserver(BeatObserver o);
	void registerObserver(BPMObserver o);
	void removeObserver(BPMOnbserver o);
}
