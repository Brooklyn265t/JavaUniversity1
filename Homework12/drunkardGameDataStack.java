/*игра пьяница */
package Mirea.Homework12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class drunkardGameDataStack {
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
        
        Stack<Integer> player1 = new Stack<>();
        Stack<Integer> player2 = new Stack<>();
        Stack<Integer> Save = new Stack<>();

        for(String c : p1.split("")){
            Save.add(Integer.parseInt(c));
        }
        while(!Save.isEmpty())
            player1.push(Save.pop());
        
        for(String c : p2.split("")){
            Save.add(Integer.parseInt(c));
        }
        while(!Save.isEmpty())
            player2.push(Save.pop());
        
//        System.out.printf("player1: %s; player2: %s%n", player1, player2);
        
        boolean botva = false;
        boolean takeFirst = false;
        // Игра продолжается, пока у обоих игроков есть карты
        while (!player1.isEmpty() && !player2.isEmpty()) {
            int card1 = player1.pop(); // Игрок 1 берет верхнюю карту
            int card2 = player2.pop(); // Игрок 2 берет верхнюю карту
            takeFirst = false;
            // Определяем, кто выигрывает раунд
            if(card1 ==9 && card2 ==0 || card1 ==0 && card2 ==9){
                // карты 0 и 9
                if (card1 == 0 && card2 == 9){
                    takeFirst = true;
                }
            }else{
                takeFirst = card1 > card2;
            }
            
            if(takeFirst){
                // забирает 1й
                while(!player1.isEmpty())
                    Save.push(player1.pop());
                Save.push(card1);
                Save.push(card2);
                while(!Save.isEmpty())
                    player1.push(Save.pop());
            }else{
                // забирает 2й
                while(!player2.isEmpty())
                    Save.push(player2.pop());
                Save.push(card1);
                Save.push(card2);
                while(!Save.isEmpty())
                    player2.push(Save.pop());
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
//            System.out.println("GAME OVER");
//            System.out.printf("player1: %s; player2: %s%n", player1, player2);
            if (player1.isEmpty()) {
                System.out.printf("second %d", round);
            }
            else {
                System.out.printf("first %d", round);
            }
        }
    }
}