public class 이차원배열01 {
    public static void main(String[] args) {
        // 정수 3개 저장할 수 있는 배열 arr 선언 및 생성

        int[] arr = new int[3]; //기존에 배운 1차원 배열

        // 2차원 배열 생성
        int[][] arr1 = new int[2][3];//3개 정수 칸이 2줄


        //예시) 배열의 모든 요소에 1~6까지 정수를 저장하시오
        //arr1[0][0] =1;
        //arr1[0][1] =2;
        //arr1[0][2] =3;
        //arr1[1][0] =4;
        //arr1[1][1] =5;
        //arr1[1][2] =6; 을 이중 for반복문으로
        //arr1의 배열의 길이는 2 즉, 행의 개수를 물어보는 것
        //arr1.lenght; 또는 arr1[0].lenght 로 표현함

        //1번째 for문에서는 1번째 정수의 수 반복/ 0,1
        //2번째
        // 변수 1개를 만들어서 1~6을 표현해야함

        int value = 1; // 1~6을 표현할 변수

        for(int i =0; i<arr1.length; i++){
            for(int j=0; j< arr1[i].length; j++){
                arr1[i][j] = value++;//증감 연산자는 모든 연산을 끝낸 뒤 +1

            }
       }


    }
}
