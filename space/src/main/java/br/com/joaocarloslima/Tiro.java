package br.com.joaocarloslima;

import javafx.scene.image.ImageView;

public class Tiro extends Asset {
    private int poder;

    public Tiro(int x, int y, int velocidade, Direcao direcao, int poder) {
        super(x, y, velocidade, direcao);
        this.poder = poder;
        String path = "images/laser/laser" + poder + ".png";
        setImagem(new ImageView(App.class.getResource(path).toString()));
    }

    public int getPoder() {
        return poder;
    }

}
