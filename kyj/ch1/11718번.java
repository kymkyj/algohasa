package Baekjoon;

import java.util.*; // Scanner�� ����ϱ� ���� �߰�

//�Է� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

/**
 ���� : �Է��� �־�����. �Է��� �ִ� 100�ٷ� �̷���� �ְ�, ���ĺ� �ҹ���, �빮��, ����, ���ڷθ� �̷���� �ִ�. 
 �� ���� 100���ڸ� ���� ������, �� ���� �־����� �ʴ´�. ��, �� ���� �������� �������� �ʰ�, �������� ������ �ʴ´�.
*/

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()) {
            String str=sc.nextLine();
            if(!(str.isEmpty() | str.length()>100)) {
                System.out.println(str);
            }
        }
    }
}
