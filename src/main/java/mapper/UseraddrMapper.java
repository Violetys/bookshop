package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import beans.Useraddr;

@Repository
public interface UseraddrMapper {

	@Insert("insert into user_addr (id,uphone,uaddress) values (default,#{uphone},#{uaddress})")
	public int addUseraddr(Useraddr useraddr);

	@Update("update user_addr set uaddress=#{uaddress} where id=#{id}")
	public int updateUseraddr(Useraddr useraddr);

	@Select("select * from user_addr where id=#{id}")
	public Useraddr getUseraddrById(int id);

	@Select("select * from user_addr where uphone=#{uphone}")
	public List<Useraddr> getAllUseraddr(String uphone);

}
