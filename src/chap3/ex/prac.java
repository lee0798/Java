package com.example.prac.chap3.ex;

public class prac {
}
//
//
//
//
//[4장 1번]
//
//
//
//        자바 클래스를 작성하는 연습을 해보자. 다음 main() 메소드를 실행하였을 때 예시와 같이 출력되도록 TV 클래스를 작성하라.
//
//public static void main(String[] args) {
//        TV myTV = new TV("LG", 2017, 32); //LG에서 만든 2017년 32인치
//        myTV.show();
//        }
//        LG에서 만든 2017년형 32인치 TV
//
//
//        [풀이]
//
//        package java_study4_1;
//
//class TV {
//    private String brand;
//    private int year;
//    private int inch;
//    TV(String brand, int year, int inch) {
//        this.brand = brand;
//        this.year = year;
//        this.inch = inch;
//    }
//    public void show() {
//        System.out.println(brand+"에서 만든 "+year+"년형 "+inch+"인치 TV");
//    }
//}
//
//public class java_study4_1 {
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        TV myTV = new TV("LG", 2017, 32);
//        myTV.show();
//    }
//
//}
//
//
//[4장 2번]
//
//
//
//        Grade 클래스를 작성해보자. 3 과목의 점수를 입력받아 Grade 객체를 생성하고 성적 평균을 출력하는 main()과 실행 예시는 다음과 같다.
//
//public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("수학, 과학, 영어 순으로 3개의 정수 입력 >> ");
//        int math = sc.nextInt();
//        int science = sc.nextInt();
//        int english = sc.nextInt();
//        Grade me = new Grade(math, science, english);
//        System.out.println("평균은 "+me.average()); // average()는 평균을 계산하여 리턴
//
//        sc.close();
//        }
//        수학, 과학, 영어 순으로 3개의 정수 입력 >> 90 88 96
//        평균은 91
//        [Hint] Grade 클래스에 int 타입의 math, science, english 필드를 private로 선언하고, 생성자와 세 과목의 평균을 리턴하는 average() 메소드를 작성한다.
//
//
//
//        [풀이]
//
//        package java_study4_2;
//
//        import java.util.Scanner;
//
//class Grade {
//    private int math;
//    private int science;
//    private int english;
//    Grade(int math, int science, int english) {
//        this.math = math;
//        this.science = science;
//        this.english = english;
//    }
//    public int average() {
//        return (math + science + english) / 3;
//    }
//}
//
//public class java_study4_2 {
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("수학, 과학, 영어 순으로 3개의 정수 입력 >> ");
//        int math = sc.nextInt();
//        int science = sc.nextInt();
//        int english = sc.nextInt();
//        Grade me = new Grade(math, science, english);
//        System.out.println("평균은 "+me.average());
//
//        sc.close();
//    }
//
//}
//
//
//[4장 3번]
//
//
//
//        노래 한 곡을 나타내는 Song 클래스를 작성하라. Song은 다음 필드로 구성된다.
//
//        - 노래의 제목을 나타내는 title
//        - 가수를 나타내는 artist
//        - 노래가 발표된 연도를 나타내는 year
//        - 국적을 나타내는 country
//
//        또한 Song 클래스에 다음 생성자와 메소드를 작성하라.
//        - 생성자 2개: 기본 생성자와 매개변수로 모든 필드를 초기화하는 생성자
//        - 노래 정보를 출력하는 show() 메소드
//        - main() 메소드에서는 1978년, 스웨덴 국적의 ABBA가 부른 "Dancing Queen"을
//        song 객체로 생성하고 show()를 이용하여 노래의 정보를 다음과 같이 출력하라.
//        1978년 스웨덴국적의 ABBA가 부른 Dancing Queen
//
//
//        [풀이]
//
//        package java_study4_3;
//
//class Song {
//    private String title;
//    private String artist;
//    private int year;
//    private String country;
//    Song() {
//        this("title","artist",0000,"country");
//    }
//    Song(String title, String artist, int year, String country) {
//        this.title = title;
//        this.artist = artist;
//        this.year = year;
//        this.country = country;
//    }
//    public void show() {
//        System.out.println(year+"년 "+country+"국적의 "+artist+"가 부른 "+title);
//    }
//}
//
//public class java_study4_3 {
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        Song song = new Song("Dancing Queen","ABBA",1978,"스웨덴");
//        song.show();
//    }
//
//}
//
//
//[4장 4번]
//
//
//
//        다음 멤버를 가지고 직사각형을 표현하는 Rectangle 클래스를 작성하라.
//
//        - int 타입의 x, y, width, height 필드: 사각형을 구성하는 점과 크기 정보
//        - x, y, width, height 값을 매개변수로 받아 필드를 초기화하는 생성자
//        - int square() : 사각형 넓이 리턴
//        - void show() : 사각형의 좌표와 넓이를 화면에 출력
//        - boolean contatins(Rectangle r) : 매개변수로 받은 r이 현 사각형 안에 있으면 true 리턴
//        - main() 메소드의 코드와 실행 결과는 다음과 같다
//public static void main(String[] args) {
//        Rectangle r = new Rectangle(2, 2, 8, 7);
//        Rectangle s = new Rectangle(5, 5, 6, 6);
//        Rectangle t = new Rectangle(1, 1, 10, 10);
//
//        r.show();
//        System.out.println("s의 면적은 "+s.square());
//        if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
//        if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
//        }
//        (2,2)에서 크기가 8x7인 사각형
//        s의 면적은 36
//        t는 r을 포함합니다.
//
//
//        [풀이]
//
//        package java_study4_4;
//
//class Rectangle {
//    private int x;
//    private int y;
//    private int width;
//    private int height;
//
//    Rectangle(int x, int y, int width, int height) {
//        this.x = x;
//        this.y = y;
//        this.width = width;
//        this.height = height;
//    }
//    public void show() {
//        System.out.println("("+x+","+y+")에서 크기가 "+width+"x"+height+"인 사각형");
//    }
//    public int square() {
//        return (width*height);
//    }
//    boolean contains(Rectangle r) {
//        if(x < r.x && y < r.y)
//            if((width+x) > (r.x+r.width) && (height+y) > (r.y+r.height))
//                return true;
//        return false;
//    }
//}
//
//public class java_study4_4 {
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        Rectangle r = new Rectangle(2, 2, 8, 7);
//        Rectangle s = new Rectangle(5, 5, 6, 6);
//        Rectangle t = new Rectangle(1, 1, 10, 10);
//
//        r.show();
//        System.out.println("s의 면적은 "+s.square());
//        if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
//        if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
//    }
//
//}
//
//
//[4장 5번]
//
//
//
//        다음 설명대로 Circle 클래스와 CircleManager 클래스를 완성하라.
//
//        import java.util.Scanner;
//
//class Circle {
//    private double x, y;
//    private int radius;
//    public Circle(double x, double y, int radius) {
//        _______________________________; //x, y, radius 초기화
//    }
//    public void show() {
//        _______________________________
//    }
//}
//
//public class CircleManager {
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        Scanner sc = ___________________;
//        Circle c[] = ______________; // 3개의 Circle 배열 선언
//        for(int i=0; i < _______; i ++) {
//            System.out.print("x, y, radius >>");
//            ______________________; // x값 읽기.
//            ______________________; // y값 읽기.
//            _______________________; // radius값 읽기.
//            c[i] = ____________________; // Circle 객체 생성
//        }
//        for(int i=0; i<c.length; i++)
//            ______________; // 모든 Circle 객체 출력
//        sc.close();
//    }
//
//}
//
//    다음 실행 결과와 같이 3개의 Circle 객체 배열을 만들고 x, y, radius 값을 읽어 3개의 Circle 객체를 만들고 show()를 이용하여 이들을 모두 출력한다.
//
//        x, y, radius >>3.0 3.0 5
//        x, y, radius >>2.5 2.7 6
//        x, y, radius >>5.0 2.0 4
//        (3.0,3.0)5
//        (2.5,2.7)6
//        (5.0,2.0)4
//
//
//        [풀이]
//
//        package java_study4_5;
//
//        import java.util.Scanner;
//
//class Circle {
//    private double x, y;
//    private int radius;
//    public Circle(double x, double y, int radius) {
//        this.x = x; //x, y, radius 초기화
//        this.y =y;
//        this.radius = radius;
//    }
//    public void show() {
//        System.out.println("(" + x + "," + y + ")"+ radius);
//    }
//}
//
//public class CircleManager {
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        Scanner sc = new Scanner(System.in);
//        Circle c[] = new Circle[3]; // 3개의 Circle 배열 선언
//        for(int i=0; i < c.length; i ++) {
//            System.out.print("x, y, radius >>");
//            double x = sc.nextDouble(); // x값 읽기.
//            double y = sc.nextDouble(); // y값 읽기.
//            int radius = sc.nextInt(); // radius값 읽기.
//            c[i] = new Circle(x, y, radius); // Circle 객체 생성
//        }
//        for(int i=0; i<c.length; i++)
//            c[i].show();
//        sc.close();
//    }
//
//}
//
//
//[4장 6번]
//
//
//
//        앞의 5번 문제는 정답이 공개되어 있다. 이 정답을 참고하여 Circle 클래스와 CircleManager 클래스를 수정하여 다음 실행 결과처럼 되게 하라.
//
//        x, y, radius >>3.0 3.0 5
//        x, y, radius >>2.5 2.7 6
//        x, y, radius >>5.0 2.0 4
//        가장 면적인 큰 원은 (2.5,2.7)6
//
//
//        [풀이]
//
//        package java_study4_6;
//
//        import java.util.Scanner;
//
//class Circle {
//    private double x, y;
//    private int radius;
//    public Circle(double x, double y, int radius) {
//        this.x = x; //x, y, radius 초기화
//        this.y =y;
//        this.radius = radius;
//    }
//    public void show() {
//        System.out.println("(" + x + "," + y + ")"+ radius);
//    }
//    public int getRadius() {
//        return radius;
//    }
//}
//
//public class CircleManager {
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        Scanner sc = new Scanner(System.in);
//        Circle c[] = new Circle[3]; // 3개의 Circle 배열 선언
//        int max=0;
//        for(int i=0; i < c.length; i ++) {
//            System.out.print("x, y, radius >>");
//            double x = sc.nextDouble(); // x값 읽기.
//            double y = sc.nextDouble(); // y값 읽기.
//            int radius = sc.nextInt(); // radius값 읽기.
//            c[i] = new Circle(x, y, radius); // Circle 객체 생성
//        }
//        for(int i=0; i<c.length; i++)
//            if(max < c[i].getRadius())
//                max = c[i].getRadius();
//        for(int i=0; i<c.length; i++)
//            if(max == c[i].getRadius()) {
//                System.out.print("가장 면적인 큰 원은 ");
//                c[i].show();
//            }
//        sc.close();
//    }
//
//}
//
//
//[4장 7번]
//
//
//
//        하루의 할 일을 표현하는 클래스 Day는 다음과 같다. 한 달의 할 일을 표현하는 MonthSchedule 클래스를 작성하라.
//
//class Day {
//    private String work; //하루의 할 일을 나타내는 문자열
//    public void set(String work) { this.work = work; }
//    public String get() { return work; }
//    public void show() {
//        if(work == null) System.out.println("없습니다.");
//        else System.out.println(work+"입니다.");
//    }
//}
//    MonthSchedule 클래스에는 Day 객체 배열과 적절한 필드, 메소드를 작성하고 실행 예시처럼 입력, 보기, 끝내기 등의 3개의 기능을 작성하라.
//
//        이번달 스케쥴 관리 프로그램.
//        할일(입력:1, 보기:2, 끝내기:3) >>1
//        날짜(1~30)?1
//        할일(빈칸없이입력)?자바공부
//
//        할일(입력:1, 보기:2, 끝내기:3) >>2
//        날짜(1~30)?1
//        1일의 할 일은 자바공부입니다.
//
//        할일(입력:1, 보기:2, 끝내기:3) >>3
//        프로그램을 종료합니다.
//        [Hint] MonthSchedule에는 생성자, input(), view(), finish(), run() 메소드를 만들고 main()에서 다음과 같이 호출하여 실행하고 run()에서 메뉴를 출력하고 처리한다.
//
//        MonthSchedule april = new MonthSchedule(30); // 4월달의 할 일
//        april.run();
//
//
//        [풀이]
//
//        package java_study4_7;
//
//        import java.util.Scanner;
//
//class Day {
//    private String work; // 하루의 할 일을 나타내는 문자열
//    public void set(String work) { this.work = work; }
//    public String get() { return work; }
//    public void show() {
//        if(work == null) System.out.println("없습니다.");
//        else System.out.println(work + "입니다.");
//    }
//}
//
//public class MonthSchedule {
//    private Scanner sc;
//    private Day days[];
//
//    MonthSchedule(int day) {
//        this.days = new Day[day];
//        for(int i=0; i<days.length; i++) {
//            days[i] = new Day();
//        }
//        sc = new Scanner(System.in);
//    }
//    private void input() {
//        System.out.print("날짜(1~30)?");
//        int day = sc.nextInt();
//        System.out.print("할일(빈칸없이입력)?");
//        String work = sc.next();
//        day--;
//        if(day < 0 || day > 30) { // 0~29
//            System.out.println("날짜를 잘못 입력하였습니다.");
//            return;
//        }
//        days[day].set(work);
//    }
//    private void view() {
//        System.out.print("날짜(1~30)?");
//        int day = sc.nextInt();
//        day--;
//        if(day < 0 || day > 30) { // 0~29
//            System.out.println("날짜를 잘못 입력하였습니다.");
//            return;
//        }
//        System.out.print((day+1)+"일의 할 일은 ");
//        days[day].show();
//    }
//    private void finish() {
//        System.out.println("프로그램을 종료합니다.");
//        sc.close();
//    }
//    public void run() {
//        System.out.print("이번달 스케쥴 관리 프로그램.");
//        while(true) {
//            System.out.println();
//            System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
//            int select = sc.nextInt();
//            switch(select) {
//                case 1: input(); break;
//                case 2: view(); break;
//                case 3: finish(); return;
//            }
//        }
//    }
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        MonthSchedule april = new MonthSchedule(30); // 4월달의 할 일
//        april.run();
//    }
//
//}
//
//
//[4장 8번]
//
//
//
//        이름(name), 전화번호(tel) 필드와 생성자 등을 가진 Phone 클래스를 작성하고, 실행 예시와 같이 작동하는 PhonBook 클래스를 작성하라.
//
//        인원수 >> 3
//        이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>황기태 777-7777
//        이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>나명품 999-9999
//        이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>최자바 333-1234
//        저장되었습니다...
//        검색할 이름 >>황기순
//        황기순이 없습니다.
//        검색할 이름 >>최자바
//        최자바의 번호는 333-1234 입니다.
//        검색할 이름 >>그만
//        [Hint] PhoneBook 클래스에서 저장할 사람의 수를 입력받고, Phone 개게 배열을 생성한다. 한 사람의 정보는 하나의 Phone 객체에 저장한다. 7번 정답을 참고하기 바란다. 문자열 a와 b가 같은지 비교할 때 a.equals(b)가 참인지로 판단한다.
//
//
//
//        [풀이]
//
//        package java_study4_8;
//
//        import java.util.Scanner;
//
//class Phone {
//    private String name;
//    private String tel;
//    Phone(String name, String tel) {
//        this.name = name;
//        this.tel = tel;
//    }
//    public String getName() {
//        return name;
//    }
//    public String getTel() {
//        return tel;
//    }
//}
//
//public class PhoneBook {
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        Scanner sc = new Scanner(System.in);
//        Phone phone[];
//        int i;
//        System.out.print("인원수 >> ");
//        int num = sc.nextInt();
//        phone = new Phone[num];
//        for(i=0; i<phone.length; i++) {
//            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
//            String name = sc.next();
//            String tel = sc.next();
//            phone[i] = new Phone(name, tel);
//        }
//        System.out.println("저장되었습니다...");
//        while(true) {
//            System.out.print("검색할 이름 >>");
//            String name = sc.next();
//            for(i=0; i<num; i++) {
//                if(name.equals(phone[i].getName())) {
//                    System.out.println(name+"의 번호는 "+phone[i].getTel()+" 입니다.");
//                    i--;
//                    break;
//                }
//            }
//            if(name.equals("그만")) break;
//            if (i == num) System.out.println(name+"이 없습니다.");
//        }
//
//        sc.close();
//    }
//
//}
//
//
//[4장 9번]
//
//
//
//        다음 2개의 static 가진 ArrayUtil 클래스를 만들어보자. 다음 코드의 실행 결과를 참고하여 concat()와 print()를 작성하여 ArrayUtil 클래스를 완성하라.
//
//class ArrayUtil {
//    public static int[] concat(int[] a, int[] b) {
//        /* 배열 a와 b를 연결한 새로운 배열 리턴 */
//    }
//    public static void print(int[] a) {
//        /* 배열 a 출력 */
//    }
//}
//
//public class StaticEx {
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        int[] array1 = {1, 5, 7, 9};
//        int[] array2 = {3, 6, -1, 100, 77};
//        int[] array3 = ArrayUtil.concat(array1, array2);
//        ArrayUtil.print(array3);
//    }
//
//}
//
//[ 1  5  7  9  3  6  -1  100  77 ]
//
//
//        [풀이]
//
//        package java_study4_9;
//
//class ArrayUtil {
//    public static int[] concat(int[] a, int[] b) {
//        int tmp[] = new int[a.length+b.length];
//        int i=0;
//        for(; i<a.length; i++) {
//            tmp[i] = a[i];
//        }
//        for(;i<a.length+b.length;i++) {
//            tmp[i] = b[i-a.length];
//        }
//        return tmp;
//
//    }
//    public static void print(int[] a) {
//        System.out.print("[");
//        for(int i=0; i<a.length;i++) {
//            System.out.print(" "+a[i]+" ");
//        }
//        System.out.print("]");
//    }
//}
//
//public class StaticEx {
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        int[] array1 = {1, 5, 7, 9};
//        int[] array2 = {3, 6, -1, 100, 77};
//        int[] array3 = ArrayUtil.concat(array1, array2);
//        ArrayUtil.print(array3);
//    }
//
//}
//
//
//[4장 10번]
//
//
//
//        다음과 같은 Dictionary 클래스가 있다. 실행 결과와 같이 작동하도록 Dictionary 클래스의 kor2Eng() 메소드와 DicApp 클래스를 작성하라.
//
//class Dictionary {
//    private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
//    private static String[] eng = {"love", "baby", "money", "future","hope"};
//    public static String kor2Eng(String word) { /*검색 코드 작성*/ }
//}
//    한영 단어 검색 프로그램입니다.
//        한글 단어?희망
//        희망은 hope
//        한글 단어?아가
//        아가는 저의 사전에 없습니다.
//        한글 단어?아기
//        아기는 baby
//        한글 단어?그만
//
//
//        [풀이]
//
//        package java_study4_10;
//
//        import java.util.Scanner;
//
//class Dictionary {
//    private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
//    private static String[] eng = {"love", "baby", "money", "future","hope"};
//    public static String kor2Eng(String word) { /*검색 코드 작성*/
//        for(int i=0; i<kor.length;i++) {
//            if(word.equals(kor[i])) {
//                if(i%2==0)
//                    System.out.print(word+"은 ");
//                else
//                    System.out.print(word+"는 ");
//                return eng[i];
//            }
//        }
//        return "false";
//    }
//}
//
//public class DicApp {
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        Scanner sc = new Scanner(System.in);
//        System.out.println("한영 단어 검색 프로그램입니다.");
//        while(true) {
//            System.out.print("한글 단어?");
//            String search = sc.next();
//            if(search.equals("그만")) break;
//            String eng = Dictionary.kor2Eng(search);
//            if(eng.equals("false"))
//                System.out.println(search+"는 저의 사전에 없습니다.");
//            else
//                System.out.println(eng);
//        }
//        sc.close();
//    }
//
//}
//
//
//[4장 11번]
//
//
//
//        다수의 클래스를 만들고 활용하는 연습을 해보자. 더하기(+), 빼기(-),  곱하기(*), 나누기(/)를 수행하는 각 클래스 Add, Sub, Mul, Div를 만들어라. 이들은 모두 다음 필드와 메소드를 가진다.
//
//        - int 타입의 a, b 필드: 2개의 피연산자
//        - void setValue(itn a, int b): 피연사 값을 객체 내에 저장한다.
//        - int calculate(): 클래스의 목적에 맞는 연산을 실행하고 결과를 리턴한다.
//        main() 메소드에서는 다음 실행 사례와 같이 두 정수와 연산자를 입력받고 Add, Sub, Mul, Div 중에서 이 연산을 실행할 수 있는 객체를 생성하고 setValue()와 calculate()를 호출하여 결과를 출력하도록 작성하라. (참고: 이 문제는 상속을 이용하여 다시 작성하도록 5장의 실습문제로 이어진다.)
//
//        두 정수와 연산자를 입력하시오 >> 5 7 *
//        35
//
//
//        [풀이]
//
//        package java_study4_11;
//
//        import java.util.Scanner;
//
//class Add {
//    private int a;
//    private int b;
//    public void setValue(int a, int b) {
//        this.a = a;
//        this.b = b;
//    }
//    public int calculate() {
//        return a+b;
//    }
//}
//class Sub {
//    private int a;
//    private int b;
//    public void setValue(int a, int b) {
//        this.a = a;
//        this.b = b;
//    }
//    public int calculate() {
//        return a-b;
//    }
//}
//class Mul {
//    private int a;
//    private int b;
//    public void setValue(int a, int b) {
//        this.a = a;
//        this.b = b;
//    }
//    public int calculate() {
//        return a*b;
//    }
//}
//class Div {
//    private int a;
//    private int b;
//    public void setValue(int a, int b) {
//        this.a = a;
//        this.b = b;
//    }
//    public int calculate() {
//        return a/b;
//    }
//}
//
//public class java_study4_11 {
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        Scanner sc = new Scanner(System.in);
//        int result=0;
//        System.out.print("두 정수와 연산자를 입력하시오 >> ");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        char c = sc.next().charAt(0);
//        switch(c) {
//            case '+' :
//                Add add = new Add();
//                add.setValue(a, b);
//                result = add.calculate();
//                break;
//            case '-' :
//                Sub sub = new Sub();
//                sub.setValue(a, b);
//                result = sub.calculate();
//                break;
//            case '*' :
//                Mul mul = new Mul();
//                mul.setValue(a, b);
//                result = mul.calculate();
//                break;
//            case '/' :
//                Div div = new Div();
//                div.setValue(a, b);
//                result = div.calculate();
//                break;
//        }
//        System.out.println(result);
//        sc.close();
//    }
//
//}
//
//
//[4장 12번]
//
//
//
//        간단한 콘서트 예약 시스템을 만들어보자. 다수의 클래스를 다루고 객체의 배열을 다루기에는 아직 자바 프로그램 개발이 익숙하지 않은 초보자에게 다소 무리가 있을 것이다. 그러나 반드시 넘어야 할 산이다. 이 도전을 통해 산을 넘어갈 수 있는 체력을 키워보자. 예약 시스템의 기능은 다음과 같다.
//
//        - 공연은 하루에 한 번 있다.
//        - 좌석은 S석, A석, B석으로 나뉘며, 각각 10개의 좌석이 있다.
//        - 예약 시스템의 메뉴는 "예약", "조회", "취소", "끝내기"가 있다.
//        - 예약은 한 자리만 가능하고, 좌석 타입, 예약자 이름, 좌석 번호를 순서대로 입력받아 예약한다.
//        - 조회는 모든 좌석을 출력한다.
//        - 취소는 예약자의 이름을 입력받아 취소한다.
//        - 없는 이름, 없는 번호, 없는 메뉴, 잘못된 취소 등에 대해서 오류 메시지를 출력하고 사용자가 다시 시도하도록 한다.
//        명품콘서트홀 예약 시스템입니다.
//        예약:1, 조회:2, 취소:3, 끝내기:4 >> 1
//        좌석구분 S(1), A(2), B(3)>>1
//        S>> ___  ___  ___  ___  ___  ___  ___  ___  ___  ___
//        이름>>황기태
//        번호>>1
//        예약:1, 조회:2, 취소:3, 끝내기:4 >> 1
//        좌석구분 S(1), A(2), B(3)>>2
//        A>> ___  ___  ___  ___  ___  ___  ___  ___  ___  ___
//        이름>>김효수
//        번호>>5
//        예약:1, 조회:2, 취소:3, 끝내기:4 >> 2
//        S>> 황기태  ___  ___  ___  ___  ___  ___  ___  ___  ___
//        A>> ___  ___  ___  ___  김효수  ___  ___  ___  ___  ___
//        B>> ___  ___  ___  ___  ___  ___  ___  ___  ___  ___
//        <<<조회를 완료하였습니다.>>>
//        예약:1, 조회:2, 취소:3, 끝내기:4 >> 3
//        좌석 S:1, A:2, B:3>>2
//        A>> ___  ___  ___  ___  김효수  ___  ___  ___  ___  ___
//        이름>>김효수
//        예약:1, 조회:2, 취소:3, 끝내기:4 >> 2
//        S>> 황기태  ___  ___  ___  ___  ___  ___  ___  ___  ___
//        A>> ___  ___  ___  ___  ___  ___  ___  ___  ___  ___
//        B>> ___  ___  ___  ___  ___  ___  ___  ___  ___  ___
//        <<<조회를 완료하였습니다.>>>
//        예약:1, 조회:2, 취소:3, 끝내기:4 >> 4
//
//
//        [풀이]
//
//        package java_study4_12;
//
//        import java.util.Scanner;
//
//class Concert{
//    private String S[];
//    private String A[];
//    private String B[];
//    private Scanner sc;
//    Concert() {
//        sc = new Scanner(System.in);
//        S = new String[10];
//        A = new String[10];
//        B = new String[10];
//        for(int i=0; i<S.length; i++) {
//            S[i] = "___";
//            A[i] = "___";
//            B[i] = "___";
//        }
//    }
//    public static void printSeat(String seat[]) { //좌석 한줄 출력 메소드
//        for(int i=0; i<seat.length; i++) {
//            System.out.print(" "+seat[i]+" " );
//        }
//        System.out.println();
//    }
//    public void allPrint() { //모든 좌석 출력 메소드
//        System.out.print("S>>");
//        Concert.printSeat(S);
//        System.out.print("A>>");
//        Concert.printSeat(A);
//        System.out.print("B>>");
//        Concert.printSeat(B);
//        System.out.println("<<<조회를 완료하였습니다.>>>");
//    }
//    public void choiceSeat() { //좌석 선택(S, A, B) 메소드
//        while(true) {
//            System.out.print("좌석구분 S(1), A(2), B(3)>>");
//            int select = sc.nextInt();
//            switch(select) {
//                case 1:
//                    System.out.print("S>>");
//                    printSeat(S);
//                    inputSeat(S);
//                    return;
//                case 2:
//                    System.out.print("A>>");
//                    printSeat(A);
//                    inputSeat(A);
//                    return;
//                case 3:
//                    System.out.print("B>>");
//                    printSeat(B);
//                    inputSeat(B);
//                    return;
//                default:
//                    System.out.println("다시 입력해 주세요.");
//            }
//        }
//    }
//    public void inputSeat(String seat[]) { //좌석에 이름값 넣는 메소드
//        System.out.print("이름>>");
//        String name = sc.next();
//        while(true) {
//            System.out.print("번호>>");
//            int num = sc.nextInt();
//            num--;
//            if(seat[num].equals("___")) {
//                seat[num] = name;
//                break;
//            }
//            else {
//                System.out.println("다른 좌석을 선택해 주세요.");
//            }
//        }
//    }
//    public void d_choiceSeat() {
//        while(true) {
//            System.out.print("좌석 S:1, A:2, B:3>>");
//            int select = sc.nextInt();
//            switch(select) {
//                case 1:
//                    System.out.print("S>>");
//                    printSeat(S);
//                    delete(S);
//                    return;
//                case 2:
//                    System.out.print("A>>");
//                    printSeat(A);
//                    delete(A);
//                    return;
//                case 3:
//                    System.out.print("B>>");
//                    printSeat(B);
//                    delete(B);
//                    return;
//                default:
//                    System.out.println("다시 입력해 주세요.");
//            }
//        }
//    }
//    public void delete(String seat[]) {
//        System.out.print("이름>>");
//        String name = sc.next();
//        for(int i=0; i<seat.length; i++) {
//            if(name.equals(seat[i])) {
//                seat[i] = "___";
//                break;
//            }
//        }
//    }
//}
//public class java_study4_12 {
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        Scanner sc = new Scanner(System.in);
//        System.out.println("명품콘서트홀 예약 시스템입니다.");
//        Concert concert = new Concert();
//        while(true) {
//            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >> ");
//            int select = sc.nextInt();
//            switch(select) {
//                case 1:
//                    concert.choiceSeat();
//                    break;
//                case 2:
//                    concert.allPrint();
//                    break;
//                case 3:
//                    concert.d_choiceSeat();
//                    break;
//                case 4:
//                    sc.close();
//                    return;
//                default :
//                    System.out.println("다시 입력해 주세요.");
//            }
//        }
//    }
//
//}