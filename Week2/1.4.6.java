/*
a.Vòng lặp ngoài: $n$ nhận các giá trị $N, \frac{N}{2}, \frac{N}{4}, \dots, 1$.
Vòng lặp trong: chạy $n$ lần.
Tổng số phép toán: $N + \frac{N}{2} + \frac{N}{4} + \dots + 1 = N(1 + \frac{1}{2} + \frac{1}{4} + \dots) \approx 2N$.
Bậc tăng: $O(N)$ (Tuyến tính).
b.Vòng lặp ngoài: $i$ nhận các giá trị $1, 2, 4, 8, \dots, 2^k$ (với $2^k < N$).
Vòng lặp trong: chạy $i$ lần.
Tổng số phép toán: $1 + 2 + 4 + \dots + 2^k \approx 2^{k+1} - 1 \approx 2N$.
Bậc tăng: $O(N)$ (Tuyến tính).
c.Vòng lặp ngoài: $i$ tăng gấp đôi mỗi bước, nên sẽ lặp $\log_2 N$ lần.
Vòng lặp trong: chạy độc lập với $i$ và luôn lặp đúng $N$ lần.Tổng số phép toán:
Vòng lặp ngoài $\times$ Vòng lặp trong = $N \log_2 N$.
Bậc tăng: $O(N \log N)$ (Tuyến tính logarit).
 */