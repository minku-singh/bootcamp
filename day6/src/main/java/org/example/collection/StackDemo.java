package org.example.collection;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(10);
        st.push(5);
        st.push(0);

        System.out.println(st);
        st.pop();
        System.out.println(st);
    }
}
