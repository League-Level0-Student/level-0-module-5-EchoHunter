package _07_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
public static void main(String[] args) {

SkillPractice skills = new SkillPractice();
           skills.skill1();
           skills.skill2();
           skills.skill3();
           skills.skill4();
           skills.skill5();
}

void skill1() {
// Use pop-ups for the following.
// Ask the user how many dimes they have
String muneh = JOptionPane.showInputDialog(null, "how Many dimes do you have?");

int muney = Integer.parseInt(muneh);

// Tell them how many cents they have (hint multiply by 10)
JOptionPane.showMessageDialog(null, muney*10);


// Ask the user how tall they are (inches)
String muneh1 = JOptionPane.showInputDialog(null, "how Many talls (in inches) do you have?");

int muney1 = Integer.parseInt(muneh1);



// If they are shorter than 36 inches, tell them to eat their Wheaties
if (muney1 < (36)) {
	JOptionPane.showMessageDialog(null, "Eat your WHeatiEs");
}



}

void skill2() { // Write a loop to print every third number between 1 and 30 to the console

for (int i = 1; i < 31; i=i+3) {
	System.out.println(i);
}





}

void skill3() { // Get a random number that is less than 20 and print it to the console
	Random random1 = new Random(10);
int rand =random1.nextInt(20);
System.out.println(rand);
// Get another random number that is less than 10 and print it to the console
int rand1 =random1.nextInt(10);
System.out.println(rand1);


// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction

JOptionPane.showMessageDialog(null, rand-rand1  + "is the difference between the two numbers");

}

void skill4() { // In a pop-up, ask the user for the city they live in

String e =JOptionPane.showInputDialog("what city do you live in?");

// If they answered "San Diego", tell them they live in America's Finest City
if(e .contentEquals("San Diego")){
	JOptionPane.showMessageDialog(null,"You live in Americas finest city");
	
}


// Otherwise, tell them to move to San Diego
else {
	JOptionPane.showMessageDialog(null,"move to San Diego");
}


// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation."
int cars = 8;



// If there is 1 car, use a pop-up to display the make/model of the car



// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them.
cars = cars * 4;
JOptionPane.showMessageDialog(null, "your cars have" + cars+" wheels");


}

void skill5() { // In a pop-up, ask the user for the name of their school
String school = JOptionPane.showInputDialog("what is the name of your school");


// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message.
JOptionPane.showMessageDialog(null, "your school is awesome! i've always wanted to go to " +  school);


}
}

