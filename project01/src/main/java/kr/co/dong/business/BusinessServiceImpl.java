package kr.co.dong.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.dong.domain.BusinessVO;

@Service
public class BusinessServiceImpl implements BusinessService{
	
	@Autowired
	private BusinessDAO dao;

	@Override
	public List<BusinessVO> listAll() {
		// TODO Auto-generated method stub
		return dao.listAll();
	}

	@Override
	public BusinessVO selectOne(String bu_eamil) {
		// TODO Auto-generated method stub
		return dao.selectOne(bu_eamil);
	}

	@Override
	public int insert(BusinessVO bu) {
		// TODO Auto-generated method stub
		return dao.insert(bu);
	}

	@Override
	public int update(BusinessVO bu) {
		// TODO Auto-generated method stub
		return dao.update(bu);
	}

	@Override
	public int delete(String bu_eamil) {
		// TODO Auto-generated method stub
		return dao.delete(bu_eamil);
	}

}
