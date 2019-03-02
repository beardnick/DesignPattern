package singleton;

//饿汉变种，跟饿汉其实没啥差别
public class LooksLikeBetterSIgleton {

    static {
        unique = new LooksLikeBetterSIgleton();
    }
    private static LooksLikeBetterSIgleton unique = null;

    public static LooksLikeBetterSIgleton getInstance(){
        return unique;
    }

    private LooksLikeBetterSIgleton(){

    }
}
