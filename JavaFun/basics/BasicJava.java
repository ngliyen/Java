import java.util.ArrayList;
public class BasicJava {

  // prints all numbers from 1 to 255
  public void oneTo255() {
    for (int i = 1; i <= 255; i++){
      System.out.println(i);
    }
  }

  // prints all the odd numbers from 1 to 255
  public void oneTo255Odd() {
    for (int i = 1; i <= 255; i++){
      if (i%2 == 1){
        System.out.println(i);
      }
    }
  }

  // Sigma of 255 AKA Sum to 255
  public int sum1To255() {
    int sum = 0;
    for (int i=1; i<=255; i++) {
      sum += i;
    }
    return sum;
  }

  // Iterating through an array
  // Given an array X, say [1,3,5,7,9,13], write a method that would iterate through each member of the array and print each value on the screen.
  public void printArray(ArrayList<Object> array){
    for (Object item : array){
      System.out.println(item);
    }
  }

  // Find Max
  // Write a method (sets of instructions) that takes any array and prints the maximum value in the array.
  public void findMax(int[] array){
    int maxNum = array[0];
    for (int i=0; i<array.length; i++){
      if (array[i] > maxNum){
        maxNum = array[i];
      }
    }
    System.out.println(maxNum);
  }

  // Array with Odd Numbers
  // Write a method that creates an array 'y' that contains all the odd numbers between 1 to 255.
  public ArrayList<Integer> oddNumArray(){
    ArrayList<Integer> y = new ArrayList<Integer>();
    for (int i=1; i<=255; i++){
      if (i%2 == 1){
        y.add(i);
      }
    }
    return y;
  }

  // Get Average
  public double getAverage(int[] array){
    double sum = 0;
    for (int i=0; i<array.length; i++){
      sum += array[i];
    }
    return sum/array.length;
  }

  // Greater Than Y
  // Write a method that takes an array and returns the number of values in that array whose value is greater than a given value y. 
  public void greaterThanY(int[] array, int y){
    int count = 0;
    for (int i=0; i<array.length; i++){
      if(array[i] > y){
        count += 1;
      }
    }
    System.out.println(count);
  }

  // Square the values
  // Given any array x, say [1, 5, 10, -2], write a method that multiplies each value in the array by itself. When the method is done, the array x should have values that have been squared, say [1, 25, 100, 4].
  public int[] squareValues(int[] x){
    for (int i=0; i<x.length; i++){
        x[i] *= x[i];
      }
    return x;
  }

  // Eliminate Negative Numbers
  // Given any array x, say [1, 5, 10, -2], write a method that replaces any negative number with the value of 0.
  public int[] removeNegatives(int[] x){
    for (int i=0; i<x.length; i++){
      if (x[i] < 0){
        x[i] = 0;
      }
    }
    return x;
  }

  // Max, Min, and Average
  // Given any array x, say [1, 5, 10, -2], write a method that returns an array with the maximum number in the array, the minimum value in the array, and the average of the values in the array.
  public ArrayList<Object> maxMinAvg(int[] x){
    int max = x[0];
    int min = x[0];
    double sum = 0;
    for (int i=0;i<x.length;i++){
      // check for min
      if (x[i] < min){
        min = x[i];
      }
      // check for max
      if (x[i] > max){
        max = x[i];
      }
      // sum
      sum += x[i];
    }
    ArrayList<Object> maxMinAvgArr = new ArrayList<Object>();
    maxMinAvgArr.add(max);
    maxMinAvgArr.add(min);
    double avg = sum/x.length;
    maxMinAvgArr.add(avg);
    return maxMinAvgArr;
  }
  // Shifting the Values in the Array
  // Given any array x, say [1, 5, 10, 7, -2], write a method that shifts each number by one to the front. For example, when the method is done, an x of [1, 5, 10, 7, -2] should become [5, 10, 7, -2, 0]. Notice that the last number is 0.
  public int[] shiftArr(int[] x){
    for (int i=1; i<x.length; i++){
      x[i-1] = x[i];
    }
    x[x.length-1] = 0;
    return x;
  }

}