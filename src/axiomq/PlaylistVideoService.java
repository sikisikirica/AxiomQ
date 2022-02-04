/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package axiomq;

import java.util.ArrayList;

/**
 *
 * @author Sikirica
 */
public class PlaylistVideoService {

    ArrayList<Video> playlist = new ArrayList<>();

    public ArrayList getPlaylist() {
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
            playlist.add(index, v);
            System.out.println(v.name + " changed position to " + (index + 1));
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
