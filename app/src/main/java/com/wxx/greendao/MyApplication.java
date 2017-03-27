package com.wxx.greendao;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

import com.wxx.greendao.db.DaoMaster;
import com.wxx.greendao.db.DaoSession;
import com.wxx.greendao.utils.DBHelper;

/**
 * 作者：Tangren_ on 2017/3/23 0023.
 * 邮箱：wu_tangren@163.com
 * TODO:用一句话概括
 */

public class MyApplication extends Application {

    private final String DB_NAME = "info";
    private static DaoSession session;

    @Override
    public void onCreate() {
        super.onCreate();
        setUpDataBase();
    }

    private void setUpDataBase() {
//        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, DB_NAME);
        DBHelper helper = new DBHelper(this, DB_NAME);
        SQLiteDatabase db = helper.getWritableDatabase();

        //获取数据库对象
        DaoMaster master = new DaoMaster(db);
        //获取dao管理者
        session = master.newSession();
    }


    public static DaoSession getDaoInstance() {
        return session;
    }
}
