package com.example.prac.chap7;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

class Word {
    private String english;
    private String korean;
    public Word(String english, String korean) {
        this.english = english;
        this.korean = korean;
    }
    public String getEnglish() { return english; }
    public String getKorean() { return korean; }

}
public class WordQuiz {
    Scanner sc = new Scanner(System.in);
    private String name;
    private Vector<Word> v;

    public WordQuiz(String name) {
        this.name = name;
        v = new Vector<Word>();
        v.add(new Word("computer", "컴퓨터"));
        v.add(new Word("people", "사람"));
        v.add(new Word("apple", "사과"));
        v.add(new Word("banana", "바나나"));
        v.add(new Word("ball", "공"));
        v.add(new Word("soccer", "축구"));
        v.add(new Word("baseball", "야구"));
        v.add(new Word("tiger", "호랑이"));
        v.add(new Word("lion", "사자"));
        v.add(new Word("monkey", "원숭이"));
        v.add(new Word("bear", "곰"));
        v.add(new Word("money", "돈"));
        v.add(new Word("car", "차"));
        v.add(new Word("bus", "버스"));
        v.add(new Word("airplane", "비행기"));
        v.add(new Word("rain", "비"));
        v.add(new Word("snow", "눈"));
    }


    private int makeExample(int ex[], int answerIndex) {
        int n[] = {-1, -1, -1, -1};
        int index;
        for(int i=0; i<n.length; i++) {
            do {
                index = (int)(Math.random()*v.size());
            } while(index == answerIndex || exists(n, index));
            n[i] = index;
        }

        for(int i=0; i<n.length; i++) ex[i] = n[i];
        return (int)(Math.random()*n.length);
    }

    private boolean exists(int n[], int index) {
        for(int i=0; i<n.length; i++) {
            if(n[i] == index)
                return true;
        }
        return false;
    }

    public void quiz() {
        System.out.println("\"" + name + "\"" + "의 단어 테스트를 시작합니다. -1을 입력하면 종료합니다.");
        System.out.println("현재 " + v.size() + "개의 단어가 들어 있습니다.");
        while(true) {
            int answerIndex = (int)(Math.random()*v.size());
            String eng = v.get(answerIndex).getEnglish();

            int example[] = new int [4];

            int answerLoc = makeExample(example, answerIndex);
            example[answerLoc] = answerIndex;


            System.out.println(eng + "?");
            for(int i=0; i<example.length; i++)
                System.out.print("(" + (i+1) + ")" + v.get(example[i]).getKorean() + " ");

            System.out.print(":>");
            try {
                int in = sc.nextInt();
                if(in == -1) {
                    break;
                }


                in--;
                if(in == answerLoc)
                    System.out.println("정답입니다!!!!");
                else
                    System.out.println("잘못된 번호입니다!!!");
            }
            catch(InputMismatchException e) {
                sc.next();
                System.out.println("숫자를 입력하세요 !!");
                // while 문으로 다시 반복
            }
        }
    }
    private boolean contains(String eng) {
        for(int i=0; i<v.size(); i++) {
            if(v.get(i).getEnglish().equals(eng)) {
                return true;
            }
        }
        return false;
    }

    public void insert() {
        System.out.print("현재 " + v.size() + "개 단어가 입력되어 있습니다.");
        System.out.println("'그만'을 입력하면 테스트가 종료됩니다.");
        while(true) {
            System.out.print("영어 한글 입력>>");
            String english = sc.next();
            if(english.equals("그만")) break;
            String capital = sc.next();

            if(contains(english)) {
                System.out.println(english + "는 이미 있습니다!");
                continue;
            }

            v.add(new Word(english, capital));
        }
    }
    public void run() {
        System.out.println("단어 테스트 시작");
        while(true) {
            System.out.print("단어테스트:1, 단어 삽입:2, 종료:3>>");
            int select = sc.nextInt();
            switch(select) {
                case 1:
                    quiz(); break;
                case 2:
                    insert(); break;
                case 3:
                    sc.close();
                    System.out.println("수고하셨습니다. 단어테스트를 종료합니다.");
                    return;
            }
        }
    }
    public static void main(String[] args) {
        WordQuiz quiz = new WordQuiz("퀴즈");
        quiz.run();
    }
}

