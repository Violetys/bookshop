package mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import beans.Userlogin;

@Repository
public interface UserloginMapper {

	@Insert("insert into user_login (uphone,upassword) values (#{uphone},#{upassword})")
	public int addUserlogin(Userlogin userlogin);

	@Update("update user_login set upassword=#{upassword} where uphone=#{uphone}")
	public int updateUserlogin(Userlogin userlogin);

	@Select("select * from user_login where uphone=#{uphone} and upassword=#{upassword}")
	public Userlogin getUserlogin(String uphone, String upassword);
	
	@Select("select * from user_login where uphone=#{uphone}")
	public Userlogin getUserloginByUphone(String uphone);

}
