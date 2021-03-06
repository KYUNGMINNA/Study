package stu.Spring0627_;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.myweb.command.SnsBoardVO;
import com.spring.myweb.snsboard.mapper.ISnsBoardMapper;
import com.spring.myweb.util.PageVO;

@Service
public class SnsBoardService implements ISnsBoardService {

	@Autowired
	ISnsBoardMapper mapper;
	
	@Override
	public void insert(SnsBoardVO vo) {
		mapper.insert(vo);
	}

	@Override
	public List<SnsBoardVO> getList(PageVO paging) {
		return mapper.getList(paging);
	}

	@Override
	public SnsBoardVO getDetail(int bno) {
		return mapper.getDetail(bno);
	}

	@Override
	public void delete(int bno) {
		mapper.delete(bno);
	}

}
