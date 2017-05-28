package com.example.mysession.mobileproject_userinformation;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by My session on 27/05/2017.
 */

public class FragmentInfo extends android.app.Fragment {
    int fragNumber;
    Etudiant etudiant;



    @Override
    public void setArguments(Bundle args){
        super.setArguments(args);
        fragNumber=args.getInt("FRAGMENT_NUMBER");
        etudiant=(Etudiant)args.getSerializable("ETUDIANT");
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v=null;

        switch (fragNumber) {
            case 1:
                v = inflater.inflate(R.layout.fragment1, container, false);

                TextView Name=(TextView)v.findViewById(R.id.Name);
                TextView CIN=(TextView)v.findViewById(R.id.CIN);
                TextView Email=(TextView)v.findViewById(R.id.Email);
                TextView Group=(TextView)v.findViewById(R.id.Group);
                TextView numIns=(TextView)v.findViewById(R.id.numIns);


                Name.setText(etudiant.getPrenom()+" "+etudiant.getNom());
                CIN.setText(etudiant.getCin());
                Email.setText(etudiant.getEmail());
                Group.setText(etudiant.getGroupe());
                numIns.setText(etudiant.getNumIns());

                break;
            case 2:
                v = inflater.inflate(R.layout.fragment2, container, false);

                break;
            case 3: v = inflater.inflate(R.layout.fragment3, container, false);
                break;
        }
        return v;
    }
}
