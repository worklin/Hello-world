package com.example.shao.testsearch;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

/**
@ Description:展示搜索结果
**/
public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        Intent intent = getIntent();
        if(Intent.ACTION_SEARCH.equals(intent.getAction())) {
            String equry = intent.getStringExtra(SearchManager.QUERY);
            doMySearch(equry);
        }
    }

    private void doMySearch(String equry) {
        TextView tv = (TextView) findViewById(R.id.text);
        tv.setText(equry);
        Toast.makeText(SearchActivity.this,"搜索执行",Toast.LENGTH_SHORT).show();
    }


}
