public class Bai8 {
//    Viết chương trình Java thực hiện các yêu cầu sau:
//
//Khởi tạo một mảng số nguyên từ bàn phím (các số cách nhau bằng dấu cách).
//Nhập một số nguyên k, là tổng cần tìm.
//In tất cả các cặp số(2 số) có tổng bằng k.
//Sắp xếp các cặp số theo thứ tự tăng dần.
//Gợi ý:
//Khởi tạo mảng: Tạo một mảng số nguyên có giá trị sẵn trong chương trình. Không cần nhập từ bàn phím
//Nhập giá trị tổng k: Khởi tạo một giá trị k (tổng cần tìm).
//Tìm các cặp số: Duyệt qua mảng và tìm tất cả các cặp số có tổng bằng k. Đảm bảo không có cặp trùng lặp.
//Sắp xếp các cặp số: Chuyển các cặp số từ Set sang List và dùng Collections.sort() để sắp xếp theo thứ tự tăng dần.
//In kết quả: In tất cả các cặp số sau khi sắp xếp
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 10;
        System.out.println("Các cặp số có tổng bằng " + k + " là:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
}
