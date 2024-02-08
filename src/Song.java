
import java.util.ArrayList;
public class Song {
    private String title;
    private String artist;
    private ArrayList <String> listeners;

    public Song (String title, String artist){
        this.title = title;
        this.artist = artist;
        this.listeners = new ArrayList<>();
    }

    public String getTitle(){
        return title;
    }
    public String getArtist(){
        return artist;
    }

    public int howMany(ArrayList<String> newListeners){
        int newCount = 0;
        for(String listener: newListeners) {
            if (!listener.contains(newListeners.toLowerCase())) {
                listeners.add(listener.toLowerCase());
                newCount++;
            }
        }
        return newCount;
    }
}
