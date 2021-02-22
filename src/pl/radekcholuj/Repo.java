package pl.radekcholuj;

public interface Repo {
    void save(String text);
    void get();
    default void getById(int id){
        System.out.println("Get by id.");
    }
}
