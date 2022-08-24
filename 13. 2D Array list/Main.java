import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		//combining all string array lists so that's why this is called 3d
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		//simpe 1 D array list
		ArrayList<String> bakeryList = new ArrayList();
		bakeryList.add("pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("donuts");
		
		//simpe 1 D array list
		ArrayList<String> produceList = new ArrayList();
		produceList.add("tomatoes");
		produceList.add("zucchini");
		produceList.add("peppers");
		
		//simpe 1 D array list
		ArrayList<String> drinksList = new ArrayList();
		drinksList.add("soda");
		drinksList.add("coffee");

		//adding item to 3d array list
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinksList);
		
		System.out.println(groceryList);
		
	}
}