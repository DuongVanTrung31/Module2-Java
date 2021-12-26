package iostream;


import java.io.*;



public class IOStream <T> {
    private T t;
    private FileOutputStream fos;
    private ObjectOutputStream oos;
    private FileInputStream fis;
    private ObjectInputStream ois;

    public IOStream(File pathName) throws IOException {
        this.fos = new FileOutputStream(pathName, true);
        this.oos = new ObjectOutputStream(fos);
        this.fis = new FileInputStream(pathName);
        this.ois = new ObjectInputStream(fis);
    }

    public synchronized void saveData(T e) {

        try {
            oos.writeObject(e);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public synchronized T readData() {
        try {
            t = (T) ois.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
        return t;
    }
}
