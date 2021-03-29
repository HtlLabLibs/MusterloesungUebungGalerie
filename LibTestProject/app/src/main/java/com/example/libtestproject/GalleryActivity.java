package com.example.libtestproject;

import android.media.Image;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gallerylib.GalleryObject;
import com.vuzix.hud.actionmenu.ActionMenuActivity;

public class GalleryActivity extends ActionMenuActivity {
    private GalleryObject galleryObject;

    private GridView gridView;
    private GalleryObject.gridViewAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);


        galleryObject = new GalleryObject(this);

        gridView = (GridView) findViewById(R.id.gridView);
        customAdapter = new GalleryObject.gridViewAdapter(this, R.layout.row_layout, galleryObject.getData(), R.id.text, R.id.image);
        gridView.setAdapter(customAdapter);
    }
}
