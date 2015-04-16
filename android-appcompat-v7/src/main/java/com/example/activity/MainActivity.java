package com.example.activity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.R;

public class MainActivity extends ActionBarActivity {
  private ActionBarDrawerToggle toggle;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);

    final DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer);
    toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.drawer_open, R.string.drawer_close) {
      @Override
      public void onDrawerOpened(View drawerView) {
        super.onDrawerOpened(drawerView);
      }

      @Override
      public void onDrawerClosed(View drawerView) {
        super.onDrawerClosed(drawerView);
      }
    };

    drawer.setDrawerListener(toggle);
    getSupportActionBar().setHomeButtonEnabled(true);
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
  }

  @Override
  protected void onPostCreate(Bundle savedInstanceState) {
    super.onPostCreate(savedInstanceState);
    toggle.syncState();
  }

  @Override
  public void onConfigurationChanged(Configuration configuration) {
    super.onConfigurationChanged(configuration);
    toggle.onConfigurationChanged(configuration);
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    super.onCreateOptionsMenu(menu);
    getMenuInflater().inflate(R.menu.activity_main, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    switch (item.getItemId()) {
      case R.id.item1:
        return true;

      case R.id.item2:
        return true;

      default:
        return super.onOptionsItemSelected(item);
    }
  }
}
