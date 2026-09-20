/*
Bạn xét phần tử ở giữa mảng mid.
Nếu a[mid] nhỏ hơn cả 2 hàng xóm của nó (a[mid-1] và a[mid+1]), đó chính là cực tiểu, thuật toán dừng.
Nếu a[mid-1] < a[mid], chắc chắn nửa bên trái của mảng sẽ chứa ít nhất một cực tiểu địa phương
(vì đồ thị đang đi xuống về bên trái, và bị chặn bởi đầu mảng).
Bạn thu hẹp phạm vi tìm kiếm về nửa trái.
Ngược lại, nếu a[mid+1] < a[mid], đi tìm ở nửa bên phải.Mỗi bước tốn 2 phép so sánh, sau $\lg N$ bước sẽ tìm ra $\rightarrow$
Tổng chi phí $\sim 2\lg N$.
 */