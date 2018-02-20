package ca.nathanrochon.ss_char;

import android.app.DialogFragment;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SkillsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skills);

        load(R.id.SKT1);
        load(R.id.SKT2);
        load(R.id.SKT3);
        load(R.id.SKT4);
        load(R.id.SKT5);
        load(R.id.SKT6);
        load(R.id.SKT7);
        load(R.id.SKT8);
        load(R.id.SKT9);
        load(R.id.SKT10);
        load(R.id.SKT11);
        load(R.id.SKT12);
        load(R.id.SKT13);
        load(R.id.SKT14);
        load(R.id.SKT15);
        load(R.id.SKT16);
        load(R.id.SKT17);
        load(R.id.SKT18);
        load(R.id.SKT19);
        load(R.id.SKT20);
        load(R.id.SKT21);
        load(R.id.SKT22);
        load(R.id.SKT23);
        load(R.id.SKT24);
        load(R.id.SKT25);
        load(R.id.SKT26);
        load(R.id.SKT27);
        load(R.id.SKT28);
        load(R.id.SKT29);
        load(R.id.SKT30);
        load(R.id.SKT31);
        load(R.id.SKT32);
        load(R.id.SKT33);
        load(R.id.SKT34);
        load(R.id.SKT35);
        load(R.id.SKT36);
        load(R.id.SKT37);
        load(R.id.SKT38);
        load(R.id.SKT39);









    }


    public void onSkillClick(View v){
        DialogFragment nF = new CDiaFrag();
        String name =((TextView)v).getText().toString();



        ((CDiaFrag)nF).setName(name);
        ((CDiaFrag)nF).setClicker(findViewById(v.getLabelFor()));
        nF.show(getFragmentManager(),"yep");

    }
    public void setLableTotal(View v, int total){
        TextView child = (TextView) findViewById(v.getLabelFor());
        child.setText(total+"");
    }

    private void load(int ParentID){
       TextView v = findViewById(findViewById(ParentID).getLabelFor());
        SharedPreferences data = getSharedPreferences("ss_char."+((TextView)findViewById(ParentID)).getText().toString(), 0);
        v.setText(data.getInt("Total",99)+"");

    }
}
