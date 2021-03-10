package com.example.news.repository

import androidx.lifecycle.LiveData
import com.example.news.api.RetrofitInstance
import com.example.news.db.ArticleDatabase
import com.example.news.models.Article
import com.example.news.util.Resource
import kotlinx.coroutines.flow.flow
import java.util.concurrent.Flow

class NewsRepository(
    private val db: ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)

    //suspend fun  getShow() : LiveData<Article>

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery, pageNumber)

    suspend fun upsert(article: Article) = db.getArticleDao().upsert(article)

    fun getSavedNews() = db.getArticleDao().getAllArticles()



    suspend fun deleteArticle(article: Article) = db.getArticleDao().deleteArticle(article)
}