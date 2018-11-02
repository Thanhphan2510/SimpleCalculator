package thanhphan.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {
    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttonAdd;
    Button buttonSub;
    Button buttonDiv;
    Button buttonMul;
    Button buttonEqual;
    Button buttonAC;
    ImageButton buttonDel;
    Button buttonDot;
    Button buttonPer;
    Button buttonAddSub;
    EditText editText;
    float value1, value2;
    boolean Addition,Subtract, Multiplication, Division, Percent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);

        buttonEqual = (Button) findViewById(R.id.buttonEqual);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonSub= (Button) findViewById(R.id.buttonSub);
        buttonMul = (Button) findViewById(R.id.buttonMul);
        buttonDiv = (Button) findViewById(R.id.buttonDiv);

        buttonPer = (Button) findViewById(R.id.buttonPer);
        buttonDot = (Button) findViewById(R.id.buttonDot);
        buttonAC = (Button) findViewById(R.id.buttonAC);
        buttonDel = (ImageButton) findViewById(R.id.buttonDel);
        buttonAddSub = (Button) findViewById(R.id.buttonAS);

        editText = (EditText) findViewById(R.id.editText);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "9");
            }
        });

        buttonAddSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 = Float.parseFloat(editText.getText()+"");
                if(value1 < 0){
                    editText.setText((value1 + (-2*value1)) + "");
                }
                if(value1 > 0){
                    editText.setText(-value1 +"");
                }
                if(value1 == 0){
                    editText.setText(editText.getText());
                }

            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText == null){
                    editText.setText("");
                }else{
                    value1 = Float.parseFloat(editText.getText() + "");
                    Addition = true;
                    editText.setText(null);
                }
            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText == null){
                    editText.setText("");
                }else{
                    value1 = Float.parseFloat(editText.getText() + "");
                    Subtract = true;
                    editText.setText(null);
                }
            }
        });
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText == null){
                    editText.setText("");
                }else{
                    value1 = Float.parseFloat(editText.getText() + "");
                    Multiplication = true;
                    editText.setText(null);
                }
            }
        });
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText == null){
                    editText.setText("");
                }else{
                    value1 = Float.parseFloat(editText.getText() + "");
                    Division = true;
                    editText.setText(null);
                }
            }
        });
        buttonPer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText == null){
                    editText.setText("");
                }else{
                    value1 = Float.parseFloat(editText.getText() + "");
                    Percent = true;
                    editText.setText(null);
                }
            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Percent == true){
                    editText.setText(value1 / 100 + "");
                    Percent = false;
                }else{
                    value2 = Float.parseFloat(editText.getText()+ "");

                    if(Addition == true){
                        editText.setText(value1 + value2 +"");
                        Addition = false;
                    }
                    if(Subtract == true){
                        editText.setText(value1 - value2 +"");
                        Subtract = false;
                    }
                    if(Multiplication == true){
                        editText.setText(value1 * value2 +"");
                        Multiplication = false;
                    }
                    if(Division == true){
                        editText.setText(value1 / value2 +"");
                        Division = false;
                    }

                }

            }
        });
        buttonAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
                value2 = 0;
                value1 = 0;

            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editText.setText(editText.getText()+".");
            }
        });


        buttonDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = String.valueOf(editText.getText());
                String str = "";
                editText.setText("");
                for(int i = 0; i < s.length() - 1; i++) {
                    str = str + s.charAt(i);
                }
                editText.setText(str);
            }
        });
    }
}
