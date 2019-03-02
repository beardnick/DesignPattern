package singleton;

//第二种懒汉模式
//线程安全，但是性能堪忧
public class EasySingleton {

    private  static EasySingleton unique;

    public static synchronized EasySingleton getInstance(){
        if(unique == null){
            unique = new EasySingleton();
        }
        return unique;
    }

    private EasySingleton(){

    }
}
