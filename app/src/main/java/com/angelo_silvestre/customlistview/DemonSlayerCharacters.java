package com.angelo_silvestre.customlistview;

import android.content.Context;

public class DemonSlayerCharacters {
    private String name;
    private String character;
    private String imageUrlCover;
    private String imageUrlPoster;


    private String shortDesc;

    public DemonSlayerCharacters() {
    }

    public DemonSlayerCharacters(String name, String character, String imageUrlCover, String imageUrlPoster) {
        this.name = name;
        this.character = character;
        this.imageUrlCover = imageUrlCover;
        this.imageUrlPoster = imageUrlPoster;
    }

    public DemonSlayerCharacters(String name, String character, String imageUrlPoster) {
        this.name = name;
        this.character = character;
        this.imageUrlPoster = imageUrlPoster;
    }

    public DemonSlayerCharacters(String name, String character, String imageUrlCover, String imageUrlPoster, String shortDesc) {
        this.name = name;
        this.character = character;
        this.imageUrlCover = imageUrlCover;
        this.imageUrlPoster = imageUrlPoster;
        this.shortDesc = shortDesc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getImageUrlCover() {
        return imageUrlCover;
    }

    public void setImageUrlCover(String imageUrlCover) {
        this.imageUrlCover = imageUrlCover;
    }

    public String getImageUrlPoster() {
        return imageUrlPoster;
    }

    public int getImageFromDrawable(Context context) {

        int drawableResourceId = context.getResources().getIdentifier(getImageUrlPoster(), "drawable", context.getPackageName());

        return drawableResourceId;
    }

    public void setImageUrlPoster(String imageUrlPoster) {
        this.imageUrlPoster = imageUrlPoster;
    }



    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    @Override
    public String toString() {
        return "DemonSlayerCharacters{" +
                "name='" + name + '\'' +
                ", character='" + character + '\'' +
                ", imageUrlCover='" + imageUrlCover + '\'' +
                ", imageUrlPoster='" + imageUrlPoster + '\'' +
                '}';
    }
}
