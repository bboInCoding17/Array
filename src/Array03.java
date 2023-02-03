public class Array03 {
    public static void main(String[] args) {
        //배열의 값 읽기

        int [] arr1 = {1, 2, 3};
        //System.out.println(arr1); - 이렇게 하면 안됨

        //배열에 저장 된 값을 읽기 위해서
        //배열의 몇 번 째 요소의 값을 읽을지 명확히 정해야 해

        // arr1의 0번 째 요소 출력 해봐라
        System.out.println(arr1[0]);// arr1의 0번 째 요소의 값을 출력 해라 -> 1
        //System.out.println(arr1[3]);// 오류가 났지만, 진행은 되지만, 오류 멘트로 출력됨

        double[]  arr2 = {1.0 , 2.3, 3.6, 4.7, 5.5};
        // arr2의 모든 요소를 출력해 봐라
        for(int i =0; i<5; i++){
            System.out.println(arr1[i]);
        }
        System.out.println();


        System.out.println("배열의 길이 : "+ arr2.length); // 5
          // arr2의 길이 즉, 공간이 몇개 있는지 확인할 수 있음

        //for(int i =0; i<5; i++)
        // i < 5 ->  i < arr2.length 로 표기하면 유용해
        // arr2의 공간이 바뀌더라도 i<5를 수정하지 않아도 자동으로 바뀜

    }
}
