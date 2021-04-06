
public class IterationDemo {

	public static void main(String[] args) {
		for (char i = 65; i <= 70; i++) {
			for (char j = 65; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println(" ");
		}
		System.out.println();

		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= 5; j++) {
				{
					if (i == 0 || i == 5 || j == 0 || j == 5)
						System.out.print(" *");
					else
						System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
