package com.wxx.greendao.utils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.github.yuweiguocn.library.greendao.MigrationHelper;
import com.wxx.greendao.db.DaoMaster;
import com.wxx.greendao.db.InfoDao;

/**
 * 作者：Tangren_ on 2017/3/23 0023.
 * 邮箱：wu_tangren@163.com
 * TODO：
 */


public class DBHelper extends DaoMaster.OpenHelper {
    public DBHelper(Context context, String name) {
        super(context, name);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        super.onUpgrade(db, oldVersion, newVersion);
        MigrationHelper.migrate(db, InfoDao.class);
    }
}
