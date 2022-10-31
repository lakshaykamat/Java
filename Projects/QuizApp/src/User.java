import java.util.ArrayList;

public class User {
	int score;
	final String usrName;
	int[] timeTaken;
	ArrayList<Questions> wrongAnswerArrayList = new ArrayList<>();
	ArrayList<Questions> correctAnswerArrayList = new ArrayList<>();

	User(String usrName) {
		this.usrName = usrName;
	}

	public int[] getTimeTaken() {
		return timeTaken;
	}

	public void setTimeTaken(int[] timeTaken) {
		this.timeTaken = timeTaken;
	}

	public ArrayList<Questions> getWrongAnswerArrayList() {
		return wrongAnswerArrayList;
	}

	public void setWrongAnswerArrayList(ArrayList<Questions> wrongAnswerArrayList) {
		this.wrongAnswerArrayList = wrongAnswerArrayList;
	}

	public ArrayList<Questions> getCorrectAnswerArrayList() {
		return correctAnswerArrayList;
	}

	public void setCorrectAnswerArrayList(ArrayList<Questions> correctAnswerArrayList) {
		this.correctAnswerArrayList = correctAnswerArrayList;
	}
	public String getUsrName() {
		return usrName;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public void incrementScoreBy5() {
		int newScore = getScore() + 5;
		setScore(newScore);
	}
}
