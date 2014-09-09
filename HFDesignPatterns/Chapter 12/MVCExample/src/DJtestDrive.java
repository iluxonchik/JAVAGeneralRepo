
public class DJtestDrive {

	public static void main (String[] args){
		BeatModelInterface model = new BeatModel();
		ControllerInterface controller = new BeatController(model);
	}
}
