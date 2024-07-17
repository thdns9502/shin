package kr.co.dong.business;

import java.util.List;

import kr.co.dong.domain.BusinessVO;

public interface BusinessService {
	  //전체사원조회
	   public List<BusinessVO> listAll();
	   
	   //사원조회_사원번호
	   public BusinessVO selectOne(String bu_eamil);
	   
	   //사원추가
	   public int insert(BusinessVO bu);
	   
	   //사원수정
	   public int update(BusinessVO bu);
	   
	   //사원 삭제_사원번호
	   public int delete(String bu_eamil);


}
