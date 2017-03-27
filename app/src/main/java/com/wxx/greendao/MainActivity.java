package com.wxx.greendao;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.wxx.greendao.bean.Info;
import com.wxx.greendao.utils.DBManager;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.name)
    EditText name;
    @BindView(R.id.age)
    EditText age;
    @BindView(R.id.address)
    EditText address;
    @BindView(R.id.insert)
    Button insert;
    @BindView(R.id.delete)
    Button delete;
    @BindView(R.id.query)
    Button query;
    @BindView(R.id.query_name)
    Button queryName;

    private static final String TAG = "MainActivity";
    @BindView(R.id.test)
    EditText test;
    @BindView(R.id.activity_main)
    LinearLayout activityMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.insert, R.id.delete, R.id.query, R.id.query_name})
    public void onClick(View view) {
        String n = name.getText().toString();
        int a = Integer.valueOf(age.getText().toString());
        String add = address.getText().toString();
        String t = test.getText().toString();
        switch (view.getId()) {
            case R.id.insert:
                Info info = new Info(null, n, a, add, t);
                DBManager.insert(info);
                break;
            case R.id.delete:
//                Info info2 = new Info(null, n, a, add,t);
//                DBManager.delet(info2);
                break;
            case R.id.query:
                List<Info> list = DBManager.query();
                for (int i = 0; i < list.size(); i++) {
                    Log.d(TAG, "--------------------------------------------------------");
                    Log.d(TAG, list.get(i).getAddRess());
                    Log.d(TAG, list.get(i).getName());
                    Log.d(TAG, "Age=" + list.get(i).getAge());
                    Log.d(TAG, "自增id=" + list.get(i).getId());
                    Log.d(TAG, "test=" + list.get(i).getTest());
                    Log.d(TAG, "--------------------------------------------------------");
                }
                break;
            case R.id.query_name:
                List<Info> list2 = DBManager.query(n);
                for (int i = 0; i < list2.size(); i++) {
                    Log.d(TAG, list2.get(i).getAddRess());
                    Log.d(TAG, list2.get(i).getName());
                    Log.d(TAG, "Age=" + list2.get(i).getAge());
                    Log.d(TAG, "自增id=" + list2.get(i).getId());
                    Log.d(TAG, "自增id=" + list2.get(i).getId());
                    Log.d(TAG, "自增id=" + list2.get(i).getId());
                }
                break;
        }
    }
}
