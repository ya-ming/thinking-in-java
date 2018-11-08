package interfaces.music5;

import interfaces.music.Note;

import static util.Print.print;

interface Instrument {
    int VALUE = 5;
    void play(Note n);
    void adjust();
}

class Wind implements Instrument {
    @Override
    public void play(Note n) {
        print("Wind.play() " + n);
    }

    @Override
    public void adjust() {
        print(this + ".adjust()");
    }
}

class Percussion implements Instrument {
    @Override
    public void play(Note n) {
        print("Percussion.play() " + n);
    }

    @Override
    public void adjust() {
        print(this + ".adjust()");
    }
}

public class Music5 {
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