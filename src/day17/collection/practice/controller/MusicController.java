package day17.collection.practice.controller;

import day17.collection.practice.model.vo.Music;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MusicController {

    private Map<String, Music> musicMap;

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

    //////////////////////////////// IO SAVE FUNCTIONS ////////////////////////////////

    // directory to save '.sav' files
    public void makeDirectory() {
        File dir = new File("E:/music");
        if (!dir.exists()) dir.mkdirs();
    }

    public void save() {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:/music/m.sav"))) {

            oos.writeObject(musicMap);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //////////////////////////////// IO LOAD FUNCTIONS ////////////////////////////////

    public void load() {

        File file = new File("E:/music/m.sav");

        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:/music/m.sav"))) {
                musicMap = (Map<String, Music>) ois.readObject();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

/*

// instructor's way

package day17.song.controller;

import day17.song.model.vo.Artist;

import java.util.*;

public class ArtistController {

    // key??? ???????????? ??????
    private final Map<String, Artist> artistMap;

    private static ArtistController ac;
    static {
        ac = new ArtistController();
    }

    private ArtistController() {
        artistMap = new HashMap<>();
    }


    // ????????? ?????? ??????
    public static ArtistController getInstance() {
        return ac;
    }


    // list??? set?????? ??????
    public Set<String> convert(List<String> list) {
        Set<String> set = new HashSet<>();
        set.addAll(list);
        return set;
    }

    // ?????? ?????? ?????? ??????
    public void insertNewArtist(Artist artist) {
        artistMap.put(artist.getName(), artist);
    }

    // ?????? ?????? ??????????????? ?????? ?????? ??????
    public boolean addNewSong(String artistName, String songName) {
        // ?????? ?????? ??????
        List<String> songList = artistMap.get(artistName).getSongs();
        // ?????? ????????? ?????? set ??????
        Set<String> songSet = convert(songList);
        // ?????? ?????? ?????? ??????
        boolean result = songSet.add(songName);

        // set??? ??????????????? ?????????????????? ????????? ?????? ??????????????? ???????????? ??????
        if (result) songList.add(songName);

        // ?????? ?????? ?????? ?????? ?????? ??????
        return result;
    }

    // ????????? ???????????? ????????? ?????? ??????
    public boolean isRegister(String artistName) {
        return artistMap.containsKey(artistName);
    }

    // ????????? ????????? ??? ??????
    public int count() {
        return artistMap.size();
    }

    // ?????? ?????? ?????? ?????? ??????
    public List<String> getSongList(String artistName) {
        return artistMap.get(artistName).getSongs();
    }
}
*/
