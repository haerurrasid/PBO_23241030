package com.tutorial;

import com.terminal.Console;

//visibillity default
//hanya bisa diakses oleh package sama
class Player {
    private String nama;

    Player(String nama) {
        this.nama = nama;

    }

    void cetak() {
        // System.out.println("Player nama : " + this.nama);
        Console.log("Menggunakan Console");
        Console.log("Player name : " + this.nama);
    }

}
