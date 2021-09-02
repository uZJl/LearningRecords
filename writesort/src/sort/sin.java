package sort;

/**
 * Created by JiaLe on 2021/9/2 10:05
 */
public class sin {
    static class single {
        private single(){}
        private static volatile single instance = null;
        public static single getInstance() {
            if (instance == null) {
                synchronized (single.class) {
                    if (instance == null) {
                        instance = new single();
                    }
                }
            }
            return instance;
        }
    }
    public static void main(String[] args) {

    }

}
