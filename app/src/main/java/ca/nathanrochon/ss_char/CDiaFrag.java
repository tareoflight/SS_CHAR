package ca.nathanrochon.ss_char;

import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CDiaFrag extends DialogFragment {

    String name;
    View clicker;
    int total;

    @Override
    public Dialog onCreateDialog(Bundle bundle){



        AlertDialog.Builder B = new AlertDialog.Builder(getActivity());
        final LayoutInflater F = getActivity().getLayoutInflater();
        final View inlat = F.inflate(R.layout.skill_popup,null);
        final SharedPreferences data = getActivity().getSharedPreferences("ss_char."+name, 0);

        ((EditText)inlat.findViewById(R.id.skillRank)).setText(data.getInt("Rank",2)+"");
        ((EditText)inlat.findViewById(R.id.skillClassB)).setText(data.getInt("ClassB",1)+"");
        ((EditText)inlat.findViewById(R.id.skillABIL)).setText(data.getInt("ABIL",2)+"");
        ((EditText)inlat.findViewById(R.id.skillRace)).setText(data.getInt("Race",2)+"");
        ((EditText)inlat.findViewById(R.id.skillFeat)).setText(data.getInt("Feat",3)+"");
        ((EditText)inlat.findViewById(R.id.skillItem)).setText(data.getInt("Item",4)+"");
        ((EditText)inlat.findViewById(R.id.skillMisc)).setText(data.getInt("Misc",5)+"");
        ((EditText)inlat.findViewById(R.id.skillArmor)).setText(data.getInt("Armor",6)+"");
        final TextView totaler= (TextView) clicker;
                B.setView(inlat)
                .setPositiveButton("Save", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        int tt;
                        SharedPreferences.Editor saver = data.edit();
                        tt=Integer.parseInt(((EditText)inlat.findViewById(R.id.skillRank)).getText().toString());
                        saver.putInt("Rank",Integer.parseInt(((EditText)inlat.findViewById(R.id.skillRank)).getText().toString()));
                        tt+=Integer.parseInt(((EditText)inlat.findViewById(R.id.skillClassB)).getText().toString());
                        saver.putInt("ClassB",Integer.parseInt(((EditText)inlat.findViewById(R.id.skillClassB)).getText().toString()));
                        tt+=Integer.parseInt(((EditText)inlat.findViewById(R.id.skillABIL)).getText().toString());
                        saver.putInt("ABIL",Integer.parseInt(((EditText)inlat.findViewById(R.id.skillABIL)).getText().toString()));
                        tt+=Integer.parseInt(((EditText)inlat.findViewById(R.id.skillRace)).getText().toString());
                        saver.putInt("Race",Integer.parseInt(((EditText)inlat.findViewById(R.id.skillRace)).getText().toString()));
                        tt+=Integer.parseInt(((EditText)inlat.findViewById(R.id.skillFeat)).getText().toString());
                        saver.putInt("Feat",Integer.parseInt(((EditText)inlat.findViewById(R.id.skillFeat)).getText().toString()));
                        tt+=Integer.parseInt(((EditText)inlat.findViewById(R.id.skillItem)).getText().toString());
                        saver.putInt("Item",Integer.parseInt(((EditText)inlat.findViewById(R.id.skillItem)).getText().toString()));
                        tt+=Integer.parseInt(((EditText)inlat.findViewById(R.id.skillMisc)).getText().toString());
                        saver.putInt("Misc",Integer.parseInt(((EditText)inlat.findViewById(R.id.skillMisc)).getText().toString()));
                        tt+=Integer.parseInt(((EditText)inlat.findViewById(R.id.skillArmor)).getText().toString());
                        saver.putInt("Armor",Integer.parseInt(((EditText)inlat.findViewById(R.id.skillArmor)).getText().toString()));
                        saver.putInt("Total",tt);
                        saver.commit();
                        total=tt;
                        totaler.setText(total+"");
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Log.i("skill"+name+" popup: ","Cancel");

                    }
                });



        B.setTitle(name);
        AlertDialog output = B.create();


        return output;


    }

    public void setName(String name){
        this.name = name;

    }

    public void setClicker(View v) {
        clicker = v;
    }
}
