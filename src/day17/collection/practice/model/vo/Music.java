package day17.collection.practice.model.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Music implements Serializable {

    private String name;
    private List<String> songs;

    public Music() {
        songs = new ArrayList<>();
    }
    public Music(String name, List<String> songs) {
        this.name = name;
        this.songs = songs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSongs() {
        return songs;
    }

    public void setSongs(List<String> songs) {
        this.songs = songs;
    }

    public void add(String song) {
        songs.add(song);
    }
}

/*

// Instructor's way

package day17.song.model.vo;

import java.util.List;

// 가수 클래스
public class Artist {

    private String name; // 가수명
    private List<String> songs; // 노래목록

    public Artist(String name, List<String> songs) {
        this.name = name;
        this.songs = songs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSongs() {
        return songs;
    }

    public void setSongs(List<String> songs) {
        this.songs = songs;
    }
}
*/
