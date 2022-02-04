
package axiomq;

import java.util.ArrayList;

/**
 *
 * @author Sikirica
 */
public class AxiomQ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Video v1 = new Video("1", "Dog Video");
        Video v2 = new Video("2", "Cat Video");
        Video v3 = new Video("3", "Hot Video");
        Video v4 = new Video("4", "Sport Video");
        Video v5 = new Video("5", "Music Video");
        Video v6 = new Video("6", "Car Video");
        Video v7 = new Video("7", "Vlog Video");
        Video v8 = new Video("8", "Fail Video");
        Video v9 = new Video("9", "Documentary Video");
        Video v10 = new Video("10", "Awesome Video");
        
        ArrayList<Video> list = new ArrayList<>();
        list.add(v1);
        User user = new User();
        
        PlaylistVideoService pvs = new PlaylistVideoService();
        Playlist pl = new Playlist("1","123",user,list);
   
        pl.videos.add(v2);
        pl.videos.add(v3);
        pl.videos.add(v4);
        pl.videos.add(v5);
        pl.videos.add(v6);
        pl.videos.add(v7);
        pl.videos.add(v8);
        pl.videos.add(v9);
        pl.videos.add(v10);

        pvs.printList(pl);

        pvs.removeVideo(v5,pl);

        pvs.printList(pl);

        pvs.changeOrder(1, v7, pl);

        pvs.printList(pl);

    }

}
