import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava {
  public int[] getTenRolls(){
    Random randMachine = new Random();
    int[] array = new int[10];
    for (int i=0; i<array.length; i++){
      array[i] = randMachine.nextInt(20) + 1;
      // System.out.println(array[i]);
    }
    return array;
  }

  // getRandomLetter
  // // Write a method that will:
  // Create an array within the method that contains all 26 letters of the alphabet (this array must have 26 values). 
  // Generate a random index between 0-25, and use it to pull a random letter out of the array.
  // Return the random letter.
  public char getRandomLetter(){
    char[] alphabets = new char[26];
    // create an array with 26 alphabets
    for (int i=0; i<26; i++){
      alphabets[i] = (char)(97+i);
      // System.out.println(alphabets[i]);
    }
    Random randMachine = new Random();
    return alphabets[randMachine.nextInt(26)];
  }

  // generatePassword
  // Write a method that uses the previous method to create a random string of eight characters, and return that string.
  public String generatePassword() {
    String password = "";
    int i = 0;
    while (i < 8) {
      password += getRandomLetter();
      i += 1;
    }
    return password;
  }

  // getNewPasswordSet
  // Write a method that takes an int length as an argument and creates an array of random eight character words. The array should be the length passed in as an int.
  public ArrayList<String> getNewPasswordSet(int numWords){
    ArrayList<String> passwordSet = new ArrayList<String>();
    for (int i=0; i<numWords; i++){
      passwordSet.add(generatePassword());
    }
    return passwordSet;
  }

  // shuffleArray
  // Write a method that takes an array and and mixes up all the values in a pseudo-random way. Hint: use random indexes within the array, and swap values repeatedly.
  public int[] shuffleArray(int[] numArray){
    int iter = numArray.length * 10;
    int randIdx1;
    int randIdx2;
    int temp;
    Random randMachine = new Random();
    for (int i=0; i<iter; i++){
      randIdx1 = randMachine.nextInt(numArray.length);
      randIdx2 = randMachine.nextInt(numArray.length);
      temp = numArray[randIdx1];
      numArray[randIdx1] = numArray[randIdx2];
      numArray[randIdx2] = temp;
    }
    return numArray;
  }

}