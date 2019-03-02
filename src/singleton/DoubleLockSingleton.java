package singleton;

//双重锁定的做法
//在Java1.5之后才可以使用
public class DoubleLockSingleton {

    private static DoubleLockSingleton unique;

    public static DoubleLockSingleton getInstance(){
        if(unique == null){
            synchronized (DoubleLockSingleton.class){
                if(unique == null){
                    unique = new DoubleLockSingleton();
                }
            }
        }
        return unique;
    }

    private DoubleLockSingleton(){

    }
}
