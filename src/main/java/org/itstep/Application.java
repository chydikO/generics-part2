package org.itstep;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
//        StringQueue stringQueue = new StringQueue();
        ObjectQueue stringQueue = new ObjectQueue();
        stringQueue.enqueue("First task");
        stringQueue.enqueue("Second task");
        stringQueue.enqueue("Third task");
        stringQueue.enqueue(123);
        System.out.println(stringQueue.size());    // 3
        System.out.println(stringQueue.dequeue()); // First task
        System.out.println(stringQueue.dequeue()); // Second task
        System.out.println(stringQueue.dequeue()); // Third task
        System.out.println(stringQueue.isEmpty()); // true

        Task task1 = new Task("Learn Generics", "Generic classes, methods");
        Task task2 = new Task("Go for a walk", "With dog");
//        TaskQueue taskQueue = new TaskQueue();
//        ObjectQueue taskQueue = new ObjectQueue();

        /*
        Queue<Task> taskQueue = new Queue<>();
        taskQueue.enqueue(task1); // upcasting


        // taskQueue.enqueue("task2");
        while (!taskQueue.isEmpty()) {
//            Task task = (Task) taskQueue.dequeue();// downcasting
            System.out.println(taskQueue.dequeue().getTitle());
        }
   */
        ObjectQueue objectQueue = new ObjectQueue();
        objectQueue.enqueue(10);
        objectQueue.enqueue(20);
        objectQueue.enqueue(30);
        System.out.println(objectQueue.dequeue());
        System.out.println(objectQueue.dequeue());
        System.out.println(objectQueue.dequeue());

        /*

         */
    }
}

class Task {
    private String title;
    private String description;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }
}

// Queue:
// FIFO - First In - First Out
// void enqueue();
// Object dequeue();
// Object peek();
// int size();
// boolean isEmpty();
class StringQueue {
    private String[] queue = new String[0];

    // ["First task", "Second task", "Third task"]
    public void enqueue(String item) {
        int size = size();
        queue = Arrays.copyOf(queue, size + 1);
        queue[size] = item;
    }

    public String dequeue() {
        String first = null;
        if (!isEmpty()) {
            first = peek();
            queue = Arrays.copyOfRange(queue, 1, queue.length);
        }
        return first;
    }

    public String peek() {
        return queue[0];
    }

    public int size() {
        return queue.length;
    }

    public boolean isEmpty() {
        return size() == 0;
    }
}

class TaskQueue {
    private Task[] queue = new Task[0];

    public void enqueue(Task item) {
        int size = size();
        queue = Arrays.copyOf(queue, size + 1);
        queue[size] = item;
    }

    public Task dequeue() {
        Task first = null;
        if (!isEmpty()) {
            first = peek();
            queue = Arrays.copyOfRange(queue, 1, queue.length);
        }
        return first;
    }

    public Task peek() {
        return queue[0];
    }

    public int size() {
        return queue.length;
    }

    public boolean isEmpty() {
        return size() == 0;
    }
}

class ObjectQueue {
    private Object[] queue = new Object[0];

    public void enqueue(Object item) {
        int size = size();
        queue = Arrays.copyOf(queue, size + 1);
        queue[size] = item;
    }

    public Object dequeue() {
        Object first = null;
        if (!isEmpty()) {
            first = peek();
            queue = Arrays.copyOfRange(queue, 1, queue.length);
        }
        return first;
    }

    public Object peek() {
        return queue[0];
    }

    public int size() {
        return queue.length;
    }

    public boolean isEmpty() {
        return size() == 0;
    }
}


/*class WebPage {
    private String url;

    public WebPage(String url) {
        this.url = url;
    }
}*/

class Queue<T> {
    private Object[] queue = new Object[0];

    public void enqueue(T item) {
        int size = size();
        queue = Arrays.copyOf(queue, size + 1);
        queue[size] = item;
    }

    public T dequeue() {
        T first = null;
        if (!isEmpty()) {
            first = peek();
            queue = Arrays.copyOfRange(queue, 1, queue.length);
        }
        return first;
    }

    public T peek() {
        return (T) queue[0];
    }

    public int size() {
        return queue.length;
    }

    public boolean isEmpty() {
        return size() == 0;
    }
}
