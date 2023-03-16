package entities;

public class Pousada {

    private String name;
    private String email;
    private int room;

    public Pousada(String name, String email, int room) {
        this.name = name;
        this.email = email;
        this.room = room;
    }

    public Pousada() {

    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getRoom() {
        return room;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRoom(int room) {
        this.room = room;
    }

public String toString(){
    return
        room
        +": "
        +name
        +", "
        +email;
}
}