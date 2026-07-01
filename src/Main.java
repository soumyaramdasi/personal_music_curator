//importing the entire java.util package
import java.util.*;

//Abstract base class for languages
abstract class Language {

    //Instance variables
    public String lang; //Language name
    public ArrayList<String> preferredGenres; //ArrayList for genres per language

    //Parameterised constructor
    public Language(String lang) {

        this.lang = lang;
        this.preferredGenres = new ArrayList<>(); //Creating ArrayList for preferred genres per language
    }
}

//Concrete language subclasses
class English extends Language {

    public English() {

        super("English"); //Call to parent class constructor
    
        // adding genres in the ArrayList for English
        preferredGenres.add("Pop");
        preferredGenres.add("Hip-Hop");
        preferredGenres.add("Rap");
        preferredGenres.add("Rock");
        preferredGenres.add("Dance");
        preferredGenres.add("Disco");
        preferredGenres.add("Alt Rock");
        preferredGenres.add("Indie");
        preferredGenres.add("Grunge");
        preferredGenres.add("R&B");
    }
}

class Hindi extends Language {

    //constructor
    public Hindi() {

        super("Hindi"); //Call to parent class constructor

        //adding genres in the ArrayList for Hindi
        preferredGenres.add("Pop");
        preferredGenres.add("Film Songs");
        preferredGenres.add("Disco");
        preferredGenres.add("Ghazal");
        preferredGenres.add("Sad");
        preferredGenres.add("Fusion");
        preferredGenres.add("Rap");
        preferredGenres.add("Sufi");
	}
}

//Song class to store details related to the song
class Song {

    String title;
    String artist;
    String language; //english, hindi
    String genre; //according to language and decade
    int decade; //1980, 1990, 2000, 2010
    String url;

    //Parameterised constructor to initialise details
    public Song(String title, String artist, String language, String genre, int decade, String url) {

        this.title = title;
        this.artist = artist;
        this.language = language;
        this.genre = genre;
        this.decade = decade;
        this.url = url;
    }
}

//Class to create the music library
class Music {

    public ArrayList<Song> songs; //ArrayList to store songs as objects of the Song class

