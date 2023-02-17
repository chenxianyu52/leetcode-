import java.util.*;

class Solution {
    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Bean> map = new HashMap<>();
        int len = employees.size();
        if (len == 0) {
            return 0;
        }
        int result = 0;
        for (int i = 0; i < len; i++) {
            Employee employee = employees.get(i);
            Bean bean = new Bean();
            bean.importance = employee.importance;
            bean.subordinates = employee.subordinates;
            map.put(employee.id, bean);
        }

        Deque<Bean> deque = new ArrayDeque<>();
        deque.push(map.get(id));
        while (!deque.isEmpty()) {
            Bean bean = deque.pollFirst();
            result += bean.importance;
            int subLen = bean.subordinates.size();
            for (int i = 0; i < subLen; i++) {
                int subId = bean.subordinates.get(i);
                Bean sub = map.getOrDefault(subId, null);
                if (sub != null) {
                    deque.push(sub);
                }
            }
        }
        return result;
    }
}

class Bean {
    public int importance;
    public List<Integer> subordinates;
}
/**
 * 解答成功:
 * 执行耗时:5 ms,击败了58.32% 的Java用户
 * 内存消耗:41.9 MB,击败了80.37% 的Java用户
 */