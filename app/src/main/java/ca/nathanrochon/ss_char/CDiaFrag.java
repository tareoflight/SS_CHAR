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
    private boolean edit =false;

    @Override
    public Dialog onCreateDialog(Bundle bundle){



        AlertDialog.Builder B = new AlertDialog.Builder(getActivity());
        final LayoutInflater F = getActivity().getLayoutInflater();
        final View inlat = F.inflate(R.layout.skill_popup,null);
        final SharedPreferences data = getActivity().getSharedPreferences("ss_char."+name, 0);

        ((EditText)inlat.findViewById(R.id.skillRank)).setText(data.getInt("Rank",0)+"");
        ((EditText)inlat.findViewById(R.id.skillClassB)).setText(data.getInt("ClassB",0)+"");
        ((EditText)inlat.findViewById(R.id.skillABIL)).setText(data.getInt("ABIL",0)+"");
        ((EditText)inlat.findViewById(R.id.skillRace)).setText(data.getInt("Race",0)+"");
        ((EditText)inlat.findViewById(R.id.skillFeat)).setText(data.getInt("Feat",0)+"");
        ((EditText)inlat.findViewById(R.id.skillItem)).setText(data.getInt("Item",0)+"");
        ((EditText)inlat.findViewById(R.id.skillMisc)).setText(data.getInt("Misc",0)+"");
        ((EditText)inlat.findViewById(R.id.skillArmor)).setText(data.getInt("Armor",0)+"");
        ((TextView)inlat.findViewById(R.id.skillABILT)).setText("ABILITY("+data.getString("ABILHINT","")+")");

        final TextView totaler= (TextView) clicker;
                B.setView(inlat)
                .setPositiveButton("Save", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        int tt;
                        SharedPreferences.Editor saver = data.edit();
                        tt=Integer.parseInt(nullcetch((((EditText)inlat.findViewById(R.id.skillRank)).getText().toString())));
                        saver.putInt("Rank",Integer.parseInt(nullcetch(((EditText)inlat.findViewById(R.id.skillRank)).getText().toString())));
                        tt+=Integer.parseInt(nullcetch(((EditText)inlat.findViewById(R.id.skillClassB)).getText().toString()));
                        saver.putInt("ClassB",Integer.parseInt(nullcetch(((EditText)inlat.findViewById(R.id.skillClassB)).getText().toString())));
                        tt+=Integer.parseInt(nullcetch(((EditText)inlat.findViewById(R.id.skillABIL)).getText().toString()));
                        saver.putInt("ABIL",Integer.parseInt(nullcetch(((EditText)inlat.findViewById(R.id.skillABIL)).getText().toString())));
                        tt+=Integer.parseInt(nullcetch(((EditText)inlat.findViewById(R.id.skillRace)).getText().toString()));
                        saver.putInt("Race",Integer.parseInt(nullcetch(((EditText)inlat.findViewById(R.id.skillRace)).getText().toString())));
                        tt+=Integer.parseInt(nullcetch(((EditText)inlat.findViewById(R.id.skillFeat)).getText().toString()));
                        saver.putInt("Feat",Integer.parseInt(nullcetch(((EditText)inlat.findViewById(R.id.skillFeat)).getText().toString())));
                        tt+=Integer.parseInt(nullcetch(((EditText)inlat.findViewById(R.id.skillItem)).getText().toString()));
                        saver.putInt("Item",Integer.parseInt(nullcetch(((EditText)inlat.findViewById(R.id.skillItem)).getText().toString())));
                        tt+=Integer.parseInt(nullcetch(((EditText)inlat.findViewById(R.id.skillMisc)).getText().toString()));
                        saver.putInt("Misc",Integer.parseInt(nullcetch(((EditText)inlat.findViewById(R.id.skillMisc)).getText().toString())));
                        tt+=Integer.parseInt(nullcetch(((EditText)inlat.findViewById(R.id.skillArmor)).getText().toString()));
                        saver.putInt("Armor",Integer.parseInt(nullcetch(((EditText)inlat.findViewById(R.id.skillArmor)).getText().toString())));
                        saver.putInt("Total",tt);
                        saver.commit();
                        total=tt;
                        totaler.setText(tt+"");
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Log.i("skill"+name+" popup: ","Cancel");

                    }
                });
                if(data.getBoolean("Sub",false)) {
                    B.setNeutralButton("Edit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            final AlertDialog.Builder ad = new AlertDialog.Builder(getContext());
                            final EditText input = new EditText(getContext());
                            ad.setTitle("Edit Skill");
                            ad.setView(input);
                            ad.setPositiveButton("Save", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
Log.i("TODO", "edit subclass stuff");

                                }
                            })
                                    .setNegativeButton("Cancel", null);
                            ad.show();
                        }
                    });
                }



        B.setTitle(name);
        AlertDialog output = B.create();


        return output;


    }

    public void setName(String name){
        this.name = name;

    }
    public String nullcetch(String i){
        return i.equals("")?"0":i;
    }
    public void setClicker(View v) {
        clicker = v;
    }

    public void addEdit() {
        edit =true;
    }
}
