package enumerate;

class EnumMain {
    public enum Spiciness {
        NOT, MILD, MEDIUM, HOT, FLAMING
    }

    private static void simplePrint() {
        Spiciness howHot = Spiciness.MEDIUM;
        System.out.println(howHot);
    }

    private static void forPrint() {
        for (Spiciness spiciness : Spiciness.values()) {
            System.out.println(spiciness);
        }
    }

    private static void switchEnum() {
        Spiciness spiciness;

        spiciness = Spiciness.HOT;
        switch (spiciness) {
            case NOT:
                System.out.println("not spicy at all");
            case MILD:
            case MEDIUM:
                System.out.println("a little hot");
            case HOT:
            case FLAMING:
            default:
                System.out.println("maybe too hot");
        }
    }

    public static void main(String[] args) {
        simplePrint();
        forPrint();
        switchEnum();
    }


}