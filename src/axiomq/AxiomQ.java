/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package axiomq;

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
         

        PlaylistVideoService pvs = new PlaylistVideoService();

        pvs.addVideo(v1);
        pvs.addVideo(v2);
        pvs.addVideo(v3);
        pvs.addVideo(v4);
        pvs.addVideo(v5);
        pvs.addVideo(v6);
        pvs.addVideo(v7);
        pvs.addVideo(v8);
        pvs.addVideo(v9);
        pvs.addVideo(v10);

        pvs.printList();

        pvs.removeVideo(v5);

        pvs.printList();

        pvs.changeOrder(2, v7);

        pvs.printList();

    }

}
