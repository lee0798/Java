package com.example.prac.chap5;

public class study10 {
    public static void main(String[] args) {
        Dictionary dic = new Dictionary(3);

        dic.put("황기태", "자바");
        dic.put("이재문", "파이썬");
        dic.put("홍길동", "자료구조");
        System.out.println("=======================================");
        dic.dicPrint();
        System.out.println("=======================================");
        System.out.println("이재문을 C++ 수정");
        dic.put("이재문", "C++");
        System.out.println("이재문의 값은 "+dic.get("이재문"));

        System.out.println("=======================================");
        System.out.println("김철수 운영체제 삽입");
        dic.put("김철수", "운영체제");

        System.out.println("=======================================");
        System.out.println("황기태 value 찾음 ");
        System.out.println("황기태의 값은 "+dic.get("황기태"));
        System.out.println("=======================================");
        System.out.println("황기태 삭제");
        System.out.println("황기태 삭제의 값은 "+dic.delete("황기태"));
        System.out.println("=======================================");
        System.out.println("황기태 value 찾음 ");
        System.out.println("황기태의 값은 "+dic.get("황기태"));
        System.out.println("=======================================");
        dic.dicPrint();
        System.out.println("=======================================");
        System.out.println("이영희 삭제");
        System.out.println("이영희 삭제의 값은 "+dic.delete("이영희"));
        System.out.println("=======================================");
        dic.dicPrint();

    }
}
