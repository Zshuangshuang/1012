package java10_12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-12
 * Time:10:17
 **/

class Card{
    private String rank;//点数
    private String suit;//花色

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        /*return "Card{" +
                "rank='" + rank + '\'' +
                ", suit='" + suit + '\'' +
                '}';*/
        return "["+this.suit+this.rank+"]";
    }
}
public class Poker {
    private static List<Card> buyPoker(){
        List<Card> poker = new ArrayList<>();
        String[] suits = {"♥","♠","♣","♦"};
        for (int i = 0; i < 4; i++) {
            for (int j = 2; j <= 10; j++) {
                poker.add(new Card(""+j,suits[i]));
            }
            poker.add(new Card("J",suits[i]));
            poker.add(new Card("Q",suits[i]));
            poker.add(new Card("K",suits[i]));
            poker.add(new Card("A",suits[i]));
        }
        return poker;
    }


    public static void main(String[] args) {
        List<Card> poker = buyPoker();
        Collections.shuffle(poker);
        List<List<Card>> players = new ArrayList<>();
        players.add(new ArrayList<Card>());
        players.add(new ArrayList<Card>());
        players.add(new ArrayList<Card>());
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                List<Card> player = players.get(j);
                player.add(poker.remove(0));
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("玩家"+i+":"+ players.get(i));
        }
    }
}
