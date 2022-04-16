package kz.course.lesson7;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    RadioButton excellentRadio, gooRadio, okayRadio, poorRadio;
    CheckBox reallyCheckBox, willCheckBox, wouldCheckBox, satiffCheckBox;
    Button jiberuBtn;

    String lessonTuri, jetkizuText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        excellentRadio = findViewById(R.id.excellentRadio);
        gooRadio = findViewById(R.id.gooRadio);
        okayRadio = findViewById(R.id.okayRadio);
        poorRadio = findViewById(R.id.poorRadio);


        reallyCheckBox = findViewById(R.id.reallyCheckBox);
        willCheckBox = findViewById(R.id.willCheckBox);
        wouldCheckBox = findViewById(R.id.wouldCheckBox);
        satiffCheckBox = findViewById(R.id.satiffCheckBox);


        jiberuBtn = findViewById(R.id.jiberuBtn);



        jiberuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (excellentRadio.isChecked()) {
                    lessonTuri = "EXCELLENT";
                } else if (gooRadio.isChecked()) {
                    lessonTuri = "GOOD";
                } else if (okayRadio.isChecked()) {
                    lessonTuri = "OKAY";
                } else if (poorRadio.isChecked()) {
                    lessonTuri = "POOR";
                }


                if (reallyCheckBox.isChecked()) {
                    jetkizuText = "I really enjoy this lesson";
                }

                if (willCheckBox.isChecked()) {
                    jetkizuText = "I will prefer this lesson to else also";
                }
                if (wouldCheckBox.isChecked()) {
                    jetkizuText = "I would like to hear more from you";
                }

                if (satiffCheckBox.isChecked()) {
                    jetkizuText = "I am satified with the content and full description";
                }


                String result = "Selected Radio Button is: " +
                        "GOOD" +"\n" +
                        "CheckBox Choices:" + "\n" +
                        "I really enjoy this lesson:" + "Yes" + "\n"+
                        "I will prefer this lesson to else also: " + "Yes" + "\n"+
                        "I would like to hear more from you:" + "No" + "\n"+
                        "I am satified with the content and description:" + "No";



                Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();


            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main,menu);

        return super.onCreateOptionsMenu(menu);
    }
}