# DiceGame-Java-
## Tạo một trò chơi xúc sắc bằng ngôn ngữ Java, thể hiện hướng thiết kế ngôn ngữ hướng đối tượng
### Đề bài:

Số lượng người chơi mặc định là 4. Nếu có ít hơn 4 người tham gia thì máy tính sẽ tạo ra số người chơi ảo tương ứng để đủ 4 người. 

Có tổng cộng 4 quân xúc sắc. Mỗi quân xúc sắc có 1 mặt có xác suất 20% và 5 mặt có xác suất 16%.
(Ví dụ: xúc sắc số 1 có mặt 1 chấm xác suất 20%, xúc sắc số 2 có mặt 2 chấm xác suất 20%)

Mỗi người chơi có các thuộc tính và hành vi cơ bản sau 
- Tên
- Số điểm đang có
- Riêng mỗi người chơi ảo có các cách biểu lộ thất bại khác nhau. 

Có 1 trọng tài, là người điều khiển trò chơi. Trọng tài có nhiệm vụ: 
- Chỉ định người chơi tiếp theo
- Tính điểm cho các người chơi theo nguyên tắc: 
  - Nếu tổng điểm cũ của người chơi và điểm vừa tung được bằng 21: Người chơi chiến thắng
  - Nếu tổng điểm cũ của người chơi và điểm vừa tung được lớn hơn 21: Tính điểm là 0
  - Các trường hợp còn lại tính điểm bình thường
- Tuyên bố người thắng cuộc, khi đó các người chơi thua cuộc sẽ lần lượt biểu lộ thất bại. 

Mỗi người chơi khi đến lượt sẽ nhận được 1 xúc sắc và tung để có số điểm tương ứng. 
