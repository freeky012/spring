package service;

import java.util.ArrayList;

import VO.bbsVO;

public interface bbsService {
	
	public ArrayList<bbsVO> bbsList();
	public bbsVO bbsOneList(int bbsNo);
	public void bbsInsert(bbsVO bvo);
	public void bbsUpdate(bbsVO bvo);
	public void bbsDelete(int bbsNo);
}
