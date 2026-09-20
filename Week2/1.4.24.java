/*
Chiến thuật 1 ($\sim \lg N$ lần thả, vỡ $\sim \lg N$ trứng):
Tìm kiếm nhị phân chuẩn trên $N$ tầng.
Thả ở tầng $N/2$, vỡ thì tìm nửa dưới, không vỡ thì tìm nửa trên.
Chiến thuật 2 (Chi phí giảm còn $\sim 2\lg F$):
Thả trứng ở các tầng lũy thừa của 2: $1, 2, 4, 8, 16, \dots, 2^k$ cho đến khi trứng vỡ ở tầng $2^k$.
Lúc này ta mất $\lg F$ lần thả và 1 quả trứng.
Ta biết chắc $F$ nằm giữa $2^{k-1}$ và $2^k$.
Dùng tìm kiếm nhị phân trong khoảng này mất thêm $\lg F$ lần thả nữa. Tổng cộng $\sim 2\lg F$.
 */