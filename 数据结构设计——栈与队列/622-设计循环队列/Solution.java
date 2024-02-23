import java.util.ArrayList;

//leetcode submit region begin(Prohibit modification and deletion)
class MyCircularQueue {

    int[] list;
    int font = 0;
    int rear = -1;
    int len = 0;

    public MyCircularQueue(int k) {
        list = new int[k];
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        rear = (rear + 1) % list.length;
        list[rear] = value;
        len++;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        list[font] = 0;
        font = (font + 1) % list.length;
        len--;
        return true;
    }

    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return list[font];
    }

    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return list[rear];
    }

    public boolean isEmpty() {
        return len == 0;
    }

    public boolean isFull() {
        return len == list.length;
    }
}
/**
 * 执行耗时:4 ms,击败了100.00% 的Java用户
 * 内存消耗:43.7 MB,击败了13.27% 的Java用户
 */