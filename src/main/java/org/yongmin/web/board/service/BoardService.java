package org.yongmin.web.board.service;

import java.util.List;

import org.yongmin.common.Search;
import org.yongmin.web.board.model.BoardVO;

public interface BoardService {
	
	public List<BoardVO> getBoardList(Search search) throws Exception;
	public int getBoardListCnt(Search search) throws Exception;
	public void insertBoard(BoardVO boardVO) throws Exception;
	public BoardVO getBoardContent(int bid) throws Exception;
	public void updateBoard(BoardVO boardVO) throws Exception;
	public void deleteBoard(int bid) throws Exception;

}
