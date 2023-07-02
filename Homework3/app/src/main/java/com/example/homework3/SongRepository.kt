package com.example.homework3

object SongRepository {

    val list: List<Song> = listOf(
        Song(id = 11133, url = "https://music.yandex.ru/album/295708/track/2758009",
            name = "The Show Must Go On", singer = "Queen", description = "Автор текста\n" +
                "Freddie Mercury, Brian May, Roger Taylor, John Deacon\n" +
                "Источник фонограммы\n" +
                "Universal International, Queen", picture = R.drawable.theshowmustgoon),

        Song(id = 12852, url = "https://music.yandex.ru/album/1609071/track/14690772",
            name = "Dark Horse", singer = "Katy Perry, Juicy J", description = "Автор текста\n" +
                    "Katy Perry, Sarah Hudson, Lukasz Gottwald, Jordan Houston, Henry Walter, Max Martin\n" +
                    "Источник фонограммы\n" +
                    "Capitol", picture = R.drawable.darkhorse),

        Song(id = 12232, url = "https://music.yandex.ru/album/625175/track/3616433",
            name = "Summertime Sadness", singer = "Lana Del Rey", description = "Автор текста\n" +
                    "Rick Nowels, Elizabeth Grant\n" +
                    "Источник фонограммы\n" +
                    "Lana Del Rey", picture = R.drawable.summertimesadness),

        Song(id = 21232, url = "https://music.yandex.ru/album/5313/track/637882",
            name = "Umbrella", singer = "Rihanna, Jay-Z", description = "Автор текста\n" +
                    "Terius Nash, Shawn Carter, Thaddis Laphonia Harrell\n" +
                    "Источник фонограммы\n" +
                    "The Island Def Jam", picture = R.drawable.umbrella),

        Song(id = 21342, url = "https://music.yandex.ru/album/57344/track/39844167",
            name = "Moscow Never Sleeps", singer = "DJ SMASH", description = "Автор музыки\n" +
                    "DJ SMASH\n" +
                    "Источник фонограммы\n" +
                    "Shirman", picture = R.drawable.moscowneversleeps),

        Song(id = 86552, url = "https://music.yandex.ru/album/5313/track/637882",
            name = "Знаешь ли ты", singer = "МакSим", description = "Автор текста\n" +
                    "Marina Sergeevna Maksimova\n" +
                    "Источник фонограммы\n" +
                    "SBA Production LLC, a Warner Music Group Company, Gala Records", picture = R.drawable.znaeshlity),

        Song(id = 20232, url = "https://music.yandex.ru/album/2785/track/33627",
            name = "Say It Right", singer = "Nelly Furtado", description = "Автор текста\n" +
                    "Nelly Furtado, Tim Mosley, Nate Hills\n" +
                    "Источник фонограммы\n" +
                    "Mosley, Geffen", picture = R.drawable.sayitright),

        Song(id = 84654, url = "https://music.yandex.ru/album/4418923/track/70443",
            name = "Barbie Girl", singer = "Aqua", description = "Автор текста\n" +
                    "Lene, Karsten Dahlgaard, Søren Rasted, Claus Norreen, Johnny Pedersen, René Dif\n" +
                    "Источник фонограммы\n" +
                    "Universal Music (Denmark) A, S Records", picture = R.drawable.barbiegirl),

        Song(id = 53292, url = "https://music.yandex.ru/album/169068/track/417474",
            name = "Empire State Of Mind", singer = "Jay-Z", description = "Автор текста\n" +
                    "Alicia Keys, Shawn Carter, Sylvia Robinson, Alexander Shuckburgh, Bert Keyes, A. Hunte\n" +
                    "Источник фонограммы\n" +
                    "S. Carter Enterprises", picture = R.drawable.empirestateofmind),

        Song(id = 35332, url = "https://music.yandex.ru/album/169065/track/923037",
            name = "Just A Dream", singer = "Nelly", description = "Автор текста\n" +
                    "Damon Sharpe, David Ryan Harris, Frank Romano, Richard Butler, James Scheffer, Cornell Haynes, Jr.\n" +
                    "Источник фонограммы\n" +
                    "Universal Music", picture = R.drawable.justadream),

        Song(id = 76743, url = "https://music.yandex.ru/album/357676/track/3401738",
            name = "What Is Love?", singer = "Haddaway", description = "Автор текста\n" +
                    "Junior Torello\n" +
                    "Источник фонограммы\n" +
                    "-", picture = R.drawable.whatislove),

        Song(id = 12345, url = "https://music.yandex.ru/album/7913194/track/54719915",
            name = "Umbrella", singer = "La Bouche", description = "Автор текста\n" +
                    "Uli Brenner, Frank Farian, Gerd Amir Saraf\n" +
                    "Источник фонограммы\n" +
                    "Alpha", picture = R.drawable.umbrella),

        Song(id = 26432, url = "https://music.yandex.ru/album/5313/track/637882",
            name = "Umbrella", singer = "Rihanna, Jay-Z", description = "Автор текста\n" +
                    "Terius Nash, Shawn Carter, Thaddis Laphonia Harrell\n" +
                    "Источник фонограммы\n" +
                    "The Island Def Jam", picture = R.drawable.umbrella),

        Song(id = 21332, url = "https://music.yandex.ru/album/5313/track/637882",
            name = "Umbrella", singer = "Rihanna, Jay-Z", description = "Автор текста\n" +
                    "Terius Nash, Shawn Carter, Thaddis Laphonia Harrell\n" +
                    "Источник фонограммы\n" +
                    "The Island Def Jam", picture = R.drawable.umbrella),

        Song(id = 0, url = "-",
            name = "-", singer = "-", description = "-", picture = R.drawable.notes)
        )

    fun findSongById(id: Int): Song{
        for(n in 1..list.size){
            if(list[n].id == id) return list[n]
        }
        return list[list.size - 1]
    }
}