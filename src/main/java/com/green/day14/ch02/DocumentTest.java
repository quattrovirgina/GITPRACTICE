package com.green.day14.ch02;

class DocumentTest {

    String n1;
    static int cnt = 1;

    public DocumentTest() {
        this("제목없음" + cnt);
        ++cnt;
    }

    public DocumentTest(String n1) {
        this.n1 = n1;
        System.out.println(n1);
    }
}

class Document {
    public static void main(String[] args) {
        DocumentTest d1 = new DocumentTest();
        DocumentTest d2 = new DocumentTest("자바.txt");
        DocumentTest d3 = new DocumentTest();
        DocumentTest d4 = new DocumentTest();
        DocumentTest d5 = new DocumentTest();
    }
}
