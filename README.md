Clean Code Principles and Secure Coding
Setelah mengimplementasikan fitur Edit dan Delete, saya merasa penerapan prinsip Clean Code dan Secure Coding sangat membantu keterbacaan kode. Beberapa hal yang sudah saya terapkan antara lain sebagai berikut.

1. Meaningful Names
   Saya berusaha memberi nama variabel dan method yang deskriptif. Contohnya delete(String productId) dan findById(String productId) di Service dan Repository. Hal ini membuat kode menjadi lebih mudah dipahami. Orang lain yang membaca kode tersebut, atau bahkan saya sendiri di masa depan, dapat langsung mengerti fungsinya tanpa harus melihat detail implementasinya.

2. Single Responsibility Principle (SRP)
   Saya tetap menjaga pemisahan tugas yang jelas dengan pola MVC. Controller hanya bertugas mengatur alur request, Service mengatur logika bisnis seperti memanggil repository, dan Repository fokus pada manipulasi data di dalam list. Dengan cara ini, tidak ada logika bisnis yang tercampur atau bocor ke dalam Controller.

3. Secure Coding (UUID)
   Awalnya saya tidak terlalu memikirkan soal ID, namun kemudian saya menyadari bahwa penggunaan ID berurutan seperti 1, 2, 3, dan seterusnya tidak aman karena mudah ditebak dan berpotensi menimbulkan serangan ID Enumeration. Oleh karena itu, saya menerapkan penggunaan UUID secara acak saat produk dibuat. Dengan cara ini, URL untuk fitur edit dan delete menjadi unik dan sulit diprediksi oleh pihak yang tidak bertanggung jawab.

Areas for Improvement (Mistakes and Evaluation)
Secara jujur, masih terdapat beberapa kekurangan dalam kode yang saya buat, sekaligus pelajaran yang bisa saya ambil dari proses ini.

1. Validasi Input
   Saat ini, logika validasi yang diterapkan masih sangat minim. User masih bisa memasukkan nama produk yang kosong atau quantity bernilai negatif. Ke depannya, saya perlu menambahkan validasi baik di level Model maupun Controller agar data yang masuk benar-benar valid dan bersih.

2. Konsistensi Path URL
   Saya sempat mengalami kebingungan dalam penggunaan path relatif seperti ../list dibandingkan dengan path absolut seperti /product/list saat melakukan redirect. Meskipun penggunaan ../list tetap berfungsi, pendekatan ini cukup rentan menimbulkan error jika struktur URL berubah. Oleh karena itu, sebaiknya saya konsisten menggunakan absolute path agar navigasi aplikasi menjadi lebih kuat dan tidak membingungkan.