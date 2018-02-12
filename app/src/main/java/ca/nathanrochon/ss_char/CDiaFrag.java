package ca.nathanrochon.ss_char;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.LayoutInflater;

public class CDiaFrag extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle bundle){
        AlertDialog.Builder B = new AlertDialog.Builder(getActivity());
        LayoutInflater F = getActivity().getLayoutInflater();
        B.setView(F.inflate(R.layout.skill_popup,null))
                .setPositiveButton("Save", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Log.v("skill popup: ","Save");
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Log.v("skill popup: ","Cancel");

                    }
                });
        return B.create();


    }

}
