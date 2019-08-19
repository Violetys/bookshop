package mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import beans.Sellerinfo;

@Repository
public interface SellerinfoMapper {

	@Insert("insert into seller_info (sphone,snickname,struename,ssex,saddress,sphoto) values (#{sphone},#{snickname},#{struename},#{ssex},#{saddress},#{sphoto})")
	public int addSellerinfo(Sellerinfo sellerinfo);

	@Update("update seller_info set snickname=#{snickname}, saddress=#{saddress}, sphoto=#{sphoto} where sphone=#{sphone}")
	public int updateSellerinfo(Sellerinfo sellerinfo);

	@Select("select * from seller_info where sphone=#{sphone}")
	public Sellerinfo getSellerinfo(String sphone);
}
