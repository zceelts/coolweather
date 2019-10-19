package com.example.coolweather.db;

import org.litepal.crud.LitePalSupport;

/**
 * Created by Litong on 2019/10/20.
 */

public class city extends LitePalSupport {
    private int id;
    private String cityName;
    private int cityCode;

    public int getId(){
        return id;
    }
    public void setId(){
        this.id=id;
    }
    public String getcityName(){
        return cityName;
    }
    public void setcityName(String cityName){
        this.cityName=cityName;
    }
    public int getcityCode(){
        return cityCode;
    }
    public void setcityCode(int cityCode){
        this.cityCode=cityCode;
    }
}
