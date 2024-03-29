package com.mohamed.commerce.validator;

import com.mohamed.commerce.dto.ArticleDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ArticleValidator {
    public static List<String> validate(ArticleDto dto){
        List<String> errors= new ArrayList<>();
        if (dto==null){
            errors.add("Veuiller renseigner le code de l'article");
            errors.add("Veuillez renseigner le prix unitaire HT l'article");
            errors.add("Veuillez renseigner le prix unitaire TTC l'article");
            errors.add("Veuiller renseigner l'image d'article");
            errors.add("Veuillez renseigner la designation de l'article");
            errors.add("Veuillez renseigner la libelle de l'article");
            errors.add("Veuillez renseigner le taux TVA de l'article");
            errors.add("Veuillez renseigner le prix unitaire TTC de l'article");
            errors.add("Veuillez selectionner une categorie");
            errors.add("Veuillez selectionner un stock");
            return errors;
        }
        if (!StringUtils.hasLength(dto.getCodeArticle())){
            errors.add("Veuiller renseigner le code de l'article");
        }
        if ( dto.getPrixUnitaireHt()==null){
            errors.add("Veuillez renseigner le prix unitaire HT l'article");
        }
        if ( dto.getPrixUnitaireTtc()==null){
            errors.add("Veuillez renseigner le prix unitaire TTC l'article");
        }
        if (!StringUtils.hasLength(dto.getImage())){
            errors.add("Veuiller renseigner l'image l'article");
        }
        if (!StringUtils.hasLength(dto.getDescription())) {
            errors.add("Veuillez renseigner la designation de l'article");
        }
        if (!StringUtils.hasLength(dto.getLibelle())) {
            errors.add("Veuillez renseigner la libelle de l'article");
        }
        if (dto.getCategorie() == null || dto.getCategorie().getId() == null) {
            errors.add("Veuillez selectionner une categorie");
        }
        if (dto.getStock() == null || dto.getStock().getId() == null) {
            errors.add("Veuillez selectionner un stock");
        }
        return errors;

    }
}
