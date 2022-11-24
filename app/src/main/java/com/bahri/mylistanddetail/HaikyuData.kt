package com.bahri.mylistanddetail

object HaikyuData {
    private var data = arrayOf(
        arrayOf(
            "Daichi Sawamura",
            R.drawable.daichi,
            "Posisi : Kapten, Wing Spiker\n" +
            "Tinggi : 176.8 cm\n" +
                    "Jenis Kelamin : Pria\n" +
                    "Nomor Punggung : 1",
            "4.8"
        ),
        arrayOf(
            "Shoyo Hinata",
            R.drawable.hinata,
            "Posisi : Middle Blocker\n" +
                    "Tinggi : 164.2 cm\n" +
                    "Jenis kelamin : Pria\n" +
                    "Nomor punggung : 10",
            "5.0"
        ),
        arrayOf(
            "Tobio Kageyama",
            R.drawable.kageyama,
            "Posisi : Setter\n" +
                    "Tinggi : 181.9 cm\n" +
                    "Jenis kelamin : Pria\n" +
                    "Nomor punggung : 9",
            "4.9"
        ),
        arrayOf(
            "Asahi Azumane",
            R.drawable.lima,
            "Posisi : Ace, Wing Spiker\n" +
                    "Tinggi : 184.7 cm\n" +
                    "Jenis kelamin : Pria\n" +
                    "Nomor punggung : 3",
            "4.8"
        ),
        arrayOf(
            "Kazuhito Narita",
            R.drawable.narita,
            "Posisi : Middle Blocker\n" +
                    "Tinggi : 180.9\n" +
                    "Jenis kelamin : Pria\n" +
                    "Nomor punggung : 8",
            "4.3"
        ),
        arrayOf(
            "Yu Nishinoya",
            R.drawable.nishinoya,
            "Posisi : Libero\n" +
                    "Tinggi : 160.5 cm\n" +
                    "Jenis kelamin : Pria\n" +
                    "Nomor punggung : 4",
            "4.8/5"
        ),
        arrayOf(
            "Koshi Sugawara",
            R.drawable.suga,
            "Posisi : Setter\n" +
                    "Tinggi : 174.6 cm\n" +
                    "Jenis kelamin : Pria\n" +
                    "Nomor Punggung : 2",
            "4.6"
        ),
        arrayOf(
            "Ryunosuke Tanaka",
            R.drawable.tanaka,
            "Posisi : Wing Spiker\n" +
                    "Tinggi : 178.2 cm\n" +
                    "Jenis kelamin : Pria\n" +
                    "Nomor punggung : 5",
            "4.6"
        ),
        arrayOf(
            "Kei Tsukishima",
            R.drawable.tsukhisima,
            "Posisi : Middle Bloker\n" +
                    "Tinggi : 190.1 cm\n" +
                    "Jenis kelamin : Pria\n" +
                    "Nomor punggung : 11",
            "4.5"
        ),
        arrayOf(
            "Tadashi Yamaguchi",
            R.drawable.yamaguchi,
            "Posisi : Pinch Server\n" +
                    "Tinggi : 180 cm\n" +
                    "Jenis kelamin : Pria\n" +
                    "Nomor punggung : 12",
            "4.4"
        ),
    )
    val listData: ArrayList<Haikyu>
        get() {
            val list = ArrayList<Haikyu>()
            for (aData in data) {
                val haikyu = Haikyu()
                haikyu.name = aData[0].toString()
                haikyu.photo = aData[1].toString().toInt()
                haikyu.desc = aData[2].toString()
                haikyu.rate = aData[3].toString()

                list.add(haikyu)
            }
            return list
        }
}
