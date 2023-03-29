package com.example.recyclerview

class Music(
    var image: Int,
    var song: String,
    var singer: String
) {
    companion object {
        fun getMock(): MutableList<Music> {
            return mutableListOf(
                Music(R.drawable.as_it_was, "As it was", "Harry Styles"),
                Music(R.drawable.boy_is_a_liar, "Boy is a liar", "PinkPantheress, Ice Spice"),
                Music(R.drawable.calm_down, "Calm Down", "Rema, Selena Gomez"),
                Music(R.drawable.creepin, "Creepin", "Metro Boomin, The Weeknd, 21 Savage"),
                Music(R.drawable.escapsism, "Escapsism", "Raye, 070 Shake"),
                Music(R.drawable.flowers, "Flowers", "Miley Cyrus"),
                Music(R.drawable.golden_hour, "Golden hour", "JVKE"),
                Music(R.drawable.here_with_we, "Here With Me", "d4vd"),
                Music(R.drawable.i_am_good, "I'm Good(Blue)", "David Guetta, Bebe Rexha"),
                Music(R.drawable.kill_bill, "Kill Bill", "SZA"),
                Music(R.drawable.la_bachata, "La Bachata", "Manuel Turizo"),
                Music(R.drawable.prc, "PRC", "Peso Pluma, Natanael Cano"),
                Music(
                    R.drawable.shakira,
                    "Shakira: Bzrp Music Sessions, Vol. 53",
                    "Bizarrap, Shakira"
                ),
                Music(R.drawable.snooze, "Snooze", "SZA"),
                Music(R.drawable.yandel, "Yandel 150", "Yandel, Feid"),


                )
        }
    }


}