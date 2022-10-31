import java.util.*;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		// User Objects
		System.out.print("Enter Your name:");
		currentTime();
		User user = new User(scanner.nextLine());// User Object

		// creating Questions
		Questions question1 = new Questions(
				"Who is the father of Computers?",
				new String[]{
						"James Gosling",
						"Charles Babbage",
						"Dennis Ritchie",
						"Bjarne Stroustrup"},
				"Charles Babbage",
				"Charles Babbage is known as the father of computers. Charles Babbage designed and built the first mechanical computer and Difference Engine.");

		Questions question2 = new Questions(
				"Which of the following is the correct abbreviation of COMPUTER?",
				new String[]{
						"Commonly Occupied Machines Used in Technical and Educational Research","Commonly Operated Machines Used in Technical and Environmental Research","Commonly Oriented Machines Used in Technical and Educational Research","Commonly Operated Machines Used in Technical and Educational Research"},
				"Commonly Operated Machines Used in Technical and Educational Research",
				"The word COMPUTER is an abbreviation for the terms “Commonly Operated Machines Used in Technical and Educational Research”. The word COMPUTER also relates to the word COMPUTE which means to calculate. So initially, it was thought that a computer is a device that is used to perform calculations.");

		Questions question3 = new Questions(
				"Which of the following is the correct definition of Computer?",
				new String[]{
						"Computer is a machine or device that can be programmed to perform arithmetical or logic operation sequences automatically",
						"Computer understands only binary language which is written in the form of 0s & 1s",
						"Computer is a programmable electronic device that stores, retrieves, and processes the data",
						"All of the mentioned",},
				"All of the mentioned",
				"A computer is a machine or device that can be programmed to perform arithmetical or logic operation sequences automatically. The computer understands only binary codes (0s & 1s).");

		Questions questions4 = new Questions(
				"What is the full form of CPU?",
				new String[]{
						"Computer Processing Unit",
						"Computer Principle Unit",
						"Central Processing Unit",
						"Control Processing Unit"},
				"Central Processing Unit",
				"CPU stands for Central Processing Unit. CPU is the part of a computer system that is mainly referred as the brain of the computer.");

		Questions questions5 = new Questions(
				"Which of the following language does the computer understand?",
				new String[]{
						"Computer understands only C Language",
						"Computer understands only Assembly Language",
						"Computer understands only Binary Language",
						" Computer understands only BASIC"},
				"Computer understands only Binary Language",
				"The Computer understands only binary language which is written in the form of 0s & 1s. A computer can understand assembly language but an assembler is required which convert the assembly language to binary language. Similarly, for understanding high level languages, compilers/interpreters are required.");

		//All Questions Arrays
		Questions[] questionsArrays = new Questions[] {question1, question2, question3,questions4,questions5};
		Questions[] shuffledQuestionArrays= shuffleQuestions(questionsArrays);
		//Wrong Answer given by user
		ArrayList<Questions> wrongAnswerArrayList = new ArrayList<>();
		//correct Question given by user
		ArrayList<Questions> correctAnswerArrayList = new ArrayList<>();

		clearScreen();
		System.out.println("Starting in");
		countdownBy3();
		clearScreen();

		Date timeBeforeQuiz = currentTime();
		//Looping through All Questions
		for (int currentQuestion = 0; currentQuestion <= shuffledQuestionArrays.length - 1; currentQuestion++) {
			// display questions
			System.out.println("Q."+(currentQuestion+1)+" "+shuffledQuestionArrays[currentQuestion].getTitle());
			// display options
			shuffledQuestionArrays[currentQuestion].displayOptions();
			System.out.print("Correct Option: ");

			String usrInput = scanner.nextLine().toLowerCase();
			clearScreen();
			//Match the input to correct answer
			if (usrInput.equals(shuffledQuestionArrays[currentQuestion].getCorrectOption())) {
				
				System.out.println("Correct Answer :)");
				correctAnswerArrayList.add(shuffledQuestionArrays[currentQuestion]);
				//increment score by 5
				user.incrementScoreBy5();
			} else {
				System.out.println("Wrong Answer :(");
				//add to wrong answer array list
				wrongAnswerArrayList.add(shuffledQuestionArrays[currentQuestion]);
			}

			// Next Question Countdown if exists
			if (currentQuestion != questionsArrays.length - 1) {
				System.out.println("Next Question in");
				Questions.countdownOf3();
			}
			clearScreen();
		}

		Date timeAfterQuiz = currentTime();
		//calculating the time difference storing in array {hours,minutes,seconds}
		user.setTimeTaken(timeDifference(timeBeforeQuiz,timeAfterQuiz));

		System.out.println("Showing Score in");
		Questions.countdownOf3();
		clearScreen();

		//User Score and Answers
		System.out.print("Time ");
		//Looping through time taken array
		for (int i=0;i<=user.getTimeTaken().length-1;i++){
			//if this is not the last item add a colon :
			if(user.getTimeTaken().length-1!=i){
				System.out.print(user.getTimeTaken()[i]+":");
				//this is the last item of array (seconds) not add colon :
			}else {
				System.out.println(user.getTimeTaken()[i]);
			}
		}
		System.out.println("Total Questions: "+shuffledQuestionArrays.length);
		System.out.println("Correct Answer: "+correctAnswerArrayList.size());
		System.out.println("Wrong Answers: "+wrongAnswerArrayList.size());
		System.out.println(user.getUsrName() + " Score: " + user.getScore());


		//if wrong answer array list is not null (has something)
		if (wrongAnswerArrayList.size()!=0){
			System.out.print("You want see Correct answers? y/n: ");
			//user press "y" (want to see correct answers)
			if (scanner.nextLine().equalsIgnoreCase("y")){
				//loop through wrong questions
				for (int currentQuestion=0;currentQuestion<=wrongAnswerArrayList.size()-1;currentQuestion++){
					System.out.println("Q."+(currentQuestion+1)+" "+wrongAnswerArrayList.get(currentQuestion).getTitle());
					System.out.print("Answer is: ");
					System.out.println(wrongAnswerArrayList.get(currentQuestion).getCorrectAnswer());
					System.out.println("Explanation");
					System.out.println(wrongAnswerArrayList.get(currentQuestion).getExplanation());
					System.out.println("\n");
				}
			}
		}
		scanner.close();
	}

	public static void clearScreen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
	public static void countdownBy3() throws InterruptedException {
		for (int i = 3; i >= 1; i--) {
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
	public static Questions[] shuffleQuestions(Questions[] questions){
		//Converting Array to ArrayList
		List<Questions> QuestionArrayList = Arrays.asList(questions);
		//Shuffling
		Collections.shuffle(QuestionArrayList);
		//converting ArrayList to Array and setting to shuffleOptions
		return QuestionArrayList.toArray(questions);
		//setShuffleOptionArray(optionArrayList.toArray(getOptionsArray()));
	}
	public static Date currentTime(){
		return new Date();
	}
	public static long dateToMilliseconds(Date now){
		return now.getTime();
	}
	public static int[] timeDifference(Date before,Date after){
		int[] timeDiff = new int[3];
		int seconds = 1000;
		int minutes = seconds * 60;
		int hours = minutes * 24;
		int days = hours*24;
		long beforeInMillisecond = dateToMilliseconds(before);
		long afterInMillisecond = dateToMilliseconds(after);
		long theDifference =  afterInMillisecond - beforeInMillisecond;
		timeDiff[0]= (int) ((theDifference%days)/hours);
		timeDiff[1]= (int) ((theDifference%hours)/minutes);
		timeDiff[2]= (int) ((theDifference%minutes)/seconds);
		return timeDiff;
	}
}