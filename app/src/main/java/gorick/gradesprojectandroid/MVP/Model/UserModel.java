package gorick.gradesprojectandroid.MVP.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by sg-0036936 on 06/03/2017.
 */

@Data
@NoArgsConstructor
public class UserModel {

    @SerializedName("ra")
    @Expose
    private String ra;
    @SerializedName("username")
    @Expose
    private String name;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("state")
    @Expose
    private String state;

}
