import java.util.*;
abstract class FileSystemEntity {
    private String name;
    private Date createdDate;
    public FileSystemEntity(String name) {
        this.name = name;
        this.createdDate = new Date();
    }

    public String getName() {
        return name;
    }

    public Date getCreatedDate() {
        return createdDate;
    }
    public abstract void display();
}
class File extends FileSystemEntity {
    private String content;

    public File(String name, String content) {
        super(name);
        this.content = content;
    }

    public int getSize() {
        return content.length();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void display() {
        System.out.println("File: " + getName() + " Size: " + getSize());
    }
}
class Directory extends FileSystemEntity {
    private List<FileSystemEntity> contents;

    public Directory(String name) {
        super(name);
        contents = new ArrayList<>();
    }

    public void add(FileSystemEntity entity) {
        contents.add(entity);
    }

    public void remove(String name) {
        contents.removeIf(e -> e.getName().equals(name));
    }

    public List<FileSystemEntity> getContents() {
        return contents;
    }

    @Override
    public void display() {
        System.out.println("Directory: " + getName());
        for (FileSystemEntity e : contents) {
            e.display();
        }
    }
}
class User {
    private String username;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
class FileManager {
    private Directory root;

    public FileManager() {
        root = new Directory("root");
    }

    public Directory getRoot() {
        return root;
    }
    public void createFile(String name, String content) {
        if (name == null || name.isEmpty()) {
            System.out.println("Invalid file name!");
            return;
        }
        root.add(new File(name, content));
    }
    public void createDirectory(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Invalid directory name!");
            return;
        }
        root.add(new Directory(name));
    }


    public void delete(String name) {
        root.remove(name);
    }
    public void search(String name) {
        for (FileSystemEntity e : root.getContents()) {
            if (e.getName().equals(name)) {
                System.out.println("Found: " + name);
                return;
            }
        }
        System.out.println("Not Found!");
    }

    public void displayFileSystem() {
        root.display();
    }
}

public class holiday_task {
    public static void main(String[] args) {
        FileManager fm = new FileManager();
        User user = new User("Mugesh");

        fm.createFile("file1.txt", "Hello World");
        fm.createFile("file2.txt", "OOP Concepts");
        fm.createDirectory("docs");

        System.out.println("--- File System ---");
        fm.displayFileSystem();

        System.out.println("--- Search ---");
        fm.search("file1.txt");

        System.out.println("--- Delete ---");
        fm.delete("file2.txt");
        fm.displayFileSystem();
    }
}