package Collection.List;

import java.util.Iterator;

public class ArrayDemo {
    public static void main(String[] args) {
        Iterable iterable=()->new Iterator() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                return null;
            }
        };

    }
}
