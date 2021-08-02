import java.util.ArrayList;
public class BasicJavaTest {
  public static void main(String[] args){
    BasicJava tester = new BasicJava();

    System.out.println("---------- Print 1-255 ----------");
    tester.oneTo255();

    System.out.println("---------- Print odd numbers between 1-255 ----------");
    tester.oneTo255Odd();

    System.out.println("---------- Sum to 255 ----------");
    System.out.println(tester.sum1To255());
    
    System.out.println("---------- Iterating through an array (int) ----------");
    ArrayList<Object> intArray = new ArrayList<Object>();
    intArray.add(1);
    intArray.add(2);
    intArray.add(3);
    intArray.add(4);
    intArray.add(5);
    tester.printArray(intArray);

    System.out.println("---------- Iterating through an array (mixed type) ----------");
    ArrayList<Object> mixedArray = new ArrayList<Object>();
    mixedArray.add(1);
    mixedArray.add("Hello");
    mixedArray.add(new Double(12.0));
    mixedArray.add(new ArrayList<Integer>());
    tester.printArray(mixedArray);

    System.out.println("---------- Find Max (positive) ----------");
    int[] myArray = {1,2,7,4,5};
    tester.findMax(myArray);

    System.out.println("---------- Find Max (negative) ----------");
    int[] negArray = {-5,-10,-3,-22};
    tester.findMax(negArray);

    System.out.println("---------- Array with Odd Numbers ----------");
    System.out.println(tester.oddNumArray());

    System.out.println("---------- Get Average ----------");
    System.out.println(tester.getAverage(myArray));

    System.out.println("---------- Greater Than Y ----------");
    tester.greaterThanY(myArray, -1);

    System.out.println("---------- Square the Values ----------");
    int[] squareArr = {1,2,3,4,5,6};
    tester.squareValues(squareArr);
    for (int i=0; i<squareArr.length; i++){
      System.out.println(squareArr[i]);
    }

    System.out.println("---------- Eliminate Negative Numbers ----------");
    int[] arrayWithNeg = {1,-2,3,-4,-5,6};
    tester.removeNegatives(arrayWithNeg);
    for (int i=0; i<arrayWithNeg.length; i++){
      System.out.println(arrayWithNeg[i]);
    }

    System.out.println("---------- Max, Min and Average ----------");
    int[] array = {1,5,10,7,-2};
    ArrayList<Object> maxMinAvgArr = tester.maxMinAvg(array);
    System.out.println(maxMinAvgArr);

    System.out.println("---------- Shifting Values in Array ----------");
    int[] xArray = {1, 5, 10, 7, -2};
    tester.shiftArr(xArray);
    for (int i=0; i<xArray.length; i++){
      System.out.println(xArray[i]);
    }

  }


}