package e2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();// ȡ�÷Ǹ�����
		int sum = 0;// ����Ķ�������ֵ
		int weight = 1;// �����Ƹ�λȨֵ
		int index = 1;// ʮ���ƴ�������ֽ����
		int bit = 0;// ʮ���ƴ�������ֽ��λ����
		/*
		 * �Ƴ�����n>0������ȡ�����λ ��������������1��ʮ������������һλ 2����������λ�����ƣ�λȨֵ*2 3��ʮ������λ��ż�1
		 */
		for (; n > 0; n /= 10, weight *= 2, index++) {
			bit = n % 10;// ȡʮ���Ƹ���λ������
			if (bit % 2 == index % 2) {
				// ��ż����ͬ���ͼ��ϵ�ǰΪȨֵ
				sum += weight;
			}
		}
		System.out.println(sum);
		in.close();
	}

}
