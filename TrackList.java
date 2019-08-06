import java.util.HashMap;
public class TrackList{
    public void trackList(){

        // create trackList of type HashMap
        HashMap<String, String> newTrack = new HashMap<String, String>();
        // Add 4 Songs
        newTrack.put("Shy Girls", "Skip the small talk" );
        newTrack.put("Hotel California", "At the Hotel California");
        newTrack.put("Dust in the Wind", "All we are is dust in the wind");
        newTrack.put("All The Small Things", "Work sucks, I know");

        //get a song by its track title
        System.out.println("get song by title : "+newTrack.get("All The Small Things"));
        //Print all track names and lyrics in the format Track: Lyrics
        
        // Set<String> keys = newTrack.keySet();
        // for(String key : keys){
        //     System.out.println(key+" : "+newTrack.get(key));
        // }

        newTrack.forEach((title,lyrics)->System.out.println(title+" : "+lyrics));
    }
}