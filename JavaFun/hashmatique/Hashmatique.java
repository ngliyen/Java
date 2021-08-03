import java.util.HashMap;
import java.util.Set;
public class Hashmatique {
  public void createTrackList(){
    HashMap<String, String> trackList = new HashMap<String,String>();
    trackList.put("All Too Well", "You call me up again just to break me like a promise, so casually cruel in the name of being honest.");
    trackList.put("Supermarket Flowers", "I'm in pieces, it's tearing me up, but I know a heart that's broke is a heart that's been loved.");
    trackList.put("Landslide", "But time makes you bolder, even children get older and I'm gettin' older, too.");
    trackList.put("The Show Must Go On", "My soul is painted like the wings of butterflies. Fairy tales of yesterday will grow but never die.");

    // pull out one song by title
    System.out.println(trackList.get("Landslide"));

    // print out all the track names and lyrics
    Set<String> keys = trackList.keySet();
    for (String key : keys){
      System.out.println(key + ": " + trackList.get(key));
    }

  }
}