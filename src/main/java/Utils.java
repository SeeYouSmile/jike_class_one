public class Utils {

    public static byte[] byte2Inverse(byte[] bytes){
        byte[] bytes2 = new byte[bytes.length];
        for (int i = 0; i < bytes.length; i++) {
            bytes2[i]= (byte) (0xff-bytes[i]);
        }
        return bytes2;
    }
}
