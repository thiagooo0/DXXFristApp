package com.dxx.dxxfristapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView luBanHp;
    Button luBanShoot;
    TextView hanXin3hp;
    Button hanXin3haha;
    Button hanXin3mama;
    Button hanXin3lala;
    LuBan luBan = new LuBan(100);
    HanXin hanXin = new HanXin(108);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        luBanHp = (TextView) findViewById(R.id.lubanhp);
        luBanShoot = (Button) findViewById(R.id.button2);

        hanXin3hp = (TextView) findViewById(R.id.textView3
        );
        hanXin3haha = (Button) findViewById(R.id.button3);
        hanXin3mama = (Button) findViewById(R.id.button4);
        hanXin3lala = (Button) findViewById(R.id.button5);

        luBanShoot.setOnClickListener(this);
        hanXin3haha.setOnClickListener(this);
        hanXin3mama.setOnClickListener(this);
        hanXin3lala.setOnClickListener(this);

        updateHp();
    }

    void updateHp() {
        luBanHp.setText("鲁班血量：" + luBan.hp);
        hanXin3hp.setText("韩信血量：" + hanXin.hp);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button2:
                luBan.shot(hanXin);
                updateHp();
                break;
            case R.id.button3:
                hanXin.haha(luBan);
                updateHp();
                break;
            case R.id.button4:
                hanXin.mama(luBan);
                updateHp();
                break;
            case R.id.button5:
                hanXin.lala();
                updateHp();
                break;
        }
    }
//    public static void main(String args[]) {
//        LuBan luBan1 = new LuBan(144);
//        HanXin hanXin3 = new HanXin();
//        System.out.print("鲁班的血量:" + luBan1.hp);
//        System.out.print("\n韩信的血量:" + hanXin3.hp);
//        luBan1.shot(hanXin3);
//        System.out.print("\n鲁班的血量:" + luBan1.hp);
//        System.out.print("\n韩信的血量:" + hanXin3.hp);
//        hanXin3.lala(hanXin3);
//        System.out.print("\n鲁班的血量:" + luBan1.hp);
//        System.out.print("\n韩信的血量:" + hanXin3.hp);
//        hanXin3.mama(luBan1);
//        System.out.print("\n鲁班的血量:" + luBan1.hp);
//        System.out.print("\n韩信的血量:" + hanXin3.hp);
//    }
}
