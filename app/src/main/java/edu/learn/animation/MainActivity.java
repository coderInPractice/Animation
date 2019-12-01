package edu.learn.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity{
    boolean isImage=true;
    public void animate(View view){
        ImageView image = (ImageView)findViewById(R.id.img1);
        ImageView image2 = (ImageView)findViewById(R.id.img2);

        if(isImage) {
            isImage=false;
            image.animate().alpha(0).setDuration(2000);
            image2.animate().rotation(1800).alpha(1).setDuration(2000);
        }else{
            isImage=true;
            image.animate().alpha(1).setDuration(2000);
            image2.animate().rotation(1800).alpha(0).setDuration(2000);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
