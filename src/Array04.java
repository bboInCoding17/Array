public class Array04 {
    public static void main(String[] args) {
        int[] arr1 = new int[5]; // 정수 arr1을 선언하고 5개의 저장소를 만들었다.
        //arr1[0] = 10; // arr1의 1번 째 요소에 정수 10을 넣겠다 는 의미
        //arr1 = 100; // 몇 번째 요소에 넣을 지 설정이 안되서 비문

        //arr1 배열의 각 요소에 1~5까지 차례대로 저장하시오
        //위 문제 요구 사항에 맞게 데이터 잘 들어갔는지, 모든 요소를 출력하여 확인하시오

        for(int i =0; i <arr1.length; i++ ){
            arr1[i] = i+1;
        }
        for(int i =0; i <arr1.length; i++ ){
            System.out.println(arr1[i]);
        }

        //for-each 문
        for(int e : arr1){
            System.out.println(e);

        }

        //for -each 예시

        double [] arr2 = {1.1, 2.2, 3.3};

        for(double e : arr2){
            System.out.println(e);

        }






    }
}
