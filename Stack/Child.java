package Stack;

public class Child extends Construct {

	public void push(int val) {
		if (super.arr.length == super.size) {
			int res[] = new int[super.arr.length * 2];
			for (int i = 0; i < arr.length; i++) {
				res[i] = arr[i];
			}
			super.arr = res;
		}
		super.push(val);
	}
}
