package com.example.prac.project1;


public class Main {
    public static void main(String[] args) {
        System.out.println("======================================");
        System.out.println("실행 1");
        Electronic[] arr = new Electronic[2];
        for (int i = 0; i < 2; i++) {
            switch (i) {
                case 0 :
                    arr[i] = new TV();
                    break;
                case 1 :
                    arr[i] = new Radio();
                    break;
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr[j].soundUp();
            }
        }
        for (int i = 0; i < 2; i++) {
            System.out.println(arr[i].eleMember());
        }
        System.out.println("=====================================");
        System.out.println("실행 2");

        Sound[] arr1 = new Sound[5];
        for(int i = 0 ; i < 5 ; i ++ ){
            switch (i){
                case 0:
                    arr1[i] = new Sedan();
                    break;
                case 1 :
                    arr1[i] = new Bus();
                    break;
                case 2 :
                    arr1[i] = new Truck();
                    break;
                case 3 :
                    arr1[i] = new TV();
                    break;
                case 4 :
                    arr1[i] = new Radio();
                    break;
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0 ; j < 5 ; j ++){
                arr1[j].soundUp();
            }
        }
        for (int i = 0; i < 5; i++) {
            if (arr1[i] instanceof Car){
                ((Car) arr1[i]).speedUp();
                System.out.printf("[class %10s ]",arr1[i].getClass().getSimpleName() );
                ((Car) arr1[i]).carMember();
            }else if(i == 3){
                System.out.printf("[class %10s ]",arr1[i].getClass().getSimpleName() );
                System.out.println(((TV)arr1[i]).eleMember());
            }
            else {
                System.out.printf("[class %10s ]",arr1[i].getClass().getSimpleName() );
                System.out.println(((Radio)arr1[i]).eleMember());
            }
        }



    }

}
