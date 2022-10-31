import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Questions {
	final String title, correctAnswer, explanation;
	String correctOption;
	final String[] optionsArray;
	String[] shuffleOptionArray;
	Questions(String title,String[] optionsArray,String correctAnswer, String explanation) {
		this.title = title;
		this.optionsArray = optionsArray;
		this.correctAnswer = correctAnswer;
		this.explanation = explanation;
	}

	// Getters
	public String[] getOptionsArray() {
		return optionsArray;
	}
	public String getTitle() {
		return title;
	}
	public String getCorrectOption() {
		return correctOption;
	}
	public String getCorrectAnswer() {
		return correctAnswer;
	}
	public void setCorrectOption(String correctOption) {
		this.correctOption = correctOption;
	}
	public String getExplanation() {
		return explanation;
	}
	public String[] getShuffleOptionArray() {
		return shuffleOptionArray;
	}
	public void setShuffleOptionArray(String[] shuffleOptionArray) {
		this.shuffleOptionArray = shuffleOptionArray;
	}
	public void displayOptions() {
		shuffleOptions();
		String[] newOptions = getShuffleOptionArray();
		char alphabet = 65;
		for (int i = 0; i <= newOptions.length - 1;i++){
			System.out.println(alphabet+". " + newOptions[i]);
			alphabet++;
		}
	}

	public static void countdownOf3() throws InterruptedException {
		for (int j = 3; j >= 1; j--) {
			System.out.println(j);
			Thread.sleep(1000);
		}
	}
	public void shuffleOptions(){
		//Converting Array to ArrayList
		List<String> optionArrayList = Arrays.asList(getOptionsArray());
		//Shuffling
		Collections.shuffle(optionArrayList);
		//converting ArrayList to Array and setting to suffleOptions
		setShuffleOptionArray(optionArrayList.toArray(getOptionsArray()));
		findCorrectOption(getShuffleOptionArray(),getCorrectAnswer());
	}
	public void findCorrectOption(String[] shuffleOptionArray, String correctAnswer){
		//correct Option Stored
		int correctOptionNumber=-1;
		for (int i=0;i<=shuffleOptionArray.length-1;i++){
			//match the value of array to correct answer
			if(shuffleOptionArray[i].equals(correctAnswer)){
				//stored the index number of correct Answer
				correctOptionNumber=i;
				//break the loop
				break;
			}
		}
		switch (correctOptionNumber){
			case 0:setCorrectOption("a");break;
			case 1:setCorrectOption("b");break;
			case 2:setCorrectOption("c");break;
			case 3: setCorrectOption("d");break;
			default: setCorrectOption("error");
		}
	}
}
