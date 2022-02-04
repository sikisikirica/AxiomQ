package axiomq;

import java.util.ArrayList;

/**
 *
 * @author Sikirica
 */
public class PlaylistVideoService {

    public Playlist playlist;

    public void addVideo(Video v) {
        playlist.videos.add(v);
        System.out.println(v.name + " added to playlist");
    }

    public void removeVideo(Video v, Playlist pl) {

        pl.videos.remove(v);
        System.out.println(v.name + " removed from playlist");
    }

    public void changeOrder(int index, Video v, Playlist pl) {

        ArrayList<Video> playlistCopy = new ArrayList<>();
        playlistCopy.addAll(pl.videos);
        try {
            pl.videos.remove(v);
            pl.videos.add(index - 1, v);
            System.out.println(v.name + " changed position to " + (index));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid index");
            pl.videos = playlistCopy;
        }

    }

    public void printList(Playlist pl) {

        StringBuilder sb = new StringBuilder();
        for (Video s : pl.videos) {
            sb.append(pl.videos.indexOf(s) + 1).append(". ");
            sb.append(s.name);
            sb.append("\t");
        }

        System.out.println(sb.toString());
    }

}
