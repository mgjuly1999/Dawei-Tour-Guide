package com.coder.config;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.coder.model.Address;
import com.coder.model.Admin;
import com.coder.model.AdminRole;
import com.coder.model.Day;
import com.coder.model.FoodGroup;
import com.coder.model.Ingredient;
import com.coder.model.IngredientJoinItemResturant;
import com.coder.model.IngredientJoinItemResturantId;
import com.coder.model.Item;
import com.coder.model.ItemImage;
import com.coder.model.ItemJoinLanguage;
import com.coder.model.ItemJoinLanguageId;
import com.coder.model.ItemJoinStore;
import com.coder.model.ItemOption;
import com.coder.model.Language;
import com.coder.model.LanguageJoinGroup;
import com.coder.model.LanguageJoinGroupId;
import com.coder.model.LinkJoinShop;
import com.coder.model.LinkJoinShopId;
import com.coder.model.LinkType;
import com.coder.model.OptionJoinItem;
import com.coder.model.OptionJoinItemId;
import com.coder.model.OrderForm;
import com.coder.model.OrderLine;
import com.coder.model.OrderType;
import com.coder.model.Orders;
import com.coder.model.OrdersId;
import com.coder.model.PaymentMethod;
import com.coder.model.Review;
import com.coder.model.ReviewCommand;
import com.coder.model.ReviewCommandId;
import com.coder.model.ReviewId;
import com.coder.model.ReviewMenu;
import com.coder.model.ReviewType;
import com.coder.model.Shop;
import com.coder.model.ShopJoinLanguage;
import com.coder.model.ShopJoinLanguageId;
import com.coder.model.ShopMedia;
import com.coder.model.TimeTable;
import com.coder.model.TimeTableId;
import com.coder.model.Type;
import com.coder.model.TypeJoinLanguage;
import com.coder.model.TypeJoinLanguageId;
import com.coder.model.User;


@Configuration//spring.xml
@ComponentScan(basePackages={"com.coder"}) //<context:component-scan
@PropertySources({ //resources/database.properties
		@PropertySource("classpath:application.properties")
})
@EnableTransactionManagement
public class SpringDSXmlConfig {
	@Autowired
	private Environment environment;	
	
	@Autowired
	@Bean(name="dataSource")
	public DataSource getDataSource(){
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName(
				this.environment.getProperty("jdbc.driverClassName"));
		ds.setUrl(this.environment.getProperty("jdbc.url"));
		ds.setUsername(this.environment.getProperty("jdbc.username"));
		ds.setPassword(this.environment.getProperty("jdbc.password"));
		return ds;
	}
	
	@Autowired
	@Bean(name="transactionManager")
	public HibernateTransactionManager getTransactionManager(
			SessionFactory sf){
		HibernateTransactionManager tm=new HibernateTransactionManager(sf);
		return tm;
	}
	
	@Bean(name="sessionFactory")
	public SessionFactory getSessionFactory(){
		LocalSessionFactoryBuilder b=new LocalSessionFactoryBuilder(getDataSource());
		b.addAnnotatedClass(Address.class);
		b.addAnnotatedClass(Admin.class);
		b.addAnnotatedClass(AdminRole.class);
		b.addAnnotatedClass(Day.class);
		b.addAnnotatedClass(FoodGroup.class);
		b.addAnnotatedClass(Ingredient.class);
		b.addAnnotatedClass(IngredientJoinItemResturant.class);
		b.addAnnotatedClass(IngredientJoinItemResturantId.class);
		b.addAnnotatedClass(Item.class);
		b.addAnnotatedClass(ItemImage.class);
		b.addAnnotatedClass(ItemJoinLanguage.class);
		b.addAnnotatedClass(ItemJoinLanguageId.class);
		b.addAnnotatedClass(ItemJoinStore.class);
		b.addAnnotatedClass(ItemOption.class);
		b.addAnnotatedClass(Language.class);
		b.addAnnotatedClass(LanguageJoinGroup.class);
		b.addAnnotatedClass(LanguageJoinGroupId.class);
		b.addAnnotatedClass(LinkJoinShop.class);
		b.addAnnotatedClass(LinkJoinShopId.class);
		b.addAnnotatedClass(LinkType.class);
		b.addAnnotatedClass(OptionJoinItem.class);
		b.addAnnotatedClass(OptionJoinItemId.class);
		b.addAnnotatedClass(OrderForm.class);
		b.addAnnotatedClass(OrderLine.class);
		b.addAnnotatedClass(Orders.class);
		b.addAnnotatedClass(OrdersId.class);
		b.addAnnotatedClass(OrderType.class);
		b.addAnnotatedClass(PaymentMethod.class);
		b.addAnnotatedClass(Review.class);
		b.addAnnotatedClass(ReviewCommand.class);
		b.addAnnotatedClass(ReviewCommandId.class);
		b.addAnnotatedClass(ReviewId.class);
		b.addAnnotatedClass(ReviewMenu.class);
		b.addAnnotatedClass(ReviewType.class);
		b.addAnnotatedClass(Shop.class);
		b.addAnnotatedClass(ShopJoinLanguage.class);
		b.addAnnotatedClass(ShopJoinLanguageId.class);
		b.addAnnotatedClass(ShopMedia.class);
		b.addAnnotatedClass(TimeTable.class);
		b.addAnnotatedClass(TimeTableId.class);
		b.addAnnotatedClass(Type.class);
		b.addAnnotatedClass(TypeJoinLanguage.class);
		b.addAnnotatedClass(TypeJoinLanguageId.class);
		b.addAnnotatedClass(User.class);
		
		return b.buildSessionFactory();
	}
}




