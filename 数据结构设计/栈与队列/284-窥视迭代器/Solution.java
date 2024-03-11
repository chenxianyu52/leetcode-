import java.util.ArrayList;
import java.util.Iterator;

class PeekingIterator implements Iterator<Integer> {
    ArrayList<Integer> arrayList = new ArrayList<>();
    int index = 0;

    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        while (iterator.hasNext()) {
            arrayList.add(iterator.next());
        }
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return arrayList.get(index);
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        return arrayList.get(index++);
    }

    @Override
    public boolean hasNext() {
        return index < arrayList.size();
    }
}
/**
 * 执行耗时:3 ms,击败了100.00% 的Java用户
 * 内存消耗:41.2 MB,击败了31.52% 的Java用户
 */