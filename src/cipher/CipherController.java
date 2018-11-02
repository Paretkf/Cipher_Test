//5810450261   Dusit     Siri
package cipher;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class CipherController {


    @FXML private TextArea textFieldMessage,textFieldKey;


    public void encodeButton(){
        Cipher5810450261 cipher5810450261 = new Cipher5810450261("tiger");
        cipher5810450261.setKey(textFieldKey.getText());
        textFieldMessage.setText(cipher5810450261.encode(textFieldMessage.getText()));
    }

    public void decodeButton(){
        Cipher5810450261 cipher5810450261 = new Cipher5810450261("tiger");
        cipher5810450261.setKey(textFieldKey.getText());
        textFieldMessage.setText(cipher5810450261.decode(textFieldMessage.getText()));
    }

}
