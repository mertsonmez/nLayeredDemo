package nLayeredDemo.business.concretes;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

import java.util.List;

public class ProductManager implements ProductService {
   //Dependency Injection
    private ProductDao productDao;
    private LoggerService loggerService;

    public ProductManager(ProductDao productDao, LoggerService loggerService) {
        this.productDao = productDao;
        this.loggerService = loggerService;
    }



    @Override
    public void add(Product product) {
        //İş kodları yazılır.
        if (product.getCategoryId() == 1){
            System.out.println("Bu kategoride ürün kabul edilmiyor!");
            return; //!return gördüğü yerde aşağıya gitmez bitirir.
        }
        this.productDao.add(product);
        this.loggerService.logToSystem("Ürün eklendi " + product.getName());

    }


    @Override
    public List<Product> getAll() {
        return null;
    }
}
