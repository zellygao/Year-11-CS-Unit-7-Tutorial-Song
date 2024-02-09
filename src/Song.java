
import java.util.ArrayList;
public class Song {
    private String title;
    private String artist;
    private ArrayList<String> listeners = new ArrayList<>();

    public Song (String a, String b){
        title = a;
        artist = b;
    }

    public String getTitle(){
        return title;
    }
    public String getArtist(){
        return artist;
    }

    public int howMany(ArrayList <String> listeners){
        int count = 0;
        for(String listener: listeners){
            if(!listener.contains(listeners.toLowerCase())){
                listeners.add(listener.tolowerCase());
                count++;
            }
        }
        return count;
    }
}
