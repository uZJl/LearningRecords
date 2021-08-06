package sort0806;

/**
 * Created by JiaLe on 2021/8/6 8:49
 */
public class single {
    static class Singleton {
        private Singleton(){}
        private static volatile Singleton instance = null;
        public static Singleton getInstance() {
            // 即使instance已经实例化了，但是每次调用getInstance()还是会涉及加锁解锁
            // 实际上此时已经不需要了，所以要实现在instance实例化之前调用的时候加锁，
            // 之后不加锁，就引出了双重检验锁版本
            if (instance == null) {
                synchronized (Singleton.class) {
                    if (instance == null) {
                        instance = new Singleton();
                    }
                }
            }
            return instance;
        }
    }
}
