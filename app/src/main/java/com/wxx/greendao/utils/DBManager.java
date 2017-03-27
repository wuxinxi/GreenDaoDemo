package com.wxx.greendao.utils;

import com.wxx.greendao.MyApplication;
import com.wxx.greendao.bean.Info;
import com.wxx.greendao.db.InfoDao;

import java.util.List;

/**
 * 作者：Tangren_ on 2017/3/23 0023.
 * 邮箱：wu_tangren@163.com
 * TODO:DBManger
 */


public class DBManager {
    //增
    public static void insert(Info info) {
        MyApplication.getDaoInstance().getInfoDao().insert(info);
    }


    //根据id删除
    public static void delete(long id) {
        MyApplication.getDaoInstance().getInfoDao().deleteByKey(id);
    }

    //删除
    public static void delet(Info info) {
        MyApplication.getDaoInstance().getInfoDao().delete(info);
    }

    //更改
    public static void update(Info info) {
        MyApplication.getDaoInstance().getInfoDao().update(info);
    }


    //查询所有
    public static List<Info> query() {
        return MyApplication.getDaoInstance().getInfoDao().queryBuilder().list();
    }

    //根据名字查询
    public static List<Info> query(String name) {
        return MyApplication.getDaoInstance().getInfoDao().queryBuilder().where(InfoDao.Properties.Name.eq(name)).list();
    }


}
