/*
a. Accumulator: 16 (overhead) + 8 (double) + 4 (int) + 4 (padding làm tròn) = 32 bytes.
b. Transaction: 16 (overhead) + 8 (ref String) + 8 (ref Date) + 8 (double) = 40 bytes.
c. Mảng FixedCapacityStackOfStrings (cỡ C, N phần tử):
Tính riêng Object Stack (32 bytes) và bản thân mảng Object (24 bytes overhead mảng + $8 \times C$). Tổng: $56 + 8C$ bytes.
d. Point2D: 16 + 8 (double x) + 8 (double y) = 32 bytes.e. Interval1D: 16 + 8 (double min) + 8 (double max) = 32 bytes.
f. Interval2D: 16 + 8 (ref x) + 8 (ref y) = 32 bytes.g. Double: 16 + 8 (giá trị) = 24 bytes.
 */