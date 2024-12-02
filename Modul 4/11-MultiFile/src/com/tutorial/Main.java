package com.tutorial;

// keyboard import untuk panggil package eksternal
import com.Terminal.Console;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Saitama");
        Player player2 = new Player("Goku");
        Player player3 = new Player("Ishigami Yuu");
        Player player4 = new Player("Light Yagami");
        Player player5 = new Player("Gojo Satoru");

        player1.show();
        player2.show();
        player3.show();
        player4.show();
        player5.show();

        Console.log("Hello");
    }
}
