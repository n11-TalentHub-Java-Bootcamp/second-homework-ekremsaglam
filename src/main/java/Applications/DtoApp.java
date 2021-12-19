package Applications;

import dto.ProductDetailDto;
import entityservice.ProductEntityService;

import java.util.List;

public class DtoApp {

    public static void main(String[] args) {

        ProductEntityService service = new ProductEntityService();
        List<ProductDetailDto> productList = service.findAllProductDetailDtoByCategoryBranch(3L);

        for (ProductDetailDto productDetailDto : productList) {
            System.out.println(productDetailDto);
        }
    }
}
