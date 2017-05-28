package com.example.mysession.mobileproject_userinformation;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {

    public TextView mTextMessage;
    DatabaseReference mRootRef = FirebaseDatabase.getInstance().getReference();
    Etudiant etudiant;
    List<Seance> seanceList=new ArrayList<>();

    @Override
    protected void onStart() {
        super.onStart();

        DatabaseReference myRef=mRootRef.child("etudiant");
        Query q=myRef.orderByChild("cin").equalTo("12345").limitToFirst(1);

        q.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    for(DataSnapshot issue: dataSnapshot.getChildren()) {
                        etudiant = issue.getValue(Etudiant.class);
                        for(String l:etudiant.getListeseance()){


                        Query q2=mRootRef.child("seance").orderByKey().equalTo(l);
                        q2.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot dataSnapshot) {
                                for (DataSnapshot l:dataSnapshot.getChildren()){

                                    seanceList.add(l.getValue(Seance.class));

                                }

                            }

                            @Override
                            public void onCancelled(DatabaseError databaseError) {

                            }
                        });
                        }




                    }
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextMessage=(TextView)findViewById(R.id.textView);


        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()) {

                case R.id.profile_info:

                    setFragment(1);
                    return true;
                case R.id.calender:

                    setFragment(2);
                    return true;
                case R.id.navigation_notifications:

                    setFragment(3);
                    return true;
            }
            return false;
        }

    };

    protected void setFragment(int fragNumber){
        android.app.Fragment fragment=new FragmentInfo();
        Bundle b=new Bundle();

        b.putSerializable("ETUDIANT",etudiant);
        b.putInt("FRAGMENT_NUMBER",fragNumber);
        fragment.setArguments(b);
        FragmentManager fm=getFragmentManager();
        FragmentTransaction tr= fm.beginTransaction();
        tr.replace(R.id.fragment1,fragment);
        tr.commit();
    }



}
