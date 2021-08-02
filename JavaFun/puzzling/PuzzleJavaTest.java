public class PuzzleJavaTest {
  public static void main(String[] args){
    PuzzleJava tester = new PuzzleJava();

    System.out.println("---------- getTenRolls ----------");
    int[] randNumArr = tester.getTenRolls();
    for (int i=0; i<randNumArr.length; i++){
      System.out.println(randNumArr[i]);
    }

    System.out.println("---------- getRandomLetter ----------");
    char randLetter = tester.getRandomLetter();
    System.out.println(randLetter);

    
    System.out.println("---------- generatePassword ----------");
    System.out.println(tester.generatePassword());

    System.out.println("---------- getNewPasswordSet ----------");
    System.out.println(tester.getNewPasswordSet(8));

    System.out.println("---------- shuffleArray ----------");
    int[] numArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    tester.shuffleArray(numArray);
    for (int i=0; i<numArray.length; i++){
      System.out.println(numArray[i]);
    }



  }
}