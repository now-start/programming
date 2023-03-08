import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {

	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Node root = new Node(Integer.parseInt(str));
		
		while ((str = br.readLine()) != null && str.length() != 0) {
			Node next = new Node(Integer.parseInt(str));
			putNode(root, next);
		}
		
		getBackpatrol(root);
		System.out.print(sb.toString());
	}

	public static void putNode(Node root, Node next) {
		if (root.num > next.num) {
			if (root.left != null)
				putNode(root.left, next);
			else
				root.left = next;
		} else {
			if (root.right != null)
				putNode(root.right, next);
			else
				root.right = next;
		}
	}

	public static void getBackpatrol(Node root) {
		if (root.left != null)
			getBackpatrol(root.left);
		if (root.right != null)
			getBackpatrol(root.right);
		sb.append(root.num + "\n");
	}
}

class Node {
	Node left;
	Node right;
	int num;

	public Node(int num) {
		this.num = num;
	}
}