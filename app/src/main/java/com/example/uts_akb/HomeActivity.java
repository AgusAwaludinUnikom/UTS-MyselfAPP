package com.example.uts_akb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
/*
Tanggal Pengerjaan  : 3 June 2021
Nim                 : 10118067
Nama                : Agus Awaludin
Kelas               : IF-2
 */
public class HomeActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    private BottomNavigationView.OnNavigationItemSelectedListener navigation = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(MenuItem item) {
            Fragment f = null;
            switch (item.getItemId()) {
                case R.id.home_menu:
                    f = new HomeFragment();
                    break;
                case R.id.daily_activity_menu:
                    f = new DailyActivityFragment();
                    break;
                case R.id.gallery_menu:
                    f = new GalleryFragment();
                    break;
                case R.id.music_video_menu:
                    f = new MusicVideoFragment();
                    break;
                case R.id.profile_menu:
                    f = new ProfileFragment();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fl_container, f).commit();
            return true;
        }
    };

    public void ig(View view){
        Intent instagram = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/agusawaludin_/"));
        startActivity(instagram);
    }

    public void wa(View view){
        Intent whatsapp = new Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/081320118657"));
        startActivity(whatsapp);
    }

    public void gmail(View view){
        Intent gmail = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:aogust252000@gmail.com"));
        startActivity(gmail);
    }

    public void fb(View view){
        Intent facebook = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/agus.awaludin.56829/"));
        startActivity(facebook);
    }

    public void maps(View view){
        Intent maps = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Butik+Rizky/@-6.9097054,107.7092458,20z/data=!4m5!3m4!1s0x2e68dd240e602f87:0x6c516eb2087a164f!8m2!3d-6.9094699!4d107.7093028"));
        startActivity(maps);
    }

    public void buka_dialog(View view) {
        com.example.uts_akb.DialogFragment dialogFragment = new com.example.uts_akb.DialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "DialogFragment");
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        loadFragment(new HomeFragment());
        bottomNavigationView = findViewById(R.id.bn_main);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigation);
    }
    private boolean loadFragment(Fragment f) {
        if (f != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fl_container, f)
                    .commit();
            return true;
        }
        return false;
    }
}