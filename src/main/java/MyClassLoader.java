import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;

public class MyClassLoader extends ClassLoader{

    public static void main(String[] args) throws Exception {
        MyClassLoader myClassLoader = new MyClassLoader();
        Object hello = myClassLoader.findClass("Hello").newInstance();
        Method method = hello.getClass().getMethod("hello", null);
        method.invoke(hello,null);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        InputStream resourceAsStream = MyClassLoader.class.getClassLoader().getResourceAsStream(name + ".xlass");
        ByteArrayOutputStream bos=new ByteArrayOutputStream();
        byte[] buff=new byte[1024];
        int len=-1;
        try {
            while((len=resourceAsStream.read(buff))!=-1){
                bos.write(buff,0,len);
            }
            byte[] bytes = Utils.byte2Inverse(bos.toByteArray());
            return defineClass(name,bytes,0,bytes.length);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
