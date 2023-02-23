package org.itstep.classtask;

import java.util.Arrays;

/**
 * Створити узагальнений клас Stack, що повинен представляти структуру даних Стек.
 * В класі повинні бути наступні методи:
 * push() - додати новий елемент в стек
 * pop() - виштовхнути останній доданий елемент з стеку
 * peek() - подивитися вершину стеку
 * size() - отримати розмір стеку
 * isEmpty() - перевірити чи пустий стек
 * Застосувати стек для зберігання історії веб серфінгу.
 * Для цього створити допоміжний клас WebPage, в якому визначити поле url
 *
 * Приклад застосування історії:
 *
 * Stack<WebPage> browserHistory = new Stack<>();
 *
 * browserHistory.push(new WebPage("https://google.com"));
 * browserHistory.push(new WebPage("https://itstep.dp.ua"));
 * browserHistory.push(new WebPage("https://chat.openia.com"));
 *
 * Sustem.out.println(browserHistory.size()); // 3
 * System.out.println(browserHistory.pop()); // https://chat.openia.com
 * System.out.println(browserHistory.pop()); // https://itstep.dp.ua
 * System.out.println(browserHistory.pop()); // https://google.com
 * Sustem.out.println(browserHistory.isEmpty()); // true
 */
public class MyStack<T> {
    private Object[] data = new Object[0];

    /**
     * - додати новий елемент в стек
     */
    public void push(T element) {
        int size = size();
        data = Arrays.copyOf(data, size + 1);
        data[size] = element;
   }

    /**
     * виштовхнути останній доданий елемент з стеку
     */
    public T pop() {
        T last = null;
        if (!isEmpty()) {
            last = peek();
            data = Arrays.copyOfRange(data, 0, data.length - 1);
        }
        return last;
    }

    /**
     * - подивитися вершину стеку
     */
    public T peek() {
        return (T) data[data.length - 1];
    }

    /**
     * - отримати розмір стеку
     */
    public int size() {
        return data.length;
    }

    /**
     *  - перевірити чи пустий стек
     */
    public boolean isEmpty() {
        return data.length == 0;
    }
}
