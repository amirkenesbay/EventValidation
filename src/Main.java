public class Main {
    public static void main(String[] args) {
        for (Event event : getMovies()) {
            validEvent(event);
        }
        for (Event event : getTheatres()) {
            validEvent(event);
        }
        System.out.println("Все события корректны");
    }

    public static Movie[] getMovies() {
        return new Movie[]{
                new Movie("", 2010, 16)
        };
    }

    public static Theatre[] getTheatres() {
        return new Theatre[]{
                new Theatre("", 0, 0)
        };
    }

    public static void validEvent(Event event) {
        if (event.equals(null) || event.equals("")) {
            throw new RuntimeException();
        } else {
            System.out.println("Все ок");
        }
    }
}
