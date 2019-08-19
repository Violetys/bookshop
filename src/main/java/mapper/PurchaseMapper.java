package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import beans.Purchase;

@Repository
public interface PurchaseMapper {

	@Insert("insert into purchase (id,bisbn,uphone,sphone,uaddress,num,charge,status,sum,time) values (default,#{bisbn},#{uphone},#{sphone},#{uaddress},#{num},#{charge},#{status},#{sum},#{time})")
	public int addPurchase(Purchase purchase);

	@Update("update purchase set uaddress=#{uaddress}, num=#{num}, charge=#{charge}, status=#{status}, sum=#{sum}, time=#{time} where id=#{id}")
	public int updatePurchase(Purchase purchase);

	@Select("select * from purchase where id=#{id}")
	public Purchase getPurchaseByid(int id);

	@Select("select * from purchase where uphone=#{uphone}")
	public List<Purchase> getAllPurchaseByUphone(String uphone);

	@Select("select * from purchase where sphone=#{sphone}")
	public List<Purchase> getAllPurchaseBySphone(String sphone);
}
