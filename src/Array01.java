public class Array01 {
    public static void main(String[] args) {
        int a; //변수를 선언만 하고 초기화는 되지 않았다.
        a = 10; //변수a에 10을 초기화 해줌


        //배열의 선언
        //정수를 여러개 저장할 수 있는 배열 arr1 선언해봐



        int[] arr1; //int arr1[]; -//변수를 선언만 하고 배열 생성 되지 않았다.

        arr1 = new int[5]; //배열 생성 - arr1변수에 5개의 정수가 들어가도록 생성함

        //배열 선언과 생성을 동시에 해보기
        int [] arr2 = new int[3];
          //정수변수를 저장하는 arr2 배열에 저장 공간 3개 생성했다 라는 뜻
         // int [3] arr2 불가능해 - []는 빈칸으로 선언하기

        //실수를 여러개 저장할 수 있는 배열 arr4 선언 및 생성
        double[] arr4 = new double[10]; // 초기화 값은 0.0


        //문자열 5개를 저장할 수 있는 배열 arr5 생성
        String [] arr5 = new String[5]; // 초기화 값은 null





    }
}
