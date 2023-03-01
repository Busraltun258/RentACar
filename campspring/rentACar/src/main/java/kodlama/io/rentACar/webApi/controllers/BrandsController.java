/**
 * Created By Büşranur Altun
 * Date :1/03/2023
 * Time :10:33
 * Project Name :campspring
 */
package kodlama.io.rentACar.webApi.controllers;

import java.util.List;

import kodlama.io.rentACar.business.abstarcts.BrandService;
import kodlama.io.rentACar.entities.concretes.Brand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//controller olduğunu belirtmek için kullanılır.
@RestController //annotation
@RequestMapping(value = "/event")
public class BrandsController {
    private BrandService brandService;

    //parametrelierine bakar ve implemnte edeni bulur.BrandManagerın newlenmiş halini verir.

    public BrandsController(BrandService brandService) {
        this.brandService = brandService;

    }

    //birden fazla çeşitte listeleme yapma
    @GetMapping
    public List<Brand> getAll() {
        return brandService.getAll();
    }

}
