package Mirea.Homework12;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DrunkCardGameDoubleArrayList {
    public static void main(String[] args) {
        
        // Создаем колоду карт
        String p1 = "";
        String p2 = "";
        int round = 0;
        
        ArrayList<Integer> cards = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
        Collections.shuffle(cards);
        for(int i = 0; i < cards.size(); i++){
            if(i < cards.size() / 2){
                p1 += cards.get(i);
            }else{
                p2 += cards.get(i);
            }
        }
        System.out.printf("player1: %s; player2: %s%n", p1, p2);
        
        List<Integer> player1 = new ArrayList<>();
        List<Integer> player2 = new ArrayList<>();
        
        for(String c : p1.split("")){
            player1.add(Integer.parseInt(c));
        }
        
        for(String c : p2.split("")){
            player2.add(Integer.parseInt(c));
        }
        
        boolean botva = false;
        // Игра продолжается, пока у обоих игроков есть карты
        while (!player1.isEmpty() && !player2.isEmpty()) {
            int card1 = player1.remove(0); // Игрок 1 берет верхнюю карту
            int card2 = player2.remove(0); // Игрок 2 берет верхнюю карту
            // Определяем, кто выигрывает раунд
            if (card1 > card2 & (card1 != 9 && card2 != 0)|| (card1 == 0 && card2 == 9)) {
                player1.add(card1); // Игрок 1 забирает обе карты
                player1.add(card2);
            } 
            else if (card1 == 9 && card2 == 0){
                player2.add(card1); // Игрок 2 забирает обе карты
                player2.add(card2);
            }
            else {
                player2.add(card1); // Игрок 2 забирает обе карты
                player2.add(card2);
            }
            round++;
            // Определяем победителя
            if(round > 106){
                System.out.println("botva");
                botva = true;
                break;
            }
        }
        if(!botva){
            if (player1.isEmpty()) {
                System.out.printf("second %d", round);
            }
            else {
                System.out.printf("first %d", round);
            }
        }
    }
}
