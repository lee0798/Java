//package com.example.week1.week4.ex;
//
//public class chap3prac {
//}
//[3장 1번]
//
//
//
//        다음 프로그램에 대해 물음에 답하라?
//
//        int sum = 0, i = 0;
//        while (i < 100) {
//        sum = sum + i;
//        i += 2;
//        }
//        System.out.println(sum);
//        (1) 무엇을 계산하는 코드이며 실행 결과 출력되는 내용은?
//
//        - 0부터 100까지의 짝수를 더하는 코드이며 실행 결과는 2450이다.
//
//        (2) 위의 코드를 main() 메소드를 만들고 WhileTest 클래스로 완성하라.
//
//        package java_study3_1;
//
//public class WhileTest {
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        int sum = 0, i = 0;
//        while (i < 100) {
//            sum = sum + i;
//            i += 2;
//        }
//        System.out.println(sum);
//    }
//
//}
//(3) for 문을 이용하여 동일하게 실행되는 ForTest 클래스를 작성하라.
//
//        package java_study3_1;
//
//public class ForTest {
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        int sum = 0;
//        for(int i=0; i<100; i+=2) {
//            sum = sum + i;
//        }
//        System.out.println(sum);
//    }
//
//}
//(4) do-while 문을 이용하여 동일하게 실행되는 DoWhileTest 클래스를 작성하라.
//
//        package java_study3_1;
//
//public class DoWhileTest {
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        int sum = 0, i = 0;
//        do {
//            sum = sum + i;
//            i += 2;
//        }while(i < 100);
//        System.out.println(sum);
//    }
//
//}
//
//
//[3장 2번]
//
//
//
//        다음 2차원 배열 n을 출력하는 프로그램을 작성하라.
//
//        int n[][] = {{1}, {1, 2, 3}, {1}, {1, 2, 3, 4}, {1, 2}};
//
//        1
//        1 2 3
//        1
//        1 2 3 4
//        1 2
//
//
//        [풀이]
//
//        package java_study3_2;
//
//public class java_study3_2 {
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        int n[][] = {{1}, {1, 2, 3}, {1}, {1, 2, 3, 4}, {1, 2}};
//        for(int i=0; i<n.length; i++) {
//            for(int j=0; j<n[i].length; j++) {
//                System.out.print(n[i][j]+ " ");
//            }
//            System.out.println();
//        }
//    }
//
//}
//
//
//[3장 3번]
//
//
//
//        Scanner를 이용하여 정수를 입력받고 다음과 같이 *를 출력하는 프로그램을 작성하라. 다음은 5를 입력받았을 경우이다.
//
//        정수를 입력하시오 >> 5
//        *****
//        ****
//        ***
//        **
//        *
//
//
//        [풀이]
//
//        package java_study3_3;
//
//        import java.util.Scanner;
//
//public class java_study3_3 {
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        Scanner sc = new Scanner(System.in);
//        int num;
//
//        System.out.print("정수를 입력하시오 >> ");
//        num = sc.nextInt();
//
//        for(int i=0; i<num; i++) {
//            for(int j=0; j<num-i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        sc.close();
//    }
//
//}
//
//
//[3장 4번]
//
//
//
//        Scanner를 이용하여 소문자 알파벳을 하나 입력받고 다음과 같이 출력하는 프로그램을 작성하라. 다음은 e를 입력받았을 경우이다.
//
//        소문자 알파벳 하나를 입력하시오 >> e
//        abcde
//        abcd
//        abc
//        ab
//        a
//        [Hint] Scanner는 문자를 입력받는 기능이 없다. 그러므로 문자열을 입력받아야 한다. 다음 코드를 참고하라.
//
//        String s = scanner.next(); // 문자열 읽기
//        char c = s.charAt(0); // 문자열의 첫 번째 문자
//
//
//        [풀이]
//
//        package java_study3_4;
//
//        import java.util.Scanner;
//
//public class java_study3_4 {
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        Scanner sc = new Scanner(System.in);
//        String s;
//        char c;
//
//        System.out.print("소문자 알파벳 하나를 입력하시오 >> ");
//        s = sc.next(); //s 에 문자열 읽기
//        c = s.charAt(0); //s의 첫번쨰 문자를 c에 입력
//
//        for(int i = 0; i<=c-'a'; i++) {
//            for(char j = 'a'; j<= c-i; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//
//        sc.close();
//    }
//
//}
//
//
//[3장 5번]
//
//
//
//        양의 정수를 10개 입력받아 배열에 저장하고, 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력하는 프로그램을 작성하라.
//
//        양의 정수 10개를 입력하시오 >> 1 5 99 22 345 125 2346 55 32 85
//        3의 배수는 99 345 2346
//
//
//        [풀이]
//
//        package java_study3_5;
//
//        import java.util.Scanner;
//
//public class java_study3_5 {
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        Scanner sc = new Scanner(System.in);
//        int arr[] = new int[10];
//
//        System.out.print("양의 정수 10개를 입력하시오 >> ");
//        for(int i=0; i<arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        System.out.print("3의 배수는 ");
//        for(int i=0; i<arr.length; i++) {
//            if(arr[i] % 3 == 0) {
//                System.out.print(arr[i]+ " ");
//            }
//        }
//
//        sc.close();
//    }
//
//}
//
//
//[3장 6번]
//
//
//
//        배열과 반복문을 이용하여 프로그램을 작성해보자. 키보드에서 정수로 된 돈의 액수를 입력받아 오만 원권, 만 원권, 천 원권, 500원짜리 동전, 100원짜리 동전, 50원짜리 동전, 10원짜리 동전, 1원짜리 동전이 각 몇 개로 변환되는지 예시와 같이 출력하라. 이때 반드시 다음 배열을 이용하고 반복문으로 작성하라.
//
//        int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; // 환산할 돈의 종류
//
//        금액을 입력하시오 >> 65123
//        50000 원 짜리 : 1개
//        10000 원 짜리 : 1개
//        1000 원 짜리 : 5개
//        500 원 짜리 : 0개
//        100 원 짜리 : 1개
//        50 원 짜리 : 0개
//        10 원 짜리 : 2개
//        1 원 짜리 : 3개
//
//
//        [풀이]
//
//        package java_study3_6;
//
//        import java.util.Scanner;
//
//public class java_study3_6 {
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        Scanner sc = new Scanner(System.in);
//        int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; // 환산할 돈의 종류
//        int money;
//
//        System.out.print("금액을 입력하시오 >> ");
//        money = sc.nextInt();
//
//        for(int i=0; i<unit.length; i++) {
//            System.out.printf("%d 원 짜리 : %d개 \n",unit[i], money/unit[i]);
//            money = money - (money / unit[i])*unit[i];
//        }
//
//        sc.close();
//    }
//
//}
//
//
//[3장 7번]
//
//
//
//        정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하라. 그리고 배열에 든 숫자들과 평균을 출력하라.
//
//        랜덤한 정수들 : 3 6 3 6 1 3 8 9 6 9
//        평균은 5.4
//        [Hint] 1에서 10까지 범위의 정수를 랜덤하게 생성할 때는 다음 코드를 이용하라.
//
//        int i  = (int)(Math.random()*10+1);
//
//
//        [풀이]
//
//        package java_study3_8;
//
//        import java.util.Scanner;
//
//public class java_study3_8 {
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        Scanner sc = new Scanner(System.in);
//        int arr[];
//        int num;
//
//        System.out.print("정수 몇개? >> ");
//        num = sc.nextInt();
//
//        arr = new int[num];
//        for(int i=0; i<arr.length; i++) {
//            arr[i] = (int)(Math.random()*100+1);
//            for(int j=0; j<i; j++)
//                if(arr[i]==arr[j])
//                    i--;
//        }
//
//        for(int i=0; i<arr.length; i++) {
//            if(i%10 == 0 && i != 0) System.out.println();
//            System.out.print(arr[i] + " ");
//        }
//
//        sc.close();
//    }
//
//}
//
//
//[3장 8번]
//
//
//
//        정수를 몇 개 저장할지 키보드로부터 개수를 입력받아(100보다 작은 개수) 정수 배열을 생성하고, 이곳에 1에서 100까지 범위의 정수를 랜덤하게 삽입하라. 배열에는 같은 수가 없도록 하고 배열을 출력하라.
//
//        정수 몇개? >> 24
//        26 87 78 44 93 99 37 40 2 63
//        95 82 51 53 4 94 5 14 33 39
//        32 58 70 6
//
//
//        [풀이]
//
//        package java_study3_8;
//        import java.util.Scanner;
//public class java_study3_8 {
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        Scanner sc = new Scanner(System.in);
//        int arr[];
//        int num;
//
//        System.out.print("정수 몇개? >> ");
//        num = sc.nextInt();
//
//        arr = new int[num];
//        for(int i=0; i<arr.length; i++) {
//            int tmp = (int)(Math.random()*100+1);
//            int chk = 0;
//            for(int j=0; j<arr.length; j++) {
//                if(tmp == arr[j]) {
//                    chk=1;
//                    break;
//                }
//            }
//            if(chk == 1) {
//                i--;
//                continue;
//            }
//            arr[i] = tmp;
//        }
//
//        for(int i=0; i<arr.length; i++) {
//            if(i%10 == 0 && i != 0) System.out.println();
//            System.out.print(arr[i] + " ");
//        }
//        sc.close();
//    }
//}
//
//
//[3장 9번]
//
//
//
//        4 x 4의 2차원 배열을 만들고 이곳에 1에서 10까지 범위의 정수를 랜덤하게 생성하여 정수 16개를 배열에 저장하고, 2차원 배열을 화면에 출력하라.
//
//        8 6 1 1
//        7 3 6 9
//        4 5 3 7
//        9 6 3 1
//
//
//        [풀이]
//
//        package java_study3_9;
//
//public class java_study3_9 {
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        int arr[][] = new int[4][4];
//
//        for(int i=0; i<arr.length; i++) {
//            for(int j=0; j<arr[i].length;j++) {
//                arr[i][j] = (int)(Math.random()*10+1);
//            }
//        }
//
//        for(int i=0; i<arr.length; i++) {
//            for(int j=0; j<arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//
//}
//
//
//[3장 10번]
//
//
//
//        4 x 4의 2차원 배열을 만들고 이곳에 1에서 10까지 범위의 정수를 10개만 랜덤하게 생성하여 임의의 위치에 삽입하라. 동일한 정수가 있어도 상관없다. 나머지 6개의 숫자는 모두 0이다. 만들어진 2차원 배열을 화면에 출력하라.
//
//        7 1 9 0
//        0 0 0 1
//        4 4 4 0
//        7 4 5 0
//
//
//        [풀이]
//
//        package java_study3_10;
//
//public class java_study3_10 {
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        int arr[][] = new int[4][4];
//        int x, y, result=0;//result는 랜덤 생성 갯수
//
//        while(result < 10) {
//            x = (int)(Math.random()*4); //x에 0~4까지의 랜덤 수 넣기
//            y = (int)(Math.random()*4); //y에 0~4까지의 랜덤 수 넣기
//            if(arr[y][x]==0) { //arr[x][y]에 값이 없으면 랜덤 수 넣기
//                arr[y][x] = (int)(Math.random()*10+1);
//                result++;
//            }
//        }
//
//        for(int i=0; i<arr.length; i++) {
//            for(int j=0; j<arr[i].length; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
//
//}
//
//
//[3장 11번]
//
//
//
//        다음과 같이 작동하는 Average.java를 작성하라. 명령행 인자는 모두 정수만 사용되며 정수들의 평균을 출력한다. 다음 화면은 컴파일된 Average.class 파일을 c:\Temp 디렉터리에 복사한 뒤 실행한 경우이다. 원본 Average.class 파일은 이클립스의 프로젝트 폴더 밑에 bin 폴더에 있다.
//
//
//
//        [풀이]
//
//        package java_study3_11;
//
//public class Average {
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        int sum = 0;
//
//        for(int i=0; i<args.length; i++) {
//            sum += Integer.parseInt(args[i]);
//        }
//
//        System.out.printf("%d",sum/args.length);
//    }
//
//}
//
//
//[3장 12번]
//
//
//
//        다음과 같이 작동하는 Add.java를 작성하라. 명령행 인자 중에서 정수 만을 골라 합을 구하라. 다음 화면은 Add.class 파일을 c:\Temp 디렉터리에 복사한 뒤 실행한 경우이다. 원본 Add.class 파일은 이클립스 프로젝트 폴더 밑에 bin 폴더에 있다.
//
//
//
//        [풀이]
//
//        package java_study3_12;
//
//public class Add {
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        int sum=0;
//        for(int i=0; i<args.length; i++) {
//            try {
//                sum += Integer.parseInt(args[i]);
//            }catch(NumberFormatException e) {
//                continue;
//            }
//        }
//        System.out.println(sum);
//    }
//
//}
//
//
//[3장 13번]
//
//
//
//        반복문을 이용하여 369게임에서 박수를 쳐야 하는 경우를 순서대로 화면에 출력해보자. 1부터 시작하며 99까지만 한다. 실행 사례는 다음과 같다.
//
//        3박수 짝
//        6박수 짝
//        9박수 짝
//        13박수 짝
//        16박수 짝
//        19박수 짝
//        23박수 짝
//        26박수 짝
//        29박수 짝
//        30박수 짝
//        31박수 짝
//        32박수 짝
//        33박수 짝짝
//        34박수 짝
//        35박수 짝
//        36박수 짝짝
//        37박수 짝
//        ...............
//
//
//        [풀이]
//
//        package java_study3_13;
//
//public class java_study3_13 {
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        int a, b; //a = 10의자리, b = 1의자리
//
//        for (int i=1; i<100; i++) {
//            a = i/10;
//            b = i%10;
//            if((a == 3 || a == 6 || a == 9) && (b ==3 || b == 6 || b == 9) ) {
//                System.out.println(i + "박수 짝짝");
//            }
//            else if((a == 3 || a == 6 || a == 9) && (b !=3 || b != 6 || b != 9)) {
//                System.out.println(i + "박수 짝");
//            }
//            else if((a != 3 || a != 6 || a != 9) && (b ==3 || b == 6 || b == 9)) {
//                System.out.println(i + "박수 짝");
//            }
//        }
//    }
//
//}
//
//
//[3장 14번]
//
//
//
//        다음 코드와 같이 과목과 점수가 짝을 이루도록 2개의 배열을 작성하라.
//
//        String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
//        int score[]  = {95, 88, 76, 62, 55};
//        그리고 다음 예시와 같이 과목 이름을 입력받아 점수를 출력하는 프로그램을 작성하라. "그만"을 입력받으면 종료한다. (Java는 인덱스 0에 있으므로 score[0]을 출력)
//
//        과목 이름 >> Jaba
//        없는 과목입니다.
//        과목 이름 >> Java
//        Java의 점수는 95
//        과목 이름 >> 안드로이드
//        안드로이드의 점수는 55
//        과목 이름 >> 그만
//        [Hint] 문자열을 비교하기 위해서는 String 클래스의 equals()메소드를 이용해야 한다.
//
//        String name;
//        if(course[i].equals(name)) {
//        int n = score[i];
//        ...
//        }
//
//
//        [풀이]
//
//        package java_study3_14;
//
//        import java.util.Scanner;
//
//public class java_study3_14 {
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        Scanner sc = new Scanner(System.in);
//        String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
//        int score[]  = {95, 88, 76, 62, 55};
//        String name="";
//        int i =0;
//
//        while(true) {
//            System.out.print("과목 이름 >> ");
//            name = sc.next();
//            if(name.equals("그만")) break;
//            for(i=0;i<course.length; i++) {
//                if(course[i].equals(name)) {
//                    System.out.println(course[i]+"의 점수는 "+score[i]);
//                    break;
//                }
//            }
//            if(i == course.length) {
//                System.out.println("없는 과목입니다.");
//            }
//        }
//
//        sc.close();
//    }
//
//}
//
//
//[3장 15번]
//
//
//
//        다음은 2개의 정수를 입력 받아 곱을 구하는 Muliply 클래스이다.
//
//        import java.util.Scanner;
//public class Multiply {
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("곱하고자 하는 두 수 입력 >> ");
//        int n = scanner.nextInt();
//        int m = scanner.nextInt();
//        System.out.print(n+"x",+m+"="+n*m);
//        scanner.close();
//    }
//}
//    다음과 같이 실행할 때 프로그램은 10과 5를 곱해 50을 잘 출력한다.
//
//        곱하고자 하는 두 수 입력 >> 10 5
//        10x5=50
//        하지만, 다음과 같이 실수를 입력하였을 때, 예외가 발생한다.
//
//        곱하고자 하는 두 수 입력 >> 2.5 4
//        Exception in thread "main" java.util.InputMismatchException
//        at java.util.Scanner.throwFor(Unknown Source)
//        at java.util.Scanner.next(Unknown Source)
//        at java.util.Scanner.nextInt(Unknown Source)
//        at java.util.Scanner.nextInt(Unknown Source)
//        at java_study3_15.Multiply.main(Multiply.java:11)
//        다음과 같이 실수가 입력되면 정수를 다시 입력하도록 하여 예외 없이 정상적으로 처리되도록 예외 처리 코드를 삽입하여 Multiply 클래스를 수정하라.
//
//        곱하고자 하는 두 수 입력 >> 2.5 4
//        실수는 입력하면 안됩니다.
//        곱하고자 하는 두 수 입력 >> 4 3.5
//        실수는 입력하면 안됩니다.
//        곱하고자 하는 두 수 입력 >> 4 3
//        4x3=12
//        [Hint] InputMismatchException 예외를 처리할 try-catch 코드를 작성하고, catch 블록에서 Scanner에 이미 입력된 키를 모두 제거하기 위해 Scanner의 nextLine()을 호출하라.
//
//
//
//        [풀이]
//
//        package java_study3_15;
//
//        import java.util.Scanner;
//        import java.util.InputMismatchException;
//
//public class Multiply {
//
//    public static void main(String[] args){
//        // TODO Auto-generated method stub
//        Scanner scanner = new Scanner(System.in);
//        while(true) {
//            System.out.print("곱하고자 하는 두 수 입력 >> ");
//            try {
//                int n = scanner.nextInt();
//                int m = scanner.nextInt();
//                System.out.print(n + "x" + m + "=" + n*m);
//                break;
//            }catch(InputMismatchException e) {
//                System.out.println("실수는 입력하면 안됩니다.");
//                scanner.nextLine();
//            }
//        }
//        scanner.close();
//    }
//
//}
//
//
//[3장 16번]
//
//
//
//        컴퓨터와 독자 사이의 가위 바위 보 게임을 만들어보자. 예시는 다음 그림과 같다. 독자부터 먼저 시작한다. 독자가 가위 바위 보 중 하나를 입력하고 <Enter>키를 치면, 프로그램은 가위 바위 보 중에서 랜덤하게 하나를 선택하고 컴퓨터가 낸 것으로 한다. 독자가 입력한 값과 랜덤하게 선택한 값을 비교하여 누가 이겼는지 판단한다. 독자가 가위 바위 보 대신 "그만"을 입력하면 게임을 끝난다.
//
//        컴퓨터와 가위 바위 보 게임을 합니다.
//        가위 바위 보! >> 바위
//        사용자 = 바위 , 컴퓨터 = 가위 사용자가 이겼습니다.
//        가위 바위 보! >> 가위
//        사용자 = 가위 , 컴퓨터 = 가위 비겼습니다.
//        가위 바위 보! >> 그만
//        게임을 종료합니다...
//        [Hint]
//
//        다음과 같은 문자열 배열을 만든다.
//        String str[] = {"가위", "바위", "보"};
//        컴퓨터가 내는 것을 랜덤하게 선택하기 위해서는 다음 코드를 이용한다.
//        int n = (int)(Math.random()*3); // n은 0, 1, 2 중에서 랜덤하게 결정
//        컴퓨터가 낸 것이 "바위" 인지 비교하는 코드는 다음과 같이 한다.
//        if(str[n].equals("바위")) //컴퓨터가 낸 것이 "바위"인지 비교하는 문
//
//
//        [풀이]
//
//        package java_study3_16;
//
//        import java.util.Scanner;
//
//public class java_study3_16 {
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        Scanner sc = new Scanner(System.in);
//        String str[] = {"가위", "바위", "보"};
//        String UserSelect, ComSelect;
//        int n; //컴퓨터가 내는 것
//        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
//        do {
//            System.out.print("가위 바위 보! >> ");
//            UserSelect = sc.next();
//            if(UserSelect.equals("그만")) break;
//            n = (int)(Math.random()*3);
//            ComSelect=str[n];
//            if(UserSelect.equals("가위")) {
//                if(str[n].equals("가위")) {
//                    System.out.println("사용자 = "+UserSelect+" , 컴퓨터 = "+ComSelect+" 비겼습니다.");
//                    continue;
//                }
//                else if(str[n].equals("바위")) {
//                    System.out.println("사용자 = "+UserSelect+" , 컴퓨터 = "+ComSelect+" 사용자가 졌습니다.");
//                    continue;
//                }
//                else if(str[n].equals("보")) {
//                    System.out.println("사용자 = "+UserSelect+" , 컴퓨터 = "+ComSelect+" 사용자가 이겼습니다.");
//                    continue;
//                }
//            }
//            else if(UserSelect.equals("바위")) {
//                if(str[n].equals("가위")) {
//                    System.out.println("사용자 = "+UserSelect+" , 컴퓨터 = "+ComSelect+" 사용자가 이겼습니다.");
//                    continue;
//                }
//                else if(str[n].equals("바위")) {
//                    System.out.println("사용자 = "+UserSelect+" , 컴퓨터 = "+ComSelect+" 비겼습니다.");
//                    continue;
//                }
//                else if(str[n].equals("보")) {
//                    System.out.println("사용자 = "+UserSelect+" , 컴퓨터 = "+ComSelect+" 사용자가 졌습니다.");
//                    continue;
//                }
//            }
//            else if(UserSelect.equals("보")) {
//                if(str[n].equals("가위")) {
//                    System.out.println("사용자 = "+UserSelect+" , 컴퓨터 = "+ComSelect+" 사용자가 졌습니다.");
//                    continue;
//                }
//                else if(str[n].equals("바위")) {
//                    System.out.println("사용자 = "+UserSelect+" , 컴퓨터 = "+ComSelect+" 사용자가 이겼습니다.");
//                    continue;
//                }
//                else if(str[n].equals("보")) {
//                    System.out.println("사용자 = "+UserSelect+" , 컴퓨터 = "+ComSelect+" 비겼습니다.");
//                    continue;
//                }
//            }
//            System.out.print("사용자 = "+UserSelect+" , 컴퓨터 = "+ComSelect+" ");
//        }while(true);
//        System.out.println("게임을 종료합니다...");
//        sc.close();
//    }
//
//}