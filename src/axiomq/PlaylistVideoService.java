package axiomq;

import java.util.ArrayList;

/**
 *
 * @author Sikirica
 */
public class PlaylistVideoService {

    private ArrayList<Video> playlist = new ArrayList<>();

    public ArrayList<Video> getPlaylist() {
        return this.playlist;
    }

    public void addVideo(Video v) {

        this.playlist.add(v);
        System.out.println(v.name + " added to playlist");
    }

    public void removeVideo(Video v) {

        this.playlist.remove(v);
        System.out.println(v.name + " removed from playlist");
    }

    public void changeOrder(int index, Video v) {

        ArrayList<Video> playlistCopy = new ArrayList<>();
        playlistCopy.addAll(this.playlist);
        try {
            playlist.remove(v);
            playlist.add(index -1, v);
            System.out.println(v.name + " changed position to " + (index));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
            this.playlist = playlistCopy;
        }

    }

    public void printList() {

        StringBuilder sb = new StringBuilder();
        for (Video s : playlist) {
            sb.append(playlist.indexOf(s) + 1).append(". ");
            sb.append(s.name);
            sb.append("\t");
        }

        System.out.println(sb.toString());
    }

}
