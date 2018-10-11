package com.example.bhoang8.csmokeconcept;

import android.os.Parcel;
import android.os.Parcelable;

public class Smoke {

    private String smoke_target;
    private String smoke_directions;
    private int imgId = 0;

    public Smoke(String smoke_tar, String smoke_dir, int nImgId){
        smoke_target = smoke_tar;
        smoke_directions = smoke_dir;
        imgId = nImgId;
    }

    public String get_smoke_target(){
        return smoke_target;
    }

    public String get_Smoke_directions() {
        return smoke_directions;
    }

    public int get_ImgId(){
        return imgId;
    }
}


