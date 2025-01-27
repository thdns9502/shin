package kr.co.dong;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/*.xml"})
//불러들일 파일인 무엇인지 | {} : 여러개 _ locations
public class DataSourceTest {
	//안되면 버전 확인
	@Autowired //beans가 붙게됨. //Autowired : spring전용 | @Resource : 이름으로 연결 | @Inject : 자바/spring용
	private DataSource dataSource;
	
	@Test
	public void testConn() {
		try {
			Connection conn = dataSource.getConnection();
			System.out.println(conn);
			System.out.println("연결성공");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}// end testConn
	
	
}//end class
