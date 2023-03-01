/**
 * Created By Büşranur Altun
 * Date :1/03/2023
 * Time :09:52
 * Project Name :campspring
 */
package kodlama.io.rentACar.entities.concretes;

// veri tabanı nesnesi:marka

public class Brand {
    private int id;
    private String name;

    public Brand() {

    }

    public Brand(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
