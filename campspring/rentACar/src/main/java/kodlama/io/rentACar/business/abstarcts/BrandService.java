package kodlama.io.rentACar.business.abstarcts;

import kodlama.io.rentACar.entities.concretes.Brand;

import java.util.List;

// iş kuralları yazılır.
public interface BrandService {
    List<Brand> getAll();
}
