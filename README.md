# thinking-in-java

## access
Classes for testing purpose.

## simple
Simple functionalities.

## initialization
Initialization related.

## util
Utility classes such as Print

## reusing
Basic example of inherit and member variable initialization; final/blank final;

## polymorphism
Covariant return. Overriding function in the extended class can return one of the inherited type of the parent class.

## innerclass
Inner class releated examples. 

## simple containers
![Simple Container Taxonomy](https://github.com/ya-ming/thinking-in-java/raw/master/files/simple-container-taxonomy.jpg)

## Exceptions
![Exceptions](https://github.com/ya-ming/thinking-in-java/raw/master/files/exception.jpg)

## Reflection
![Reflection](https://github.com/ya-ming/thinking-in-java/raw/master/files/reflection-basic.jpg)

## Array

| Category | Implementation | Thread Safety | Absolute Consistency | Sort | Characteristic |
| ------ | ------ | ------ | ------ | ------ | ------ |
| List  | LinkedList | No | No | Insertion Order | Fast inserting and removing, slow random accessing |
|  | ArrayList | No | No | Insertion Order | Slow inserting and removing, fast random accessing |
|  | Vector | Yes | Yes | Insertion Order | Low performance |
|  | CopyOnWriteArrayList | Yes | No | Insertion Order | Fast inserting and removing, high memory usage |
| Map | HashMap | No | No | N/A | High performance, close to O(1) |
|  | LinkedHashMap | No | No | Insertion Order | Can be iterated on the insertion order, performance close to HashMap |
|  | HashTable | Yes | Yes | N/A | Lower performance |
|  | ConcurrentHashMap | Yes | No | N/A | Higher performance compare to HashTable |
|  | TreeMap | No | No | Key ascending/descending order | O(logN) |
|  | ConcurrentSkipListMap | Yes | No | Key ascending/descending order | Performance close to TreeMap, high memory usage |
| Set | HashSet | No | No | N/A | High performance, close to O(1) |
|  | LinkedHashSet | No | No | Insertion Order | Can be iterated on the insertion order, performance close to HashSet |
|  | TreeSet | No | No | Object ascending/descending order | O(logN) |
|  | ConcurrentSkipListSet | No | No | N/A | Performance close to TreeSet, high memory usage |
| Queue | ConcurrentLinkedQueue | Yes | No | Insertion Order | Non-blocking |
|  | LinkedBlockingQueue | Yes | No | Insertion Order | Blocking, no boundary |
|  | ArrayBlockingQueue | Yes | No | Insertion Order | Blocking, has boundary |
|  | SynchronousQueue | Yes | Yes | N/A | Blocking until the only element has been popped from the queue |
|  | PriorityQueue | No | No | Order on demand | Sorted by priority |
| Deque | ConcurrentLinkedDeque | Yes | No | Insertion Order | Non-blocking |
|  | LinkedBlockingDeque | Yes | No | Insertion Order | Blocking, no boundary |