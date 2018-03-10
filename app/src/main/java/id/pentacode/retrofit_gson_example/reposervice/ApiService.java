package id.pentacode.retrofit_gson_example.reposervice;

import id.pentacode.retrofit_gson_example.models.ContactList;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    /*
    Retrofit get annotation with our URL
    And our method that will return us the List of ContactList
    */
    @GET("/json_data.json")
    Call<ContactList> getContacts();
}
