package entityservice;

import dao.CommentDao;
import dao.ProductDao;
import dto.ProductCommentDetailDto;
import dto.ProductDetailDto;
import entity.Product;

import java.math.BigDecimal;
import java.util.List;

public class ProductCommentEntityService {

    private CommentDao commentDao;

    public ProductCommentEntityService() {
        commentDao = new CommentDao();
    }

    public List<ProductCommentDetailDto> findAllProductCommentDetailDtoByProduct(Long productId)
    {
        return commentDao.findAllProductCommentDetailDtoByProduct(productId);
    }
    public List<ProductCommentDetailDto> findCommentCountAndDetailByProduct(Long productId) {
        return commentDao.findCommentCountAndDetailByProduct(productId);
    }
    public List<ProductCommentDetailDto> findUserCommentsDetailByUser(Long userId){
        return  commentDao.findUserCommentsDetailByUser(userId);
    }
}
