package com.example.secondcom.model

import com.example.secondcom.R

data class News
    (
    var title : String, var desc: String, var photo: Int
)

object NewsModel{
    val newsList = listOf(
        News("Pasar Ramai di Kunjungi Warga Meskipun Wabah Covid 19 Belum di Nyatakan Usai","detikcom | 1 Jam Yang Lalu", R.drawable.img_news1),
        News("Kapal Nelayan Menyalurkan Bansos Masyarakat Sulawesi","detikcom | 2 Jam Yang Lalu", R.drawable.img_news2),
        News("Macet Mulai Terjadi di Wilayah Jalur Pemudik Semarang","detikcom | 3 Jam Yang Lalu",R.drawable.img_news3),
        News("Jelang New Normal Jakarta Macet Lagi","detikcom | 4 Jam Yang Lalu",R.drawable.img_news4),
        News("Dukung Indonesia Perangi COVID-19, Sampoerna Donasi Ventilator dan APD Full Set","detikcom | 5 Jam Yang Lalu",R.drawable.img_news5),
        News("Saat Risma Jelaskan soal Penanganan Corona pada Kepala BNPB dan Menkes","detikcom | 6 JamYang Lalu",R.drawable.img_news6),
        News("Banjir Kritik ke Trump yang Kerahkan Militer Usai Demo George Floyd","detikcom | 7 Jam Yang Lalu",R.drawable.img_news7),
        News("Mengapa Aksi Demo Damai Kasus George Floyd Bisa Berubah Jadi Kerusuhan?","detikcom | 8 Jam Yang Lalu",R.drawable.img_news8),
        News("2 Opsi bagi Calon Jemaah Haji yang Tak Jadi Berangkat Tahun Ini","detikcom | 1 Menit Yang Lalu",R.drawable.img_news9)
    )
}