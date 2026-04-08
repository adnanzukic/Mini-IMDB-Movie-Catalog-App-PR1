# Mini IMDB – Movie Catalog App
Ovo je android aplikacija koja omogućava pregled do 20 filmova na svojoj početnoj stranici. Filmovi su poredani jedan ispod drugog i metodom skrolanja se pregledavaju. 
Aplikacija prikazuje filmove sa orginalnim posterima, žanr, ocjena, podaci o glumcima i slično...

## Funkcije aplikacije

- Pregled 20 filmova sa originalnim posterima, žanrom i ocjenom
- Klik na film otvara stranicu sa detaljnim informacijama o filmu
- Prikaz glumaca za svaki film
- Ocjenjivanje filmova putem zvjezdica
- Pretraživanje filmova po nazivu
- Dodavanje filmova u favorite i pregled liste favorita

 ## Tehnologije
 
- Java
- Android Studio Panda 3
- RecyclerView za prikaz liste filmova
- Multiple Activities (MainActivity, MovieDetailsActivity, FavoritesActivity)

## Pokretanje projekta

1. Instaliraj Android Studio i Java JDK 21
2. Kloniraj repozitorij
3. Otvori projekt u Android Studiju
4. Pokreni na emulatoru ili fizičkom uređaju (minimalno Android 7.0 / API 24)

## Struktura projekta

- `MainActivity.java` - glavna stranica sa listom filmova i pretragom
- `MovieDetailsActivity.java` - stranica sa detaljima filma
- `FavoritesActivity.java` - stranica sa listom omiljenih filmova
- `Movie.java` - klasa koja predstavlja film
- `Actor.java` - klasa koja predstavlja glumca
- `MovieAdapter.java` - adapter za prikaz filmova u listi
- `ActorAdapter.java` - adapter za prikaz glumaca
- `MovieData.java` - podaci o filmovima
