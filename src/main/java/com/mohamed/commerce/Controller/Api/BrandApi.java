package com.mohamed.commerce.Controller.Api;

import com.mohamed.commerce.dto.BrandDto;
import io.swagger.annotations.Api;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.mohamed.commerce.Utils.Constants.APP_ROOT;

@Api("Brand")
public interface BrandApi {
    @PostMapping(value=APP_ROOT+"/Brand/save",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    BrandDto save(@RequestBody BrandDto dto);

    @GetMapping(value = APP_ROOT + "/Brand/{Brand_ID}", produces = MediaType.APPLICATION_JSON_VALUE)
    BrandDto findById(@PathVariable("Brand_ID") Integer Brand_ID);

    @GetMapping(value = APP_ROOT + "/Brand/filter/{marque}", produces = MediaType.APPLICATION_JSON_VALUE)
    BrandDto findByMarque(@PathVariable("marque") String marque);

    @GetMapping(value = APP_ROOT + "/Brand/all", produces = MediaType.APPLICATION_JSON_VALUE)
    List<BrandDto> findAll();

    @DeleteMapping(value = APP_ROOT + "/Brand/delete/{Brand_ID}")
    void delete(@PathVariable("Brand_ID")Integer Brand_ID);
}
