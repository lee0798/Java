
package com.example.prac;
import java.util.Scanner;
public class week4_study7 {
    public class Day {
        private String work;

        public void set(String work) {
            this.work = work;
        }

        public String get() {
            return work;
        }

        public void show() {
            System.out.println(work + "입니다");
        }
    }
    public class MonthSchedule {
        Scanner scanner = new Scanner(System.in);
        Day[] day;

        public MonthSchedule(int days) {
            day = new Day[days];
        }

        public void input(int date) {
            System.out.print(date + "일 할일 입력: ");
            String work = scanner.nextLine();
            day[date - 1] = new Day(); // 배열 요소 초기화
            day[date - 1].set(work);
        }
        public void view(int days) {
            if (day[days - 1] != null) {
                day[days - 1].show();
            } else {
                System.out.println(" 등록된 할일이 없습니다.");
            }
        }


        public String viewMonth() {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < day.length; i++) {
                if (day[i] != null) {
                    result.append(i + 1).append("일 : ").append(day[i].get()).append("\n");
                }
            }
            return result.toString(); // 문자열 반환
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int date = 30;
        System.out.println("4월의 스케줄 관리 프로그램");
        week4_study7 outerInstance = new week4_study7();
        week4_study7.MonthSchedule April = outerInstance.new MonthSchedule(date);

        while (true) {
            System.out.print("1.할일 입력 2.할일보기 3.전체할일보기 4.종료 : ");
            int b = scanner.nextInt();
            int day;
            if (b == 4) {
                System.exit(0);
            } else if (b == 1) {
                System.out.print("입력할 날짜 : ");
                day = scanner.nextInt();
                scanner.nextLine(); // 개행 문자 제거
                April.input(day);
            } else if (b == 2) {
                System.out.print("입력할 날짜 : ");
                day = scanner.nextInt();
                System.out.print(day + "일: ");
                April.view(day);
            } else if (b == 3) {
                System.out.println(April.viewMonth());
            }else{
                System.out.println("메뉴를 잘못 선택하였습니다.");
            }
        }
    }
}
