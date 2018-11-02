//5810450261   Dusit     Siri
package cipher;

public class Cipher5810450261 implements Cipher{

    private String key;
    private String alphabet;

    public Cipher5810450261(String alphabet) {
        this.alphabet = alphabet;
    }

    @Override
    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String encode(String msg1) {
            for (int i = 0; i < this.alphabet.length(); i++){
                int locationAlphabet =  (this.alphabet.indexOf(this.alphabet.charAt(i)));
                char alphabetChar = this.alphabet.charAt(i);
                char replaceMsg = ' ';

                for (int j = 0; j < this.key.length(); j++){
                    if (this.key.indexOf(this.key.charAt(j)) == locationAlphabet){
                        replaceMsg = this.key.charAt(i);

                        for (int k = 0 ; k < msg1.length(); k++){
                            if (msg1.charAt(k) == alphabetChar){
                                msg1 = msg1.replace(msg1.charAt(k), replaceMsg);
                            }
                        }
                    }
                }
            }
        return msg1;
    }

    @Override
    public String decode(String msg2) {
        for (int i = 0; i < this.key.length(); i++){
            int locationKey =  (this.key.indexOf(this.key.charAt(i)));
            char keyChar = this.key.charAt(i);
            char replaceMsg = ' ';

            for (int j = 0; j < this.alphabet.length(); j++){
                if (this.alphabet.indexOf(this.alphabet.charAt(j)) == locationKey){
                    replaceMsg = this.alphabet.charAt(i);

                    for (int k = 0 ; k < msg2.length(); k++){
                        if (msg2.charAt(k) == keyChar){
                            msg2 = msg2.replace(msg2.charAt(k), replaceMsg);
                        }
                    }
                }
            }
        }
        return msg2;
    }

}
