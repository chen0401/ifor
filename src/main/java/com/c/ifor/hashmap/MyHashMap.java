package com.c.ifor.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: cjianping on 2021/1/12 14:20
 */
public class MyHashMap {
    public static void main(String[] args) {
        Map<Key, Object> map = new HashMap<>();
        for (int i = 0; i < 12; i++) {
            Key key = new Key(i);
            map.put(key, i);
        }

        map = new ConcurrentHashMap<>();
    }

    static class Key {
        private int i;

        public Key(int i) {
            this.i = i;
        }

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }

        @Override
        public int hashCode() {
            return 1;
        }

        @Override
        public boolean equals(Object obj) {
            return super.equals(obj);
        }
    }
}
