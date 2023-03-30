import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(in));
    public static int size;
    public static int[] inOrder;
    public static int[] inOrderIdx; // 중위 순회에 루트들의 인덱스 정보를 입력한다.
    public static int[] postOrder;

    public static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        size = Integer.parseInt(br.readLine());

        inOrder = new int[size + 1];
        inOrderIdx = new int[size + 1];
        postOrder = new int[size + 1];

        sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= size; i++) {
            inOrder[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= size; i++) {
            postOrder[i] = Integer.parseInt(st.nextToken());
        }

        IntStream.rangeClosed(1, size).forEach(i -> inOrderIdx[inOrder[i]] = i);
        getPreOrder(1, size, 1, size);
        out.println(sb.toString());
    }

    public static void getPreOrder(int inO_start, int inO_end, int poO_start, int poO_end) {
        if (inO_start > inO_end || poO_start > poO_end) return;
        int root = postOrder[poO_end];
        sb.append(root).append(" ");
        int rootIdx = inOrderIdx[root];
        int left = rootIdx - inO_start;
        getPreOrder(inO_start, rootIdx - 1, poO_start, poO_start + left - 1);
        getPreOrder(rootIdx + 1, inO_end, poO_start + left, poO_end - 1);
    }
}
