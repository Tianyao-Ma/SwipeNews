package com.tianyaoma.tinnews.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.tianyaoma.tinnews.model.Article;

import java.util.List;
// specified the operations to access the article table;
@Dao
public interface ArticleDao {
        @Insert
        void saveArticle(Article article);

        @Query("SELECT * FROM article")
        LiveData<List<Article>> getAllArticles();

        @Delete
        void deleteArticle(Article article);

    }
