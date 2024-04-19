package main.java.com.nyqk.chwj.juc.ThreadUnsafeExample111;

/**
 * @author ZhangZL
 * @date 2024/04/19 17:21
 */
public class WorkClazz {
    private int cnt = 0;

    public void add() {
        cnt++;
    }

    public int get() {
        return cnt;
    }
}
