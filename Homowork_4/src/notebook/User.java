package notebook;

public class User {
    private String name;
    private String surname;
    private String nickname;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setSurname(String surname){
        this.surname=surname;
    }
    public String getSurname(){
        return surname;
    }
    public void setNickname(String nickname){
        this.nickname=nickname;
    }
    public String getNickname(){
        return nickname;
    }
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
