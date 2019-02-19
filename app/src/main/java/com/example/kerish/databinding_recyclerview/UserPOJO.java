package com.example.kerish.databinding_recyclerview;

import android.databinding.BindingAdapter;
import android.support.v4.content.ContextCompat;
import android.view.View;

import de.hdodenhof.circleimageview.CircleImageView;

public class UserPOJO {

    public String name, email;
    public int image;

    public UserPOJO(String name, String email, int image) {
        this.name = name;
        this.email = email;
        this.image = image;
    }

    @BindingAdapter("android:customImageUrl")
    public static void loadImage(View view, int image){
        CircleImageView circleImageView = (CircleImageView) view;
        circleImageView.setImageDrawable(ContextCompat.getDrawable(view.getContext(), image));
    }

}
