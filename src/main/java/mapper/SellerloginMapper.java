package mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import beans.Sellerlogin;

@Repository
public interface SellerloginMapper {

	@Insert("insert into seller_login (sphone,spassword) values (#{sphone},#{spassword})")
	public int addSellerlogin(Sellerlogin sellerlogin);

	@Update("update seller_login set spassword=#{spassword} where sphone=#{sphone}")
	public int updateSellerlogin(Sellerlogin sellerlogin);

	@Select("select * from seller_login where sphone=#{sphone}")
	public Sellerlogin getSellerlogin(String sphone);

}
