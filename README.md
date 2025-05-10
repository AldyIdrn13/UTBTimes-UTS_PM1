# 📰 UTB Times - News Portal App

**UTB Times** adalah aplikasi portal berita sederhana berbasis Android yang dikembangkan sebagai tugas Ujian Tengah Semester (UTS) mata kuliah **Pemrograman Mobile 1** di Universitas Teknologi Bandung.

---

## 📱 Fitur Aplikasi

- ✅ Splash Screen saat aplikasi dibuka pertama kali.
- ✅ Halaman Login dengan validasi email dan password.
- ✅ Halaman Register untuk mendaftarkan pengguna baru.
- ✅ Dashboard utama yang menampilkan daftar berita.
- ✅ Menggunakan `RecyclerView` untuk list berita yang dinamis.

---

## 🛠️ Teknologi yang Digunakan

- **Bahasa:** Kotlin
- **Framework:** Android SDK
- **UI Components:** 
  - EditText, Button, TextView
  - RecyclerView
  - Toast
  - Intent & Activity
- **Library:** AndroidX, Material Design Components

---

## 📂 Struktur Aktivitas

| Activity               | Fungsi                                                                 |
|------------------------|------------------------------------------------------------------------|
| `SplashScreenActivity` | Menampilkan splash screen selama 3 detik                               |
| `LoginActivity`        | Form login pengguna, validasi, dan navigasi ke dashboard               |
| `RegisterActivity`     | Form registrasi pengguna dan navigasi ke halaman login                 |
| `NewsPortalDashboard`  | Menampilkan daftar berita menggunakan `RecyclerView`                   |
| `NewsAdapter`          | Adapter untuk menghubungkan data berita dengan `RecyclerView`          |
| `NewsItem`             | Data model untuk item berita (judul, gambar, waktu)                    |

---

## 📸 Preview 

-

---

## 👨‍💻 Developer

- **Nama:** Aldy Indrawan  
- **NIM:** 23552011346  
- **Mata Kuliah:** Pemrograman Mobile 1  
- **Dosen Pengampu:** Nova Agustina, M.Kom

---

## 📌 License

Proyek ini hanya untuk keperluan pembelajaran dan tugas kuliah. Tidak untuk digunakan secara komersial.

