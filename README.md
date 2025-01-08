# Algorithm Utils - JUnit Test Project

## Mô tả
Dự án này là tập hợp các phương thức thuật toán cơ bản được kiểm tra bằng **JUnit**. Các thuật toán bao gồm:
- Tìm giá trị lớn nhất trong mảng (`findMax`)
- Tính số Fibonacci (`fibonacci`)
- Kiểm tra chuỗi Palindrome (`isPalindrome`)
- Thuật toán sắp xếp nhanh (`quickSort`)

Mục tiêu chính của dự án là cung cấp ví dụ rõ ràng và dễ hiểu về cách kiểm thử các thuật toán cơ bản trong Java bằng **JUnit 5**.

---

## Yêu cầu hệ thống
- **Java** 8 hoặc cao hơn
- **JUnit** 5
- IDE hỗ trợ Java (IntelliJ IDEA, Eclipse, VS Code, v.v.)
- Maven hoặc Gradle (tuỳ chọn)

---

## Cách sử dụng
- Clone repository về máy của bạn:
   ```bash
   git clone https://github.com/KieuTruomng/KiemthunangcaoJUnit.git


## Mô tả các phương thức:
### 1. findMax(int[] array)
- Tìm giá trị lớn nhất trong mảng số nguyên.
- Input: Mảng số nguyên (không null, không rỗng).
- Output: Giá trị lớn nhất trong mảng.
- Ngoại lệ: Ném IllegalArgumentException nếu mảng null hoặc rỗng.

### 2. fibonacci(int n)
- Tính số Fibonacci thứ n.
- Input: Số nguyên n (không âm).
- Output: Số Fibonacci thứ n.
- Ngoại lệ: Ném IllegalArgumentException nếu n < 0.

### 3. isPalindrome(String input)
- Kiểm tra xem chuỗi có phải là Palindrome không.
- Input: Chuỗi bất kỳ.
- Output: true nếu chuỗi là Palindrome, false nếu không phải.
- Ngoại lệ: Ném IllegalArgumentException nếu chuỗi null.

### 4. quickSort(int[] array, int low, int high)
- Thuật toán sắp xếp nhanh.
- Input: Mảng số nguyên cần sắp xếp, chỉ số low và high.
- Output: Mảng được sắp xếp tại chỗ (không trả về).
- Ngoại lệ: Ném IllegalArgumentException nếu mảng null.

