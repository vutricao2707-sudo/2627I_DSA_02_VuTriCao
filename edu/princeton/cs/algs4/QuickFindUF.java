package edu.princeton.cs.algs4;

public class QuickFindUF {
    private int[] id;    // id[i] = ID của component chứa phần tử i
    private int count;   // số lượng component

    // Khởi tạo cấu trúc dữ liệu với N phần tử (từ 0 đến N-1)
    public QuickFindUF(int n) {
        count = n;
        id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    // Trả về số lượng component hiện tại
    public int count() {
        return count;
    }

    // Trả về ID của component chứa phần tử p
    public int find(int p) {
        return id[p];
    }

    // Kiểm tra xem p và q có đang kết nối với nhau không
    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    // Hợp nhất component chứa p và component chứa q
    public void union(int p, int q) {
        int pID = id[p];
        int qID = id[q];

        // Nếu đã kết nối rồi thì không làm gì cả
        if (pID == qID) return;

        // Đổi tất cả các phần tử có cùng ID với p sang ID của q
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pID) {
                id[i] = qID;
            }
        }
        count--; // Giảm số lượng component đi 1
    }

    // Hàm main để chạy thử nghiệm đọc dữ liệu từ file
    public static void main(String[] args) {
        // Đọc số lượng phần tử N từ file đầu vào (ví dụ: tinyUF.txt)
        int n = StdIn.readInt();
        QuickFindUF uf = new QuickFindUF(n);

        // Đọc từng cặp số p, q cho đến khi hết file
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();

            // Nếu đã kết nối rồi thì bỏ qua
            if (uf.connected(p, q)) continue;

            // Nếu chưa kết nối thì nối lại và in cặp số đó ra màn hình
            uf.union(p, q);
            StdOut.println(p + " " + q);
        }
    }
}