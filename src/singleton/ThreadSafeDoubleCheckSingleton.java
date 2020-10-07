package singleton;

public class ThreadSafeDoubleCheckSingleton {
    private static ThreadSafeDoubleCheckSingleton threadSafeDoubleCheckSingleton = null;

    private ThreadSafeDoubleCheckSingleton() {
    }

    public static ThreadSafeDoubleCheckSingleton getInstance() {
        if (threadSafeDoubleCheckSingleton == null) {
            synchronized (ThreadSafeDoubleCheckSingleton.class) {
                if (threadSafeDoubleCheckSingleton == null) {
                    threadSafeDoubleCheckSingleton = new ThreadSafeDoubleCheckSingleton();
                }
            }
        }

        return threadSafeDoubleCheckSingleton;
    }
}
