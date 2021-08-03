import java.util.ArrayList;
public class Exceptions {
  public void castElementAsInt(){
    ArrayList<Object> myList = new ArrayList<Object>();
    myList.add("13");
    myList.add("hello world");
    myList.add(48);
    myList.add("Goodbye World");

    for(int i = 0; i < myList.size(); i++) {
      try {
        Integer castedValue = (Integer) myList.get(i);
      } catch (ClassCastException e){
        System.out.println(e.toString());
        System.out.println("Error at index " + i + ", with value of " + myList.get(i));
        // System.out.println(myList.get(i));
      }
      // Integer castedValue = (Integer) myList.get(i);
      
    }
  }
}