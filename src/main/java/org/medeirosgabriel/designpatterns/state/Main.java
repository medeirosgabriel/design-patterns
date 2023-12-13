package org.medeirosgabriel.designpatterns.state;

public class Main {

    public static void main(String[] args) {
        Player player = new Player();
        System.out.println(player.toString());
        player.getState().onLock();
        System.out.println(player.toString());
        player.getState().onPlay();
        System.out.println(player.toString());
        player.getState().onPlay();
        System.out.println(player.toString());
        player.nextTrack();
        System.out.println(player.toString());
    }
}
