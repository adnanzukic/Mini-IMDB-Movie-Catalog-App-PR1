package com.example.miniimdbmoviecatalogapppr1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MovieData {

    private static List<Movie> movies;

    public static List<Movie> getMovies() {
        if (movies == null) {
            movies = new ArrayList<>();

            movies.add(new Movie("The Shawshank Redemption", "Drama", 9.3,
                    R.drawable.poster_placeholder, "Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency. A story of hope and perseverance.",
                    new ArrayList<>(Arrays.asList(
                            new Actor("Tim Robbins", R.drawable.actor_placeholder),
                            new Actor("Morgan Freeman", R.drawable.actor_placeholder),
                            new Actor("Bob Gunton", R.drawable.actor_placeholder),
                            new Actor("William Sadler", R.drawable.actor_placeholder),
                            new Actor("Clancy Brown", R.drawable.actor_placeholder)
                    ))));

            movies.add(new Movie("The Godfather", "Crime", 9.2,
                    R.drawable.poster_placeholder, "The aging patriarch of an organized crime dynasty transfers control to his reluctant son. A masterpiece of American cinema.",
                    new ArrayList<>(Arrays.asList(
                            new Actor("Marlon Brando", R.drawable.actor_placeholder),
                            new Actor("Al Pacino", R.drawable.actor_placeholder),
                            new Actor("James Caan", R.drawable.actor_placeholder),
                            new Actor("Robert Duvall", R.drawable.actor_placeholder),
                            new Actor("Diane Keaton", R.drawable.actor_placeholder)
                    ))));

            movies.add(new Movie("The Dark Knight", "Action", 9.0,
                    R.drawable.poster_placeholder, "Batman faces the Joker, a criminal mastermind who wants to plunge Gotham into anarchy. An epic superhero film with deep themes.",
                    new ArrayList<>(Arrays.asList(
                            new Actor("Christian Bale", R.drawable.actor_placeholder),
                            new Actor("Heath Ledger", R.drawable.actor_placeholder),
                            new Actor("Aaron Eckhart", R.drawable.actor_placeholder),
                            new Actor("Michael Caine", R.drawable.actor_placeholder),
                            new Actor("Maggie Gyllenhaal", R.drawable.actor_placeholder)
                    ))));

            movies.add(new Movie("Pulp Fiction", "Crime", 8.9,
                    R.drawable.poster_placeholder, "The lives of two mob hitmen, a boxer, and a pair of bandits intertwine in four tales of violence and redemption.",
                    new ArrayList<>(Arrays.asList(
                            new Actor("John Travolta", R.drawable.actor_placeholder),
                            new Actor("Uma Thurman", R.drawable.actor_placeholder),
                            new Actor("Samuel L. Jackson", R.drawable.actor_placeholder),
                            new Actor("Bruce Willis", R.drawable.actor_placeholder),
                            new Actor("Harvey Keitel", R.drawable.actor_placeholder)
                    ))));

            movies.add(new Movie("Forrest Gump", "Drama", 8.8,
                    R.drawable.poster_placeholder, "The presidencies of Kennedy and Johnson, Vietnam, Watergate, and other history unfold through the perspective of an Alabama man.",
                    new ArrayList<>(Arrays.asList(
                            new Actor("Tom Hanks", R.drawable.actor_placeholder),
                            new Actor("Robin Wright", R.drawable.actor_placeholder),
                            new Actor("Gary Sinise", R.drawable.actor_placeholder),
                            new Actor("Sally Field", R.drawable.actor_placeholder),
                            new Actor("Mykelti Williamson", R.drawable.actor_placeholder)
                    ))));

            movies.add(new Movie("Inception", "Sci-Fi", 8.8,
                    R.drawable.poster_placeholder, "A thief who steals corporate secrets through dream-sharing technology is given the inverse task of planting an idea into a CEO's mind.",
                    new ArrayList<>(Arrays.asList(
                            new Actor("Leonardo DiCaprio", R.drawable.actor_placeholder),
                            new Actor("Joseph Gordon-Levitt", R.drawable.actor_placeholder),
                            new Actor("Elliot Page", R.drawable.actor_placeholder),
                            new Actor("Tom Hardy", R.drawable.actor_placeholder),
                            new Actor("Ken Watanabe", R.drawable.actor_placeholder)
                    ))));

            movies.add(new Movie("The Matrix", "Sci-Fi", 8.7,
                    R.drawable.poster_placeholder, "A computer hacker learns from mysterious rebels about the true nature of his reality and his role in the war against its controllers.",
                    new ArrayList<>(Arrays.asList(
                            new Actor("Keanu Reeves", R.drawable.actor_placeholder),
                            new Actor("Laurence Fishburne", R.drawable.actor_placeholder),
                            new Actor("Carrie-Anne Moss", R.drawable.actor_placeholder),
                            new Actor("Hugo Weaving", R.drawable.actor_placeholder),
                            new Actor("Joe Pantoliano", R.drawable.actor_placeholder)
                    ))));

            movies.add(new Movie("Goodfellas", "Crime", 8.7,
                    R.drawable.poster_placeholder, "The story of Henry Hill and his life in the mob, covering his relationship with his wife Karen and his partners Jimmy and Tommy.",
                    new ArrayList<>(Arrays.asList(
                            new Actor("Ray Liotta", R.drawable.actor_placeholder),
                            new Actor("Robert De Niro", R.drawable.actor_placeholder),
                            new Actor("Joe Pesci", R.drawable.actor_placeholder),
                            new Actor("Lorraine Bracco", R.drawable.actor_placeholder),
                            new Actor("Paul Sorvino", R.drawable.actor_placeholder)
                    ))));

            movies.add(new Movie("Interstellar", "Sci-Fi", 8.6,
                    R.drawable.poster_placeholder, "A team of explorers travel through a wormhole in space in an attempt to ensure humanity's survival.",
                    new ArrayList<>(Arrays.asList(
                            new Actor("Matthew McConaughey", R.drawable.actor_placeholder),
                            new Actor("Anne Hathaway", R.drawable.actor_placeholder),
                            new Actor("Jessica Chastain", R.drawable.actor_placeholder),
                            new Actor("Michael Caine", R.drawable.actor_placeholder),
                            new Actor("Matt Damon", R.drawable.actor_placeholder)
                    ))));

            movies.add(new Movie("Fight Club", "Drama", 8.8,
                    R.drawable.poster_placeholder, "An insomniac office worker and a devil-may-care soap maker form an underground fight club that evolves into something much more.",
                    new ArrayList<>(Arrays.asList(
                            new Actor("Brad Pitt", R.drawable.actor_placeholder),
                            new Actor("Edward Norton", R.drawable.actor_placeholder),
                            new Actor("Helena Bonham Carter", R.drawable.actor_placeholder),
                            new Actor("Meat Loaf", R.drawable.actor_placeholder),
                            new Actor("Jared Leto", R.drawable.actor_placeholder)
                    ))));

            movies.add(new Movie("The Silence of the Lambs", "Thriller", 8.6,
                    R.drawable.poster_placeholder, "A young FBI cadet must receive the help of an incarcerated and manipulative cannibal killer to catch another serial killer.",
                    new ArrayList<>(Arrays.asList(
                            new Actor("Jodie Foster", R.drawable.actor_placeholder),
                            new Actor("Anthony Hopkins", R.drawable.actor_placeholder),
                            new Actor("Scott Glenn", R.drawable.actor_placeholder),
                            new Actor("Ted Levine", R.drawable.actor_placeholder),
                            new Actor("Anthony Heald", R.drawable.actor_placeholder)
                    ))));

            movies.add(new Movie("Schindler's List", "History", 8.9,
                    R.drawable.poster_placeholder, "In German-occupied Poland during World War II, industrialist Oskar Schindler gradually becomes concerned for his Jewish workforce.",
                    new ArrayList<>(Arrays.asList(
                            new Actor("Liam Neeson", R.drawable.actor_placeholder),
                            new Actor("Ben Kingsley", R.drawable.actor_placeholder),
                            new Actor("Ralph Fiennes", R.drawable.actor_placeholder),
                            new Actor("Caroline Goodall", R.drawable.actor_placeholder),
                            new Actor("Jonathan Sagall", R.drawable.actor_placeholder)
                    ))));

            movies.add(new Movie("The Lord of the Rings", "Fantasy", 8.9,
                    R.drawable.poster_placeholder, "A meek Hobbit from the Shire and eight companions set out on a journey to destroy the powerful One Ring and save Middle-earth.",
                    new ArrayList<>(Arrays.asList(
                            new Actor("Elijah Wood", R.drawable.actor_placeholder),
                            new Actor("Ian McKellen", R.drawable.actor_placeholder),
                            new Actor("Orlando Bloom", R.drawable.actor_placeholder),
                            new Actor("Viggo Mortensen", R.drawable.actor_placeholder),
                            new Actor("Sean Astin", R.drawable.actor_placeholder)
                    ))));

            movies.add(new Movie("Gladiator", "Action", 8.5,
                    R.drawable.poster_placeholder, "A former Roman General sets out to exact vengeance against the corrupt emperor who murdered his family and sent him to slavery.",
                    new ArrayList<>(Arrays.asList(
                            new Actor("Russell Crowe", R.drawable.actor_placeholder),
                            new Actor("Joaquin Phoenix", R.drawable.actor_placeholder),
                            new Actor("Connie Nielsen", R.drawable.actor_placeholder),
                            new Actor("Oliver Reed", R.drawable.actor_placeholder),
                            new Actor("Derek Jacobi", R.drawable.actor_placeholder)
                    ))));

            movies.add(new Movie("The Lion King", "Animation", 8.5,
                    R.drawable.poster_placeholder, "Lion prince Simba and his father are targeted by his treacherous uncle, who wants to ascend the throne himself.",
                    new ArrayList<>(Arrays.asList(
                            new Actor("Matthew Broderick", R.drawable.actor_placeholder),
                            new Actor("Jeremy Irons", R.drawable.actor_placeholder),
                            new Actor("James Earl Jones", R.drawable.actor_placeholder),
                            new Actor("Moira Kelly", R.drawable.actor_placeholder),
                            new Actor("Nathan Lane", R.drawable.actor_placeholder)
                    ))));

            movies.add(new Movie("Titanic", "Romance", 7.9,
                    R.drawable.poster_placeholder, "A seventeen-year-old aristocrat falls in love with a kind but poor artist aboard the luxurious ill-fated R.M.S. Titanic.",
                    new ArrayList<>(Arrays.asList(
                            new Actor("Leonardo DiCaprio", R.drawable.actor_placeholder),
                            new Actor("Kate Winslet", R.drawable.actor_placeholder),
                            new Actor("Billy Zane", R.drawable.actor_placeholder),
                            new Actor("Kathy Bates", R.drawable.actor_placeholder),
                            new Actor("Frances Fisher", R.drawable.actor_placeholder)
                    ))));

            movies.add(new Movie("Avengers: Endgame", "Action", 8.4,
                    R.drawable.poster_placeholder, "After the devastating events of Infinity War, the Avengers assemble once more to reverse Thanos' actions and restore balance.",
                    new ArrayList<>(Arrays.asList(
                            new Actor("Robert Downey Jr.", R.drawable.actor_placeholder),
                            new Actor("Chris Evans", R.drawable.actor_placeholder),
                            new Actor("Mark Ruffalo", R.drawable.actor_placeholder),
                            new Actor("Chris Hemsworth", R.drawable.actor_placeholder),
                            new Actor("Scarlett Johansson", R.drawable.actor_placeholder)
                    ))));

            movies.add(new Movie("Joker", "Drama", 8.4,
                    R.drawable.poster_placeholder, "A mentally troubled stand-up comedian embarks on a downward spiral that leads to the creation of an iconic villain.",
                    new ArrayList<>(Arrays.asList(
                            new Actor("Joaquin Phoenix", R.drawable.actor_placeholder),
                            new Actor("Robert De Niro", R.drawable.actor_placeholder),
                            new Actor("Zazie Beetz", R.drawable.actor_placeholder),
                            new Actor("Frances Conroy", R.drawable.actor_placeholder),
                            new Actor("Brett Cullen", R.drawable.actor_placeholder)
                    ))));

            movies.add(new Movie("Parasite", "Thriller", 8.5,
                    R.drawable.poster_placeholder, "Greed and class discrimination threaten the newly formed symbiotic relationship between the wealthy Park family and the destitute Kim clan.",
                    new ArrayList<>(Arrays.asList(
                            new Actor("Song Kang-ho", R.drawable.actor_placeholder),
                            new Actor("Lee Sun-kyun", R.drawable.actor_placeholder),
                            new Actor("Cho Yeo-jeong", R.drawable.actor_placeholder),
                            new Actor("Choi Woo-shik", R.drawable.actor_placeholder),
                            new Actor("Park So-dam", R.drawable.actor_placeholder)
                    ))));

            movies.add(new Movie("Whiplash", "Drama", 8.5,
                    R.drawable.poster_placeholder, "A promising young drummer enrolls at a cut-throat music conservatory where his dreams of greatness are mentored by an instructor who will stop at nothing.",
                    new ArrayList<>(Arrays.asList(
                            new Actor("Miles Teller", R.drawable.actor_placeholder),
                            new Actor("J.K. Simmons", R.drawable.actor_placeholder),
                            new Actor("Melissa Benoist", R.drawable.actor_placeholder),
                            new Actor("Paul Reiser", R.drawable.actor_placeholder),
                            new Actor("Austin Stowell", R.drawable.actor_placeholder)
                    ))));
        }
        return movies;
    }
}