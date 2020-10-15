package shop.carrental.tt.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import shop.carrental.tt.domain.MemberVO;

@RunWith(SpringRunner.class)
@ContextConfiguration({ "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
@Log4j
public class MemberMapperTests {

	@Setter(onMethod_ = @Autowired)
	private MemberMapper memberMapper;

	@Test
	public void testRead() {

		log.info("Read");

		MemberVO vo = memberMapper.read("admin9");
		log.info(vo);

		vo.getAuthList().forEach(authVo -> log.info(authVo));

	}

}