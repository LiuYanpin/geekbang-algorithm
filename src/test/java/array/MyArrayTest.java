package array;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MyArrayTest {
    @Test
    public void should_be_true() {
        assertTrue(true);
    }

    @Test
    public void should_initialize_array_with_given_capacity() {
        MyArray myArray = new MyArray(10);
        assertEquals(0, myArray.length());
    }

    @Test
    public void should_insert_an_item_at_head() {
        MyArray myArray = new MyArray(3);
        myArray.addAtHead(1);
        myArray.addAtHead(2);
        myArray.addAtHead(3);
        assertEquals(3, myArray.get(0));
        assertEquals(2, myArray.get(1));
        assertEquals(1, myArray.get(2));
        assertEquals(3, myArray.length());
    }

    @Test
    public void should_return_illegal_if_index_is_not_valid() {
        MyArray myArray = new MyArray();
        myArray.addAtHead(1);
        myArray.addAtHead(2);
        assertEquals(-1, myArray.get(-1));
        assertEquals(-1, myArray.get(2));
    }

    @Test
    public void should_insert_value_at_given_index() {
        MyArray myArray = new MyArray();
        myArray.insertAt(0, 1);
        myArray.insertAt(0, 2);
        myArray.insertAt(1, 3);
        myArray.insertAt(2, 4);
        assertEquals(2, myArray.get(0));
        assertEquals(3, myArray.get(1));
        assertEquals(4, myArray.get(2));
        assertEquals(1, myArray.get(3));
    }

    @Test
    public void should_add_item_within_capacity() {
        MyArray myArray = new MyArray(3);
        myArray.add(1);
        myArray.add(2);
        myArray.add(3);
        myArray.add(4);
        myArray.add(5);
        myArray.add(6);

        assertEquals(1, myArray.get(0));
        assertEquals(2, myArray.get(1));
        assertEquals(3, myArray.get(2));
        assertEquals(4, myArray.get(3));
        assertEquals(5, myArray.get(4));
        assertEquals(6, myArray.get(5));
    }

    @Test
    public void should_show_the_original_array() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0, 1);
        arrayList.add(0, 2);
        arrayList.add(1, 3);
        arrayList.add(2, 4);
        arrayList.add(-1, 1);
        assertEquals(2, arrayList.get(0).intValue());
        assertEquals(3, arrayList.get(1).intValue());
        assertEquals(4, arrayList.get(2).intValue());
        assertEquals(1, arrayList.get(3).intValue());
    }
}