package singleton;

public class InnertSingleton {

//    这里可以看出来，构造函数隐性地可以看做是静态的
//    所以静态的内部类才可以调用它
    private static class SingletonHolder {
        private static InnertSingleton unique = new InnertSingleton();
    }

    public static InnertSingleton getInstance(){
        return SingletonHolder.unique;
    }

    private InnertSingleton(){

    }
}
