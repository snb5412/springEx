package springEx.dao;

import springEx.domain.Article;

public interface ArticleDao {
	void insert(Article article);
	Article selectOne(int id);
}
