public class 이차원배열02 {
    public static void main(String[] args) {
        //길이가 3이 정수형 2차원 배열 생성
        //-> 열의 길이를 아직 모르겠다는 뜻
        //-> 행의 배열의 길이는 다를 수 있음

        int[][] arr = new int[3][];

        arr[0] = new int[3]; // 0번 째 배열에 3개의 정수 칸(열)을 만들겠다
        arr[1] = new int[4]; // 1번 째 배열에 4개의 정수 칸(열)을 만들겠다
        arr[2] = new int[5]; // 2번 째 배열에 5개의 정수 칸(열)을 만들겠다

        //arr.length 는 3(배열의 행의 길이)
        //arr[1].length 는 4
        //arr[2].length 는 5

        //이차원배열 요소를 모두 출력 할 때 이중 반복문을 쓰면 된다!
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
