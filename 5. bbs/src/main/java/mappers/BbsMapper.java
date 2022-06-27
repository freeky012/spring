package mappers;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import VO.bbsVO;

@Repository
public interface BbsMapper {
	
	@Select("SELECT * FROM BOARD")
	public ArrayList<bbsVO> bbsList();

	@Select("SELECT * FROM BOARD WHERE bbsno=#{bbsNo}")
	public bbsVO bbssOneList(int bbsNo);

	@Insert("INSERT INTO BOARD (NAME, TITLE, PHOTO, CONTENT) VALUES ( #{name}, #{title}, #{photo}, #{content})")
	public void bbsInsert(bbsVO bvo);

	@Update("UPDATE BOARD SET NAME=#{name}, TITLE=#{title}, PHOTO=#{photo}, CONTENT=#{content} WHERE bbsno=#{bbsNo}")
	public void bbsUpdate(bbsVO bvo);
	
	@Delete("DELETE FROM BOARD WHERE bbsno=#{bbsNo}")
	public void bbsDelete(int bbsNo);

}
