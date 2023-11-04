package com.example.prac.chap3.ex;

public class chap2prac {
}
//[2장 1번]
//
//
//
//        Scanner 클래스를 이용하여 원화를 입력받아 달러로 바꾸어 다음 예시와 같이 출력하는 프로그램을 작성하라. $1=1100원으로 가정하고 계산하라.
//
//        원화를 입력하세요(단위 원)>>3300
//        3300원은 $3.0입니다.
//
//
//        [풀이]
//
//        package java_study2_1;
//
//        import java.util.Scanner;
//
//public class java_study2_1 {
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        Scanner sc = new Scanner(System.in);
//
//        int money;
//        double dollar;
//
//        System.out.print("원화를 입력하세요(단위 원)>>");
//        money = sc.nextInt();
//
//        dollar = (double)money / 1100;
//
//        System.out.print(money+"원은 $"+dollar+"입니다.");
//
//        sc.close();
//    }
//
//}
//
//
//[2장 2번]
//
//
//
//        Scanner 클래스를 이용하여 2자리의 정수(10~99사이)를 입력받고, 십의 자리와 1의 자리가 같은지 판별하여 출력하는 프로그램을 작성하라.
//
//        2자리 정수 입력(10~99)>>77
//        YES! 10의 자리와 1의 자리가 같습니다.
//
//
//        [풀이]
//
//        package java_study2_2;
//
//        import java.util.Scanner;
//
//public class java_study2_2 {
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        Scanner sc = new Scanner(System.in);
//
//        int num, a, b; // 십의자리 a, 일의자리 b
//
//        System.out.print("2자리 정수 입력(10~99)>>");
//        num = sc.nextInt();
//
//        a = num / 10;
//        b = num % 10;
//
//        if(a==b)
//            System.out.print("YES! 10의 자리와 1의 자리가 같습니다.");
//        else
//            System.out.print("NO! 10의 자리와 1의 자리가 다릅니다.");
//
//        sc.close();
//    }
//}
//
//
//
//[2장 3번]
//
//
//
//        Scanner 클래스를 이용하여 정수로 된 돈의 액수를 입력받아 오만 원권, 만 원권, 천 원권, 500짜리 동전, 100원짜리 동전, 50원짜리 동전, 10원짜리 동전, 1원짜리 동전 각 몇 개로 변환되는지 출력하라.
//
//        금액을 입력하시오>>65376
//        오만원권 1매
//        만원권 1매
//        천원권 5매
//        백원 3매
//        오십원 1매
//        십원 2매
//        일원 6매
//
//
//        [풀이]
//
//        package java_study2_3;
//
//        import java.util.Scanner;
//
//public class java_study2_3 {
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        Scanner sc = new Scanner(System.in);
//
//        int money, a, b, c, d, e, f, g;
//        //a = 5만원, b = 1만원, c = 1천원, d = 100원, e = 50원, f = 10원, g = 1원
//
//        System.out.print("금액을 입력하시오>>");
//        money = sc.nextInt();
//
//        a = money / 50000;
//        money = money - (a * 50000); //5만원 계산
//
//        b = money / 10000;
//        money = money - (b * 10000); //1만원 계산
//
//        c = money / 1000;
//        money = money - (c * 1000); //1천원 계산
//
//        d = money / 100;
//        money = money - (d * 100); //100원 계산
//
//        e = money / 50;
//        money = money - (e * 50); //50원 계산
//
//        f = money / 10;
//        money = money - (f * 10); //10원 계산
//
//        g = money; // 1원 계산
//
//        System.out.print("오만원권 "+a+"매");
//        System.out.print("만원권 "+b+"매");
//        System.out.print("천원권 "+c+"매");
//        System.out.print("백원 "+d+"매");
//        System.out.print("오십원 "+e+"매");
//        System.out.print("십원 "+f+"매");
//        System.out.print("일원 "+g+"매");
//
//        sc.close();
//    }
//
//}
//
//
//
//[2장 4번]
//
//
//
//        Scanner 클래스로 정수 3개를 입력받고 3개의 숫자 중 중간 크기의 수를 출력하라. 평균값을 구하는 것이 아님에 주의하라.
//
//        정수 3개 입력>>20 100 33
//        중간 값은 33
//
//
//        [풀이]
//
//        package java_study2_4;
//
//        import java.util.Scanner;
//
//public class java_study2_4 {
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        Scanner sc = new Scanner(System.in);
//
//        int a, b, c;
//
//        System.out.print("정수 3개 입력>>");
//        a = sc.nextInt();
//        b = sc.nextInt();
//        c = sc.nextInt();
//
//        if((a < b && b < c) || (c < b && b < a)) {
//            System.out.print("중간 값은 "+b);
//        }
//        else if ((b < a && a < c)  || (c < a && a < b)) {
//            System.out.print("중간 값은 "+a);
//        }
//        else {
//            System.out.print("중간 값은 "+c);
//        }
//
//        sc.close();
//    }
//
//}
//
//
//
//[2장 5번]
//
//
//
//        Scanner를 이용하여 삼각형의 변의 길이를 나타내는 정수를 3개 입력받고 이 3개의 수로 삼각형을 만들 수 있는지 판별하라. 삼각형이 되려면 두변의 합이 다른 한 변의 합보다 커야 한다.
//
//        정수 3개를 입력하시오>>4 3 5
//        삼각형이 됩니다.
//
//
//        [풀이]
//
//        package java_study2_5;
//        import java.util.Scanner;
//public class java_study2_5 {
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        Scanner sc = new Scanner(System.in);
//
//        int a, b, c;
//
//        System.out.print("정수 3개를 입력하시오>>");
//        a = sc.nextInt();
//        b = sc.nextInt();
//        c = sc.nextInt();
//
//
//
//        if((a + b < c) || (b + c < a ) || (a + c < b)) {
//            System.out.print("삼각형이 되지 않습니다.");
//        }
//        else {
//            System.out.print("삼각형이 됩니다.");
//        }
//
//        sc.close();
//    }
//}
//
//
//[2장 6번]
//
//
//
//        369게임을 간단히 작성해보자. 1~99까지의 정수를 입력받고 정수에 3, 6, 9 중 하나가 있는 경우는 "박수짝"을 출력하고 두 개 있는 경우는 "박수짝짝"을 출력하는 프로그램을 작성하라. 예를 들면, 키보드로 입력된 수가 13인 경우 "박수짝"을, 36인 경우 "박수짝짝"을 출력하면 된다.
//
//        1~99 사이의 정수를 입력하시오>>36
//        박수짝짝
//
//
//        [풀이]
//
//        package java_study2_6;
//        import java.util.Scanner;
//public class java_study2_6 {
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        Scanner sc = new Scanner(System.in);
//
//        int num, a = 1, b; //a는 10의 자리, b는 1의 자리
//
//        System.out.print("1~99 사이의 정수를 입력하시오>>");
//        num = sc.nextInt();
//
//        b = num % 10;
//
//        if(num>=10) //num이 10 이상일 경우 10의자리를 구한다.
//            a = num / 10;
//        if(num%10 == 0) {
//            b = -1;
//        }
//
//        System.out.print("박수");
//        if(a%3 == 0) //num이 10 이하일 경우 a%3=0이므로 a 초기값으로 1을 준다.
//            System.out.print("짝");
//        if(b%3 == 0)
//            System.out.print("짝");
//
//        sc.close();
//    }
//}
//
//
//[2장 7장]
//
//
//
//        2차원 평면에서 직사각형은 왼쪽 상단 모서리와 오른쪽 하단 모서리의 두 점으로 표현한다. (100, 100)과 (200, 200)의 두 점으로 이루어진 사각형이 있을 때, Scanner를 이용하여 정수 x와 y값을 입력받고 점 (x, y)가 이 직사각형 안에 있는지를 판별하는 프로그램을 작성하라.
//
//        점 (x, y)의 좌표를 입력하시오>>150 150
//        (150, 150)는 사각형 안에 있습니다.
//
//
//        [풀이]
//
//        package java_study2_7;
//
//        import java.util.Scanner;
//
//public class java_study2_7 {
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        Scanner sc = new Scanner(System.in);
//
//        int x, y;
//        System.out.print("점 (x, y)의 좌표를 입력하시오>>");
//        x = sc.nextInt();
//        y = sc.nextInt();
//
//        if((100 <= x && x <= 200) && (100 <= y && y <= 200)) {
//            System.out.print("("+x+", "+y+")는 사각형 안에 있습니다.");
//        }
//        else {
//            System.out.print("("+x+", "+y+")는 사각형 안에 없습니다.");
//        }
//
//        sc.close();
//    }
//
//}
//
//
//[2장 8번]
//
//
//
//        2차원 평면에서 직사각형은 문제 7번처럼 두 점으로 표현된다. 키보드로부터 직사각형을 구성하는 두 점 (x1, y1), (x2, y2)를 입력받아 (100, 100), (200, 200)의 두 점으로 이루어진 직사각형과 충돌하는지 판별하는 프로그램을 작성하라.
//
//        [Hint] 다음은 점 (x,y)가 (rectx1, recty1), (rectx2, recty2)의 사각형 안에 있으면 true를 리턴하는 메소드이다. 이 메소드를 활용하라.
//
//public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
//        if((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2))
//        return true;
//        else
//        return false;
//        }
//        (x1, y1) 의 값을 입력해 주세요 >>150 150
//        (x2, y2) 의 값을 입력해 주세요 >>300 300
//        두 사각형은 충돌합니다.
//
//
//        [풀이]
//
//        package java_study2_8;
//
//        import java.util.Scanner;
//
//public class java_study2_8 {
//
//    public static boolean inRect(int x, int y) {
//        if((x >= 100 && x <= 200) && (y >= 100 && y <= 200))
//            return true;
//        else
//            return false;
//    }
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        Scanner sc = new Scanner(System.in);
//
//        int x1, y1;
//        int x2, y2;
//        boolean a, b; //a는 (x1,y1)의 결과, b는 (x2,y2)의 결과
//
//        System.out.print("(x1, y1) 의 값을 입력해 주세요 >>");
//        x1 = sc.nextInt();
//        y1 = sc.nextInt();
//        System.out.print("(x2, y2) 의 값을 입력해 주세요 >>");
//        x2 = sc.nextInt();
//        y2 = sc.nextInt();
//
//        a = inRect(x1,y1);
//        b = inRect(x2,y2);
//
//        if(a == true || b == true) {
//            System.out.print("두 사각형은 충돌합니다.");
//        }
//        else {
//            System.out.print("두 사각형은 충돌하지 않습니다.");
//        }
//
//        sc.close();
//    }
//
//}
//
//
//[2장 9번]
//
//
//
//        원의 중심을 나타내는 한 점과 반지름을 실수 값으로 입력받아라. 그리고 실수 값으로 다른 점 (x, y)를 입력받아 이 점이 원의 내부에 있는지 판별하여 출력하라.
//
//        [HInt] 중심에서 점 (x, y) 사이의 거리가 반지름보다 작거나 같으면 원의 내부에 있다. 변수 x에 대한 제곱근의 값은 Math.sqrt(x)를 이용하면 된다. Math는 6장에서 설명한다.
//
//        원의 중심과 반지름 입력>>10 10 6.5
//        점 입력>>13 13
//        점 (13,13)는 원 안에 있다.
//
//
//        [풀이]
//
//        package java_study2_9;
//
//        import java.util.Scanner;
//
//public class java_study2_9 {
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        Scanner sc = new Scanner(System.in);
//
//        int x,y;
//        int r_x, r_y; // 원의 중심
//        double r, distance; //원의 반지름
//
//        System.out.print("원의 중심과 반지름 입력>>");
//        r_x = sc.nextInt();
//        r_y = sc.nextInt();
//        r = sc.nextDouble();
//        System.out.print("점 입력>>");
//        x = sc.nextInt();
//        y = sc.nextInt();
//
//        distance = Math.sqrt(((x-r_x)*(x-r_x))+((y-r_y)*(y-r_y)));
//        if(distance<r) {
//            System.out.print("점 ("+x+","+y+")는 원 안에 있다.");
//        }
//        else {
//            System.out.print("점 ("+x+","+y+")는 원 안에 없다.");
//        }
//
//        sc.close();
//    }
//
//}
//
//
//[2장 10번]
//
//
//
//        원의 정보를 받기 위해 키보드로부터 원의 중심을 나타내는 한 점과 반지름을 입력받는다. 두 개의 원을 입력받고 두 원이 서로 겹치는지 판단하여 출력하라.
//
//        첫번째 원의 중심과 반지름 입력>>10 10 3
//        두번째 원의 중심과 반지름 입력>>12 12 2
//        두 원은 서로 겹친다.
//
//
//        [풀이]
//
//        package java_study2_10;
//
//        import java.util.Scanner;
//
//public class java_study2_10 {
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        Scanner sc = new Scanner(System.in);
//
//        int x1, y1;
//        int x2, y2;
//        double r1, r2, distance;
//
//        System.out.print("첫번째 원의 중심과 반지름 입력>>");
//        x1 = sc.nextInt();
//        y1 = sc.nextInt();
//        r1 = sc.nextDouble();
//        System.out.print("두번째 원의 중심과 반지름 입력>>");
//        x2 = sc.nextInt();
//        y2 = sc.nextInt();
//        r2 = sc.nextDouble();
//
//        distance = Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));
//
//        if(distance <= r1+r2) {
//            System.out.print("두 원은 서로 겹친다.");
//        }
//        else {
//            System.out.print("두 원은 서로 겹치지 않는다.");
//        }
//
//        sc.close();
//    }
//
//}
//
//[2장 11번]
//
//
//
//        숫자를 입력받아 3~5는 "봄", 6~8은 "여름", 9~11은 "가을", 12,0,1의 경우 "겨울"을, 그 외 숫자를 입력한 경우 "잘못입력"을 출력하는 프로그램을 작성하라.
//
//        달을 입력하세요(1~12)>>9
//        가을
//        (1) if-else 문을 이용하여 프로그램을 작성하라.
//
//        (2) switch 문을 이용하여 프로그램을 작성하라.
//
//
//
//        [풀이]
//
//        package java_study2_11;
//
//        import java.util.Scanner;
//
//public class java_study2_11 {
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        Scanner sc = new Scanner(System.in);
//
//        int num;
//
//        System.out.print("달을 입력하세요(1~12)>>");
//        num = sc.nextInt();
//
//        //(1) if-else문 이용
//        if(3 <= num && num <= 5)
//            System.out.print("봄");
//        else if(6 <= num && num <= 8)
//            System.out.print("여름");
//        else if(9 <= num && num <= 11)
//            System.out.print("가을");
//        else if(num == 12 || num == 1 || num == 0)
//            System.out.print("겨울");
//        else
//            System.out.print("잘못입력");
//
//        //(2) switch문 이용
//        switch(num) {
//            case 0:
//            case 1:
//                System.out.print("겨울");
//                break;
//            case 3:
//            case 4:
//            case 5:
//                System.out.print("봄");
//                break;
//            case 6:
//            case 7:
//            case 8:
//                System.out.print("여름");
//                break;
//            case 9:
//            case 10:
//            case 11:
//                System.out.print("가을");
//                break;
//            case 12:
//                System.out.print("겨울");
//                break;
//            default:
//                System.out.print("잘못입력");
//        }
//
//        sc.close();
//    }
//
//}
//
//
//[2장 12번]
//
//
//
//        사칙 연산을 입력받아 계산하는 프로그램을 작성하고자 한다. 연산자는 +, -, *, /의 네 가지로 하고 피연산자는 모두 실수로 한다. 피연산자와 연산자는 실행 사례와 같이 빈 칸으로 분리하여 입력한다. 0으로 나누기 시 "0으로 나눌 수 없습니다."를 출력하고 종료한다.
//
//        [Hint] 연산자는 scanner.next()를 이용하여 문자열로 입력받으면 된다. 문자열 s가 "+"와 같은지 검사하려면 if(s.equals("+"))를 이용하며, true이면 s와 "+"가 같다.
//
//        연산>>2 + 4
//        2.0+4.0의 계산 결과는 6.0
//        (1) 연산 식을 구분할 때 if-else 문을 이용하여 프로그램을 작성하라.
//
//        (2) 연산 식을 구분할 때 switch 문을 이용하여 프로그램을 작성하라
//
//
//
//        [풀이]
//
//        package java_study2_12;
//
//        import java.util.Scanner;
//
//public class java_study2_12 {
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        Scanner sc = new Scanner(System.in);
//
//        double a, c, result;
//        String b; //연산자
//        System.out.print("연산>>");
//        a = sc.nextDouble();
//        b = sc.next();
//        c = sc.nextDouble();
//
//        //(1) if-else문 이용
//        if(b.equals("+")) {
//            result = a + c;
//            System.out.print(a+b+c+"의 계산 결과는 "+result);
//        }
//        else if(b.equals("-")) {
//            result = a - c;
//            System.out.print(a+b+c+"의 계산 결과는 "+result);
//        }
//        else if(b.equals("*")) {
//            result = a * c;
//            System.out.print(a+b+c+"의 계산 결과는 "+result);
//        }
//        else if(b.equals("/")) {
//            if(c==0) {
//                System.out.print("0으로 나눌 수 없습니다.");
//            }
//            else {
//                result = a / c;
//                System.out.print(a+b+c+"의 계산 결과는 "+result);
//            }
//        }
//
//        //(2) switch문 이용
//        switch(b) {
//            case "+" :
//                result = a+c;
//                System.out.print(a+b+c+"의 계산 결과는 "+result);
//                break;
//            case "-":
//                result = a-c;
//                System.out.print(a+b+c+"의 계산 결과는 "+result);
//                break;
//            case "*":
//                result = a*c;
//                System.out.print(a+b+c+"의 계산 결과는 "+result);
//                break;
//            case "/":
//                if(c==0) {
//                    System.out.print("0으로 나눌 수 없습니다.");
//                    break;
//                }
//                else {
//                    result = a / c;
//                    System.out.print(a+b+c+"의 계산 결과는 "+result);
//                    break;
//                }
//            default:
//                System.out.print("잘못 입력하였습니다.");
//        }
//
//        sc.close();
//    }
//}