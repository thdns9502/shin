package kr.co.dong.business;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.dong.domain.BusinessVO;

@Repository
public class BusinessDAOImpl implements BusinessDAO {

    @Autowired
    private SqlSession sqlSession;	
    
	  private final static String nameSpace = "kr.co.dong.businessMapper";
	
	@Override
	public List<BusinessVO> listAll() {
		// TODO Auto-generated method stub
		return sqlSession.selectList(nameSpace+".list");
	}

	@Override
	public BusinessVO selectOne(String bu_eamil) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(bu_eamil+".selectOne", bu_eamil);
	}

	@Override
	public int insert(BusinessVO bu) {
		// TODO Auto-generated method stub
		return sqlSession.insert(nameSpace+".insert", bu);
	}

	@Override
	public int update(BusinessVO bu) {
		// TODO Auto-generated method stub
		return sqlSession.update(nameSpace+".update",bu);
	}

	@Override
	public int delete(String bu_eamil) {
		// TODO Auto-generated method stub
		return sqlSession.delete(nameSpace+".delete",bu_eamil);
	}

}
