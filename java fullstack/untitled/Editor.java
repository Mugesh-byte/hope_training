abstract class Access{
    abstract void open();
    abstract void close();
    abstract void save();
}

class Text extends Access{
    private String content;
    Text(String content){
        this.content=content;
    }
    public void open(){
        System.out.println("Opened text file");
    }
    public void close(){
        System.out.println("Closed text file");
    }
    public void save(){
        System.out.println("saved text file");
    }
    public void show(){
        System.out.println(content);
    }
}

class Img extends Access{
    private String content;
    Img(String content){
        this.content=content;
    }
    public void open(){
        System.out.println("opened image file");
    }
    public void close(){
        System.out.println("closed image file");
    }
    public void save(){
        System.out.println("saved image file");
    }
}