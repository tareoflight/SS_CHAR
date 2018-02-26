package ca.nathanrochon.ss_char;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;

/**
 * Created by Nathan Rochon on 2018-02-26.
 */

public class CoreFrag extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle bundle) {

        AlertDialog.Builder B = new AlertDialog.Builder(getActivity());
        final LayoutInflater F = getActivity().getLayoutInflater();
        final View inlat = F.inflate(R.layout.core_popup,null);
        final SharedPreferences data = getActivity().getSharedPreferences("ss_char.core", 0);
        B.setView(inlat);
        return B.create();
    }
}
