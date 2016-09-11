import java.nio.CharBuffer;

/**
 * Created by acer on 2016/9/11.
 */
public class BufferTest {
    public static void main (String args[]){
        String test = "Hahaahahaha";
        CharBuffer testbuffer = CharBuffer.allocate(test.length());
        System.out.println("Capcity: "+testbuffer.capacity());
        System.out.println("Limit: "+testbuffer.limit());
        System.out.println("Position: "+testbuffer.position());
        testbuffer.put("A");
        System.out.println("Position: "+testbuffer.position());
    }
}
