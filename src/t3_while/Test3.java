package t3_while;

// 1~100까지의 홀수합
public class Test3 {
	public static void main(String[] args) {
		int i = -1, tot = 0;
		//홀수일땐 100과 가장 가까운 정수99로 바꾸기
		while(i < 99) {
			i = i + 2; // i++, ++i, i+=1
			tot = tot + i; // tot +=i
		
		}
		System.out.println("1~100까지의 홀수합은? " + tot);
	}
}
