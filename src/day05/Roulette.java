package day05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Roulette {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("게임 인원 (2 ~ 4명) ==> ");
        int playerNum = Integer.parseInt(br.readLine());

        ArrayList<String> players = new ArrayList<>();

        System.out.println("플레이어 이름을 등록합니다.");
        for (int i = 0; i < playerNum; i++) {
            System.out.printf("%d번 플레이어 이름 : ", i + 1);
            players.add(br.readLine());
        }
        System.out.printf("%s 참가!\n\n", players.toString());
        System.out.print("실탄 개수 (1 ~ 5개) ==> ");
        int numShots = Integer.parseInt(br.readLine());
        System.out.println("실탄을 넣고 탄창을 무작위로 돌립니다.\n");
        int randomPlayer = (int) (Math.random() * playerNum);
        String currPlayer = players.get(randomPlayer);
        System.out.printf("총을 돌렸습니다. %s부터 시작합니다\n\n", currPlayer);
        int who = randomPlayer+1;


        while (true) {
            System.out.printf("[%s님의 턴!] 탄창 실린더를 무작위로 돌립니다.\n", currPlayer);
            System.out.println("# 엔터를 누르면 격발합니다.");
            String enter = br.readLine();

            if (enter.isEmpty()) {
                double dead = Math.random();
                if (dead > 0.5) {
                    System.out.println("휴... 살았습니다.\n");
                } else {
                    System.out.printf("빵!! [%s]님 사망...\n\n", currPlayer);
                    numShots--;
                    players.remove(currPlayer);
                    who-=1;
                }
                if (who >= players.size() || who < 0) {
                    who = 0;
                }
                currPlayer = players.get(who++);

            }

            if (numShots == 0) {
                System.out.println("# 총알이 모두 소진되었습니다. 게임을 종료합니다.");
                System.out.printf("# 생존한 인원 : %s\n", players.toString());
                System.out.println("# 게임을 종료합니다.");
                break;
            } else if (players.size() == 1) {
                System.out.println("# 단 한명만 살아남았습니다. 게임을 종료합니다.");
                System.out.printf("# 최후 생존자 : %s\n", players.toString());
                System.out.println("# 게임을 종료합니다.");
                break;
            }
        }

        br.close();
    }
}
