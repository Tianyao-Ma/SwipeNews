package com.tianyaoma.tinnews.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.tianyaoma.tinnews.model.Article;

@Database(entities = {Article.class}, version = 1, exportSchema = false)
public abstract class TinNewsDatabase extends RoomDatabase {
    public abstract ArticleDao articleDao();
}
