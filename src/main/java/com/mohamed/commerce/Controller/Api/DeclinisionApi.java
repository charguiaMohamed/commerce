package com.mohamed.commerce.Controller.Api;

import com.mohamed.commerce.dto.DeclinisionDto;
import io.swagger.annotations.Api;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.mohamed.commerce.Utils.Constants.APP_ROOT;

@Api("Declinision")
public interface DeclinisionApi {

    @PostMapping(value = APP_ROOT + "/Declinision/save", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    DeclinisionDto save(@RequestBody DeclinisionDto dto);

    @GetMapping(value = APP_ROOT + "/Declinision/{Declinision_ID}", produces = MediaType.APPLICATION_JSON_VALUE)
    DeclinisionDto findById(@PathVariable("Declinision_ID") Integer Declinision_ID);

    @GetMapping(value = APP_ROOT + "/Declinision/filter/{couleur}", produces = MediaType.APPLICATION_JSON_VALUE)
    DeclinisionDto findByCouleur(@PathVariable String couleur);

    @GetMapping(value = APP_ROOT + "/Declinision/Filter/{taille}", produces = MediaType.APPLICATION_JSON_VALUE)
    DeclinisionDto findByTaille(@PathVariable String taille);

    @GetMapping(value = APP_ROOT + "/Declinision/all", produces = MediaType.APPLICATION_JSON_VALUE)
    List<DeclinisionDto> findAll();

    @DeleteMapping(value = APP_ROOT + "/categories/delete/{Declinision_ID}")
    void delete(@PathVariable("Declinision_ID") Integer Declinision_ID);
}
