package org.yongmin.web.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.yongmin.common.Search;
import org.yongmin.web.board.dao.BoardDAO;
import org.yongmin.web.board.model.BoardVO;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Inject
	private BoardDAO boardDAO;
	
	public List<BoardVO> getBoardList(Search search) throws Exception{		
		return boardDAO.getBoardList(search);		
	}
	
	@Override
	public int getBoardListCnt(Search search) throws Exception {
		return boardDAO.getBoardListCnt(search);
	}
	
	@Override
	public void insertBoard(BoardVO boardVO) throws Exception{		
		boardDAO.insertBoard(boardVO);		
	}
	
	public BoardVO getBoardContent(int bid) throws Exception{
		BoardVO boardVO = new BoardVO();
		boardDAO.updateViewCnt(bid);
		boardVO = boardDAO.getBoardContent(bid); 	
		
		return boardVO;		
	}
	
	@Override
	public void updateBoard(BoardVO boardVO) throws Exception{
		boardDAO.updateBoard(boardVO);
	}
	
	@Override
	public void deleteBoard(int bid) throws Exception{
		boardDAO.deleteBoard(bid);
	}

}
