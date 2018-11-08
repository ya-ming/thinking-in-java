package interfaces.music4;

import interfaces.music.Note;

import static util.Print.print;

abstract class Instrument {
    private int i;
    public abstract void play(Note n);
    public String what() {
        return "Instrument";
    }
    public abstract void adjust();
}

class Wind extends Instrument{
    @Override
    public void play(Note n) {
        print("Wind.play() " + n);
    }

    @Override
    public void adjust() {

    }
}

class Percussion extends Instrument{
    @Override
    public void play(Note n) {
        print("Percussion.play() " + n);
    }

    @Override
    public void adjust() {

    }
}

public class Music4 {
    static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] e) {
        for (Instrument i:e
             ) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(), new Percussion()
        };
        tuneAll(orchestra);
    }
}