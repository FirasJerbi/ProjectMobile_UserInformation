package com.example.mysession.mobileproject_userinformation;

import android.os.Parcelable;

/**
 * Created by My session on 28/05/2017.
 */

class Seance {

    String date;
    String groupe;
    String heureDebut;
    String heureFin;
    String jour;
    String matiere;
    String prof;
    Long salle;
    String semaine;
    String type;

    public Seance(){}

    public Seance(String date, String groupe, String heureDebut, String heureFin, String jour, String matiere, String prof, Long salle, String semaine, String type) {
        this.date = date;
        this.groupe = groupe;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
        this.jour = jour;
        this.matiere = matiere;
        this.prof = prof;
        this.salle = salle;
        this.semaine = semaine;
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGroupe() {
        return groupe;
    }

    public void setGroupe(String groupe) {
        this.groupe = groupe;
    }

    public String getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(String heureDebut) {
        this.heureDebut = heureDebut;
    }

    public String getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(String heureFin) {
        this.heureFin = heureFin;
    }

    public String getJour() {
        return jour;
    }

    public void setJour(String jour) {
        this.jour = jour;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public String getProf() {
        return prof;
    }

    public void setProf(String prof) {
        this.prof = prof;
    }

    public Long getSalle() {
        return salle;
    }

    public void setSalle(Long salle) {
        this.salle = salle;
    }

    public String getSemaine() {
        return semaine;
    }

    public void setSemaine(String semaine) {
        this.semaine = semaine;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
