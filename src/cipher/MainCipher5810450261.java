//5810450261   Dusit     Siri
package cipher;

public class MainCipher5810450261 {
    public static void main(String[] args) {

        Cipher5810450261 cipher5810450261 = new Cipher5810450261("abcd");
        cipher5810450261.setKey("efgh");
        System.out.println(cipher5810450261.encode("cat"));
        System.out.println(cipher5810450261.decode("get"));

        String[] msg = {"abcd", "dabc", "xaxbxcxdx"};
        String[] encoded = new String[msg.length];
        for (int i = 0; i < msg.length; i++){
            encoded[i] = cipher5810450261.encode(msg[i]);
            System.out.println(msg[i]+"->"+encoded[i]+"->"+cipher5810450261.decode(encoded[i]));
        }

        cipher5810450261 = new Cipher5810450261("edcba");
        cipher5810450261.setKey("xyz");
        for (int i = 0; i< msg.length; i++){
            encoded[i] = cipher5810450261.encode(msg[i]);
            System.out.println(msg[i]+"->"+encoded[i]+"->"+cipher5810450261.decode(encoded[i]));
        }

        cipher5810450261 = new Cipher5810450261("abc");
        cipher5810450261.setKey("vwxyz");
        for (int i = 0; i < msg.length; i++){
            encoded[i] = cipher5810450261.encode(msg[i]);
            System.out.println(msg[i]+"->"+encoded[i]+"->"+cipher5810450261.decode(encoded[i]));
        }
    }
}
