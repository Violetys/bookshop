package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import beans.Saddb;
import beans.Sellerinfo;

@Repository
public interface SaddbMapper {

	@Insert("insert into saddb (sphone,bisbn,num,sellnum) values (#{sphone},#{bisbn},#{num},#{sellnum})")
	public int addSaddb(Saddb saddb);

	@Update("update saadb set num=#{num}, sellnum=#{sellnum} where sphone=#{sphone} and bisbn=#{bisbn}")
	public int updateSaddb(Saddb saddb);

	@Select("select * from saddb where bisbn=#{bisbn} and sphone=#{sphone}")
	public Saddb getSaddb(String bisbn, String sphone);

	@Select("select * from saddb where sphone=#{sphone}")
	public List<Saddb> getAllSaddb(String sphone);
	
	@Select("select * from saddb where bisbn=#{bisbn}")
	public Sellerinfo getSellerinfoByISBN(String bisbn);

}
