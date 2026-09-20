/*
Binary Search dùng phép chia 2 để lấy điểm giữa (mid = low + (high - low) / 2).
Fibonacci Search chia mảng dựa trên dãy số Fibonacci:
Nếu mảng có độ dài $F_k - 1$, ta xét phần tử ở vị trí $F_{k-1} - 1$.
Tùy vào giá trị, ta thu hẹp mảng về độ dài $F_{k-1}-1$ hoặc $F_{k-2}-1$.
Quá trình này chỉ yêu cầu tính toán chỉ số bằng phép cộng và trừ dãy Fibonacci đã tính trước, với số bước $\sim \log N$.
 */