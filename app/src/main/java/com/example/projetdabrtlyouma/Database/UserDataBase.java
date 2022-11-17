package com.example.projetdabrtlyouma.Database;
import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.projetdabrtlyouma.Dao.UserDao;
import com.example.projetdabrtlyouma.Entity.User;


@Database(entities = {User.class}, version = 1, exportSchema = false)
public abstract class UserDataBase extends RoomDatabase {
    public abstract UserDao getUserDao();

}