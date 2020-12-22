package org.yongmin.web.board.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.yongmin.common.Search;
import org.yongmin.web.board.model.BoardVO;


@Repository
public class BoardDAOImpl implements BoardDAO {
	
	@Inject
	private SqlSession sqlSession;
	
	@Override
	public List<BoardVO> getBoardList(Search search) throws Exception {
		return sqlSession.selectList("org.yongmin.web.board.boardMapper.getBoardList", search);
	}
	
	@Override
	public int getBoardListCnt(Search search) throws Exception {
		return sqlSession.selectOne("org.yongmin.web.board.boardMapper.getBoardListCnt", search);
	}
	
	@Override
	public BoardVO getBoardContent(int bid) throws Exception {
		return sqlSession.selectOne("org.yongmin.web.board.boardMapper.getBoardContent", bid);
	}
	
	@Override
	public int insertBoard(BoardVO boardVO) throws Exception {
		return sqlSession.insert("org.yongmin.web.board.boardMapper.insertBoard", boardVO);
	}
	
	@Override
	public int updateBoard(BoardVO boardVO) throws Exception {
		return sqlSession.update("org.yongmin.web.board.boardMapper.updateBoard", boardVO);
	}
	
	public int deleteBoard(int bid) throws Exception {
		return sqlSession.delete("org.yongmin.web.board.boardMapper.deleteBoard", bid);
	}
	
	@Override
	public int updateViewCnt(int bid) throws Exception {
		return sqlSession.update("org.yongmin.web.board.boardMapper.updateViewCnt", bid);
	}
}
