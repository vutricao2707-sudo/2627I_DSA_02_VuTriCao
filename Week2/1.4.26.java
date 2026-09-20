/*
Khai triển hằng đẳng thức hiệu hai lập phương và rút gọn (vì các điểm phân biệt nên
$b-a \neq 0$ và $c-b \neq 0$):
$$a^2 + ab + b^2 = b^2 + bc + c^2
$$$$a^2 - c^2 + ab - bc = 0
$$$$(a - c)(a + c) + b(a - c) = 0
$$$$(a - c)(a + b + c) = 0$$
Vì 3 điểm là phân biệt nên $a \neq c \Rightarrow a - c \neq 0$.
Do đó, bắt buộc $a + b + c = 0$.
Điều này có nghĩa là mọi thuật toán đồ họa/hình học tìm 3 điểm thẳng hàng trên đồ thị hàm $y = x^3$
đều có thể được sử dụng trực tiếp để giải bài toán 3-sum.
 */