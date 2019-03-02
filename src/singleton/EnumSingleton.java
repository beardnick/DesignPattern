package singleton;

//枚举实现
//避免线程同步问题，防止反序列化重新创建对象
//从Java1.5之后才能这样使用
public enum  EnumSingleton {
    UNIQUE;
    public void doSomething(){
        System.out.println("do someting");
    }

    public static void main(String[] args) {
        EnumSingleton.UNIQUE.doSomething();
    }
}
