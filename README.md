# Studi Kasus Peminjaman Ruang
Nama      : Novianti Safitri 
<br>NIM   : 2209116004 
<br>Kelas : Sistem Informasi A 2022

<br>
<p>Project Peminjaman Ruang dibuat guna memenuhi tugas posttest 2 dari praktikum mata kuliah Pemrograman Berorientasi Objek.
Program ini merupakan sebuah program yang dapat dapat digunakan untuk melakukan manajemen peminjaman ruang dengan fitur peminjaman, 
peninjauan seluruh peminjaman, pembaruan status, peminjaman berdasarkan kode ruang, dan penghapusan peminjaman berdasarkan kode ruang.</p>

<br>

# Struktur Project
- Package <br>
  <br>
  <img width="203" alt="image" src="https://github.com/noviantisafitri/pbo-post-test-2/assets/121856489/b335c353-a672-4696-ab26-a76b33e8a603">
  
- Class <br>
  <br>
  <img width="200" alt="image" src="https://github.com/noviantisafitri/pbo-post-test-2/assets/121856489/518f36ed-de05-45ec-bca7-75dd42bfd11a">
  

<br>

# Alur Program

1. Menu Read
   <p>Menampilkan informasi peminjaman ruang, seperti kode ruang, tanggal peminjaman, keperluan, status, dan jenis ruang.</p>
2. Menu Create
   <p>Menu untuk membuat peminjaman ruang baru dengan memasukkan informasi seperti kode ruang, tanggal peminjaman, keperluan, dan status. Setelah itu, peminjaman baru ditambahkan ke daftar peminjaman.<p>
3. Menu Update
   <p>Menu untuk mengubah status peminjaman ruang yang sudah ada. User akan diminta untuk memasukkan kode ruang yang ingin diupdate dan status baru</p>
4. Menu Delete
   <p>Menu untuk menghapus peminjaman ruang berdasarkan kode ruang yang dimasukkan oleh user. Jika peminjaman dengan kode tersebut ditemukan, maka akan dihapus dari daftar</p>
6. Keluar
   <p>Menu untuk keluar dari program. Setelah memilih opsi ini, program akan berhenti.</p>

<br>

# Penjelasan SourceCode
- Class Peminjaman <br>
  <p>Class ini merupakan entitas abstrak dalam program manajemen peminjaman ruang. Kelas ini mencakup properti seperti tanggal, keperluan, dan status untuk menyimpan informasi peminjaman. Dengan metode getter dan setter, class ini memfasilitasi akses dan pengubahan nilai propertinya. Terdapat juga method abstraksi yaitu showJenis(), yang perlu diimplementasikan oleh kelas turunannya, seperti kelas Ruang. Fungsi utamanya adalah menyediakan kerangka kerja untuk pengelolaan peminjaman ruang dengan menyediakan struktur yang terorganisir melalui konsep pewarisan class.</p>
  <br>
  <img width="580" alt="image" src="https://github.com/noviantisafitri/pbo-post-test-2/assets/121856489/bd532220-f654-4734-ad41-81267f17f5a5">
  <img width="580" alt="image" src="https://github.com/noviantisafitri/pbo-post-test-2/assets/121856489/c6d98fa4-bc6b-4b2e-a502-d8b30bdeb3da">

- Class Ruang <br>
  <p>Class ini merupakan bagian dari program manajemen peminjaman ruang yang memiliki atribut seperti kodeRuang, jenisRuang, tanggal, keperluan, 
    dan status. Dengan konstruktor yang menerima parameter, class ini memungkinkan pembuatan objek peminjaman ruang baru. Metode showJenis() mengembalikan 
    jenis ruang, dan terdapat pula metode getter dan setter untuk mengakses dan mengubah nilai atribut. Class Ruang berperan sebagai entitas yang merepresentasikan
    peminjaman ruang, memfasilitasi operasi-operasi manajemen peminjaman ruang seperti pembuatan, pembaruan, dan penghapusan peminjaman.</p>
    <br>
  <img width="570" alt="image" src="https://github.com/noviantisafitri/pbo-post-test-2/assets/121856489/e0b2885c-2dbd-4bf8-af2e-84d6cac6cad7">

- Class PeminjamanManagement <br>
  <p>Class ini adalahclass yang mengelola peminjaman ruang melalui interface/terminal. Class ini memiliki metode-metode untuk membuat, melihat, 
    mengupdate, dan menghapus peminjaman, serta mendapatkan peminjaman berdasarkan kode ruang. Program menggunakan ArrayList untuk menyimpan peminjaman dan 
    berinteraksi dengan objek dari kelas Ruang.</p>
    <br>
  <img width="570" alt="image" src="https://github.com/noviantisafitri/pbo-post-test-2/assets/121856489/fae98d9b-6718-4aea-a216-df98cd1e27b7">
  <img width="570" alt="image" src="https://github.com/noviantisafitri/pbo-post-test-2/assets/121856489/610515f8-04d3-4354-8825-f7674fafb89f">

