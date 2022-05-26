package day07.com.kh.example.practice5.model.vo;

import java.util.Arrays;

public class Lotto {
    private int[] lotto;

    public Lotto() {
        lotto = new int[6];
        // Lotto Method
        makeLotto();
    }

    public void makeLotto() {
        for (int i = 0; i < lotto.length; i++) {

            // 1 ~ 45 Random Number
            int rn = (int) ((Math.random() * 45) + 1);
            if (!isDuplicate(rn)) lotto[i] = rn; // no duplicates
            else i--;
        }
    }

    public boolean isDuplicate(int rn) {
        for (int i : lotto) {
            if( rn == i) return true;
        }
        return false;
    }

    public void information() {
        System.out.println(Arrays.toString(lotto));
    }

}
