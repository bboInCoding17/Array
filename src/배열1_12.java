import java.util.Scanner;

public class 배열1_12 {
    public static void main(String[] args) {
        //성적처리 시스템/ 국어,영어,수학 점수를 입력받아
        //각 과목에 대한 점수 및 총점, 평균을 출력하는 프로그램을 만들어보자
        //배열 사용해서!

        Scanner sc= new Scanner(System.in);

        //국,영,수,총점은 정수를 저정할 수 있는 배열로 표현
        //scores의 0번째 요소에는 국어, 1번째 요소 : 영어, 2번째 요소 : 수학, 3번째 요소 총점
        String[] subjects = {"국어", "영어", "수학"}; // 과목 개수
        int[] scores =new int[subjects.length +1]; // 과목 개수 + 총점
        double avg; // 평균을 저장할 실수 변수


//        System.out.print("점수 : ");
//        scores[0] = sc.nextInt(); 를 반복
//        총점을 입력 받으면 안되기 때문에 -1을 넣어준다
        // 0~100 사이의 정수를 받기 위해 while을 이용해 무한 루프 걸어준다
        // 0~100 사이의 정수를 정확하게 입력을 유도함 //  if 문으로 키보드로 입력받을 정수를 제한해줌

        for(int i =0; i<scores.length-1; i++) {
            while(true) {
                System.out.print(subjects[i] + "점수 : ");
                scores[i] = sc.nextInt();// 변수 i에 키보드에 입력받은 정보를 저장

                if(scores[i] >= 0 && scores[i] <=100){
                    break;
                }
            }
        } // 과목 점수 입력 받기

        //총점 및 평균 계산
        //총점은 총 과목을 저장하는 변수의 가장 마지막 요소에 들어가기로 함
        //배열 길이 -1 하면 됨
        //과목 3 -> 배열길이 4 ---- 배열길이 -1 해야 마지막 요소
       //scores = scores[scores.length - 1] = scores[0] + scores[1 ] + scores[2];
        for(int i =0; i<scores.length-1; i++){
            scores[scores.length - 1] = scores[scores.length - 1] + scores[i];
        } // scores[scores.length - 1]는 총점이 저장될 변수


        //평균
        avg = scores[scores.length - 1] /(double) (scores.length - 1);

        //점수 출력
        // 점수를 과목 수만큼만
        for(int i =0; i<scores.length - 1; i++){
            System.out.println(subjects[i] + " 점수 : " + scores[i]);

        }

        System.out.println("총점 : " + scores[scores.length - 1]);
        System.out.println("평균 : " + avg);








            }
        }

















