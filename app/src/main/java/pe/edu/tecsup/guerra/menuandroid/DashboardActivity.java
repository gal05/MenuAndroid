package pe.edu.tecsup.guerra.menuandroid;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        BottomNavigationView bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu_home:
                        Intent i= new Intent(this,HomeActivity.class);
                        startActivity(i);
                        break;
                    case R.id.menu_camera:
                        Toast.makeText(DashboardActivity.this, "Go camera section...", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.menu_search:
                        Toast.makeText(DashboardActivity.this, "Go share section...", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.menu_notification:
                        Toast.makeText(DashboardActivity.this, "Go notification section...", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.menu_more:
                        Toast.makeText(DashboardActivity.this, "Go more sections...", Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });

    }
}


