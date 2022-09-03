
package Employee;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Xfile {    
    public static Object readObject(String path) throws ClassNotFoundException {
        try {
            ObjectInputStream ois= new ObjectInputStream(new FileInputStream(path));
            Object object=ois.readObject();
            ois.close();
            return object;
        } catch (IOException ex) {
            throw new RuntimeException();
        }
      
    }
    public static void  writeObject(String path, Object object){
        try {
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(path));
            oos.writeObject(object);
            oos.close();
        } catch (IOException ex) {

        }
    }
    
    
}
