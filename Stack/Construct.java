package Stack;

public class Construct {

	int arr[] = new int[5];
	int tos = -1;
	int size = 0;

	public void push(int val) {

		if (arr.length == size) {
			int res[] = new int[arr.length * 2];
			for (int i = 0; i < arr.length; i++) {
				res[i] = arr[i];
			}
			arr = res;
		}
		tos++;
		arr[tos] = val;
		size++;
	}

	public void pop() {
		if (tos == -1) {
			System.out.println("Khali h");
			return;
		}

		arr[tos] = 0;
		tos--;
		size--;
	}

	public int peek() {
		if (tos == -1) {
			System.out.println("Khali h");
			return -1;
		}
		return arr[tos];
	}

	public void display() {
		for (int i = tos; i >= 0; i--) {
			System.out.println(arr[i]);
		}

	}

	public boolean isEmpty() {
		return size == 0;
	}

}