import java.util.Stack;

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

class leetcode901 {
    private Stack<Pair<Integer, Integer>> stack;

    public leetcode901() {
        stack = new Stack<>();
    }

    public int next(int price) {
        int span = 1;

        while (!stack.isEmpty() && stack.peek().getKey() <= price) {
            span += stack.pop().getValue();
        }

        stack.push(new Pair<>(price, span));
        return span;
    }
}
