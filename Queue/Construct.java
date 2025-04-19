package Queue;

public class Construct {
	int arr[] = new int[5];
	int size = 0;
	int front = 0;
	int end = 0;

	public void enqueue(int val) {
		if (size == arr.length) {
		
			int res[]=new int[arr.length*2];
			int idx=0;
			for(int i=front;i<end;i++,idx++)
			{
				res[idx]=arr[i%arr.length];
			}
			arr=res;
		}

		arr[end % arr.length] = val;
		size++;
		end++;
	}

	public void dequeue() {
		if (size == 0) {
			System.out.println("Empty h");
			return;
		}
		arr[front % arr.length] = 0;
		front++;
		size--;
	}

	public int peek() {
		return arr[front % arr.length];
	}

	public void display() {
		for (int i = front; i < end; i++) {
			System.out.print(arr[i % arr.length] + " ");
		}
	}
}
