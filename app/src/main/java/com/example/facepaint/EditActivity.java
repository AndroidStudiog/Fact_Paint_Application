package com.example.facepaint;

import static com.example.facepaint.MainActivity.imgUri;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.dsphotoeditor.sdk.activity.DsPhotoEditorActivity;
import com.dsphotoeditor.sdk.utils.DsPhotoEditorConstants;
import com.example.facepaint.databinding.ActivityEditBinding;

public class EditActivity extends AppCompatActivity {
    ActivityEditBinding binding;
    String image;
    public static ImageView person_img;
    public static ImageView flag_img;
    Button done;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityEditBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        person_img = (ImageView) findViewById(R.id.editImage);
        flag_img = (ImageView) findViewById(R.id.editPaintImage);
        done = (Button) findViewById(R.id.done);

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent submit=new Intent(EditActivity.this,SubmitActivity.class);
                startActivity(submit);
            }
        });
    }
}