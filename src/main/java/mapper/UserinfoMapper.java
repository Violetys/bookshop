package mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import beans.Userinfo;

@Repository
public interface UserinfoMapper {

	@Insert("insert into user_info (uphone,unickname,utruename,uphoto,usex) values (#{uphone},#{unickname},#{utruename},#{uphoto},#{usex})")
	public int addUserinfo(Userinfo userinfo);

	@Update("update user_info set unickname=#{unickname}, uphoto=#{uphoto} where uphone=#{uphone}")
	public int updateUserinfo(Userinfo userinfo);

	@Select("select * from user_info where uphone=#{uphone}")
	public Userinfo getUserinfo(String uphone);
}
