package com.test.model;

public class SizeInteger implements Comparable<SizeInteger> {
    private int size;

    public SizeInteger(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        if(size <= 0) {
            return "0";
        } else if(size < 1024) {
            return size + " B";
        } else if( size < 1048576) {
            return size / 1024 + " KB";
        } else {
            return size / 1048576 + " MB";
        }
    }

    @Override
    public int compareTo(SizeInteger o) {
        if(o.size > this.size) return -1;
        if(this.size > o.size) return 1;
        return 0;
    }

}
