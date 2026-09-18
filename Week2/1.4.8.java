/*
Ý tưởng: Thay vì dùng 2 vòng lặp lồng nhau ($O(N^2)$), bạn hãy gọi Arrays.sort() để sắp xếp mảng trước. Việc này tốn $O(N \log N)$.
Sau khi sắp xếp, các số giống nhau sẽ đứng thành từng cụm sát nhau. Bạn chỉ cần duyệt mảng 1 lần ($O(N)$). Đếm xem mỗi cụm có bao nhiêu phần tử (gọi là $k$).
Số cặp tạo được từ cụm đó chính là tổ hợp chập 2 của $k$: $\frac{k \times (k-1)}{2}$. Cộng dồn kết quả của các cụm lại là xong.
 */