package iostream;


import java.io.*;


public class IOStream<E> {
    private E e;
    private File file;

    public IOStream(File files, E element) {
        this.file = files;
        this.e = element;
    }

    public synchronized void saveData(E e) {
        try {
            FileOutputStream fos = new FileOutputStream(file, false);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(e);
            fos.close();
            oos.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public synchronized E readData() {
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            e = (E) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return e;
    }
}
