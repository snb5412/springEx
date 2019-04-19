package springEx.dao;

import org.springframework.stereotype.Repository;

import springEx.domain.Article;

@Repository
public class ArticleDaoImpl implements ArticleDao{
	
	@Override
	public void insert(Article article) {
		System.out.println("======= 글 저장 =======");
		System.out.println("제목 : " + article.getTitle());
		System.out.println("내용 : " + article.getContent());
		
	}
	@Override
	public Article selectOne(int id) {
		System.out.println("======= 글 추출 =======");
		System.out.println("글 id " + id + " 추출");
		return new Article("테스트" + id , "테스트 내용");
	}
	
	//@PostC
	public void open() {
		System.out.println("데이터베이스 연결");
	}
	
	//@Pre
	public void close() {
		System.out.println("데이터베이스 연결 해제");
	}
}
