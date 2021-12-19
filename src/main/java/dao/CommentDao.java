package dao;

import base.BaseDao;
import dto.ProductCommentDetailDto;
import entityservice.ProductCommentEntityService;
import org.hibernate.query.Query;

import java.util.List;

public class CommentDao extends BaseDao {


    public List<ProductCommentDetailDto> findAllProductCommentDetailDtoByProduct(Long productId){
        String sql = " select " +
                " new dto.ProductCommentDetailDto( " +
                " product.name, category.name, product.price , "+
                " userInfo.name, userInfo.surName, userInfo.email, userInfo.phoneNumber, " +
                " productComment.comment, productComment.commentDate ) " +
                " from Product product" +
                " left join ProductComment productComment  on product.id = productComment.product.id " +
                " left join UserInfo userInfo on productComment.userInfo.id = userInfo.id " +
                " left join Category category  on product.category.id = category.id " +
                " where product.id = :productId ";

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("productId", productId);

        return query.list();
    }

    public List<ProductCommentDetailDto> findCommentCountAndDetailByProduct(Long productId){
        String sql = " select " +
                " new dto.CommentCountForProductDetailDto( " +
                " product.id, product.name, product.price ,count(product.id) ) " +
                " from Product product" +
                " left join ProductComment productComment  on product.id = productComment.product.id " +
                " where product.id = :productId "+
                " group by product.id";

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("productId", productId);

        return query.list();
    }

    public List<ProductCommentDetailDto> findUserCommentsDetailByUser(Long userId){
        String sql = " select " +
                " new dto.UserInfoCommentDetailDto(userInfo.id, userInfo.name, product.name, productComment.comment, productComment.commentDate ) " +
                " from UserInfo userInfo" +
                " inner join ProductComment productComment  on userInfo.id = productComment.userInfo.id " +
                " inner join Product product on productComment.product.id = product.id " +
                " where userInfo.id = :userId ";

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("userId", userId);

        return query.list();
    }



}
