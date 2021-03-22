package day12;

import java.util.*;

public class test07 {
    public static void main(String[] args) {
        // 1. 准备牌
        List<String> card = structCard();

        // 2. 发牌
        ArrayList<ArrayList<String>> rest = licensing(card);

        // 3. 打印结果
        for(ArrayList<String> i:rest){
            System.out.println(i);
        }
    }

    private static ArrayList<ArrayList<String>> licensing(List<String> arr) {
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            if(i >= 51){
                dipai.add(arr.get(i));
            }else{
                int j = i%3;
                if(j == 0){
                    player1.add(arr.get(i));
                }else if(j==1){
                    player2.add(arr.get(i));
                }else{
                    player3.add(arr.get(i));
                }
            }
        }

        ArrayList<ArrayList<String>> rest = new ArrayList<>();
        rest.add(player1);
        rest.add(player2);
        rest.add(player3);
        rest.add(dipai);
        return rest;
    }

    private static List<String> structCard() {
        Collection<String> colors = new ArrayList<>();
        Collection<String> num = new ArrayList<>();
        List<String> card = new ArrayList<>();

        colors.add("♣");
        colors.add("♦");
        colors.add("♥");
        colors.add("♠");

        for (int i = 1; i < 14; i++) {
            num.add(i+"");
        }

        for (String color:colors) {
            for (String nu:num) {
                card.add(color+nu);
            }
        }

        card.add("大王");
        card.add("小王");

        Collections.shuffle(card);

        return card;
    }

}
