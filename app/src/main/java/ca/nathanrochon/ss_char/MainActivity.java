package ca.nathanrochon.ss_char;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    SharedPreferences mydata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mydata = getSharedPreferences("ss_char",0);

       // if (!mydata.getBoolean("HasRun",false)){
            firstRun();
      //  }
    }
    public void skillTrans(View view){
        startActivity(new Intent(MainActivity.this, SkillsActivity.class));
    }
    private void firstRun(){

        SharedPreferences.Editor data;
        Log.i("setup","XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX    first run");
        data = getSharedPreferences("ss_char."+R.id.SK1,0).edit();
        data.putString("NAME","ACROBATICS").apply();
        data.putString("ABILHINT","DEX").apply();
        data = getSharedPreferences("ss_char."+R.id.SKT2,0).edit();
        data.putString("NAME","APPRAISE").apply();
        data.putString("ABILHINT","INT").apply();
        data = getSharedPreferences("ss_char."+R.id.SKT3,0).edit();
        data.putString("NAME","BLUFF").apply();
        data.putString("ABILHINT","CHA").apply();
        data = getSharedPreferences("ss_char."+R.id.SKT4,0).edit();
        data.putString("NAME","CLIMB").apply();
        data.putString("ABILHINT","STR").apply();
        data = getSharedPreferences("ss_char."+R.id.SKT5,0).edit();
        data.putString("NAME","CRAFT").apply();
        data.putString("ABILHINT","INT").apply();
        data.putString("Sub","CRAFT").apply();
        data = getSharedPreferences("ss_char."+R.id.SKT6,0).edit();
        data.putString("NAME","CRAFT").apply();
        data.putString("ABILHINT","INT").apply();
        data.putString("Sub","CRAFT").apply();
        data = getSharedPreferences("ss_char."+R.id.SKT7,0).edit();
        data.putString("NAME","DIPLOMACY").apply();
        data.putString("ABILHINT","CHA").apply();
        data = getSharedPreferences("ss_char."+R.id.SKT8,0).edit();
        data.putString("NAME","DISABLE DEVICE").apply();
        data.putString("ABILHINT","DEX").apply();
        data = getSharedPreferences("ss_char."+R.id.SKT9,0).edit();
        data.putString("NAME","DISGUISE").apply();
        data.putString("ABILHINT","CHA").apply();
        data = getSharedPreferences("ss_char."+R.id.SKT10,0).edit();
        data.putString("NAME","ESCAPE ARTIST").apply();
        data.putString("ABILHINT","DEX").apply();
        data = getSharedPreferences("ss_char."+R.id.SKT11,0).edit();
        data.putString("NAME","FLY").apply();
        data.putString("ABILHINT","DEX").apply();
        data = getSharedPreferences("ss_char."+R.id.SKT12,0).edit();
        data.putString("NAME","HANDLE ANIMAL").apply();
        data.putString("ABILHINT","CHA").apply();
        data = getSharedPreferences("ss_char."+R.id.SKT13,0).edit();
        data.putString("NAME","HEAL").apply();
        data.putString("ABILHINT","WIS").apply();
        data = getSharedPreferences("ss_char."+R.id.SKT14,0).edit();
        data.putString("NAME","INTIMIDATE").apply();
        data.putString("ABILHINT","CHA").apply();
        data = getSharedPreferences("ss_char."+R.id.SKT15,0).edit();
        data.putString("NAME","KNOW(ARCANA)").apply();
        data.putString("ABILHINT","INT").apply();
        data = getSharedPreferences("ss_char."+R.id.SKT16,0).edit();
        data.putString("NAME","KNOW(DUNGEONEETING)").apply();
        data.putString("ABILHINT","INT").apply();
        data = getSharedPreferences("ss_char."+R.id.SKT17,0).edit();
        data.putString("NAME","KNOW(ENGINEERING)").apply();
        data.putString("ABILHINT","INT").apply();
        data = getSharedPreferences("ss_char."+R.id.SKT18,0).edit();
        data.putString("NAME","KNOW(HISTORY)").apply();
        data.putString("ABILHINT","INT").apply();
        data = getSharedPreferences("ss_char."+R.id.SKT19,0).edit();
        data.putString("NAME","KNOW(GEOGRAPHY)").apply();
        data.putString("ABILHINT","INT").apply();
        data = getSharedPreferences("ss_char."+R.id.SKT20,0).edit();
        data.putString("NAME","KNOW(HISOTRY)").apply();
        data.putString("ABILHINT","INT").apply();
        data = getSharedPreferences("ss_char."+R.id.SKT21,0).edit();
        data.putString("NAME","KNOW(LOCAL)").apply();
        data.putString("ABILHINT","INT").apply();
        data = getSharedPreferences("ss_char."+R.id.SKT22,0).edit();
        data.putString("NAME","KNOW(NATURE)").apply();
        data.putString("ABILHINT","INT").apply();
        data = getSharedPreferences("ss_char."+R.id.SKT23,0).edit();
        data.putString("NAME","KNOW(NOBILITY)").apply();
        data.putString("ABILHINT","INT").apply();
        data = getSharedPreferences("ss_char."+R.id.SKT24,0).edit();
        data.putString("NAME","KNOW(PLANES)").apply();
        data.putString("ABILHINT","INT").apply();
        data = getSharedPreferences("ss_char."+R.id.SKT25,0).edit();
        data.putString("NAME","KNOW(RELIGOIN)").apply();
        data.putString("ABILHINT","INT").apply();
        data = getSharedPreferences("ss_char."+R.id.SKT26,0).edit();
        data.putString("NAME","LINGUISTICS").apply();
        data.putString("ABILHINT","INT").apply();
        data = getSharedPreferences("ss_char."+R.id.SKT27,0).edit();
        data.putString("NAME","PERCEPTION").apply();
        data.putString("ABILHINT","WIS").apply();
        data = getSharedPreferences("ss_char."+R.id.SKT28,0).edit();
        data.putString("NAME","PERFORM").apply();
        data.putString("ABILHINT","CHA").apply();
        data.putString("Sub","PERFORM").apply();
        data = getSharedPreferences("ss_char."+R.id.SKT29,0).edit();
        data.putString("NAME","PERFORM").apply();
        data.putString("ABILHINT","CHA").apply();
        data.putString("Sub","PERFORM").apply();
        data = getSharedPreferences("ss_char."+R.id.SKT30,0).edit();
        data.putString("NAME","PROFESSION").apply();
        data.putString("ABILHINT","WIS").apply();
        data.putString("Sub","PROFESSION").apply();
        data = getSharedPreferences("ss_char."+R.id.SKT31,0).edit();
        data.putString("NAME","PROFESSION").apply();
        data.putString("ABILHINT","WIS").apply();
        data.putString("Sub","PROFESSION").apply();
        data = getSharedPreferences("ss_char."+R.id.SKT32,0).edit();
        data.putString("NAME","RIDE").apply();
        data.putString("ABILHINT","DEX").apply();
        data = getSharedPreferences("ss_char."+R.id.SKT33,0).edit();
        data.putString("NAME","SENSE MOTIVE").apply();
        data.putString("ABILHINT","WIS").apply();
        data = getSharedPreferences("ss_char."+R.id.SKT34,0).edit();
        data.putString("NAME","SLEIGHT OF HAND").apply();
        data.putString("ABILHINT","DEX").apply();
        data = getSharedPreferences("ss_char."+R.id.SKT35,0).edit();
        data.putString("NAME","SPELLCRAFT").apply();
        data.putString("ABILHINT","INT").apply();
        data = getSharedPreferences("ss_char."+R.id.SKT36,0).edit();
        data.putString("NAME","STEALTH").apply();
        data.putString("ABILHINT","DEX").apply();
        data = getSharedPreferences("ss_char."+R.id.SKT37,0).edit();
        data.putString("NAME","SURVIVAL").apply();
        data.putString("ABILHINT","WIS").apply();
        data = getSharedPreferences("ss_char."+R.id.SKT38,0).edit();
        data.putString("NAME","SWIM").apply();
        data.putString("ABILHINT","STR").apply();
        data = getSharedPreferences("ss_char."+R.id.SKT39,0).edit();
        data.putString("NAME","USE MAGIC DEVICE").apply();
        data.putString("ABILHINT","CHA").apply();
        mydata.edit().putBoolean("HasRun",true).commit();


    }
}
