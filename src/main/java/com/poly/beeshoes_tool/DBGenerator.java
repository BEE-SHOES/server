package com.poly.beeshoes_tool;

import com.poly.beeshoes.entity.Account;
import com.poly.beeshoes.entity.Brand;
import com.poly.beeshoes.entity.Role;
import com.poly.beeshoes.repository.AccountRepository;
import com.poly.beeshoes.repository.BillDetailRepository;
import com.poly.beeshoes.repository.BillHistoryRepository;
import com.poly.beeshoes.repository.BillRepository;
import com.poly.beeshoes.repository.BrandRepository;
import com.poly.beeshoes.repository.CartDetailRepository;
import com.poly.beeshoes.repository.CartRepository;
import com.poly.beeshoes.repository.CategoryRepository;
import com.poly.beeshoes.repository.ColorRepository;
import com.poly.beeshoes.repository.CustomerInformationRepository;
import com.poly.beeshoes.repository.ImageRepository;
import com.poly.beeshoes.repository.MaterialRepository;
import com.poly.beeshoes.repository.NotificationRepository;
import com.poly.beeshoes.repository.ProductDetailRepository;
import com.poly.beeshoes.repository.ProductRepository;
import com.poly.beeshoes.repository.PromotionProductDetailRepository;
import com.poly.beeshoes.repository.PromotionRepository;
import com.poly.beeshoes.repository.RoleRepository;
import com.poly.beeshoes.repository.ShoesCollarRepository;
import com.poly.beeshoes.repository.SizeRepository;
import com.poly.beeshoes.repository.SoleHeightRepository;
import com.poly.beeshoes.repository.TransactionRepository;
import com.poly.beeshoes.util.ConvertDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author thangncph26123
 */

@SpringBootApplication
@EnableJpaRepositories(
        basePackages = "com.poly.beeshoes.repository"
)
public class DBGenerator implements CommandLineRunner {

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private BillDetailRepository billDetailRepository;

    @Autowired
    private BillHistoryRepository billHistoryRepository;

    @Autowired
    private BillRepository billRepository;

    @Autowired
    private BrandRepository brandRepository;

    @Autowired
    private CartDetailRepository cartDetailRepository;

    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ColorRepository colorRepository;

    @Autowired
    private CustomerInformationRepository customerInformationRepository;

    @Autowired
    private ImageRepository imageRepository;

    @Autowired
    private MaterialRepository materialRepository;

    @Autowired
    private NotificationRepository notificationRepository;

    @Autowired
    private ProductDetailRepository productDetailRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private PromotionProductDetailRepository promotionProductDetailRepository;

    @Autowired
    private PromotionRepository promotionRepository;

    @Autowired
    private ShoesCollarRepository shoesCollarRepository;

    @Autowired
    private SizeRepository sizeRepository;

    @Autowired
    private SoleHeightRepository soleHeightRepository;

    @Autowired
    private TransactionRepository transactionRepository;

    private final boolean IS_RELEASE = false;

    @Override
    public void run(String... args) throws Exception {

        Role role1 = new Role();
        role1.setCode("ROLE_1");
        role1.setName("Quản lý");
        role1.setId(roleRepository.save(role1).getId());

        Role role2 = new Role();
        role2.setCode("ROLE_2");
        role2.setName("Nhân viên");
        role2.setId(roleRepository.save(role2).getId());

        Role role3 = new Role();
        role3.setCode("ROLE_3");
        role3.setName("Khách hàng");
        role3.setId(roleRepository.save(role3).getId());

        Account account1 = new Account();
        account1.setCode("QL001");
        account1.setName("Nguyễn Công Thắng");
        account1.setEmail("thangncph26123@fpt.edu.vn");
        account1.setBirthDate(ConvertDate.convertStringToDate("25-09-2003"));
        account1.setPhoneNumber("0971089763");
        account1.setRole(role1);
        account1.setId(accountRepository.save(account1).getId());

        Account account2 = new Account();
        account2.setCode("NV001");
        account2.setName("Mai Đình Huy");
        account2.setEmail("huymdph26192@fpt.edu.vn");
        account2.setBirthDate(ConvertDate.convertStringToDate("18-11-2003"));
        account2.setPhoneNumber("0358974973");
        account2.setRole(role2);
        account2.setId(accountRepository.save(account2).getId());

        Account account3 = new Account();
        account3.setCode("KH001");
        account3.setName("Lê Quang Trị");
        account3.setEmail("trilq2003@gmail.com");
        account3.setBirthDate(ConvertDate.convertStringToDate("11-03-2003"));
        account3.setPhoneNumber("0874958462");
        account3.setRole(role3);
        account3.setId(accountRepository.save(account3).getId());

        Brand brand1 = new Brand();
        brand1.setCode("BRAND001");
        brand1.setName("Nike");
        brand1.setId(brandRepository.save(brand1).getId());
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(DBGenerator.class);
        ctx.close();
    }

}