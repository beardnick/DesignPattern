package singleton;


//懒汉模式
//最简单的单例模式写法，线程不安全
//是一种偷懒的写法
public class SimpleSigleton {

    public static SimpleSigleton unique;

    public static SimpleSigleton getInstance(){
        if(unique == null){
          unique = new SimpleSigleton();
        }
        return unique;
    }

    private SimpleSigleton(){

    }

}
