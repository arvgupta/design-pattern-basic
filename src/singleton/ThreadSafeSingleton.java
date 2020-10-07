package singleton;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton threadSafeSingleton = null;

    private ThreadSafeSingleton() {
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (threadSafeSingleton == null) {
            threadSafeSingleton = new ThreadSafeSingleton();
        }
        return threadSafeSingleton;
    }
}
