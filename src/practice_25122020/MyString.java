package practice_25122020;

import java.util.LinkedList;

public class MyString {

    private LinkedList<Character> list;

    public MyString() {
    }

    public char charAt(int index) throws IndexOutOfBoundsException {

        char[] name = new char[4];

        if (name.length - 1 > 2) {
            throw new IndexOutOfBoundsException();
        }
        return name[2];

    } // return char at index

    public static void main(String[] args) {
        try {
            // תנסה להגיע לאתר מסוים
            // תציג

        } catch (IndexOutOfBoundsException e) {
            // e.printStackTrace();

        }
    }
}