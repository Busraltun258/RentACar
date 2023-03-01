package kodlama.io.rentACar.dataAccsess.abstracts;

import kodlama.io.rentACar.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.List;

//veri tabanı işlerini yapacak sınıf(listeleme vs.):dao olarak da geçer

public interface BrandRepository {
    // getAll() fonksiyonu ile markalar listelenir.
    List<Brand> getAll();

}
