
import java.util.arrayList;
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
        String[] array = new String[];
        for(int i = 0; i<)
        for(String listener: newListeners) {
            if (!listener.contains(newListeners.toLowerCase())) {
                listeners.add(listener.toLowerCase());
                count++;
            }
        }
        return count;
    }
}
