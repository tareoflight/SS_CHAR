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
        data = getSharedPreferences("ss_char.ACROBATICS", 0).edit();
        data.putString("ABILHINT", "DEX").apply();
        data = getSharedPreferences("ss_char.APPRAISE", 0).edit();
        data.putString("ABILHINT", "INT").apply();
        data = getSharedPreferences("ss_char.BLUFF", 0).edit();
        data.putString("ABILHINT", "CHA").apply();
        data = getSharedPreferences("ss_char.CLIMB", 0).edit();
        data.putString("ABILHINT", "STR").apply();
        data = getSharedPreferences("ss_char.CRAFT1", 0).edit();
        data.putString("ABILHINT", "INT").apply();
        data.putBoolean("Sub",true).apply();
        data = getSharedPreferences("ss_char.CRAFT2", 0).edit();
        data.putString("ABILHINT", "INT").apply();
        data.putBoolean("Sub",true).apply();
        data = getSharedPreferences("ss_char.DIPLOMACY", 0).edit();
        data.putString("ABILHINT", "CHA").apply();
        data = getSharedPreferences("ss_char.DISABLE DEVICE", 0).edit();
        data.putString("ABILHINT", "DEX").apply();
        data = getSharedPreferences("ss_char.DISGUISE", 0).edit();
        data.putString("ABILHINT", "CHA").apply();
        data = getSharedPreferences("ss_char.ESCAPE ARTIST", 0).edit();
        data.putString("ABILHINT", "DEX").apply();
        data = getSharedPreferences("ss_char.FLY", 0).edit();
        data.putString("ABILHINT", "DEX").apply();
        data = getSharedPreferences("ss_char.HANDLE ANIMAL", 0).edit();
        data.putString("ABILHINT", "CHA").apply();
        data = getSharedPreferences("ss_char.HEAL", 0).edit();
        data.putString("ABILHINT", "WIS").apply();
        data = getSharedPreferences("ss_char.INTIMIDATE", 0).edit();
        data.putString("ABILHINT", "CHA").apply();
        data = getSharedPreferences("ss_char.KNOW(ARCANA)", 0).edit();
        data.putString("ABILHINT", "INT").apply();
        data = getSharedPreferences("ss_char.KNOW(DUNGEONEETING)", 0).edit();
        data.putString("ABILHINT", "INT").apply();
        data = getSharedPreferences("ss_char.KNOW(ENGINEERING)", 0).edit();
        data.putString("ABILHINT", "INT").apply();
        data = getSharedPreferences("ss_char.KNOW(HISTORY)", 0).edit();
        data.putString("ABILHINT", "INT").apply();
        data = getSharedPreferences("ss_char.KNOW(GEOGRAPHY)", 0).edit();
        data.putString("ABILHINT", "INT").apply();
        data = getSharedPreferences("ss_char.KNOW(HISOTRY)", 0).edit();
        data.putString("ABILHINT", "INT").apply();
        data = getSharedPreferences("ss_char.KNOW(LOCAL)", 0).edit();
        data.putString("ABILHINT", "INT").apply();
        data = getSharedPreferences("ss_char.KNOW(NATURE)", 0).edit();
        data.putString("ABILHINT", "INT").apply();
        data = getSharedPreferences("ss_char.KNOW(NOBILITY)", 0).edit();
        data.putString("ABILHINT", "INT").apply();
        data = getSharedPreferences("ss_char.KNOW(PLANES)", 0).edit();
        data.putString("ABILHINT", "INT").apply();
        data = getSharedPreferences("ss_char.KNOW(RELIGOIN)", 0).edit();
        data.putString("ABILHINT", "INT").apply();
        data = getSharedPreferences("ss_char.LINGUISTICS", 0).edit();
        data.putString("ABILHINT", "INT").apply();
        data = getSharedPreferences("ss_char.PERCEPTION", 0).edit();
        data.putString("ABILHINT", "WIS").apply();
        data = getSharedPreferences("ss_char.PERFORM1", 0).edit();
        data.putString("ABILHINT", "CHA").apply();
        data.putBoolean("Sub",true).apply();
        data = getSharedPreferences("ss_char.PERFORM2", 0).edit();
        data.putString("ABILHINT", "CHA").apply();
        data.putBoolean("Sub",true).apply();
        data = getSharedPreferences("ss_char.PROFESSION1", 0).edit();
        data.putString("ABILHINT", "WIS").apply();
        data.putBoolean("Sub",true).apply();
        data = getSharedPreferences("ss_char.PROFESSION2", 0).edit();
        data.putString("ABILHINT", "WIS").apply();
        data.putBoolean("Sub",true).apply();
        data = getSharedPreferences("ss_char.RIDE", 0).edit();
        data.putString("ABILHINT", "DEX").apply();
        data = getSharedPreferences("ss_char.SENSE MOTIVE", 0).edit();
        data.putString("ABILHINT", "WIS").apply();
        data = getSharedPreferences("ss_char.SLEIGHT OF HAND", 0).edit();
        data.putString("ABILHINT", "DEX").apply();
        data = getSharedPreferences("ss_char.SPELLCRAFT", 0).edit();
        data.putString("ABILHINT", "INT").apply();
        data = getSharedPreferences("ss_char.STEALTH", 0).edit();
        data.putString("ABILHINT", "DEX").apply();
        data = getSharedPreferences("ss_char.SURVIVAL", 0).edit();
        data.putString("ABILHINT", "WIS").apply();
        data = getSharedPreferences("ss_char.SWIM", 0).edit();
        data.putString("ABILHINT", "STR").apply();
        data = getSharedPreferences("ss_char.USE MAGIC DEVICE", 0).edit();
        data.putString("ABILHINT", "CHA").apply();
        mydata.edit().putBoolean("HasRun",true).commit();


    }
}
