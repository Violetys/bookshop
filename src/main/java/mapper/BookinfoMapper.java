package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import beans.Bookinfo;

@Repository
public interface BookinfoMapper {

	@Insert("insert into book_info (bisbn,bname,bpublisher,bprice,bintro,bauthor) values(#{bisbn},#{bname},#{bpublisher},#{bprice},#{bintro},#{bauthor})")
	public int addBookinfo(Bookinfo bookinfo);

	@Update("update book_info set bname=#{bname}, bpublisher=#{publisher}, bprice=#{bprice}, bintro=#{bintro}, bauthor=#{bauthor} where bisbn=#{bisbn}")
	public int updateBookinfo(Bookinfo bookinfo);

	@Select("select * from book_info where bisbn=#{bisbn}")
	public Bookinfo getBookinfo(String bisbn);

	@Select("select * from book_info")
	public List<Bookinfo> getAllBookinfo();
	
	@Select("select * from book_info where bname LIKE '#{bname}%'")
	public List<Bookinfo> getBookinfoSearch(String bname);

}
