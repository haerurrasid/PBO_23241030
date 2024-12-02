package com.terminal;

//vissibillitasnya bisa diakses oleh package eksternal
public class Console {
    public static void log(String pesan) {
        System.out.println(pesan);
    }
}

// ini hanya bisa diakses package com.terminal saja
class Terminal {
    public static void log(String pesan) {
        System.out.println(pesan);
    }
}
