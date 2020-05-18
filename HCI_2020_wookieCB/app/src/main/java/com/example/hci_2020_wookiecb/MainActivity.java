package com.example.hci_2020_wookiecb;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    TextView text1, text2;
    CheckBox cb1, cb2, cb3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = (TextView) findViewById(R.id.textView);
        text2 = (TextView) findViewById(R.id.textView1);

        cb1 = (CheckBox) findViewById(R.id.checkBox);
        cb2 = (CheckBox) findViewById(R.id.checkBox2);
        cb3 = (CheckBox) findViewById(R.id.checkBox3);

        CheckBoxListener listener = new CheckBoxListener();
        cb1.setOnCheckedChangeListener(listener);
        cb2.setOnCheckedChangeListener(listener);
        cb3.setOnCheckedChangeListener(listener);
    }

    public void btn1Method(View v) {
        text1.setText(" ");

        boolean b1 = cb1.isChecked();
        boolean b2 = cb2.isChecked();
        boolean b3 = cb3.isChecked();

        if (b1 == true)
            text1.append("첫번째 체크박스가 체크되었습니다.\n");
        else
            text1.append("첫번째 체크박스가 해제되었습니다.\n");

        if (b2 == true)
            text1.append("두번째 체크박스가 체크되었습니다.\n");
        else
            text1.append("두번째 체크박스가 해제되었습니다.\n");

        if (b3 == true)
            text1.append("세번째 체크박스가 체크되었습니다.\n");
        else
            text1.append("세번째 체크박스가 해제되었습니다.\n");
    }

    public void btn2Method(View v) {
        cb1.setChecked(true);
        cb2.setChecked(true);
        cb3.setChecked(true);
    }

    public void btn3Method(View v) {
        cb1.setChecked(false);
        cb2.setChecked(false);
        cb3.setChecked(false);
    }

    public void btn4Method(View v) {
        cb1.toggle();
        cb2.toggle();
        cb3.toggle();
    }

    public void btnrstMethod(View v) {
        setContentView(R.layout.activity_main);

        text1 = (TextView) findViewById(R.id.textView);
        text2 = (TextView) findViewById(R.id.textView1);

        cb1 = (CheckBox) findViewById(R.id.checkBox);
        cb2 = (CheckBox) findViewById(R.id.checkBox2);
        cb3 = (CheckBox) findViewById(R.id.checkBox3);

        CheckBoxListener listener = new CheckBoxListener();
        cb1.setOnCheckedChangeListener(listener);
        cb2.setOnCheckedChangeListener(listener);
        cb3.setOnCheckedChangeListener(listener);
    }

    class CheckBoxListener implements CompoundButton.OnCheckedChangeListener {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            // 체크상태가 변경된 체크박스의 id값을 얻어온다.
            int id = buttonView.getId();
            switch (id) {
                case R.id.checkBox:
                    if (isChecked == true) {
                        text2.setText("첫 번째 체크박스가 체크되었습니다");
                    } else {
                        text2.setText("첫 번째 체크박스가 해제되었습니다");
                    }
                    break;
                case R.id.checkBox2:
                    if (isChecked == true) {
                        text2.setText("두 번째 체크박스가 체크되었습니다");
                    } else {
                        text2.setText("두 번째 체크박스가 해제되었습니다");
                    }
                    break;
                case R.id.checkBox3:
                    if (isChecked == true) {
                        text2.setText("세 번째 체크박스가 체크되었습니다");
                    } else {
                        text2.setText("세 번째 체크박스가 해제되었습니다");
                    }
                    break;
            }
        }
    }

}
