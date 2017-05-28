package com.example.mysession.mobileproject_userinformation;

import android.support.annotation.NonNull;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by My session on 28/05/2017.
 */

public class Etudiant implements Serializable {
    String cin;
    String email;
    String groupe;
    List<String> listeseance;
    String nom;
    String numIns;
    String password;
    String prenom;


    public Etudiant(String cin, String email, String groupe, List<String> listeseance, String nom, String numIns, String password, String prenom) {
        this.cin = cin;
        this.email = email;
        this.groupe = groupe;
        this.listeseance = listeseance;
        this.nom = nom;
        this.numIns = numIns;
        this.password = password;
        this.prenom = prenom;
    }

    public Etudiant(){}

    public String getNumIns() {
        return numIns;
    }

    public void setNumIns(String numIns) {
        this.numIns = numIns;
    }

    public List<String> getListeseance() {
        return listeseance;
    }

    public void setListeseance(List<String> listeseance) {
        this.listeseance = listeseance;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumlns() {
        return numIns;
    }

    public void setNumlns(String numlns) {
        this.numIns = numlns;
    }

    public String getGroupe() {
        return groupe;
    }

    public void setGroupe(String groupe) {
        this.groupe = groupe;
    }


}
