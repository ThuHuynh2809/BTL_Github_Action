<h3 align="center">Git_Action CI/CD </h3>

![hinh1.png](img%2Fhinh1.png)

<p><b>Giới thiệu</b></p>
<p>File này mô tả quy trình CI/CD (Continuous Integration/Continuous Delivery) được thiết lập cho dự án sử dụng Git Action. Quy trình này tự động hóa việc xây dựng, kiểm thử và triển khai ứng dụng sử dụng các công nghệ sau:</p>

<li> <img width="24" height="24" src="https://img.icons8.com/color/48/spring-logo.png" alt="spring-logo"/>
Spring Boot: Khung phát triển ứng dụng web Java</li>
<li><img width="24" height="24" src="https://img.icons8.com/color/48/maria-db.png" alt="maria-db"/>
MySQL: Hệ quản trị cơ sở dữ liệu quan hệ</li>
<li><img width="24" height="24" src="https://img.icons8.com/fluency/48/github.png" alt="github"/>Git: Hệ thống kiểm soát phiên bản</li>

<p><b>Quy trình</b></p>
Commit: Khi bạn thay đổi mã nguồn và đẩy lên kho lưu trữ Git, Git Action sẽ tự động kích hoạt quy trình CI/CD.
Xây dựng: Git Action sẽ tạo bản dựng ứng dụng Spring Boot.
Kiểm thử: Git Action sẽ thực thi các bài kiểm tra đơn vị và kiểm tra tích hợp để đảm bảo mã nguồn hoạt động chính xác.
Triển khai: Nếu tất cả các bài kiểm tra thành công, Git Action sẽ triển khai ứng dụng lên môi trường mục tiêu (ví dụ: máy chủ sản xuất).

<p><b>Lợi ích</b></p>
<p>Việc sử dụng quy trình CI/CD mang lại nhiều lợi ích, bao gồm:</p>

<li>Tăng tốc độ phát triển: Việc tự động hóa quy trình xây dựng, kiểm thử và triển khai giúp giảm thiểu thời gian cần thiết để đưa các thay đổi mã nguồn vào sản xuất.</li>
<li>Cải thiện chất lượng: Việc thực thi các bài kiểm tra tự động giúp đảm bảo mã nguồn hoạt động chính xác và giảm thiểu lỗi.</li>
<li>Tăng hiệu quả: Việc tự động hóa các nhiệm vụ thủ công giúp giải phóng thời gian của các nhà phát triển để họ có thể tập trung vào các công việc sáng tạo hơn.</li>

<p><b>Cách sử dụng</b></p>
<p>Để sử dụng quy trình CI/CD này, bạn cần:</p>

<li>Cài đặt Git Action cho kho lưu trữ Git của bạn.</li>
<li>Tạo tệp .github/workflows/ci-cd.yml với nội dung quy trình CI/CD.</li>
<li>Cam kết tệp .github/workflows/ci-cd.yml vào kho lưu trữ Git của bạn.</li>

<p><b>Lưu ý</b></p>
<li>Nội dung tệp .github/workflows/ci-cd.yml cần được điều chỉnh cho phù hợp với dự án cụ thể của bạn.</li>
<li>Bạn có thể thêm các bước bổ sung vào quy trình CI/CD, chẳng hạn như triển khai tài liệu hoặc gửi thông báo email.</li>

