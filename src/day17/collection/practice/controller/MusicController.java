package day17.collection.practice.controller;

import day17.collection.practice.model.vo.Music;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MusicController {

    private final Map<String, Music> musicMap;

    public MusicController() {
        this.musicMap = new HashMap<>();
    }

    public List<String> search(String name) {
        if (musicMap.containsKey(name)) return musicMap.get(name).getSongs();
        return null;
    }

    public int register(String name, String song) {
        // contains artist
        if (musicMap.containsKey(name)) {
            // contains music
            if (musicMap.get(name).getSongs().contains(song)) return -1;
            else {
                musicMap.get(name).add(song);
                return 0;
            }
        }
        // new artist
        Music music = new Music();
        music.setName(name);
        music.add(song);
        musicMap.put(name, music);
        return 1;
    }

    public Map<String, Music> getMusicMap() {
        return musicMap;
    }
}
