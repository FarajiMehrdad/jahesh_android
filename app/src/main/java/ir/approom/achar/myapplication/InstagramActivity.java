package ir.approom.achar.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.PopupMenu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by Mehrdad on 8/17/17.
 */

public class InstagramActivity extends AppCompatActivity{


    boolean isLike = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.instagram);

        final ImageButton likeButton = (ImageButton) findViewById(R.id.likeButton);

        likeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isLike){
                    isLike = false;
                    likeButton.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.ic_favorite_border_black_24dp));
                }else {
                    isLike = true;
                    likeButton.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.ic_favorite_black_24dp));
                }
            }
        });


        final ImageButton moreMenu = (ImageButton) findViewById(R.id.moreMenu);

        moreMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               showMenu( view);
            }
        });


    }

    private void showMenu(View view) {
        PopupMenu popupMenu = new PopupMenu(this,view);
        MenuInflater menuInflater = popupMenu.getMenuInflater();
        menuInflater.inflate(R.menu.insta_menu,popupMenu.getMenu());
        popupMenu.show();
    }


}
