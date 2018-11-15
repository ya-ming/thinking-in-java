package arrays;

class ClassParameter<T> {
    public T[] f(T[] args) {
        return args;
    }
}

public class ParameterizedArrayType {
    public static void main(String[] args) {
        Integer[] ints = {1, 2, 3, 4, 5};
        Integer[] ints2 = new ClassParameter<Integer>().f(ints);
    }
}
