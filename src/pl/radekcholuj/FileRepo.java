package pl.radekcholuj;

public class FileRepo implements Repo {
    @Override
    public void save(String text){
        System.out.println("Save to File: "+text);
    }

    @Override
    public void get(){
        System.out.println("Get date from file.");
    }
}
