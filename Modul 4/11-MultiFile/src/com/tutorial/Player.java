package com.tutorial;

class Player {
    private String nama;

    Player(String nama) {
        this.nama = nama;
    }

    void show() {
        System.out.println("Player Name : " + this.nama);
    }
}