package axiomq;

import java.util.ArrayList;

/**
 *
 * @author Sikirica
 */
public class Playlist {

    public String id;
    public String name;
    public User user;
    public ArrayList<Video> videos = new ArrayList<>();

    public Playlist() {

    }

    public Playlist(String id, String name, User user, ArrayList<Video> videos) {
        this.id = id;
        this.name = name;
        this.user = user;
        this.videos = videos;
    }
    public void remove (Video v){
        for( Video video : this.videos){
          if(video.getId().equals(v.getId())){
              videos.remove(v);
          }  
        }
    }
    

}
