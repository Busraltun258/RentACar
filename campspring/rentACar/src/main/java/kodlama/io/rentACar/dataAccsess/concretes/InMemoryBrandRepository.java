/**
 * Created By Büşranur Altun
 * Date :1/03/2023
 * Time :10:08
 * Project Name :campspring
 */
package kodlama.io.rentACar.dataAccsess.concretes;

import kodlama.io.rentACar.dataAccsess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository //bu sınıf bir data accsess nesnesi
//İNMEMROY İLE BELLEKTEN BİR LİSTE GELİYOR.DAHA SONRA VERİ TABANINDAN GELECEK.
public class InMemoryBrandRepository implements BrandRepository {
    List<Brand> brands;

    public InMemoryBrandRepository() {
        brands = new ArrayList<Brand>();
        brands.add(new Brand(1, "BMW"));
        brands.add(new Brand(2, "Audi"));
        brands.add(new Brand(3, "Renault"));

    }

    @Override
    public List<Brand> getAll() {
        return brands;
    }
}
