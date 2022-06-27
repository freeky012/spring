package service.serviceimpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import VO.bbsVO;
import mappers.BbsMapper;
import service.bbsService;

@Service
public class bbsServiceImpl implements bbsService {

	@Autowired
	BbsMapper bbsmapper;
	
	@Override
	public ArrayList<bbsVO> bbsList() {
		ArrayList<bbsVO> list = bbsmapper.bbsList();
		return list;
	}

	@Override
	public void bbsInsert(bbsVO bvo) {
		bbsmapper.bbsInsert(bvo);
	}

	@Override
	public void bbsUpdate(bbsVO bvo) {
		bbsmapper.bbsUpdate(bvo);
	}

	@Override
	public void bbsDelete(int bbsNo) {
		bbsmapper.bbsDelete(bbsNo);
	}

	@Override
	public bbsVO bbsOneList(int bbsNo) {
		bbsVO bvo = bbsmapper.bbssOneList(bbsNo);
		return bvo;
	}



}
