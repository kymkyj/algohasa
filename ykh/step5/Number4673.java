package step5;

// 셀프넘버 구하기
public class Number4673 {

    public static void main(String args[]) {

        int notSelfNumber[] = getNotSelfNumber();

        for (int i=1; i < notSelfNumber.length; i++) {
            if(notSelfNumber[i] == 0) {     // 배열에 0이 저장되어 있는 인덱스가 셀프넘버
                System.out.println(i);
            }
        }
    }

    // 셀프넘버가 아닌 수를 얻는 메소드
    public static int[] getNotSelfNumber() {
        // arraylist 사용 불가
        //List<Integer> arr = new ArrayList<>();

        int notSelfNumber = 0;
        int[] arr = new int[10001];

        // 10000보다 큰수의 셀프넘버가 10000보다 작을 수 없으므로 for문을 10000까지 돌리면 됨
        for(int i = 1; i < 10000; i++) {
            if (i < 10) {
                notSelfNumber = i + i;
                arr[notSelfNumber] = notSelfNumber;
            } else if (i < 100) {
                notSelfNumber = i + ((i / 10) + (i % 10));
                arr[notSelfNumber] = notSelfNumber;
            } else if (i < 1000) {
                notSelfNumber = i + ((i / 100) + ((i % 100) / 10) + ((i % 100) % 10));
                arr[notSelfNumber] = notSelfNumber;
            } else {
                notSelfNumber = i + ((i / 1000) + ((i % 1000) / 100) + (((i % 1000) % 100) / 10) + (((i % 1000) % 100) % 10));

                if (notSelfNumber <= 10000) {
                    arr[notSelfNumber] = notSelfNumber;
                }
            }
        }

        return arr;
    }
}
