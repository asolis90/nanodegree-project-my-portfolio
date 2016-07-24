package com.myportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnPopularMoview;
    private Button btnStockHawk;
    private Button btnBuildItBigger;
    private Button btnMakeYourAppMaterial;
    private Button btnGoUbiquitous;
    private Button btnCapstone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        btnPopularMoview = (Button) findViewById(R.id.main_btn_movies);
        btnStockHawk = (Button) findViewById(R.id.main_btn_stock);
        btnBuildItBigger = (Button) findViewById(R.id.main_btn_build);
        btnMakeYourAppMaterial = (Button) findViewById(R.id.main_btn_material);
        btnGoUbiquitous = (Button) findViewById(R.id.main_btn_ubiquitous);
        btnCapstone = (Button) findViewById(R.id.main_btn_capstone);

        // set listeners
        btnPopularMoview.setOnClickListener(mOnClickListener);
        btnStockHawk.setOnClickListener(mOnClickListener);
        btnMakeYourAppMaterial.setOnClickListener(mOnClickListener);
        btnBuildItBigger.setOnClickListener(mOnClickListener);
        btnGoUbiquitous.setOnClickListener(mOnClickListener);
        btnCapstone.setOnClickListener(mOnClickListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.main_btn_movies:
                    Toast.makeText(getApplicationContext(), getString(R.string.this_app_will_launch,
                            getString(R.string.popular_movies)), Toast.LENGTH_SHORT).show();
                    break;
                case R.id.main_btn_stock:
                    Toast.makeText(getApplicationContext(), getString(R.string.this_app_will_launch,
                            getString(R.string.stock_hawk)), Toast.LENGTH_SHORT).show();
                    break;
                case R.id.main_btn_build:
                    Toast.makeText(getApplicationContext(), getString(R.string.this_app_will_launch,
                            getString(R.string.build_it_bigger)), Toast.LENGTH_SHORT).show();
                    break;
                case R.id.main_btn_material:
                    Toast.makeText(getApplicationContext(), getString(R.string.this_app_will_launch,
                            getString(R.string.make_your_app_material)), Toast.LENGTH_SHORT).show();
                    break;
                case R.id.main_btn_ubiquitous:
                    Toast.makeText(getApplicationContext(), getString(R.string.this_app_will_launch,
                            getString(R.string.go_ubiquitous)), Toast.LENGTH_SHORT).show();
                    break;
                case R.id.main_btn_capstone:
                    Toast.makeText(getApplicationContext(), getString(R.string.this_app_will_launch,
                            getString(R.string.capstone)), Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    };
}
