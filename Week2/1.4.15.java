/*
TwoSumFaster ($O(N)$): Cho mảng đã sắp xếp. Đặt con trỏ left ở đầu, right ở cuối.
Cộng giá trị 2 con trỏ lại. Nếu tổng $> 0$ thì dịch right sang trái để giảm tổng xuống.
Nếu tổng $< 0$ thì dịch left sang phải để tăng tổng lên. Nếu bằng $0$ thì đếm và thu hẹp cả hai.
ThreeSumFaster ($O(N^2)$): Sắp xếp mảng ($O(N \log N)$). Duyệt vòng lặp i từ đầu mảng.
Với mỗi số a[i], bạn gọi hàm TwoSumFaster cho đoạn mảng còn lại (từ i+1 đến cuối)
để tìm cặp có tổng bằng -a[i]. Vì vòng lặp ngoài mất $N$, hàm TwoSumFaster mất $N$,
tổng chi phí là $O(N^2)$.
 */