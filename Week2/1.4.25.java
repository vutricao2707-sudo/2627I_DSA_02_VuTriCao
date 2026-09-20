/*
Chiến thuật $2\sqrt{N}$: Chia tòa nhà thành các khối, mỗi khối $\sqrt{N}$ tầng.
Dùng trứng 1 thả ở các tầng $\sqrt{N}, 2\sqrt{N}, 3\sqrt{N}\dots$
Tối đa $\sqrt{N}$ lần thả thì trứng 1 vỡ. Lúc này ta biết khoảng nghi ngờ có độ dài $\sqrt{N}$.
Dùng trứng 2 dò từng tầng từ dưới lên trong khoảng đó (tối đa $\sqrt{N}$ lần thả).
Tổng chi phí $\sim 2\sqrt{N}$.Chiến thuật $c\sqrt{F}$: Đừng nhảy bước cố định.
Dùng trứng 1 nhảy với các khoảng cách tăng dần: $1, 1+2, 1+2+3, 1+2+3+4, \dots$ (số tam giác).
Nếu trứng 1 vỡ ở lần thả thứ $t$, nghĩa là tầng $F \approx \frac{t^2}{2} \Rightarrow t \approx \sqrt{2F}$.
Trứng 2 dò từng tầng trong khoảng cách tuyến tính mất tối đa $t$ bước.
Tổng số lần thả là $2t \approx 2\sqrt{2}\sqrt{F}$ (hằng số $c \approx 2\sqrt{2}$).
 */