/**
 * Created By Büşranur Altun
 * Date :1/03/2023
 * Time :10:20
 * Project Name :campspring
 */
package kodlama.io.rentACar.business.concretes;

import kodlama.io.rentACar.business.abstarcts.BrandService;
import kodlama.io.rentACar.dataAccsess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service  //servis katmanı olarak otomatik newler.bu sınıf bir business nesnesidir.
//iş kuralları yazılır.Markaları listelemek için gereklilikler yazılır.
public class BrandManager implements BrandService {
    //brandamanager dataacssesi kullanır.injection yapılır
//brandmanager interface dışında datacssesden haberi olmaz.Bağımsızlaştırılır.
    private BrandRepository brandRepository;

    @Autowired
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }


    @Override
    public List<Brand> getAll() {
        return brandRepository.getAll();
    }
}
