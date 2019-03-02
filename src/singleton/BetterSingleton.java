package singleton;

//饿汉模式
//非lazy loading
public class BetterSingleton {

    private static BetterSingleton unique = new BetterSingleton();

    public static BetterSingleton getInstance(){
        return unique;
    }
    private BetterSingleton(){

    }

}
