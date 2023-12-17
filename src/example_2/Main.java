package example_2;

public class Main {
    public static void main(String[] args) {
        Performer performer = new Performer();
        performer.name = "David Bowie";
        performer.songs = new Song[3];
        performer.show();


        Song song = new Song();
        song.title = "song1";
        song.duration = 90;
        performer.addSong(song);
        // [song1, null, null]

        song = new Song();
        song.title = "song2";
        song.duration = 120;
        performer.addSong(song);
        // [song1, song2, null]

        performer.show();

    }
}
//      Company
        // String name
        // employee[]

        // void hire(Employee employee)
        // void fire(String employeeName)
        // void displayEmployees()
        // Кампания 'название_кампаний': 'имя_сотрудника' 'имя_сотрудника' 'имя_сотрудника'

//      Employee
        // String name
        // int age