- Class PeminjamanRuang (Main) <br>
  <p>Class ini adalah kelas utama yang mengontrol alur program manajemen peminjaman ruang. Dalam source code, terdapat inisialisasi objek Scanner dan
    PeminjamanManagement, serta implementasi menu interaktif dengan pilihan Read, Create, Update, Delete, dan Keluar. Program ini berjalan dalam loop hingga user
    memilih untuk keluar.</p>
    <br>
  <img width="650" alt="image" src="https://github.com/noviantisafitri/pbo-post-test-2/assets/121856489/334e58f2-18e2-460e-8949-78fd48fd2a2a">
  <img width="650" alt="image" src="https://github.com/noviantisafitri/pbo-post-test-2/assets/121856489/e59f335b-2e15-44e1-8303-4bec797f2945">
  <img width="650" alt="image" src="https://github.com/noviantisafitri/pbo-post-test-2/assets/121856489/f8a6200a-25c2-4585-ac2d-12fe33cbf024">
  <img width="650" alt="image" src="https://github.com/noviantisafitri/pbo-post-test-2/assets/121856489/282bbda0-c86e-4853-8d3b-c2f07ccd6f67">

<br>

# Penjelasan Output
1. Menu Utama <br>
   <br>
   <img width="500" alt="image" src="https://github.com/noviantisafitri/pbo-post-test-2/assets/121856489/afc9e7d6-2ba1-4e61-b59d-54fbf2f94301">
  
2. Menu Read <br>
   - Jika didalam ArrayList tidak terdapat data, maka outputnya adalah sebagai berikut. <br>
     <br>
     <img width="500" alt="image" src="https://github.com/noviantisafitri/pbo-post-test-2/assets/121856489/ad73448c-9371-450e-acf3-6f5991a5c094">
   - Jika didalam ArrayList terdapat data, maka outputnya adalah sebagai berikut. <br>
     <br>
     <img width="500" alt="image" src="https://github.com/noviantisafitri/pbo-post-test-2/assets/121856489/9759d0a2-d4e3-4194-8f20-eb238357c342">

3. Menu Create <br>
    <br>
    <img width="500" alt="image" src="https://github.com/noviantisafitri/pbo-post-test-2/assets/121856489/94922e33-193c-4275-b22e-efc0ae1333a0">
   
4. Menu Update <br>
    - Jika kode kelas ditemukan maka Update akan sukses. <br>
      <br>  
      <img width="500" alt="image" src="https://github.com/noviantisafitri/pbo-post-test-2/assets/121856489/d43fc4e1-b320-4a4e-bf8f-ccf23f3eb7a9">
      <img width="500" alt="image" src="https://github.com/noviantisafitri/pbo-post-test-2/assets/121856489/cd1bdcac-6026-46fe-ab6b-dc66e4f59095">
    - Jika kode kelas tidak ditemukan maka outputnya adalah sebagai berikut. <br>
      <br>
      <img width="500" alt="image" src="https://github.com/noviantisafitri/pbo-post-test-2/assets/121856489/39a44f78-7b8f-47fc-9e70-07b9ccf7da8f">

5. Menu Delete <br>
    - Jika kode kelas ditemukan maka kode kelas akan berhasil dihapus. <br>
      <img width="500" alt="image" src="https://github.com/noviantisafitri/pbo-post-test-2/assets/121856489/c785dc0a-97e2-47ce-a368-c18284bb7d10">
      <img width="500" alt="image" src="https://github.com/noviantisafitri/pbo-post-test-2/assets/121856489/b172f547-379a-4cfc-91bb-b3ecd70acf72">
    - Jika kode kelas ditemukan, maka outputnya adalah sebagai berikut. <br>
      <br>
      <img width="500" alt="image" src="https://github.com/noviantisafitri/pbo-post-test-2/assets/121856489/46e18de1-a72f-4073-bba3-47478d677509">

6. Keluar (End) <br>
    <p>Berikut adalah tampilan jika user telah memilih keluar dari program.</p><br>
    <img width="500" alt="image" src="https://github.com/noviantisafitri/pbo-post-test-2/assets/121856489/9bb607c4-25bc-4a62-9355-e78f7eea8fb8">
