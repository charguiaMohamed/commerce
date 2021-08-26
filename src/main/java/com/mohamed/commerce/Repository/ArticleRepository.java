package com.mohamed.commerce.Repository;

import com.mohamed.commerce.model.Article;
import com.mohamed.commerce.model.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ArticleRepository extends JpaRepository<Article,Integer> {

    Optional<Article> findByCodeArticle(String codeArticle);

    List<Article> findAllByCategorieId(Integer Categorie_ID);

    @Query("SELECT  b from  Brand b ")
    List<Brand> findAllBrand();
}