    //Constructor
    public Music() {

        songs = new ArrayList<>();

        // ==========================================
        // ENGLISH SONGS
        // ==========================================

        // --- 1980s English ---
        // Pop
        songs.add(new Song("Mamma Mia!", "ABBA", "English", "Pop", 1980, "https://www.youtube.com/watch?v=unfzfe8f9NI"));
        songs.add(new Song("Every Breath You Take", "The Police", "English", "Pop", 1980, "https://www.youtube.com/watch?v=OMOGaugKpzs"));
        songs.add(new Song("Billie Jean", "Michael Jackson", "English", "Pop", 1980, "https://www.youtube.com/watch?v=Zi_XLOBDo_Y"));
        songs.add(new Song("Careless Whisper", "George Michael", "English", "Pop", 1980, "https://www.youtube.com/watch?v=izGwDsrQ1eQ"));
        songs.add(new Song("Summer of ‘69", "Bryan Adams", "English", "Pop", 1980, "https://www.youtube.com/watch?v=e7iKrBe6H_M"));
        songs.add(new Song("Never Gonna Give You Up", "Rick Astley", "English", "Pop", 1980, "https://www.youtube.com/watch?v=dQw4w9WgXcQ"));
        songs.add(new Song("Everybody Wants to Rule the World", "Tears for Fears", "English", "Pop", 1980, "https://www.youtube.com/watch?v=aGCdLKXNF3w"));
        songs.add(new Song("Girls Just Wanna Have Fun", "Cyndi Lauper", "English", "Pop", 1980, "https://www.youtube.com/watch?v=PIb6AZdTr-A"));
        songs.add(new Song("Come On Eileen", "Dexys Midnight Runners", "English", "Pop", 1980, "https://www.youtube.com/watch?v=ASwge9wc-eI"));
        
        // Rock
        songs.add(new Song("Livin' on a Prayer", "Bon Jovi", "English", "Rock", 1980, "https://www.youtube.com/watch?v=lDK9QqIzhwk"));
        songs.add(new Song("Sweet Child O' Mine", "Guns N’ Roses", "English", "Rock", 1980, "https://www.youtube.com/watch?v=1w7OgIMMRc4"));
        songs.add(new Song("Another One Bites the Dust", "Queen", "English", "Rock", 1980, "https://www.youtube.com/watch?v=rY0WxgSXdEE"));
        songs.add(new Song("The Number of the Beast", "Iron Maiden", "English", "Rock", 1980, "https://www.youtube.com/watch?v=WxnN05vOuSM"));
        songs.add(new Song("Another Brick in the Wall, Part 2", "Pink Floyd", "English", "Rock", 1980, "https://www.youtube.com/watch?v=HrxX9TBj2zY"));
        songs.add(new Song("Highway To Hell", "AC/DC", "English", "Rock", 1980, "https://www.youtube.com/watch?v=ikFFVfObwss"));
        songs.add(new Song("Waiting on a Friend", "The Rolling Stones", "English", "Rock", 1980, "https://www.youtube.com/watch?v=MKLVmBBTve0"));
        
        // Dance
        songs.add(new Song("Take On Me", "a-ha", "English", "Dance", 1980, "https://www.youtube.com/watch?v=djV11Xbc914"));
        songs.add(new Song("Sweet Dreams (Are Made Of This)", "Eurythmics", "English", "Dance", 1980, "https://www.youtube.com/watch?v=qeMFqkcPYcg"));
        songs.add(new Song("Tainted Love", "Soft Cell", "English", "Dance", 1980, "https://www.youtube.com/watch?v=XZVpR3Ot-6U"));
        songs.add(new Song("Don’t You Want Me", "The Human League", "English", "Dance", 1980, "https://www.youtube.com/watch?v=uPudE8nDog0"));
        songs.add(new Song("West End Girls", "Pet Shop Boys", "English", "Dance", 1980, "https://www.youtube.com/watch?v=p3j2NYZ8FKs"));
        songs.add(new Song("Blue Monday", "New Order", "English", "Dance", 1980, "https://www.youtube.com/watch?v=FYH8DsU2WCk"));
        
        // Indie
        songs.add(new Song("How Soon Is Now?", "The Smiths", "English", "Indie", 1980, "https://www.youtube.com/watch?v=hnpILIIo9ek"));
        songs.add(new Song("Love Will Tear Us Apart", "Joy Division", "English", "Indie", 1980, "https://www.youtube.com/watch?v=zuuObGsB0No"));
        songs.add(new Song("A Forest", "The Cure", "English", "Indie", 1980, "https://www.youtube.com/watch?v=RGT4V6JmINA"));
        songs.add(new Song("She Sells Sanctuary", "The Cult", "English", "Indie", 1980, "https://www.youtube.com/watch?v=8I8mWG6O2_k"));

        // --- 1990s English ---
        // Pop
        songs.add(new Song("Barbie Girl", "Aqua", "English", "Pop", 1990, "https://www.youtube.com/watch?v=ZyhrYis509A"));
        songs.add(new Song("I Want It That Way", "Backstreet Boys", "English", "Pop", 1990, "https://www.youtube.com/watch?v=4fndeDfaWCg"));
        songs.add(new Song("...Baby One More Time", "Britney Spears", "English", "Pop", 1990, "https://www.youtube.com/watch?v=C-u5WLJ9Yk4"));
        songs.add(new Song("Wannabe", "Spice Girls", "English", "Pop", 1990, "https://www.youtube.com/watch?v=gJLIiF15wjQ"));
        songs.add(new Song("No Scrubs", "TLC", "English", "Pop", 1990, "https://www.youtube.com/watch?v=FrLequ6dUdM"));
        songs.add(new Song("Wonderwall", "Oasis", "English", "Pop", 1990, "https://www.youtube.com/watch?v=6hzrDeceEKc"));
        
        // Hip-Hop
        songs.add(new Song("California Love", "2Pac", "English", "Hip-Hop", 1990, "https://www.youtube.com/watch?v=5wBTdfAkqGU"));
        songs.add(new Song("Elevators (Me & You)", "Outkast", "English", "Hip-Hop", 1990, "https://www.youtube.com/watch?v=9B6Z7pI4Qw4"));
        songs.add(new Song("Ice Ice Baby", "Vanilla Ice", "English", "Hip-Hop", 1990, "https://www.youtube.com/watch?v=rog8ou-ZepE"));
        songs.add(new Song("They Reminisce Over You", "Pete Rock & C.L. Smooth", "English", "Hip-Hop", 1990, "https://www.youtube.com/watch?v=FiOcVWQY2bc"));
        songs.add(new Song("Still D.R.E", "Dr. Dre & Snoop Dogg", "English", "Hip-Hop", 1990, "https://www.youtube.com/watch?v=_CL6n0FJZpk"));
        songs.add(new Song("Hypnotize", "The Notorious B.I.G.", "English", "Hip-Hop", 1990, "https://www.youtube.com/watch?v=glEiPXAYE-U"));

        // Grunge / Rock
        songs.add(new Song("Smells Like Teen Spirit", "Nirvana", "English", "Grunge", 1990, "https://www.youtube.com/watch?v=hTWKbfoikeg"));
        songs.add(new Song("The Show Must Go On", "Queen", "English", "Rock", 1990, "https://www.youtube.com/watch?v=t99KH0TR-J4"));
        songs.add(new Song("Would?", "Alice in Chains", "English", "Grunge", 1990, "https://www.youtube.com/watch?v=Nco_kh8xJDs"));
        songs.add(new Song("Man in the Box", "Alice in Chains", "English", "Grunge", 1990, "https://www.youtube.com/watch?v=TAqZb52sgpU"));
        songs.add(new Song("Heart-Shaped Box", "Nirvana", "English", "Grunge", 1990, "https://www.youtube.com/watch?v=n6P0SitRgz8"));
        songs.add(new Song("Black Hole Sun", "Soundgarden", "English", "Grunge", 1990, "https://www.youtube.com/watch?v=3mbBbFH9fAg"));

        // --- 2000s English ---
        // Pop
        songs.add(new Song("Hips Don't Lie", "Shakira", "English", "Pop", 2000, "https://www.youtube.com/watch?v=DUT5rEU6pqM"));
        songs.add(new Song("Toxic", "Britney Spears", "English", "Pop", 2000, "https://www.youtube.com/watch?v=LOZuxwVk7TU"));
        songs.add(new Song("Crazy in Love", "Beyoncé", "English", "Pop", 2000, "https://www.youtube.com/watch?v=3tmd-ClpJxA"));
        songs.add(new Song("In Da Club", "50 Cent", "English", "Pop", 2000, "https://www.youtube.com/watch?v=N250fUEO2Vs"));
        songs.add(new Song("Oops! I Did It Again", "Britney Spears", "English", "Pop", 2000, "https://www.youtube.com/watch?v=CduA0TULnow"));
        songs.add(new Song("Teenage Dirtbag", "Wheatus", "English", "Pop", 2000, "https://www.youtube.com/watch?v=R-S-L2BTheI"));
        songs.add(new Song("One Less Lonely Girl", "Justin Bieber", "English", "Pop", 2000, "https://www.youtube.com/watch?v=LXUSaVw3Mug"));
        songs.add(new Song("Just Dance", "Lady Gaga ft. Colby O’Donis", "English", "Pop", 2000, "https://www.youtube.com/watch?v=2Abk1jAONjw"));
        
        // Indie
        songs.add(new Song("Mr. Brightside", "The Killers", "English", "Indie", 2000, "https://www.youtube.com/watch?v=gGdGFtwCNBE"));
        songs.add(new Song("Take Me Out", "Franz Ferdinand", "English", "Indie", 2000, "https://www.youtube.com/watch?v=Ijk4j-r7qPA"));
        songs.add(new Song("Float On", "Modest Mouse", "English", "Indie", 2000, "https://www.youtube.com/watch?v=CTAud5O7Qqk"));
        songs.add(new Song("505", "Arctic Monkeys", "English", "Indie", 2000, "https://www.youtube.com/watch?v=qU9mHegkTc4"));
        songs.add(new Song("Yellow", "Coldplay", "English", "Indie", 2000, "https://www.youtube.com/watch?v=yKNxeF4KMsY"));
        songs.add(new Song("Somewhere Only We Know", "Keane", "English", "Indie", 2000, "https://www.youtube.com/watch?v=Oextk-If8HQ"));
        songs.add(new Song("We Are the People", "Empire of the Sun", "English", "Indie", 2000, "https://www.youtube.com/watch?v=hN5X4kGhAtU"));
        
        // Alt-Rock
        songs.add(new Song("In the End", "Linkin Park", "English", "Alt Rock", 2000, "https://www.youtube.com/watch?v=eVTXPUF4Oz4"));
        songs.add(new Song("Bring Me To Life", "Evanescence", "English", "Alt Rock", 2000, "https://www.youtube.com/watch?v=3YxaaGgTQYM"));
        songs.add(new Song("Boulevard of Broken Dreams", "Green Day", "English", "Alt Rock", 2000, "https://www.youtube.com/watch?v=Soa3gO7tL-c"));
        songs.add(new Song("Seven Nation Army", "The White Stripes", "English", "Alt Rock", 2000, "https://www.youtube.com/watch?v=0J2QdDbelmY"));
        songs.add(new Song("Kryptonite", "3 Doors Down", "English", "Alt Rock", 2000, "https://www.youtube.com/watch?v=NtBwVWWa3Ss"));

        // R&B
        songs.add(new Song("Umbrella", "Rihanna", "English", "R&B", 2000, "https://www.youtube.com/watch?v=CvBfHwUxHIk"));
        songs.add(new Song("Let Me Love You", "Mario", "English", "R&B", 2000, "https://www.youtube.com/watch?v=H64QG4UsrGI"));
        songs.add(new Song("Fallin’", "Alicia Keys", "English", "R&B", 2000, "https://www.youtube.com/watch?v=Urdlvw0SSEc"));
        songs.add(new Song("Cry Me a River", "Justin Timberlake", "English", "R&B", 2000, "https://www.youtube.com/watch?v=DksSPZTZRel"));
        songs.add(new Song("Milkshake", "Kelis", "English", "R&B", 2000, "https://www.youtube.com/watch?v=6AwX_Zk5yvA"));

        // --- 2010s English ---
        // Pop
        songs.add(new Song("Shape of You", "Ed Sheeran", "English", "Pop", 2010, "https://www.youtube.com/watch?v=JGwWNGJdvx8"));
        songs.add(new Song("Blinding Lights", "The Weeknd", "English", "Pop", 2010, "https://www.youtube.com/watch?v=4NRXx6U8ABQ"));
        songs.add(new Song("Baby", "Justin Bieber", "English", "Pop", 2010, "https://www.youtube.com/watch?v=kffacxfA7G4"));
        songs.add(new Song("Look What You Made Me Do", "Taylor Swift", "English", "Pop", 2010, "https://www.youtube.com/watch?v=3tmd-ClpJ8U"));
        songs.add(new Song("Blank Space", "Taylor Swift", "English", "Pop", 2010, "https://www.youtube.com/watch?v=e-ORhEE9VVg"));
        songs.add(new Song("Rolling in the Deep", "Adele", "English", "Pop", 2010, "https://www.youtube.com/watch?v=lazyDlfaptM"));
        songs.add(new Song("Call Me Maybe", "Carly Rae Jepsen", "English", "Pop", 2010, "https://www.youtube.com/watch?v=fWNaR-rxAic"));
        songs.add(new Song("What Makes You Beautiful", "One Direction", "English", "Pop", 2010, "https://www.youtube.com/watch?v=QJO3ROT-A4E"));
        songs.add(new Song("Best Song Ever", "One Direction", "English", "Pop", 2010, "https://www.youtube.com/watch?v=o_v9MY_FMcw"));
        
        // Indie
        songs.add(new Song("Do I Wanna Know?", "Arctic Monkeys", "English", "Indie", 2010, "https://www.youtube.com/watch?v=bpOSxM0rNPM"));
        songs.add(new Song("Sweater Weather", "The Neighbourhood", "English", "Indie", 2010, "https://www.youtube.com/watch?v=GCdwKhTtNNw"));
        songs.add(new Song("Pumped Up Kicks", "Foster the People", "English", "Indie", 2010, "https://www.youtube.com/watch?v=SDTZ7iX4vTQ"));
        songs.add(new Song("Riptide", "Vance Joy", "English", "Indie", 2010, "https://www.youtube.com/watch?v=uJ_1HMAGw4k"));
        songs.add(new Song("The Less I Know the Better", "Tame Impala", "English", "Indie", 2010, "https://www.youtube.com/watch?v=O2S_n7zH73A"));
        songs.add(new Song("Birds Don’t Sing", "TV Girl", "English", "Indie", 2010, "https://www.youtube.com/watch?v=xZpYofpX284"));
        
        // Rap
        songs.add(new Song("HUMBLE.", "Kendrick Lamar", "English", "Rap", 2010, "https://www.youtube.com/watch?v=tvTRZJ-4EyI"));
        songs.add(new Song("God's Plan", "Drake", "English", "Rap", 2010, "https://www.youtube.com/watch?v=xpVfcZ0ZcFM"));
        songs.add(new Song("NOKIA", "Drake", "English", "Rap", 2010, "https://www.youtube.com/watch?v=W08V0VstjA0"));
        songs.add(new Song("FEIN!", "Travis Scott ft. Playboi Carti", "English", "Rap", 2010, "https://www.youtube.com/watch?v=B9S6v7X9YjM"));
        songs.add(new Song("Old Town Road", "Lil Nas X", "English", "Rap", 2010, "https://www.youtube.com/watch?v=r7qovpFAGrQ"));
        songs.add(new Song("See You Again", "Wiz Khalifa ft. Charlie Puth", "English", "Rap", 2010, "https://www.youtube.com/watch?v=RgKAFK5djSk"));
        songs.add(new Song("Lucid Dreams", "Juice WRLD", "English", "Rap", 2010, "https://www.youtube.com/watch?v=mzB1VGEG3wA"));
        
        // R&B
        songs.add(new Song("All the Stars", "SZA, Kendrick Lamar", "English", "R&B", 2010, "https://www.youtube.com/watch?v=JQbjS0_ZfJ0"));
        songs.add(new Song("Super Rich Kids", "Frank Ocean", "English", "R&B", 2010, "https://www.youtube.com/watch?v=0XCQNpjWmRE"));
        songs.add(new Song("Tightrope", "ZAYN", "English", "R&B", 2010, "https://www.youtube.com/watch?v=uK7Yw4fF3Kk"));
        songs.add(new Song("Sunflower", "Post Malone and Swae Lee", "English", "R&B", 2010, "https://www.youtube.com/watch?v=ApXoWvfEYKu"));
        songs.add(new Song("Adorn", "Miguel", "English", "R&B", 2010, "https://www.youtube.com/watch?v=8dM5QYdTo08"));
        songs.add(new Song("Thinking Bout You", "Frank Ocean", "English", "R&B", 2010, "https://www.youtube.com/watch?v=z7P68q8S88Q"));
        songs.add(new Song("Fool’s Gold", "One Direction", "English", "R&B", 2010, "https://www.youtube.com/watch?v=pYitf0eR8j8"));


        // ==========================================
        // HINDI SONGS
        // ==========================================

        // --- 1980s Hindi ---
        // Film Songs
        songs.add(new Song("Ae Mere Humsafar", "Alka Yagnik & Udit Narayan", "Hindi", "Film Songs", 1980, "https://www.youtube.com/watch?v=3IorF5bX270"));
        songs.add(new Song("Gazab Ka Hai Din", "Alka Yagnik & Udit Narayan", "Hindi", "Film Songs", 1980, "https://www.youtube.com/watch?v=wH2n_e0EisE"));
        songs.add(new Song("Saagar Kinare", "Kishore Kumar & Lata Mangeshkar", "Hindi", "Film Songs", 1980, "https://www.youtube.com/watch?v=aH-3VshD4zQ"));
        
        // Ghazal
        songs.add(new Song("Tumko Dekha To Ye Khayal Aaya", "Jagjit Singh", "Hindi", "Ghazal", 1980, "https://www.youtube.com/watch?v=N6Z5n3fI5kY"));
        songs.add(new Song("Tum Itna Jo Muskura Rahe Ho", "Jagjit Singh", "Hindi", "Ghazal", 1980, "https://www.youtube.com/watch?v=G7K6xg9sP0U"));
        
        // Disco
        songs.add(new Song("Yaar Bina Chain Kaha Re", "Bappi Lahiri & S. Janaki", "Hindi", "Disco", 1980, "https://www.youtube.com/watch?v=8Gf268f8Z0I"));
        songs.add(new Song("Auva Auva Koi Yahan Nache", "Bappi Lahiri & Usha Uthup", "Hindi", "Disco", 1980, "https://www.youtube.com/watch?v=P72z7T-E9Xk"));
        songs.add(new Song("Yaad Aa Raha Hai", "Bappi Lahiri", "Hindi", "Disco", 1980, "https://www.youtube.com/watch?v=pAnI_tX7SLo"));
        
        // Pop
        songs.add(new Song("Hari Om Hari", "Usha Uthup", "Hindi", "Pop", 1980, "https://www.youtube.com/watch?v=A2G_mYm1Xas"));
        songs.add(new Song("Jawani Janeman", "Asha Bhosle", "Hindi", "Pop", 1980, "https://www.youtube.com/watch?v=2eR6v7S1Cmk"));
        songs.add(new Song("My Name is Lakhan", "Anuradha Paudwal, Mohammed Aziz, Nitin Mukesh", "Hindi", "Pop", 1980, "https://www.youtube.com/watch?v=wB-p8fP1k08"));
        songs.add(new Song("Apni To Jaise Taise", "Kishore Kumar", "Hindi", "Pop", 1980, "https://www.youtube.com/watch?v=kY67Z3J9kY0"));

        // --- 1990s Hindi ---
        // Film Songs
        songs.add(new Song("Pehla Nasha", "Udit Narayan", "Hindi", "Film Songs", 1990, "https://www.youtube.com/watch?v=3z7TR4ayDG8"));
        songs.add(new Song("Chaiyya Chaiyya", "Sukhwinder Singh", "Hindi", "Film Songs", 1990, "https://www.youtube.com/watch?v=PQmrmVs10X8"));
        songs.add(new Song("Chura Ke Dil Mera", "Kumar Sanu", "Hindi", "Film Songs", 1990, "https://www.youtube.com/watch?v=9pW8HkE0d9I"));
        songs.add(new Song("Mehendi Laga Ke Rakhna", "Lata Mangeshkar & Udit Narayan", "Hindi", "Film Songs", 1990, "https://www.youtube.com/watch?v=2V5m_D_uSFA"));
        songs.add(new Song("Chanda Re Chanda Re", "Hariharan & Sadhana Sargam", "Hindi", "Film Songs", 1990, "https://www.youtube.com/watch?v=M5yG6_j9VvM"));
        songs.add(new Song("Baazigar O Baazigar", "Kumar Sanu & Alka Yagnik", "Hindi", "Film Songs", 1990, "https://www.youtube.com/watch?v=MvFkLp8T5r0"));
        // Disco
        songs.add(new Song("Kisi Disco Mein Jaaye", "Udit Narayan", "Hindi", "Disco", 1990, "https://www.youtube.com/watch?v=Z9K5zP9k9mE"));
        songs.add(new Song("Bolo Ta Ra Ra", "Daler Mehndi", "Hindi", "Disco", 1990, "https://www.youtube.com/watch?v=3P2H3n3p6mI"));
        songs.add(new Song("Made In India", "Alisha Chinai", "Hindi", "Disco", 1990, "https://www.youtube.com/watch?v=QwP6p5K7nN4"));
        songs.add(new Song("Tamma Tamma", "Anuradha Paudwal & Bappi Lahiri", "Hindi", "Disco", 1990, "https://www.youtube.com/watch?v=U0r6_5JmY0s"));
        // Ghazal
        songs.add(new Song("Hoshwalon Ko Khabar Kya", "Jagjit Singh", "Hindi", "Ghazal", 1990, "https://www.youtube.com/watch?v=7XlYy6c6d7k"));
        songs.add(new Song("Tum Itna Jo Muskurarahe Ho", "Jagjit Singh", "Hindi", "Ghazal", 1990, "https://www.youtube.com/watch?v=G7K6xg9sP0U"));
        songs.add(new Song("Sansoon Ki Mala Pe", "Nusrat Fateh Ali Khan", "Hindi", "Ghazal", 1990, "https://www.youtube.com/watch?v=V7F7Y3Zx2cM"));
        songs.add(new Song("Woh Kagaz Ki Kashti", "Jagjit Singh", "Hindi", "Ghazal", 1990, "https://www.youtube.com/watch?v=W6-qM0zW5Wk"));
        // Pop
        songs.add(new Song("O Sanam", "Lucky Ali", "Hindi", "Pop", 1990, "https://www.youtube.com/watch?v=dWqb-WqbGh8"));
        songs.add(new Song("Dooba Dooba", "Silk Route", "Hindi", "Pop", 1990, "https://www.youtube.com/watch?v=6JtW4jG9Y0k"));
        songs.add(new Song("Dil Le Gayi", "Asha Bhosle", "Hindi", "Pop", 1990, "https://www.youtube.com/watch?v=6lW9WzP8p3g"));
        songs.add(new Song("Deewana Tera", "Sonu Nigam", "Hindi", "Pop", 1990, "https://www.youtube.com/watch?v=fXW9vX5s0Y4"));
        songs.add(new Song("Purani Jeans aur Guitar", "Ali Haider", "Hindi", "Pop", 1990, "https://www.youtube.com/watch?v=HdTdcnl8ZrM"));
        songs.add(new Song("Maine Payal Hai Chhankai", "Falguni Pathak", "Hindi", "Pop", 1990, "https://www.youtube.com/watch?v=kY67Z3J9kY0"));
        songs.add(new Song("Dhoom Pichuk", "Euphoria", "Hindi", "Pop", 1990, "https://www.youtube.com/watch?v=pYitf0eR8j8"));
        // Sad
        songs.add(new Song("Ae Ajnabi", "Udit Narayan", "Hindi", "Sad", 1990, "https://www.youtube.com/watch?v=FzF1J7Z8q9k"));
        songs.add(new Song("Tanhayee", "Sonu Nigam", "Hindi", "Sad", 1990, "https://www.youtube.com/watch?v=Y0gV1Yz3x5A"));
        songs.add(new Song("Jeeye To Jeeye Kaise", "Kumar Sanu", "Hindi", "Sad", 1990, "https://www.youtube.com/watch?v=W6-qM0zW5Wk"));
        songs.add(new Song("Tadap Tadap", "K.K.", "Hindi", "Sad", 1990, "https://www.youtube.com/watch?v=W6-qM0zW5Wk"));

        // --- 2000s Hindi ---
        // Film Songs
        songs.add(new Song("Dil Dooba", "Lucky Ali", "Hindi", "Film Songs", 2000, "https://www.youtube.com/watch?v=R6t0tJd9M3E"));
        songs.add(new Song("Tujh Mein Rab Dikhta Hai", "Roop Kumar Rathod", "Hindi", "Film Songs", 2000, "https://www.youtube.com/watch?v=qoq8B8ThgEM"));
        songs.add(new Song("Kal Ho Na Ho", "Sonu Nigam", "Hindi", "Film Songs", 2000, "https://www.youtube.com/watch?v=g0eO74UmRBs"));
        songs.add(new Song("Pehli Nazar Mein", "Atif Aslam", "Hindi", "Film Songs", 2000, "https://www.youtube.com/watch?v=W6-qM0zW5Wk"));
        songs.add(new Song("Zara Sa", "KK", "Hindi", "Film Songs", 2000, "https://www.youtube.com/watch?v=W6-qM0zW5Wk"));
        songs.add(new Song("Dil Chahta Hai", "Shankar Mahadevan and Clinton Cerejo", "Hindi", "Film Songs", 2000, "https://www.youtube.com/watch?v=W6-qM0zW5Wk"));
        // Fusion
        songs.add(new Song("Maahi Ve", "Gurdas Maan", "Hindi", "Fusion", 2000, "https://www.youtube.com/watch?v=1BWdglekty0"));
        songs.add(new Song("Tum Se Hi", "Mohit Chauhan", "Hindi", "Fusion", 2000, "https://www.youtube.com/watch?v=mt9xg0mmt28"));
        songs.add(new Song("Ye Ishq Hai", "Vishal Dadlani", "Hindi", "Fusion", 2000, "https://www.youtube.com/watch?v=Yr7F4V7G3wA"));
        songs.add(new Song("Tere Bina", "A.R. Rahman", "Hindi", "Fusion", 2000, "https://www.youtube.com/watch?v=W6-qM0zW5Wk"));
        songs.add(new Song("Bumbro", "Shankar Mahadevan, Jaspinder Narula, Sunidhi Chauhan", "Hindi", "Fusion", 2000, "https://www.youtube.com/watch?v=W6-qM0zW5Wk"));
        songs.add(new Song("Kajra Re", "Alisha Chinai, Shankar Mahadevan, Javed Ali", "Hindi", "Fusion", 2000, "https://www.youtube.com/watch?v=W6-qM0zW5Wk"));
        songs.add(new Song("Masakali", "Mohit Chauhan", "Hindi", "Fusion", 2000, "https://www.youtube.com/watch?v=W6-qM0zW5Wk"));
        songs.add(new Song("Oh Humdum Suniyo Re", "KK, Shaan, Kunal Ganjawala, Pravin Mani", "Hindi", "Fusion", 2000, "https://www.youtube.com/watch?v=W6-qM0zW5Wk"));
        songs.add(new Song("Chaand Sifarish", "Shaan", "Hindi", "Fusion", 2000, "https://www.youtube.com/watch?v=W6-qM0zW5Wk"));
        // Pop
        songs.add(new Song("Mauja Hi Mauja", "Mika Singh", "Hindi", "Pop", 2000, "https://www.youtube.com/watch?v=PaDaoNnOQaM"));
        songs.add(new Song("Soni De Nakhre", "Hard Kaur", "Hindi", "Pop", 2000, "https://www.youtube.com/watch?v=0G2VxhV_gXM"));
        songs.add(new Song("Haule Haule", "Himesh Reshammiya", "Hindi", "Pop", 2000, "https://www.youtube.com/watch?v=FZLadzn5i6Q"));
        songs.add(new Song("Dhoom Machale", "Sunidhi Chauhan", "Hindi", "Pop", 2000, "https://www.youtube.com/watch?v=W6-qM0zW5Wk"));
        songs.add(new Song("Dus Bahane", "KK and Shaan", "Hindi", "Pop", 2000, "https://www.youtube.com/watch?v=W6-qM0zW5Wk"));
        songs.add(new Song("Tu Hi Meri Shab Hai", "KK", "Hindi", "Pop", 2000, "https://www.youtube.com/watch?v=W6-qM0zW5Wk"));
        songs.add(new Song("Woh Lamhein Woh Baatein", "Atif Aslam", "Hindi", "Pop", 2000, "https://www.youtube.com/watch?v=W6-qM0zW5Wk"));
        songs.add(new Song("Bakhuda Tumhi Ho", "Atif Aslam and Alka Yagnik", "Hindi", "Pop", 2000, "https://www.youtube.com/watch?v=W6-qM0zW5Wk"));
        songs.add(new Song("Maaeri", "Euphoria", "Hindi", "Pop", 2000, "https://www.youtube.com/watch?v=W6-qM0zW5Wk"));
        // Ghazal
        songs.add(new Song("Jhuki Jhuki Si Nazar", "Pankaj Udhas", "Hindi", "Ghazal", 2000, "https://www.youtube.com/watch?v=Q0c8ZtQh6mY"));
        songs.add(new Song("Hum Tere Seher Me Aaye Hain", "Jagjit Singh", "Hindi", "Ghazal", 2000, "https://www.youtube.com/watch?v=V4Z1nJgGz8k"));
        songs.add(new Song("Main Yahaan Hoon", "Udit Narayan", "Hindi", "Ghazal", 2000, "https://www.youtube.com/watch?v=W6-qM0zW5Wk"));
        songs.add(new Song("Kaash", "Hariharan", "Hindi", "Ghazal", 2000, "https://www.youtube.com/watch?v=W6-qM0zW5Wk"));
        songs.add(new Song("Kuch Door Hamare Saath", "Jagjit Singh and Javed Akhtar", "Hindi", "Ghazal", 2000, "https://www.youtube.com/watch?v=W6-qM0zW5Wk"));

        // --- 2010s Hindi ---
        // Film Songs
        songs.add(new Song("Tum Hi Ho", "Arijit Singh", "Hindi", "Film Songs", 2010, "https://www.youtube.com/watch?v=Umqb9KENgmk"));
        songs.add(new Song("Raabta", "Arijit Singh", "Hindi", "Film Songs", 2010, "https://www.youtube.com/watch?v=zlt38OOqwDc"));
        songs.add(new Song("Suraj Hua Maddham", "Sonu Nigam and Alka Yagnik", "Hindi", "Film Songs", 2010, "https://www.youtube.com/watch?v=W6-qM0zW5Wk"));
        songs.add(new Song("Tu Jaane Na", "Atif Aslam", "Hindi", "Film Songs", 2010, "https://www.youtube.com/watch?v=W6-qM0zW5Wk"));
        songs.add(new Song("In Dino", "Life in a Metro", "Hindi", "Film Songs", 2010, "https://www.youtube.com/watch?v=W6-qM0zW5Wk"));
        songs.add(new Song("Ajab Si", "KK", "Hindi", "Film Songs", 2010, "https://www.youtube.com/watch?v=W6-qM0zW5Wk"));
        songs.add(new Song("Khuda Jaane", "KK and Shilpa Rao", "Hindi", "Film Songs", 2010, "https://www.youtube.com/watch?v=W6-qM0zW5Wk"));
        // Pop
        songs.add(new Song("Kala Chashma", "Badshah", "Hindi", "Pop", 2010, "https://www.youtube.com/watch?v=k4yXQkG2s1E"));
        songs.add(new Song("Kar Gayi Chull", "Badshah", "Hindi", "Pop", 2010, "https://www.youtube.com/watch?v=Vh9s6C1v1p8"));
        songs.add(new Song("Badtameez Dil", "Benny Dayal and Shefali Alvarez", "Hindi", "Pop", 2010, "https://www.youtube.com/watch?v=W6-qM0zW5Wk"));
        songs.add(new Song("High Rated Gabru", "Guru Randhawa", "Hindi", "Pop", 2010, "https://www.youtube.com/watch?v=W6-qM0zW5Wk"));
        songs.add(new Song("Vaaste", "Dhwani Bhanushali and Nikhil D’Souza", "Hindi", "Pop", 2010, "https://www.youtube.com/watch?v=W6-qM0zW5Wk"));
        songs.add(new Song("Chammak Challo", "Akon and Hamsika Iyer", "Hindi", "Pop", 2010, "https://www.youtube.com/watch?v=NLlRgNFUa9s"));
        songs.add(new Song("Galliyan", "Ankit Tiwari", "Hindi", "Pop", 2010, "https://www.youtube.com/watch?v=W6-qM0zW5Wk"));
        songs.add(new Song("Kasoor", "Prateek Kuhad", "Hindi", "Pop", 2010, "https://www.youtube.com/watch?v=9q0n5S5d9F4"));
        songs.add(new Song("Iktara", "Kavita Seth", "Hindi", "Pop", 2010, "https://www.youtube.com/watch?v=9C1w0W0f9fE"));
        // Rap
        songs.add(new Song("MIRCHI", "DIVINE", "Hindi", "Rap", 2010, "https://www.youtube.com/watch?v=VxU2y4v6k3k"));
        songs.add(new Song("Apna Time Aayega", "Ranveer Singh", "Hindi", "Rap", 2010, "https://www.youtube.com/watch?v=jFGKJBPFdUA"));
        songs.add(new Song("Blue Eyes", "Yo Yo Honey Singh", "Hindi", "Rap", 2010, "https://www.youtube.com/watch?v=W6-qM0zW5Wk"));
        songs.add(new Song("Maan Meri Jaan", "King", "Hindi", "Rap", 2010, "https://www.youtube.com/watch?v=W6-qM0zW5Wk"));
        songs.add(new Song("Brown Rang", "Yo Yo Honey Singh", "Hindi", "Rap", 2010, "https://www.youtube.com/watch?v=W6-qM0zW5Wk"));
        songs.add(new Song("Abhi Toh Party Shuru Hui Hai", "Badshah", "Hindi", "Rap", 2010, "https://www.youtube.com/watch?v=1ZNkzVyT_IQ"));
        // Sufi
        songs.add(new Song("Kun Faya Kun", "A. R. Rahman", "Hindi", "Sufi", 2010, "https://www.youtube.com/watch?v=T94PHkuydcw"));
        songs.add(new Song("Arziyan", "Javed Ali", "Hindi", "Sufi", 2010, "https://www.youtube.com/watch?v=5W9zY6V8c9k"));
        songs.add(new Song("Ishq Sufiyana", "Kamal Khan", "Hindi", "Sufi", 2010, "https://www.youtube.com/watch?v=W6-qM0zW5Wk"));
        songs.add(new Song("Aas Paas Khuda", "Rahat Fateh Ali Khan", "Hindi", "Sufi", 2010, "https://www.youtube.com/watch?v=IWuLlOOTr_s"));
        songs.add(new Song("Mast Magan", "Arijit Singh and Chinmayi Sripada", "Hindi", "Sufi", 2010, "https://www.youtube.com/watch?v=W6-qM0zW5Wk"));
        songs.add(new Song("Bulleya", "Papon", "Hindi", "Sufi", 2010, "https://www.youtube.com/watch?v=W6-qM0zW5Wk"));
        songs.add(new Song("Dil To Baccha Hai Ji", "Rahat Fateh Ali Khan", "Hindi", "Sufi", 2010, "https://www.youtube.com/watch?v=W6-qM0zW5Wk"));
    }
}

