package com.stocktrading.news.service;

import com.stocktrading.news.repository.NewsRepository;
import org.springframework.stereotype.Service;

@Service
public class NewsService {

    private final NewsRepository newsRepository;

    public NewsService(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

}
