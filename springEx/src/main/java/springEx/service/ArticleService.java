package springEx.service;

import springEx.domain.Article;

public interface ArticleService {
	void insert(Article article);
	Article selectOne(int id);
}