//Interface to sort the songs by the decade, language and genre
interface Sort{

    ArrayList<Song> sort(ArrayList<Song> songs, String lang, int decade, String genre); //Method which returns the ArrayList of possible songs
}

class SortedSongs implements Sort {

    public ArrayList<Song> sort(ArrayList<Song> songs, String lang, int decade, String genre) { //overriding the method from the above interface

        ArrayList <Song> result= new ArrayList<>(); //creating an ArrayList called result

        for(Song s : songs) {

            if(s.language.equals(lang) && s.decade == decade && s.genre.equals(genre)) {
                // If a song matches the user's preferences, add it to the result list
                result.add(s);
            }
        }

        return result;
    }
}

//Main Class
public class Main {
    
    //main method
    public static void main(String[] args) {

        //Creating objects of required classes
		Scanner sc = new Scanner(System.in);
        Music m = new Music();
		Language l1 = null; //only declaring the object for the abstract class

        //while loop to run until the condition becomes false
        while (true) {

            System.out.println("\n----------------------------------------------------");
            System.out.println("Welcome to your very own Personalised Music Curator!\n");

            //============================================================
            //language
            String[] langs= {"English", "Hindi"};   //Array to store language names

            int y;

            //executing the input validation in a while loop
            while (true) {

                try {

                    System.out.println("\nWhat language do you prefer?");
                    System.out.println("1-> English \n2-> Hindi");
                    System.out.println("\nEnter your choice (1-2): ");

                    y = sc.nextInt(); //language option is stored (1/2)

                    if (y < 1 || y > 2) {

                        throw new Exception("\nInvalid language choice! Enter 1-2."); //creating a custom exception
                    }

                    break;

                }
                catch (InputMismatchException e) {

                    System.out.println("\nInvalid input! Please enter a number."); //checks for String inputs
                    sc.next();
                }
                catch (Exception e) {

                    System.out.println(e.getMessage()); //printing the custom exception message
                }
            }

            System.out.println("\nThe playlist of your dreams is currently brewing...\n");

            String pref_lang = langs[y - 1];       //Storing name of the user's preferred language

            //Switch case for language selection
            switch(y) {

                case 1:
                    l1 = new English();     //Object of English class with reference of Language class
                    break;

                case 2:
                    l1 = new Hindi();       //Object of Hindi class with reference of Language class
                    break;
            }

            //============================================================
            //decade
            int[] dec = {1980, 1990, 2000, 2010};      //Array to store decade values
            
            int d;

            //executing the input validation in a while loop
            while (true) {

                try {

                    System.out.println("\nWhat decade calls to you?");
                    System.out.println("1-> 1980s \n2-> 1990s \n3-> 2000s \n4-> 2010s");
                    System.out.println("\nEnter your choice (1-4): ");

                    d = sc.nextInt(); //decade option is stored (1/2/3/4)

                    if (d < 1 || d > 4) {

                        throw new Exception("\nInvalid decade choice! Enter 1-4."); //creating a custom exception
                    }

                    break;

                }
                catch (InputMismatchException e) {

                    System.out.println("\nInvalid input! Please enter a number."); //checks for String inputs
                    sc.next();
                }
                catch (Exception e) {

                    System.out.println(e.getMessage()); //printing the custom exception message
                }
            }
        
            System.out.println("\nGreat choice! The vibes of the " + dec[d - 1] + "s are truly timeless.\n");

            int pref_decade = dec[d - 1];      //Storing user's preferred decade

            //============================================================
            //genre
            String pref_genre = null;
            ArrayList<String> valid_genre = new ArrayList<>();  //ArrayList to store valid genres according to user's preferred language

            for(Song s : m.songs) {

                //Checking to compare the song's language, decade, and genre preferences with user's preferences
                if(s.language.equals(pref_lang) && (s.decade == pref_decade) && (!valid_genre.contains(s.genre)) && (l1.preferredGenres.contains(s.genre))) {

                    valid_genre.add(s.genre); //Adding valid genre to the list
                }
            }

            int g = 0;

            //runs when the valid_genre ArrayList is not empty
            if(!valid_genre.isEmpty()) {

                while(true) {

                    try {

                        System.out.println("\nWhat genre are you interested in?");
                        for(int i = 0; i < valid_genre.size(); i++) {

                            System.out.println((i+1) + "-> " + valid_genre.get(i)); //Printing possible genres for the selected language and decade
                        }

                        System.out.println("\nEnter your choice (1-" + valid_genre.size() + "): ");

                        g=sc.nextInt();

                        if (g < 1 || g > valid_genre.size()) {

                            throw new Exception("\nInvalid genre choice! Enter 1-" + valid_genre.size() + ".");
                        }
                        break;
                        }
                    catch (InputMismatchException e) {

                        System.out.println("\nInvalid input! Please enter a number.");
                        sc.next(); // Clear the invalid input
                    }
                    catch (Exception e) {
                            
                        System.out.println(e.getMessage());
                    }
                }
            }

            System.out.println("\nNow that is some wonderful music taste you've got there!\n");

            pref_genre = valid_genre.get(g - 1);     //Storing user's preferred genre

            //============================================================
            //final displaying of songs

            System.out.println("\n---------------------------------------------------------------");
            System.out.println("-----------Here's a playlist made specially for you!-----------\n\n");

            ArrayList <Song> filteredSongs = new ArrayList<>();

            SortedSongs ss = new SortedSongs();     //Object of SortedSongs class with reference of Sort interface

            filteredSongs = ss.sort(m.songs, pref_lang, pref_decade, pref_genre);

            for(Song s : filteredSongs) {

                System.out.println("\"" + s.title + "\" by " + s.artist + " (" + s.language + ", " + s.genre + ", " + s.decade + "s)\n");
                System.out.println("🔗 " + s.url + "\n");
            }

            System.out.println("\nNow you're all set for a captivating, personalised, and immersive listening experience!"); //one playlist created

            System.out.println("\n---------------------------------------------------------------");

            int choice;

            while (true) {

                try {

                    System.out.println("\nDo you want to make another playlist?"); //asking if user wants to continue or exit the program
                    System.out.println("1-> Yes\n2-> No");
                    System.out.println("\nEnter your choice (1-2): ");
                    choice = sc.nextInt();

                    if (choice < 1 || choice > 2) {

                        throw new Exception("\nInvalid choice! Please enter 1 or 2.");
                    }

                    break; //exiting the loop only when valid input is given

                }
                catch (InputMismatchException e) {

                    sc.next(); //clearing the buffer
                    System.out.println("\nInvalid input! Please enter a number.");
                }
                catch (Exception e) {

                    System.out.println(e.getMessage());
                }
            }

            if (choice == 2) {
                System.out.println("\nThank you for using the Personalised Music Curator!");
                break;
            }
            else {
                System.out.println("\nGreat! Let's create another playlist!");
            }
        }

        sc.close();
    }
}