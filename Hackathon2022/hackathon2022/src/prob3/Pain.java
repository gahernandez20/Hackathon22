package prob3;

public class Pain extends Report{


	public Pain (int scale, String description){
		super(scale,description);
}

	@Override
	public String toString() {
		return "Pain score: " + scale + "Description of Pain: " + description;
	}
}

