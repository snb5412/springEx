package springEx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springEx.dao.ArticleDao;
import springEx.domain.Article;

@Service
public class ArticleServiceImpl implements ArticleService {
	@Autowired
	ArticleDao dao;

	public ArticleServiceImpl() {
	}
	
//	public ArticleServiceImpl(ArticleDao dao) {
//		this.dao = dao;
//	}
//	
//	public void setArticleDao(ArticleDao dao) {
//		this.dao = dao;
//	}

	@Override
	public void insert(Article article) {
		System.out.println("> Article Service : 글 저장");
		dao.insert(article);
	}

	@Override
	public Article selectOne(int id) {
		System.out.println("> Article Service : 글 추출");
		return dao.selectOne(id);
	}

}
