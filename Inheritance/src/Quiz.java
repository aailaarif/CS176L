
public class Quiz implements Measurable {
	
	private double score;
	
	public Quiz(double score) {
		
		this.score=score;
	}
	@Override
	public double getMeasure() {
		
		// TODO Auto-generated method stub
		return score;
	}

}
