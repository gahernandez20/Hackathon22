package prob3;

public class mentalHealth extends Report{


	public mentalHealth (int scale, String description){
		super(scale, description);
}

	@Override
	public String toString() {
		return "Mental Health score: " + mentalHealth + "Description of Mental Health: " + mentalHealthDescription;
	}
}
