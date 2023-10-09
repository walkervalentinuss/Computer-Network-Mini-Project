# Computer-Network-Mini-Project

## Aplikasi Chat Server-Client
Aplikasi ini adalah contoh sederhana dari sebuah server chat yang memungkinkan beberapa klien terhubung dan saling berkomunikasi melalui teks. Terdapat tiga kelas utama dalam aplikasi ini: Client, ClientHandler, dan Server.

## 1. Client (client.java)
Kelas Client digunakan untuk mengelola klien chat. Beberapa fitur utama dari Client:

- Mengirim pesan: Klien dapat mengirim pesan teks ke server.
- Mendengarkan pesan: Klien dapat mendengarkan pesan yang diterima dari server dan mencetaknya ke layar.

## 2. ClientHandler (clientHandler.java)
Kelas ClientHandler digunakan untuk mengelola setiap koneksi klien ke server. Fitur-fitur utama dari ClientHandler:

- Menerima pesan dari klien: ClientHandler dapat menerima pesan yang dikirim oleh klien yang terhubung.
- Mengirim pesan ke semua klien: ClientHandler dapat mengirim pesan yang diterima dari salah satu klien ke semua klien lainnya.

3. Server (Server.java)
Kelas Server adalah kelas utama untuk menjalankan server chat. Beberapa fitur utama dari Server:

- Menerima koneksi klien: Server menerima koneksi klien yang mencoba terhubung ke server.
- Menginisialisasi ClientHandler: Setiap koneksi klien baru akan diurus oleh ClientHandler yang berjalan dalam thread terpisah.
- Menjalankan server: Server akan terus berjalan dan menerima koneksi klien hingga ditutup.

## Cara Menjalankan Aplikasi
- Jalankan Server.java untuk memulai server chat.
- Jalankan beberapa instance Client.java untuk memulai klien chat.
- Setiap klien dapat memasukkan nama pengguna dan mulai mengirim pesan.
- Pesan yang dikirim oleh satu klien akan diterima oleh semua klien lain yang terhubung ke server.

## Cara Menutup Aplikasi
- Untuk menutup klien chat, cukup matikan program klien dengan menekan Ctrl+C.
- Untuk menutup server chat, cukup matikan program server dengan menekan Ctrl+C.
- Selamat mencoba aplikasi chat server-client sederhana ini! Jangan ragu untuk mengirim pesan kepada sesama pengguna untuk berkomunikasi.
