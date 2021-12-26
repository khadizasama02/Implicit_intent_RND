package com.first.implicit_intent_rnd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Intetent_implicity2_RND extends AppCompatActivity {
//    Button camera;
//    Button contact;
//    Button browser;
//    Button gallery;
//    Button dialpad;
    EditText et;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intetent_implicity2__r_n_d);
//        for camera
        findViewById(R.id.bt_camera).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
//                i.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
                i.setAction(MediaStore.ACTION_VIDEO_CAPTURE);
                startActivity(i);
            }
        });
//        for contact
        findViewById(R.id.bt_contact).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
//
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("content://contacts/people/"));
                startActivity(i);

            }
        });
//for browser
        et = (EditText)findViewById(R.id.et_phn);
        findViewById(R.id.bt_browser).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();

                i.setAction(Intent.ACTION_VIEW);
                String url =et.getText().toString();
                i.setData(Uri.parse("http://www" +url));
                startActivity(i);

            }
        });
//        for gallery
        findViewById(R.id.bt_gallery).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();

                i.setAction(Intent.ACTION_VIEW);

                i.setData(Uri.parse("content://media//external/images/media/"));
                startActivity(i);

            }
        });
//        for dial pad
        findViewById(R.id.bt_dialpad).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();

                i.setAction(Intent.ACTION_DIAL);

                i.setData(Uri.parse("tel:" +et.getText()));
                startActivity(i);

            }
        });


    }
}