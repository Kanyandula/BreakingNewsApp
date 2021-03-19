package com.example.news.ui.fragments

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.animation.AccelerateDecelerateInterpolator
import android.view.animation.AnimationUtils
import android.webkit.WebViewClient
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.news.R
import com.example.news.ui.NewsActivity
import com.example.news.ui.NewsViewModel
import com.example.news.ui.fragments.animation.startAnimation
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_article.*


class ArticleFragment : Fragment(R.layout.fragment_article){

    lateinit var viewModel: NewsViewModel
    private val args: ArticleFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as NewsActivity).viewModel
        val article = args.article
        webView.apply {
            webViewClient = WebViewClient()
            article.url?.let { loadUrl(it) }
        }

        val animation = AnimationUtils.loadAnimation(activity?.baseContext, R.anim.circle_explosion_anim).apply {
            duration = 700
            interpolator = AccelerateDecelerateInterpolator()
        }




        fabShare.setOnClickListener {
            circle.isVisible = true
            circle.startAnimation(animation){
                circle.isVisible = false
            }
            val url = webView.url
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.type = "text/plain"
            shareIntent.putExtra(Intent.EXTRA_TEXT, url) // your above url
            startActivity(Intent.createChooser(shareIntent, "Share..."))

        }

        fabSave.setOnClickListener {
            circle.isVisible = true
            circle.startAnimation(animation){
                circle.isVisible = false
            }
            viewModel.saveArticle(article)
            Snackbar.make(view, "Article saved successfully", Snackbar.LENGTH_SHORT).show()
        }
    }
}