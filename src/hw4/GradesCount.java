package hw4;

public class GradesCount {
	public static void main(String[] args) {
		int grade[][] = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };
		int count[] = { 0, 0, 0, 0, 0, 0, 0, 0 };
		for (int i = 0; i < grade.length; i++) {
			int highest = 0;
			int current = 0;
			for (int j = 0; j < grade[i].length; j++) {
				if (grade[i][j] > highest) {
					highest = grade[i][j];
					current = j;
				}
			}
			count[current]++;
		}
		for (int i = 0; i < count.length; i++) {
			System.out.println(i+1+"號同學考最高分的次數為"+count[i]+"次");
		}
	}
}
