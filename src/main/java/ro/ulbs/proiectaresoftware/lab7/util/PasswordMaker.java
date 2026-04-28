package ro.ulbs.proiectaresoftware.lab7.util;

public class PasswordMaker {

    private static PasswordMaker instance = null;

    private static final int MAGIC_NUMBER = 3;
    private static final String MAGIC_STRING;
    private String name = "Default";
    public static int contor = 0;

    static {
        StringRandomizer srand = new StringRandomizer();
        MAGIC_STRING = srand.randomString(20);
    }

    private PasswordMaker() {
    }




    public static PasswordMaker getInstance() {
        if (instance == null) {
            instance = new PasswordMaker();
        }
        contor++;
        return instance;
    }

    public static int getContor() {
        return contor;
    }

    public String getPassword() {
        java.util.Random r = new java.util.Random();
        String ln = "" + name.length();
        ln += r.nextInt(101);
        StringRandomizer srand = new StringRandomizer();
        return srand.randomString(MAGIC_NUMBER) + srand.randomString(10, MAGIC_STRING) + ln;
    }
}