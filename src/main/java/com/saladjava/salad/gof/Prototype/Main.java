package com.saladjava.salad.gof.Prototype;

public class Main {
    public static void main(String[] args) {
        // List Arrayでcloneする場合はキャスト変換をかます必要がある.またtry, catchで包んでthrowをしておく必要がある
        // List<Robot> a = (List<Robot>) ((ArrayList<Robot>) robotsReversed).clone();

        MessageBox messageBox = new MessageBox("HOGE");

        Manager manager = new Manager();
        manager.register("string", messageBox);

        Product copyMessageBox = manager.create("string");
        copyMessageBox.use();

    }
}
