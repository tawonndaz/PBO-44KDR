class mobil {
    var warna = ""
    var tahunproduksi = 0
    var hidupkan = ""
    var matikan = ""
    var gigi = 0
}

fun main() {
    val x = mobil()
    x.warna = "Putih"
    x.tahunproduksi = 2020
    x.hidupkan = "mesin nyala"
    x.matikan = "mesin meninggal"
    x.gigi = 3

    println("Warna Mobilku :"+x.warna)
    println("Tahun Produksi Mobil :"+x.tahunproduksi)
    println("Engine Start :"+x.hidupkan)
    println("Engine Stop :"+x.matikan)
    println("Masuk ke Gigi :"+x.gigi)
}