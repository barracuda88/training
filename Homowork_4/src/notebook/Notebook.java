package notebook;

import java.util.ArrayList;
import java.util.List;

public class Notebook {
    private List<User> user_list= new ArrayList<>();
    public void addList(User user){
        user_list.add(user);
    }
    public List<User> getUser_list(){
        return user_list;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "user_list=" + user_list +
                '}';
    }
}
