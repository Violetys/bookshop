package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import beans.Bookphoto;

@Repository
public interface BookphotoMapper {

	@Insert("insert into book_photo (id,bisbn,bphoto) values (default,#{bisbn},#{bphoto})")
	public int addBookphoto(Bookphoto bookphoto);

	@Delete("delete from book_photo where id=#{id}")
	public int deleteBookphoto(int id);

	@Update("update book_photo set bphoto=#{bphoto} where id=#{id}")
	public int updateBookphoto(Bookphoto bookphoto);

	@Select("select * from book_photo where id=#{id}")
	public Bookphoto getBookphotoById(int id);

	@Select("select * from book_photo where bisbn=#{bisbn}")
	public List<Bookphoto> getAllBookphotoByBisbn(String bisbn);

}
