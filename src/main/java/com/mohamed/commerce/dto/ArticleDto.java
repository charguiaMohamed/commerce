package com.mohamed.commerce.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mohamed.commerce.model.*;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Builder
@Data
public class ArticleDto {
    private Integer id;
    private String codeArticle;
    private BigDecimal prixUnitaireHt;
    private BigDecimal prixUnitaireTtc;
    private  String image;
    private  String description;
    private  String libelle;
    private Integer TVA;

    private StockDto stock;

    private  CategorieDto categorie;
    @JsonIgnore
    private List<LigneCommande> ligneCommandes;
    @JsonIgnore
    private List<Brand> brands;
    @JsonIgnore
    private List<Declinision> declinisions;


    public static ArticleDto fromEntity(Article article){
        if(article == null){
            return null;
        }
        return ArticleDto.builder()
                .id(article.getId())
                .codeArticle(article.getCodeArticle())
                .prixUnitaireHt(article.getPrixUnitaireHt())
                .prixUnitaireTtc(article.getPrixUnitaireTtc())
                .image(article.getImage())
                .description(article.getDescription())
                .libelle(article.getLibelle())
                .TVA(article.getTVA())
               // .categorie(CategorieDto.fromEntity(article.getCategorie()))
               // .stock(StockDto.fromEntity(article.getStock()))
                .build();
    }
    public static  Article toEntity(ArticleDto articleDto){
        if (articleDto == null){
            return  null;
        }
        Article article = new Article();
        article.setId(articleDto.getId());
        article.setCodeArticle(articleDto.getCodeArticle());
        article.setPrixUnitaireHt(articleDto.getPrixUnitaireHt());
        article.setPrixUnitaireTtc(articleDto.getPrixUnitaireTtc());
        article.setImage(articleDto.getImage());
        article.setDescription(articleDto.getDescription());
        article.setLibelle(articleDto.getLibelle());
        article.setTVA(articleDto.getTVA());
       // article.setCategorie(CategorieDto.toEntity(articleDto.getCategorie()));
      // article.setStock(StockDto.toEntity(articleDto.getStock()));
        return  article;
    }
}
