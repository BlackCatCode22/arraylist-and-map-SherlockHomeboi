import java.util.ArrayList;
import java.util.Arrays;

//William Reeve
// 8-29-2023

public class Main {
    public static void main(String[] args) {

        System.out.println("\n Array List Practice \n");

       //creating an arrayList and adding elements
        ArrayList<String> foods = new ArrayList<>();
        foods.add("Tomato");
        foods.add("Potato");
        foods.add("Cake");
        foods.add("CupCake");

        System.out.print(" \n My first favorite food is " + foods.get(0) + "\n");
        System.out.print(" \n The size of my list is " + foods.size() + "\n");

        // .set is to change an element in an array

        foods.set(0, "Will");
        System.out.println("\n The first element has been changed to " + foods.get(0) + "\n");

        //removing the 3rd element & checking the list to see if it's removed
        System.out.println(foods);
        foods.remove(3);
        System.out.println(foods);
        System.out.print("The 3rd element has been removed \n" + "\n");


        //printing the list with a for loop
        int foodsNum = 1;
        for (int i = 0; i < foods.size(); i++) {
        System.out.println("Food item " + foodsNum + " is " + foods.get(i));
            foodsNum++;
        }

        // add list elements with a for loop with .add()
        for (int i = 0; i < 10; i++) {
            foods.add(i+3,"new food added");
            System.out.println("new food added to list");
        }
    System.out.println(foods);

        for (int i = 0; i < foods.size(); i++) {
            System.out.println("Food item " + foodsNum + " is " + foods.get(i));
            foodsNum++;
        }

        for (String s : foods) {
            System.out.println("food" + foodsNum );
        }


    }
}