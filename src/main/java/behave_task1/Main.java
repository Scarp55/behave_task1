package behave_task1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int r : new Randoms(90, 100)) {
		    System.out.println("Случайное число: " + r);
		    if (r == 100) {
		      System.out.println("Выпало число 100, давайте на этом закончим");
		      break;
		    }
		  }
	}

}
