
public class Node<Key extends Comparable<Key>, Value> {

    public Key key;
    public Value value;
    public Node<Key, Value> left;
    public Node<Key, Value> right;
    public int size;
    public boolean color;
    public static final boolean RED = true;
    public static final boolean BLACK = false;
    public Node(Key key, Value value, int size) {
        this.key = key;
        this.value = value;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                ", value=" + value + ", color="+ color+
                '}';
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public Node<Key, Value> getLeft() {
        return left;
    }

    public void setLeft(Node<Key, Value> left) {
        this.left = left;
    }

    public Node<Key, Value> getRight() {
        return right;
    }

    public void setRight(Node<Key, Value> right) {
        this.right = right;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean color(){
        return BLACK;
    }


}
