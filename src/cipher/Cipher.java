//5810450261   Dusit     Siri
package cipher;

interface Cipher {
    void setKey(String key);
    String encode(String msg1);
    String decode(String msg2);
}