 package stu.Spring0607_;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.basic.model.BoardVO;

@Repository
public class BoardDAO implements IBoardDAO {

	//게시글을 저장할 리스트 :DB대용
	private List<BoardVO> articles=new ArrayList<BoardVO>();
	
	
	@Override
	public void insertArticle(BoardVO vo) {
		articles.add(vo);
	}

	@Override
	public List<BoardVO> getArticles() {
		return articles;
	}

	@Override
	public BoardVO getAtritlce(int bId) {
		return articles.get(bId);
	}

	@Override
	public void deleteArticle(int bId) {
		articles.remove(bId);

	}

	@Override
	public void updateArticle(BoardVO vo, int bId) {
		articles.set(bId, vo);

	}

}
